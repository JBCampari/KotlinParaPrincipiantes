package com.example.kotlinparaprincipiantes

class Programmer(
    val nombre: String,
    val edad: Int,
    val lenguajes: Array<Lenguaje>,
    var Amigos: Array<Programmer>? = null
    ) {

    enum class Lenguaje {
        C_SHARP,
        JAVA,
        KOTLIN,
        PASCAL
    }

    fun Codigo(){
        for (lenguaje in lenguajes){
            println("Estoy programando en $lenguaje")
        }
    }
}