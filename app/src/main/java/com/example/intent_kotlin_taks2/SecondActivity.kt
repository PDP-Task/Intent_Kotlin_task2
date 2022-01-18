package com.example.intent_kotlin_taks2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textData: TextView = findViewById(R.id.text_data)

        val text = intent.getSerializableExtra("key")
        textData.text = text.toString()
    }
}