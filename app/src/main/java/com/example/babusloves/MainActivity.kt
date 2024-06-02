package com.example.babusloves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.babusloves.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var isPlaying:Boolean = false
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startService(Intent(this@MainActivity, MyMusicMenu::class.java))
        val start:Button = findViewById(R.id.button_start)
        val upgrade:Button = findViewById(R.id.button_upgrade)
        val settings:Button = findViewById(R.id.button_settings)
        val howtoplay:Button = findViewById(R.id.button_howtoplay)

        start.setOnClickListener {
            val intent0 = Intent(this, GamingActivity::class.java)
            startActivity(intent0)
            stopService(Intent(this@MainActivity, MyMusicMenu::class.java))

        }
        upgrade.setOnClickListener {
            val intent1 = Intent(this, UpgradeActivity::class.java)
            startActivity(intent1)
            stopService(Intent(this@MainActivity, MyMusicMenu::class.java))
        }
        settings.setOnClickListener {
            val intent2 = Intent(this, SettingsActivity::class.java)
            startActivity(intent2)
            stopService(Intent(this@MainActivity, MyMusicMenu::class.java))
        }
        howtoplay.setOnClickListener {
            val intent3 = Intent(this, TutorialActivity::class.java)
            startActivity(intent3)
            stopService(Intent(this@MainActivity, MyMusicMenu::class.java))
        }

    }

}