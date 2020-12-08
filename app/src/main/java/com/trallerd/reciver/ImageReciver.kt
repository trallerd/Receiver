package com.trallerd.reciver

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import kotlinx.android.synthetic.main.activity_image_reciver.*
import kotlinx.android.synthetic.main.activity_text_reciver.*

class ImageReciver : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_reciver)

        if (intent.type == "image/*") {
            (intent.getParcelableExtra<Parcelable>(Intent.EXTRA_STREAM) as? Uri)?.let { uri ->
                imgReceiver.setImageURI(uri)
            }
        }
    }
}