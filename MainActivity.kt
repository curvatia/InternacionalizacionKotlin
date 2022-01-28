package com.example.ej532internacionalizacionkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //JAVA
        /*public void CambiarActividad (View view){
        Intent i = new Intent(this, Formulario.class);
        startActivity( i );
        } */

        //KOTLIN
        val intent = Intent(this, Formulario::class.java)
        btnEntrar.setOnClickListener {startActivity(intent)}

    }


}