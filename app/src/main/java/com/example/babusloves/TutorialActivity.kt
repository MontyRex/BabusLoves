package com.example.babusloves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class TutorialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        val back: ImageButton = findViewById(R.id.main_button)
        back.setOnClickListener {
            val intent0 = Intent(this, MainActivity::class.java)
            startActivity(intent0)
        }
        val next:Button = findViewById(R.id.button_next)
        next.setOnClickListener {
            val intent1 = Intent(this, TutorialSecondActivity::class.java)
            startActivity(intent1)
        }

    }
}