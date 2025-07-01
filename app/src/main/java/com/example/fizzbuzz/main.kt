package com.example.fizzbuzz

fun main() {

    val sevens = "Bang"
  //  println("Hello world!")
    for (i in 1..300) {
        var output  = ""
        var fizz = false
        var buzz = false
        var bang = false
        var fezz = false
        var bong = false

        if (i % 3 == 0) {
            fizz = true

        }
        if (i%5==0) {
            buzz = true
        }

        if (i%7==0) {
            bang = true
        }

        if (i%11==0) {
            bong = true
        }

        var thirteens = "Fezz"
        if (i%13==0) {
            fezz = true
        }
        output = ""

        if (fizz) {
            output = "Fizz"
        }
        if (buzz) {
            output = "Buzz"
        }
        if (fizz && buzz) {
            output = "FizzBuzz"
        }
        if (bang) {
            output = "$output$sevens"
        }
        if (bong) {
            output = "Bong"
        }
        if (fezz) {
            if (fizz && buzz) {
                output = "FizzFezzBuzz"
            } else if (buzz) {
                output = "fezzbuzz"
            } else if (bong) {
                output = "FezzBong"
            } else {
                output = "$output$thirteens"
            }
        }
        if (output==""){
            output = i.toString()
        }

        // if div by 17 and output is a multiple of 4 splice into groups of fours into array and reverse order in print otherwise leave alone

        if (i%17==0) {
            var numfactors = output.length
          //  var words = emptyArray<String>()
            if (numfactors%4==0) {
                var words = output.chunked(4)
               // output = (words.reversed()).joinToString()
                words = (words.reversed())
                output = ""
                for(s in words){
                    output += s
                }
            }

        }

        println(output)
    }


}