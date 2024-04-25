package org.example

class Cal {
    fun operate(make: AbstractOperation, numDou1: Double, numDou2: Double): Double {
        return make.operate(numDou1, numDou2)
    }
}
