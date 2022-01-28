package com.example.ej532internacionalizacionkotlin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_formulario.*

class Formulario : AppCompatActivity() {

    //CONFIRMAR EMAL
    var sameEmail: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btnAceptar.setOnClickListener {

            //CONFIRMAR EMAIL
            CheckEmail()
            if(! sameEmail) {
                Toast.makeText(this, R.string.etiquetaConfEmail, Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            var person = Person(etNombre.text.toString(),etApellido1.text.toString(),etApellido2.text.toString(),etEmail.text.toString())

            person.etApellido2=etApellido2.text.toString()

            person.rgSocio=(rgSocio.getChildAt(0)as RadioButton).isChecked
            person.rgEdad=(rgEdad.getChildAt(0)as RadioButton).isChecked
            person.rgNacional=(rgNacional.getChildAt(0) as RadioButton).isChecked

            val intent = Intent(this,Resultado::class.java)
            intent.putExtra("data",person)
            startActivity(intent)

        }

    }

    private fun CheckEmail() {

        if (etEmail.text.toString() != etConfEmail.text.toString()) {
            sameEmail = false
            etEmail.setTextColor(Color.RED)
        } else {
            sameEmail = true
            etEmail.setTextColor(Color.BLACK)
            etConfEmail.setTextColor(Color.BLACK)

        }
    }
}