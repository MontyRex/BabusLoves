package com.example.babusloves

open class MoneyUser (open var coinsCurrency:Int = 1000,open var cottonCurrency:Int = 1000){
    fun addCotton(plusCotton: Int) {
        cottonCurrency += plusCotton
    }
    fun downCotton(minusCotton: Int){
        cottonCurrency -= minusCotton
    }

    fun addCoins(plusCoins: Int) {
        coinsCurrency += plusCoins
    }
    fun downCoins(minusCoins: Int){
        coinsCurrency -= minusCoins
    }

}