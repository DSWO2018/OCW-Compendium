package com.example.gabriel.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Share.setOnClickListener {
            val intent:Intent = Intent(this,ShareActivity::class.java)
            startActivity(intent)
}
        Share1.setOnClickListener {
            val intent:Intent = Intent(this,ShareActivity::class.java)
            startActivity(intent)
        }
        Share2.setOnClickListener {
            val intent:Intent = Intent(this,ShareActivity::class.java)
            startActivity(intent)

        }
        Cuenta.setOnClickListener {
            val intent:Intent = Intent(this,Config_cuenta::class.java)
            startActivity(intent)

        }
        Comment.setOnClickListener {
            val intent:Intent = Intent(this,AgregarComentarios::class.java)
            startActivity(intent)

        }
        Comment1.setOnClickListener {
            val intent:Intent = Intent(this,AgregarComentarios::class.java)
            startActivity(intent)

        }
        Comment2.setOnClickListener {
            val intent:Intent = Intent(this,AgregarComentarios::class.java)
            startActivity(intent)

        }
    }
}
