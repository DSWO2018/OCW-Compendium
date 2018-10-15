package kot.app.com.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cerrar__sesion.*
import kotlinx.android.synthetic.main.activity_salir_sesion.*

class SalirSesion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salir_sesion)
        BtnNo.setOnClickListener {
            val intent: Intent = Intent(this,Cerrar_Sesion::class.java)
            startActivity(intent)
        }
        Btnsi.setOnClickListener {
            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
//El boton Btn si mandara a la pagina creada por Gabriel (Login) para inicar sesion despues de haber presionado si.