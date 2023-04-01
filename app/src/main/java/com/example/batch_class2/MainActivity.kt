package com.example.batch_class2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
     lateinit var tvN: TextView
     lateinit var tvN1: TextView
     lateinit var changeBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvN = findViewById(R.id.tvName)
        changeBtn = findViewById(R.id.btName)

        changeBtn.setOnClickListener {
            tvN.text = "I Love Comilla"
        }

    }

}