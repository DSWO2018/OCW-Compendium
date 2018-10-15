package com.example.gabriel.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cerrar__sesion.*
import kotlinx.android.synthetic.main.activity_config_cuenta.*

class Cerrar_Sesion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerrar__sesion)
        Retroceder.setOnClickListener {
            val intent: Intent = Intent(this,Config_cuenta::class.java)
            startActivity(intent)
        }
       Salir.setOnClickListener {
            val intent: Intent = Intent(this,SalirSesion::class.java)
            startActivity(intent)
        }

    }
}
