package com.example.babusloves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class TutorialThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial_third)

        val prev:Button = findViewById(R.id.button_prev1)
        prev.setOnClickListener {
            val intent0 = Intent(this, TutorialSecondActivity::class.java)
            startActivity(intent0)
        }

        val back:ImageButton = findViewById(R.id.main_button2)
        back.setOnClickListener {
            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }

    }
}