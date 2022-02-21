package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.ImageButton

class WebWiew : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_wiew)

        val btn = findViewById<ImageButton>(R.id.imageButton)

        btn.setOnClickListener {
            val intent = Intent(this,Girisi::class.java)
            startActivity(intent)
        }

    }
}



