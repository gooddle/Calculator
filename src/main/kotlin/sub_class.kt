package org.example

class SubOperation(numDou1: Double, numDou2: Double) : Cal(numDou1, numDou2) {

    fun operateSub(): Double = sub()
    var resultSub = println("결과값 : ${numDou1}-${numDou2}  입니다.")
}