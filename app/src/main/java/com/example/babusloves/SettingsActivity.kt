package com.example.babusloves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val backToMain:ImageButton = findViewById(R.id.back__to_button)
        backToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val deleteProgress:Button = findViewById(R.id.delete_progress_button)
        deleteProgress.setOnClickListener {
            Toast.makeText(this, "Поздзравляю, всё удалилось, вы великолепны!", Toast.LENGTH_LONG).show()
        }
        val removeAds:Button = findViewById(R.id.remove_ads_button)
        removeAds.setOnClickListener {
            val myDialogFragment = MyDialogFragment()
            val manager = supportFragmentManager
            myDialogFragment.show(manager, "myDialog")
        }
    }
}