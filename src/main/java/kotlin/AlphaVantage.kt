package main.java.kotlin

import main.java.kotlin.entities.Currency


fun main() {
    println(Currency("GBP").convertTo(Currency("USD")))
    println(Currency("CAD").convertFrom(Currency("CHF")))
}