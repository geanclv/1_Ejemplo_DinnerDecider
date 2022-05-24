package com.geancarloleiva.a1_ejemplo_dinnerdecider

class Strings {

    fun main(args: Array<String>){
        var str = "Esto es una prueba"
        println(str)

        str.contentEquals("texto a comaprar") //sentencia básica
        str.contentEquals("texto a comparar", false) //ignorando o no el camel case

        str.contains("parte a comparar") //sentencia básica
        str.contains("parte a comparar", true) //ignorando o no el camel case

        val abc = "abc"
        //para introducir variables en un texto usamos el símbolo $
        println("$str; es diferente a solo str; $abc")
        //incluso podemos operar las variables
        println("${str.uppercase()} : pone todo en mayúsculas; o en minúsculas: ${str.lowercase()}")
    }

    fun conditionals(param: String){
        when(param){
            "a" -> println("coincide acá")
            "b" -> println("coincide acá")
            else -> println("no coincide ninguno")
        }
    }
}