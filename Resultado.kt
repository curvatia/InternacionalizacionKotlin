package com.example.ej532internacionalizacionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var inte = intent
        var persona = inte.getSerializableExtra("data") as Person

        tvResultados.text = persona.toString()

    }
}