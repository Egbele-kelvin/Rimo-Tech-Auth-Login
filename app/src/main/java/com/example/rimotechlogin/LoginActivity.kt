package com.example.rimotechlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        get_started_button.setOnClickListener {
            val email = email_text.text.toString().trim()
            val password = password_text.text.toString().trim()

            //email validation
            if(email.isEmpty()){
                email_text.error = "Email required"
                email_text.requestFocus()
                return@setOnClickListener
            }
            // password validation
            if(password.isEmpty()){
                password_text.error = "Password required"
                password_text.requestFocus()
                return@setOnClickListener
            }

            if  (email == "kelvinfresh101@gmail.com" && password == "1234567"){
                val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
                startActivity(intent)
                val toast = Toast.makeText(applicationContext, "Welcome Wale !", Toast.LENGTH_SHORT).show()
            }else {
                val toast = Toast.makeText(applicationContext, "Invalid Email or Password", Toast.LENGTH_SHORT).show()
            }



        }
    }
}