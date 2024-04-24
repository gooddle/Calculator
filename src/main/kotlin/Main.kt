
fun main() {
    while (true) {
        println("숫자를 입력하세요")
        val numDou1 = readLine()!!.toDouble()
        println("+, *, %, -, / 중 선택하여 연산기호 입력")
        val operator = readLine()!!
        println("숫자를 입력하세요")
        val numDou2 = readLine()!!.toDouble()

        val result = when(operator) {
            "+" -> AddOperation(numDou1, numDou2).operateAdd()
            "-" -> SubOperation(numDou1, numDou2).operateSub()
            "*" -> MulOperation(numDou1, numDou2).operateMul()
            "/" -> DivOperation(numDou1, numDou2).operateDiv()
            "%" -> Div2Operation(numDou1, numDou2).operateDiv2()
            else -> {
                println("올바르지 않은 연산자입니다.")
            }
        }

        println(result)
    }
}






