package com.example.babusloves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class TutorialSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial_second)

        val prev:Button = findViewById(R.id.button_prev)
        prev.setOnClickListener {
            val intent0 = Intent(this, TutorialActivity::class.java)
            startActivity(intent0)
        }

        val next:Button = findViewById(R.id.button_next1)
        next.setOnClickListener {
            val intent1 = Intent(this, TutorialThirdActivity::class.java)
            startActivity(intent1)
        }

        val back:ImageButton = findViewById(R.id.main_button1)
        back.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }

    }
}