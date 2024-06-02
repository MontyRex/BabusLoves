package com.example.babusloves

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class MyDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle("Вы хотите занести нам денешку и отключить рекламу?")
                .setMessage("Выбери ответ")
                .setCancelable(true)
                .setPositiveButton("Да, хочу, надоела реклама!!") { _, _ ->
                    Toast.makeText(activity,"Реклама отключена",Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("Не, обожаю смотреть рекламу") { _, _ ->
                    Toast.makeText(activity, "Спасибо, что приносите нам деньги, господин!!!",Toast.LENGTH_LONG).show()
                }
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}