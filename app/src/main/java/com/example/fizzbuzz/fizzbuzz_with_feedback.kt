package com.example.fizzbuzz

fun main() {

    print("Enter max number: ")
    var maxnumStr = readln()
    val maxnum: Int
    try {
        maxnum = maxnumStr.toInt()
    } catch (e: NumberFormatException) {
        println("Please enter an integer")
        return
    }

    for (i in 1..maxnum) {
        var outputs = mutableListOf<String>()
        if (i % 3 == 0) outputs += "Fizz"
        if (i % 5 == 0) outputs += "Buzz"
        if (i % 7 == 0) outputs += "Bang"
        if (i % 11 == 0) {
            outputs.clear()
            outputs += "Bong"
        }


        if (i % 13 == 0) {
            var index = outputs.indexOfFirst { it.startsWith("B")}
            if (index == -1)
                outputs.add("Fezz")
            else
                outputs.add(index, "Fezz")
        }

        if (i % 17 == 0) {
            var temp = (outputs.reversed())
            outputs.clear()
            for (s in temp) {
                outputs += s
            }
        }

        if (outputs.isEmpty()) {
            println(i.toString())
        } else {
            var final = outputs.joinToString("")
            println(final)
        }
    }

}
