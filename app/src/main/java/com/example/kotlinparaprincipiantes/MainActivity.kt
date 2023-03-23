package com.example.kotlinparaprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Leccion 1
        //variablesYConstantes()

        //Leccion 2
        //tiposdeDatos()

        //Leccion 3
        //sentenciaIf()

        //Leccion 4
        //sentenciaWhen()

        //Leccion 5
        //arrays()

        //Leccion 6
        //maps()

        //Leccion 7
        //loops()

        //Lección 8
        //nullSafety()

        //Lección 9
        //funciones()

        //Lección 10
        clases()
    }

    private fun variablesYConstantes() {

        //Variables

        var myFirstVariable = "Hello hackersus"

        println(myFirstVariable)

        myFirstVariable = "Bienvenidos a susdev"

        println(myFirstVariable)

    }

    private fun tiposdeDatos(){

        //Tipos de datos

        //String

        val miCadenadeTexto: String = "Hola Hackersus!"
        val miCadenadeTexto2 = "Bienvenidos a Susdev"
        val miCadenadeTexto3: String = miCadenadeTexto + " " + miCadenadeTexto2

        println(miCadenadeTexto3)

        //Enteros (Byte, Short, Int, Long)

        val miEntero: Int = 1
        val miEntero2 = 2
        val miEntero3 = miEntero + miEntero2

        println(miEntero3)

        //Decimales (Float"32bytes", Double"64bytes")

        val miDecimalFlotante: Float = 10.5F
        val miDecimalDoble = 1.5
        val miDecimalOperacion = miDecimalFlotante + miDecimalDoble

        println(miDecimalOperacion)

        //Booleanos (Bool)

        val miBooleano: Boolean = true
        val miBooleano1 = false

        println(miBooleano == miBooleano1)

    }

    private fun sentenciaIf() {

        val miNumero = 16

        //Operadores condicionales
        // >, <, >=, <=, ==, !=

        //Operadores lógicos
        // && "Y"
        // || "O"
        // !  "No"

        if (miNumero >= 5 && miNumero <= 10){
            println("$miNumero es mayor o igual que 5 y menor o igual que 10")
        }else{
            println("$miNumero es menor o igual que 5 o mayor que 10")
        }
    }

    private fun sentenciaWhen () {

        val country = "España"
        val edad	= 99

        when (country){

            "España", "Argentina", "Ecuador" -> {println("El idimoma es español")}
            "EEUU" -> {println("El idimoma es inglés")}
        }

        when (edad){

            0,1,2,3 -> {println("Bebé")}
            in 4..17 -> {println("Niño")}
            in 18..69 -> {println("Adulto")}
            in 70..99 -> {println("Anciano")}
            else -> {println("Centenario")}
        }
    }

    private fun arrays(){

        val nombre = "Jesús"
        val apellido = "Valls"
        val companyia = "Susdev"
        val edad = "56"

        //Creación de un array

        val miArray = ArrayList<String>()

        //Anyadir datos uno a uno

        miArray.add(nombre)
        miArray.add(apellido)
        miArray.add(companyia)
        miArray.add(edad)

        //Anyadir un conjunto de datos

        miArray.addAll(listOf("Hola", "Bienvenidos al tutorial"))

        println(miArray)

        //Acceso a datos

        val miCompanyia = miArray[2]

        println(miCompanyia)

        //Modificar datos

        miArray[5] = "Iros a la mierda que han puesto un centro comercial"

        println(miArray)

        //Eliminar datos

        miArray.removeAt(4)

        println(miArray)

        //Recorrer datos

        miArray.forEach{
            println(it)
        }

        //Otras operaciones

        miArray.clear()

        miArray.count()

        miArray.first()

        miArray.last()

        miArray.sort()

        val myNumericArray = (0..20)
        for (myNum in myNumericArray){
            println(myNum)
        }

    }

    //Aquí vamos a habar de mapas, también llamados diccionarios

    fun maps(){

        //Sintaxis mapa no mutable
        //var myMap: Map<String,Int> = mapOf()

        //Sintaxis mapa
        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        //Añadir elementos
        //myMap = mapOf("Jesús" to 1, "María José" to 2, "Toni" to 5 )

        //Cambiar a mapa mutable
        myMap = mutableMapOf("Jesús" to 1, "María José" to 2, "Toni" to 5 )
        println(myMap)

        //Añadir un solo valor (solo si el mapa es mutable)
        myMap["Eva"] = 7
        myMap.put("Angel", 8)

        //Actualización de un dato
        myMap.put("Brais", 8)
        myMap.put("Brais", 9)
        println(myMap)

        //Acceso a un dato
        println(myMap["Jesús"])

        //Eliminar un dato
        myMap.remove("Brais")
        println(myMap)

    }

    //Aquí vamos a hablar de loops, también llamados bucles.
    private fun loops(){

        //Bucles
        val myArray: List<String> = listOf("Hola","Bienvenidos al tutorial", "Suscirbete")
        val myMap: MutableMap<String,Int> = mutableMapOf("Jesús" to 1, "María José" to 2, "Toni" to 5)

        //For
        for(myString in myArray){
            println(myString)
        }

        for(myElement in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10){
            println(x)
        }

        println("\n")

        for (x in 0 until 10){
            println(x)
        }

        println("\n")

        for (x in 0..10 step 2){
            println(x)
        }

        println("\n")

        for (x in 20 downTo 0 step 3){
            println(x)
        }

        println("\n")

        val myNumericArray = (0..20 step 4)
        for (myNum in myNumericArray){
            println(myNum)
        }

        println("\n")

        //While
        var x = 0

        while (x < 10){
            println(x)
            x++
        }

    }

    //Aqui vamos a hablar de seguridad contra nulos (Null Safety)
    private fun nullSafety(){
        var myString = "SusDev"
        //myString = null (Esto da un error de compilación)
        println(myString)

        //Variable Null Safety
        var mySafetyString: String? = "SusDev null safety"
        mySafetyString = null
        println(mySafetyString)
        mySafetyString = "SusDev"

        /*if (mySafetyString != null){
         *   println(mySafetyString!!)
        }*/

        //Safe calls
        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        } ?: run {
            println(mySafetyString)
        }
    }

    //Aquí vamos a habar de funciones
    private fun funciones(){
        var saludo = 1
        while (saludo < 10){
            diHola()
            saludo++
        }

        diMiNombre("Jesús")

        diMiNombreyEdad("Jesus", 56)

        val resultadoSuma = sumaDosNumeros(15,20)
        println(resultadoSuma)

        println(sumaDosNumeros(25,75))

        println(sumaDosNumeros(4,sumaDosNumeros(3,6)))

    }

    //Función simple
    fun diHola(){
        println("Hola!")
    }

    //Funciones con un parámetro de entrada
    fun diMiNombre(nombre:String){
        println("Hola, mi nombre es $nombre")
    }

    //Funciones con más de un parámetro de entrada
    fun diMiNombreyEdad(nombre:String, edad: Int){
        println("Hola, mi nombre es $nombre y tengo $edad años")
    }

    //Funciones con un valor de retorno
    fun sumaDosNumeros(primerSumando: Int, segundoSumando: Int): Int {
        val suma = primerSumando + segundoSumando
        return suma
    }

    //Aquí vamos a hablar de las clases.
    fun clases (){

        val Jesus = Programmer("Jesus", 56, arrayOf(Programmer.Lenguaje.KOTLIN,Programmer.Lenguaje.PASCAL), arrayOf(Programmer.Amigo.SARA))
        println(Jesus.nombre)
        println(Jesus.edad)
        println(Jesus.lenguajes[1])
        Jesus.codigo()
        println("${Jesus.Amigos?.last()} es amigo de ${Jesus.nombre}")

        val Sara = Programmer("Sara",33, arrayOf(Programmer.Lenguaje.JAVA, Programmer.Lenguaje.C_SHARP), arrayOf(Programmer.Amigo.JESUS))
        println(Sara.nombre)
        println(Sara.edad)
        println(Sara.lenguajes[1])
        Sara.codigo()
        println("${Sara.Amigos?.first()} es amigo de ${Sara.nombre}")

    }

}