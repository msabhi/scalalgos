package com.practice.algorithms

/**
  * Created by Abhi on 9/12/16.
  */
class InsertionSort {
    def insertionSort(nums : List[Int]): List[Int] = nums match {
      case Nil => List()
      case first::rest => insert(first, insertionSort(rest))
    }

    def insert(x:Int, lst: List[Int]) : List[Int] =  lst match {
      case Nil => List(x)
      case first :: rest => if (x <= first) x :: lst else first :: insert(x, rest)
    }
}

object InsertionSort{
  def Insert(nums : List[Int]): List[Int] ={
      return new InsertionSort().insertionSort(nums)
  }
}
