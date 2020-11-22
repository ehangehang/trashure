package com.example.trashure

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val rememberMeTxt = findViewById<CheckBox>(R.id.rememberMe)

        val forgotPass = findViewById<TextView>(R.id.forgotPass)
        forgotPass?.setOnClickListener(){
            Toast.makeText(this@LoginActivity, "Function Lupa Password", Toast.LENGTH_SHORT).show()
        }

        val btnMasuk = findViewById<Button>(R.id.buttonLogin)
        btnMasuk?.setOnClickListener(){
            startActivity(Intent(this@LoginActivity, HomeActivity::class.java))
        }

        val btnGplus = findViewById<ImageView>(R.id.loginGplus)
        btnGplus?.setOnClickListener(){
            Toast.makeText(this@LoginActivity, "Login dengan Google Plus", Toast.LENGTH_SHORT).show()
        }

        val btnFacebook = findViewById<ImageView>(R.id.loginFacebook)
        btnFacebook?.setOnClickListener(){
            Toast.makeText(this@LoginActivity, "Login dengan Facebook", Toast.LENGTH_SHORT).show()
        }

        val registerTxt = findViewById<TextView>(R.id.registerTxt)
        registerTxt?.setOnClickListener(){
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
        }
    }
}