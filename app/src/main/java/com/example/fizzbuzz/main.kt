package com.example.fizzbuzz

fun main() {

    val sevens = "Bang"
  //  println("Hello world!")
    for (i in 1..100) {
        var output  = ""
        var normal = false
        if (i%3==0 && i%5==0){
            output = "FizzBuzz"
        //    println("FizzBuzz")
        } else if (i % 3 == 0) {
            output = "Fizz"
       //     println("Fizz")
        } else if (i%5==0) {
            output = "Buzz"
         //   println("Buzz")
        }
        else {
            output = i.toString()
            normal = true
          //  println(i)
        }

        if (i%7==0) {
            if (normal == false) {
                output = "$output$sevens"
            } else {
                output = sevens
            }
        }

        if (i%11==0) {
            output = "Bong"
        }

        println(output)
    }


}