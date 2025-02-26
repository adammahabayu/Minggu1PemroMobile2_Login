package com.example.minggu1pbo2

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = intent.getStringExtra("email") ?: "Tidak ada email"
        val password = intent.getStringExtra("password") ?: "Tidak ada password"

        Log.d("email", email)
        Log.d("password", password)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Welcome, $email"
    }
}
