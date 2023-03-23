package com.example.kotlinparaprincipiantes

class Programmer(
    val nombre: String,
    val edad: Int,
    val lenguajes: Array<Lenguaje>,
    var Amigos: Array<Amigo>? = null
    ) {

    enum class Lenguaje {
        C_SHARP,
        JAVA,
        KOTLIN,
        PASCAL
    }

    enum class Amigo {
        JESUS,
        SARA
    }

    fun codigo(){
        for (lenguaje in lenguajes){
            println("Estoy programando en $lenguaje")
        }
    }
}

