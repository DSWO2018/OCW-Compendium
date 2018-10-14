package com.example.gabriel.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity  : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setTitle("OCW Compendium")
        universityButton.setOnClickListener {
            val intent = Intent(this, UniversityListActivity::class.java)
            startActivity(intent)
        }
    }

}