package org.example

 class Cal() {
        fun add(numDou1: Double, numDou2: Double): Double = AddOperation().operateAdd(numDou1, numDou2)

        fun sub(numDou1: Double, numDou2: Double): Double = SubOperation().operateSub(numDou1, numDou2)

        fun mul(numDou1: Double, numDou2: Double): Double = MulOperation().operateMul(numDou1, numDou2)

        fun div(numDou1: Double, numDou2: Double): Double = DivOperation().operateDiv(numDou1, numDou2)

        fun div2(numDou1: Double, numDou2: Double): Double = Div2Operation().operateDiv2(numDou1, numDou2)

    }
