package com.example.babusloves

import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyMusicMenu: android.app.Service() {
    private lateinit var player:MediaPlayer

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        player = MediaPlayer.create(this,R.raw.menu)
        player.isLooping = true
        player.setVolume(100f, 100f)
        player.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        player.stop()
        player.release()
    }
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}