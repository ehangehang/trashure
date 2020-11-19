package com.example.trashure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnBackToLogin = findViewById<ImageView>(R.id.regBackButton)
        btnBackToLogin?.setOnClickListener(){
            startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
        }

        val btnRegister = findViewById<Button>(R.id.regDaftarButton)
        btnRegister?.setOnClickListener(){
            Toast.makeText(this@RegisterActivity, "Terdaftar / Gagal", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
        }

        val btnGplus = findViewById<ImageView>(R.id.regGplus)
        btnGplus?.setOnClickListener(){
            Toast.makeText(this@RegisterActivity, "Login dengan Google Plus", Toast.LENGTH_SHORT).show()
        }

        val btnFacebook = findViewById<ImageView>(R.id.regFb)
        btnFacebook?.setOnClickListener(){
            Toast.makeText(this@RegisterActivity, "Login dengan Facebook", Toast.LENGTH_SHORT).show()
        }

        val registerTxt = findViewById<TextView>(R.id.loginTxt)
        registerTxt?.setOnClickListener(){
            startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
        }

    }
}