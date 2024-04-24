package org.example

class DivOperation(numDou1: Double, numDou2: Double) : Cal(numDou1, numDou2) {

    fun operateDiv(): Double = div()
    var resultDiv = println("결과값 : ${numDou1}/${numDou2}  입니다.")
}