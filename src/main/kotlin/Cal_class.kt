package org.example

class Cal {
    fun operate(make: AbstractOperation, num1: Double, num2: Double): Double {
        return make.operate(num1, num2)
    }
}
