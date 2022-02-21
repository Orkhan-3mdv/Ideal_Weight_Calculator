package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class Girisi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_girisi)

        val btn1 = findViewById<ImageButton>(R.id.imageButton4)
        val btn2 = findViewById<ImageButton>(R.id.imageButton5)
        btn1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent2 = Intent(this,WebWiew
            ::class.java)
            startActivity(intent2)
        }

    }


}