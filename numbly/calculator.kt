package com.example.numble


fun calculateResult(guess: String, answer: List<String>): List<Int> {
    var pos = 0
    var plus = 0
    var negative = 0

    for (i in guess) {
        if (answer.contains(i.toString())) {

            var index = answer.indexOf(i.toString())

            if (index == pos) {
                plus += 1

            } else {
                negative -= 1
            }
        }
        pos+=1

    }
    return listOf<Int>(plus, negative)
}

fun GenerateRandomList(): List<String> {
    val myset = mutableSetOf<String>()
    while (myset.size != 4) {
        myset.add((0..9).random().toString())
    }
    val list = myset.toList()
    println(list)
    return list
}
