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
            val intent = Intent(this, ZaglushkaActivity::class.java)
            startActivity(intent)
        }
        upgrade.setOnClickListener {
            Toast.makeText(this, "Вы жмакнули на кнопку апгрейд", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ZaglushkaActivity::class.java)
            startActivity(intent)
        }
        settings.setOnClickListener {
            Toast.makeText(this, "Вы жмакнули на кнопку сеттингс", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ZaglushkaActivity::class.java)
            startActivity(intent)
        }
        howtoplay.setOnClickListener {
            Toast.makeText(this, "Вы жмакнули на кнопку хау ту плей", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ZaglushkaActivity::class.java)
            startActivity(intent)
        }

    }
}