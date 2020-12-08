package com.trallerd.reciver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_text_reciver.*

class TextReciver : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_reciver)

        if(intent.action == Intent.ACTION_SEND && intent.type == "text/plain"){
            val textShered = intent.getStringExtra(Intent.EXTRA_TEXT)
            txtReceiver.text = textShered
        }
    }
}