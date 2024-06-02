package com.example.babusloves
open class MoneyUser (open var coinsCurrency: Int = 100, open var cottonCurrency:Int = 10){
    fun setCotton(plusCotton: Int) {
        cottonCurrency + plusCotton
    }
    fun setCoins(minusCoins: Int){
        coinsCurrency + minusCoins
    }

}