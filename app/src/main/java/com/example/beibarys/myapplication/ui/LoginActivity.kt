package com.example.beibarys.myapplication.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.beibarys.myapplication.R

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