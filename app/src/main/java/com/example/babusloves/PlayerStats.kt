package com.example.babusloves

open class PlayerStats(private var healthX:Int = 1, private var speedX:Int = 1,
                       private var coinsX:Float = 1F, private var cottonX:Float = 1F,
                       private var costOfHealthX: Int = 50, private var costOfCoinsX: Int = 100,
                       private var costOfSpeedX: Int = 10, private var costOfCottonX: Int = 75) {

    private var moneyUser = MoneyUser()
    fun upHealthX(){
        healthX += if (moneyUser.coinsCurrency == costOfHealthX) 1 else 0

        costOfHealthX *= 2
    }
    fun upSpeedX(){
        speedX += if (moneyUser.coinsCurrency == costOfSpeedX) 1 else 0 // это ещё нужно будет переделать когда займемся игровым процессом
        costOfSpeedX += 10
    }
    fun upCoinsX(){
        if (moneyUser.coinsCurrency == costOfCoinsX){
            coinsX += 0.5F
            moneyUser.coinsCurrency -= costOfCoinsX
            costOfCoinsX *= 2
        }
    }
    fun upCottonX(){
        if (moneyUser.coinsCurrency == costOfCottonX){
            cottonX += 0.5F
            moneyUser.cottonCurrency -= costOfCottonX
            costOfCottonX *= 2
        }
    }

}


