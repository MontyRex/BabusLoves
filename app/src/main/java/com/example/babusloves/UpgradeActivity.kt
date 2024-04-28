package com.example.babusloves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class UpgradeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upgrade)
        val backToMain:Button = findViewById(R.id.back_to_main_button)
        val ad:Button = findViewById(R.id.add_button)

        backToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        ad.setOnClickListener {
            val intent = Intent(this, ZaglushkaActivity::class.java)
            startActivity(intent)
        }

        val currency:TextView = findViewById(R.id.currency_text)
            //currency.setContentView(R.id.description)

        val cotton:Button = findViewById(R.id.cotton_button)
        val gold:Button = findViewById(R.id.gold_button)
        val speed:Button = findViewById(R.id.speed_button)
        val health:Button = findViewById(R.id.health_button)
        //val description: TextView = findViewById(R.id.)

        cotton.setOnClickListener {

        }

        val upgrade:Button = findViewById(R.id.upgrade_button)



    }
}
