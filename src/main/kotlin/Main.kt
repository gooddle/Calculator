package org.example

fun main() {

    while (true) {
        println("숫자를 입력하세요")
        val numDou1 = readLine()!!.toDouble()

        println("+, *, %, -, / 중 선택하여 연산기호 입력")
        val operator = readLine()!!

        println("숫자를 입력하세요")
        val numDou2 = readLine()!!.toDouble()

        val result = when (operator) {
            "+" -> Cal().add(numDou1,numDou2)
            "-" -> Cal().sub(numDou1,numDou2)
            "*" -> Cal().mul(numDou1,numDou2)
            "/" -> Cal().div(numDou1,numDou2)
            "%" -> Cal().div2(numDou1,numDou2)
            else -> {
                println("올바르지 않은 연산자입니다.")
                continue
            }
        }

        println(result)
    }
}





