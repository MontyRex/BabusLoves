package com.example.babusloves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class UpgradeActivity : AppCompatActivity() {
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
        val gold:Button = findViewById(R.id.gold_button)
        val speed:Button = findViewById(R.id.speed_button)
        val health:Button = findViewById(R.id.health_button)


        cotton.setOnClickListener {
            descript.text = "You pressed cotton"
        }
        gold.setOnClickListener {
            descript.text = "You pressed gold"
        }
        speed.setOnClickListener {
            descript.text = "You pressed speed"
        }
        health.setOnClickListener {
            descript.text = "You pressed health"
        }

        val upgrade:Button = findViewById(R.id.upgrade_button)
        val pStat: PlayerStats = PlayerStats()
        val mUser: MoneyUser = MoneyUser()
        var howManyCoins: Int = mUser.coinsCurrency
        upgrade.setOnClickListener {
            Toast.makeText(this, "У вас $howManyCoins coins", Toast.LENGTH_SHORT).show()
        }
    }
}
