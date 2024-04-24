package org.example

fun main() {
    val calc = Cal()

    while (true) {
        println("숫자를 입력하세요")
        val numDou1 = readLine()!!.toDouble()

        println("+, *, %, -, / 중 선택하여 연산기호 입력")
        val operator = readLine()!!

        println("숫자를 입력하세요")
        val numDou2 = readLine()!!.toDouble()

        val result = when (operator) {
            "+" -> calc.add(AddOperation(), numDou1, numDou2)
            "-" -> calc.sub(SubOperation(), numDou1, numDou2)
            "*" -> calc.mul(MulOperation(), numDou1, numDou2)
            "/" -> calc.div(DivOperation(), numDou1, numDou2)
            "%" -> calc.div2(Div2Operation(), numDou1, numDou2)
            else -> {
                println("올바르지 않은 연산자입니다.")
                continue
            }
        }

        println(result)
    }
}





