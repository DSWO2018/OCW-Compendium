package com.example.gabriel.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_config_cuenta.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_share.*

class Config_cuenta : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config_cuenta)
        Historial.setOnClickListener {
            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        Retroceso.setOnClickListener {
            val intent: Intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        Cambiarcuenta1.setOnClickListener {
            val intent: Intent = Intent(this,Cambiarcuenta::class.java)
            startActivity(intent)
        }
        CerrarSesion1.setOnClickListener {
            val intent: Intent = Intent(this,LogInActivity::class.java)
            startActivity(intent)
        }
    }
}
// En lugar de MainActivity sera la de login de gabriel