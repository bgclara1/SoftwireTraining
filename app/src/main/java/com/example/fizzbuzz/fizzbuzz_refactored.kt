package com.example.fizzbuzz

fun main() {

    print("Enter max number: ")
    val maxnum = readln()

    var Bs = arrayOf("Bong", "Buzz", "Bang") // used for search in the 13 rule

    for (i in 1..maxnum.toInt()) {
        var outputs = emptyArray<String>()
        if (i % 3 == 0) {
            outputs += "Fizz"
        }
        if (i % 5 == 0) {
            outputs += "Buzz"
        }
        if (i % 7 == 0) {
            outputs += "Bang"
        }
        if (i % 11 == 0) {
            outputs = emptyArray<String>()  // 11 rule replaces any existing words
            outputs += "Bong"
        }


        if (i % 13 == 0) {

            var containsB = false
            for (B in Bs) {
                if (B in outputs) {
                    var index = outputs.indexOf(B)
                    val temp =
                        Array(outputs.size + 1) { "" }   // algo to place Fezz before the first B word
                    for (s in 0..<index) {
                        temp[s] = outputs[s]
                    }
                    temp[index] = "Fezz"
                    for (s in index..<outputs.size) {
                        temp[s + 1] = outputs[s]
                    }
                    outputs = temp
                    containsB = true
                    break
                }

            }

            if (!containsB) {
                outputs += "Fezz"   // if no B word append Fezz to end
            }

        }

        if (i % 17 == 0) {
            var temp = (outputs.reversed().toTypedArray())
            outputs = emptyArray<String>()
            for (s in temp) {
                outputs += s
            }
        }

        if (outputs.contentEquals(emptyArray<String>())) {      // if no divisibility output is just the plain number
            outputs += i.toString()
        }

        var final = outputs.joinToString("")        // convert from array to string
        println(final)

    }


}
