package com.practice.algorithms

/**
  * Created by Abhi on 9/9/16.
  */
class MainClass {


}

object  MainClass{
  def main(args: Array[String]): Unit ={
    println(MergeSort.mergeSort(List(10,1,2,3,50,6,7)))
    println(MergeSort.merge(List(1,9,10), List(4,5,6)))
    println(InsertionSort.Insert(List(5,1,2,3,10)))
  }
}


