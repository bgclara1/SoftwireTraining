package com.example.fizzbuzz

fun main() {

    print("Enter max number: ")
    val maxnum = readLine()!!
    val sevens = "Bang"
    for (i in 1..maxnum.toInt()) {
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
        if (fezz) {                 // prescribe fezz placement rather than looking for Bs
            if (fizz && buzz) {
                output = "FizzFezzBuzz"
            } else if (buzz) {
                output = "FezzBuzz"
            } else if (bong) {
                output = "FezzBong"
            } else {
                output = "$output$thirteens"
            }
        }
        if (output==""){
            output = i.toString()
        }

        //

        if (i%17==0) {
            var numfactors = output.length
          //  var words = emptyArray<String>()
            if (numfactors%4==0) {
                var words = output.chunked(4)
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