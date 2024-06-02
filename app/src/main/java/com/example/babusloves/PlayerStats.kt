package com.example.babusloves

import android.widget.Toast

open class PlayerStats (open var healthX:Int = 1, open var speedX:Int = 1,
                       open var coinsX:Float = 1F, open var cottonX:Float = 1F,
                       open var levelOfHealth:Int = 1, open var levelOfSpeed:Int = 1,
                       open var levelOfCoins:Int = 1, open var levelOfCotton:Int = 1,
                       open var costOfHealthX: Int = -5, open var costOfCoinsX: Int = -1,
                       open var costOfSpeedX: Int = -2, open var costOfCottonX: Int = -7) {

    open var moneyUser:MoneyUser = MoneyUser()
    fun upgradeHealthX(){
        if (moneyUser.coinsCurrency >= costOfHealthX){
            healthX += 1
            moneyUser.setCoins(costOfHealthX)
            costOfHealthX *= 2
        }
    }
    fun upgradeSpeedX(){
        if (moneyUser.coinsCurrency >= costOfSpeedX){
            speedX += 1
            moneyUser.setCoins(costOfSpeedX)
            costOfSpeedX *= 2
        }

    }
    fun upgradeCoinsX(){
        if (moneyUser.coinsCurrency >= costOfCoinsX){
            coinsX += 0.5F
            moneyUser.setCoins(costOfCoinsX)
            costOfCoinsX *= 2
        }
    }
    fun upgradeCottonX(){
        if (moneyUser.coinsCurrency >= costOfCottonX){
            cottonX += 0.5F
            moneyUser.setCoins(costOfCottonX)
            costOfCottonX *= 2
        }
    }

}


