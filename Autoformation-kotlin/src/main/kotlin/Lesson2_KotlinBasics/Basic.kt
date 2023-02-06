package Lesson2_KotlinBasics

import java.awt.PageAttributes.PrintQualityType

fun main (){
    println("hello Ihssan")
    val i: Int =6
    val b1 = i.toByte()
    println(b1)

    val b2 :Byte = 1
    val i1 : Int = b2.toInt()
    println(i1)

    var fish = 1
    fish = 2
    println(fish)

    val age = 22
    val firstname = "Ihssan"
    val lastname = "Tsouli"
    val a = 5
    val b = 6

    println("your name: $firstname your age : $age years old")

    println("you are : ${firstname+lastname}")

    println("la somme est : ${a+b} ")

}