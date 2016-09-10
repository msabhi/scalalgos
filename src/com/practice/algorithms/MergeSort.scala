package com.practice.algorithms

/**
  * Created by Abhi on 9/9/16.
  */
class MergeSort {

  def merge(nums1 : List[Int], nums2 : List[Int]): List[Int] = (nums1, nums2) match{
      case(Nil, _) => nums2
      case(_, Nil) => nums1
      case(h1::t1, h2::t2) => {
        if(h1<h2) h1::merge(t1, nums2)
        else h2::merge(nums1, t2)
      }
  }

  def mergeSort(nums: List[Int]): List[Int] = nums match {
    case Nil => Nil
    case h1::Nil => nums
    case _ =>
      val (l1, l2) = nums.splitAt(nums.length/2)
      merge(mergeSort(l1), mergeSort(l2))
  }
}

object MergeSort{
  def mergeSort(nums: List[Int]): List[Int] ={
    val mSort = new MergeSort()
    mSort.mergeSort(nums)
  }

  def merge(nums1:List[Int], nums2: List[Int]): List[Int] ={
    val mergeSort = new MergeSort()
    mergeSort.merge(nums1, nums2)
  }
}
