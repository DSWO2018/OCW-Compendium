package kot.app.com.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cambiarcuenta.*
import kotlinx.android.synthetic.main.activity_config_cuenta.*

class Cambiarcuenta : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambiarcuenta)
        Salirr.setOnClickListener {
            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
// En lugar de Main seria login de gabriel ya que es para ingresar de nuevo .