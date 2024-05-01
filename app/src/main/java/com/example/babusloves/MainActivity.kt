package com.example.babusloves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val start:Button = findViewById(R.id.button_start)
        val upgrade:Button = findViewById(R.id.button_upgrade)
        val settings:Button = findViewById(R.id.button_settings)
        val howtoplay:Button = findViewById(R.id.button_howtoplay)

        start.setOnClickListener {
            Toast.makeText(this, "Вы жмакнули на кнопку старт", Toast.LENGTH_SHORT).show()
            val intent0 = Intent(this, ZaglushkaActivity::class.java)
            startActivity(intent0)
        }
        upgrade.setOnClickListener {
            Toast.makeText(this, "Вы жмакнули на кнопку апгрейд", Toast.LENGTH_SHORT).show()
            val intent1 = Intent(this, UpgradeActivity::class.java)
            startActivity(intent1)
        }
        settings.setOnClickListener {
            Toast.makeText(this, "Вы жмакнули на кнопку сеттингс", Toast.LENGTH_SHORT).show()
            val intent2 = Intent(this, ZaglushkaActivity::class.java)
            startActivity(intent2)
        }
        howtoplay.setOnClickListener {
            Toast.makeText(this, "Вы жмакнули на кнопку хау ту плей", Toast.LENGTH_SHORT).show()
            val intent3 = Intent(this, ZaglushkaActivity::class.java)
            startActivity(intent3)
        }

    }
}