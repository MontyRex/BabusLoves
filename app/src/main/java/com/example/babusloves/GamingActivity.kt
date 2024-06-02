package com.example.babusloves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.KeyEvent.*
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageButton
import com.example.babusloves.enums.Direction.*
import android.widget.ImageView
import com.example.babusloves.enums.Direction

const val CELL_SIZE = 40
/*const val VERTICAL_CELL_AMOUNT = 21
const val HORIZONTAL_CELL_AMOUNT = 37
const val VERTICAL_MAX_SIZE = CELL_SIZE * VERTICAL_CELL_AMOUNT
const val HORIZONTAL_MAX_SIZE = CELL_SIZE * HORIZONTAL_CELL_AMOUNT*/
class GamingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gaming)

        val traktor:ImageButton = findViewById(R.id.traktor)
        val myPlayer:ImageView = findViewById(R.id.myPlayer)
        traktor.setOnClickListener {
            myPlayer.setImageResource(R.drawable.traktorist)
            traktor.visibility = View.INVISIBLE
        }
        val pause:ImageButton = findViewById(R.id.pause)
        pause.setOnClickListener {
            //pause_layout.visibility =View.VISIBLE
        }
        val babus:ImageView =findViewById(R.id.babus)
        babus.setOnClickListener {

        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when(keyCode){
            KEYCODE_W -> move(UP)
            KEYCODE_S -> move(DOWN)
            KEYCODE_A -> move(LEFT)
            KEYCODE_D -> move(RIGHT)
        }
        return super.onKeyDown(keyCode, event)
    }
    private fun move(direction: Direction){
        val myPlayer:ImageView = findViewById(R.id.myPlayer)
        when (direction) {
            UP -> {
                //myPlayer.rotation = 0f
                (myPlayer.layoutParams as FrameLayout.LayoutParams).topMargin += -CELL_SIZE
                myPlayer.setImageResource(R.drawable.player_up)
            }
            DOWN -> {
                //myPlayer.rotation = 180f
                (myPlayer.layoutParams as FrameLayout.LayoutParams).topMargin += CELL_SIZE
                myPlayer.setImageResource(R.drawable.player)
//                if((myPlayer.layoutParams as FrameLayout.LayoutParams).leftMargin <= 50)
//                {   val intent = Intent(this, MainActivity::class.java)
//                    startActivity(intent)}
//                if (layoutParams.topMargin + myPlayer.height < HORIZONTAL_MAX_SIZE)
//                (myPlayer.layoutParams as FrameLayout.LayoutParams).topMargin += CELL_SIZE
            }
            RIGHT -> {
                //myPlayer.rotation = 90f
                (myPlayer.layoutParams as FrameLayout.LayoutParams).leftMargin += CELL_SIZE
                myPlayer.setImageResource(R.drawable.player_r)
//                if (layoutParams.leftMargin + myPlayer.width < VERTICAL_MAX_SIZE)
//                (myPlayer.layoutParams as FrameLayout.LayoutParams).leftMargin += CELL_SIZE
            }
            LEFT -> {
                //myPlayer.rotation = 270f
                (myPlayer.layoutParams as FrameLayout.LayoutParams).leftMargin += -CELL_SIZE
                myPlayer.setImageResource(R.drawable.player_l)
//                if((myPlayer.layoutParams as FrameLayout.LayoutParams).marginStart <= 10)
//                {   val intent = Intent(this, MainActivity::class.java)
//                    startActivity(intent)}
//                if (layoutParams.leftMargin > 0) {
//                    (myPlayer.layoutParams as FrameLayout.LayoutParams).leftMargin += -CELL_SIZE
//                }
            }
        }
        val container = findViewById<FrameLayout>(R.id.container)
        container.removeView(myPlayer)
        container.addView(myPlayer)
    }
}