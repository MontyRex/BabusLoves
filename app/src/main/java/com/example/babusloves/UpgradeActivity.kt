package com.example.babusloves

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class UpgradeActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upgrade)

        val backToMain:ImageButton = findViewById(R.id.back_to_main_button)
        val ad:ImageButton = findViewById(R.id.add_button)

        backToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        ad.setOnClickListener {
            val intent = Intent(this, ZaglushkaActivity::class.java)
            startActivity(intent)
        }

        val descript:TextView = findViewById(R.id.description)
        val cotton:Button = findViewById(R.id.cotton_button)
        val coins:Button = findViewById(R.id.coins_button)
        val speed:Button = findViewById(R.id.speed_button)
        val health:Button = findViewById(R.id.health_button)
        var textHolder = ""

        cotton.setOnClickListener {
            descript.text = "Multiplies cotton per babus by 1,5\n" +
                    " Cost: 10"
            textHolder = "cotton"
        }
        coins.setOnClickListener {
            descript.text = "Multiplies coin per cotton by 1,5\n" +
                    " Cost: 10"
            textHolder = "coins"
        }
        speed.setOnClickListener {
            descript.text = "Multiplies your movement speed by 5\n" +
                    " Cost: 10"
            textHolder = "speed"
        }
        health.setOnClickListener {
            descript.text = "Increases your health by 1\n Cost: 10"
            textHolder = "health"
        }

        val upgrade:Button = findViewById(R.id.upgrade_button)
        val pStat = PlayerStats()
        val mUser = MoneyUser()

        var lvlOfSpeed:Int = pStat.levelOfSpeed
        var lvlOfHealth:Int = pStat.levelOfHealth
        var lvlOfCoins:Int = pStat.levelOfCoins
        var lvlOfCotton:Int = pStat.levelOfCotton

        var currency:TextView = findViewById(R.id.currency_text)
        var howManyCoins:Int = mUser.coinsCurrency
        currency.text = "$howManyCoins"

        upgrade.setOnClickListener {
            when (textHolder) {
                "health" -> {
                    pStat.upgradeHealthX()
                    Toast.makeText(this, "Вы улучшили $textHolder", Toast.LENGTH_SHORT).show()
                    currency.text = "$howManyCoins"
                    health.text = "Health\n lvl $lvlOfHealth"
                }
                "speed" -> {
                    pStat.upgradeSpeedX()
                    Toast.makeText(this, "Вы улучшили $textHolder", Toast.LENGTH_SHORT).show()
                    currency.text = "$howManyCoins"
                    speed.text = "Speed\n lvl $lvlOfSpeed"

                }
                "coins" -> {
                    pStat.upgradeCoinsX()
                    Toast.makeText(this, "Вы улучшили $textHolder", Toast.LENGTH_SHORT).show()
                    currency.text = "$howManyCoins"
                    coins.text = "Coins\n lvl $lvlOfCoins"
                }
                "cotton" -> {
                    pStat.upgradeCottonX()
                    Toast.makeText(this, "Вы улучшили $textHolder", Toast.LENGTH_SHORT).show()
                    currency.text = "$howManyCoins"
                    cotton.text = "Cotton\n lvl $lvlOfCotton"
                }
                else -> {
                    Toast.makeText(this, "Выберите что вы хотите улучшить", Toast.LENGTH_SHORT).show()
                    currency.text = "$howManyCoins"

                }
            }

        }



    }
}
