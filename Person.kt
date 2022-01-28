package com.example.ej532internacionalizacionkotlin

import java.io.Serializable

class Person (var etNombre: String, var etApellido1: String, var etTelefono: String, var etEmail: String): Serializable {

    var etApellido2: String = ""
    var rgSocio: Boolean = false
    var rgEdad: Boolean = false
    var rgNacional: Boolean = false

    override fun toString(): String {
        return "Nombre: $etNombre\r\n" +
                "Primer Apellido: $etApellido1\r\n" +
                "Segundo Apellido: $etApellido2\r\n" +
                "Telefono: $etTelefono\r\n" +
                "Email: $etEmail\r\n" +
                "Socio: $rgSocio\r\n" +
                "Edad: $rgEdad\r\n " +
                "Nacional: $rgNacional"
    }

}