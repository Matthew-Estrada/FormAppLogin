package com.example.formapp3


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class Details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val nameText = findViewById<TextView>(R.id.tvName)
        val emailText = findViewById<TextView>(R.id.tvEmail)

        val name = intent.getStringExtra("NAME")
        val email = intent.getStringExtra("EMAIL")

        nameText.text = "Name: $name"
        emailText.text = "Email: $email"
    }
}
