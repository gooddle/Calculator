package org.example

class Cal {
    fun operate(operation: AbstractOperation, numDou1: Double, numDou2: Double): Double {
        return operation.operate(numDou1, numDou2)
    }
}
