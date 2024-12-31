package com.example.formapp3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameField = findViewById<EditText>(R.id.etName)
        val emailField = findViewById<EditText>(R.id.etEmail)
        val submitButton = findViewById<Button>(R.id.btnSubmit)

        submitButton.setOnClickListener {
            val name = nameField.text.toString().trim()
            val email = emailField.text.toString().trim()

            if (name.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Correctly reference the Details activity
                val intent = Intent(this, Details::class.java)
                intent.putExtra("NAME", name) // Pass the name
                intent.putExtra("EMAIL", email) // Pass the email
                startActivity(intent)
            }
        }
    }
}
