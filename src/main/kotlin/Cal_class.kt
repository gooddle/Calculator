package org.example

 class Cal() {
     fun add(add: AddOperation, numDou1: Double, numDou2: Double): Double {
         return add.operateAdd(numDou1 , numDou2)
    }
    fun sub(sub: SubOperation, numDou1: Double,numDou2: Double): Double {
        return sub.operateSub(numDou1, numDou2)

    }
    fun mul(mul : MulOperation, numDou1: Double,numDou2: Double): Double {
        return mul.operateMul(numDou1, numDou2)

    }
    fun div(div : DivOperation,numDou1: Double,numDou2: Double): Double {
        return div.operateDiv(numDou1, numDou2)

    }

    fun div2(div2 :Div2Operation, numDou1: Double,numDou2: Double): Double {
        return div2.operateDiv2(numDou1, numDou2)

    }
}