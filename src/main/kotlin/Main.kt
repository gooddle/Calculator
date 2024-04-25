package org.example

fun main() {
    while (true) {
        println("숫자를 입력하세요")
        val numDou1 = readLine()!!.toDouble()

        println("+, *, %, -, / 중 선택하여 연산기호 입력")
        val operator = readLine()!!

        println("숫자를 입력하세요")
        val numDou2 = readLine()!!.toDouble()

        fun main() {
            while (true) {
                println("숫자를 입력하세요")
                val numDou1 = readLine()!!.toDouble()

                println("+, *, %, -, / 중 선택하여 연산기호 입력")
                val operator = readLine()!!

                println("숫자를 입력하세요")
                val numDou2 = readLine()!!.toDouble()

                val cal = Cal()

                val result = when (operator) {
                    "+" -> cal.operate(AddOperation(), numDou1, numDou2)
                    "-" -> cal.operate(SubOperation(), numDou1, numDou2)
                    "*" -> cal.operate(MulOperation(), numDou1, numDou2)
                    "/" -> cal.operate(DivOperation(), numDou1, numDou2)
                    "%" -> cal.operate(ModOperation(), numDou1, numDou2)
                    else -> throw IllegalArgumentException("정확한 기호를 입력하세요")
                }

                println(result)
            }
        }
    }

}





