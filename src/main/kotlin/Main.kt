package org.example

fun main() {
    while (true) {
        println("숫자를 입력하세요")
        val num1 = readLine()!!.toDouble()

        println("+, *, %, -, / 중 선택하여 연산기호 입력")
        val operator = readLine()!!

        println("숫자를 입력하세요")
        val num2 = readLine()!!.toDouble()

        val result = when (operator) {
            "+" -> AddOperation().operate(num1, num2)
            "-" -> SubOperation().operate(num1, num2)
            "*" -> MulOperation().operate(num1, num2)
            "/" -> DivOperation().operate(num1, num2)
            "%" -> Div2Operation().operate(num1, num2)
            else -> throw IllegalArgumentException("정확한 기호를 입력하세요")
        }

        println(result)
    }
}






