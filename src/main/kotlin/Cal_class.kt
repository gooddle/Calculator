package org.example

open class Cal(val numDou1: Double, val numDou2: Double) {
    fun add(): Double = numDou1 + numDou2
    fun sub(): Double = numDou1 - numDou2
    fun mul(): Double = numDou1 * numDou2
    fun div(): Double = numDou1 / numDou2
    fun div2(): Double = numDou1 % numDou2
}