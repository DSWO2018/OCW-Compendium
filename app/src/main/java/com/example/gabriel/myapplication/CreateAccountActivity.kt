package com.example.gabriel.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class CreateAccountActivity  : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
