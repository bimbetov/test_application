package com.example.beibarys.test_application.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.beibarys.test_application.R

class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)


    }

    fun signIn(view: View){
        val signInIntent = Intent(this, MainActivity::class.java)
        startActivity(signInIntent)
    }
}