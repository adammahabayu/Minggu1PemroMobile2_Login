package com.example.minggu1pbo2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val button = findViewById<Button>(R.id.loginButton)
        val emailText = findViewById<TextInputEditText>(R.id.editTextEmail)
        val passwordText = findViewById<TextInputEditText>(R.id.editTextPassword)

        button.setOnClickListener {
            val email = emailText.text.toString()
            val password = passwordText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("email", email)
                intent.putExtra("password", password)
                startActivity(intent)
            } else {
                emailText.error = "Email tidak boleh kosong"
                passwordText.error = "Password tidak boleh kosong"
            }
        }
    }
}
