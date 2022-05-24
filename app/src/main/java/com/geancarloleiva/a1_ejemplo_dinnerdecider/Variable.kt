package com.geancarloleiva.a1_ejemplo_dinnerdecider

class Variable {

    fun main(args: Array<String>) {
        val name = "Geancarlo" //inmutable variable
        var isAwesome = true //mutable variable

        println("Is " + name + " awesome? " + isAwesome)

        //se pueden indicar los tipos de una variable, es opcional
        var a: Int = 3
        println(a)
        var b: Float = 1.2f
        println(b)
        var c: Double = 3.3
        println(c)
        var d: Long = 2324L
        println(d)

        //se puede declarar una variable y no inicializarla
        var hero: String? = null //forma 1
        println("first hero: " + hero)
        lateinit var man: String //forma 2
        println("first man: " + man)
        //luego se puede validar si ya está inicializada
        man = "inicializando validando"
        println("second hero: " + hero)
        hero = "inicializando sin validar"
        println("second man: " + man)

        thisIsAFunction("param1", 2, "param3")
    }

    fun thisIsAFunction(thisIsAParameter: String, otherParam: Int, otherOne: String){
        println("One: $thisIsAParameter; two: $otherParam; third: $otherOne")
    }

    fun functionWithReturn(paramA: Int, paramB: Int): Int {
        return paramA + paramB
    }
    val abc = functionWithReturn(2, 4)

    fun funcWithDefaults(param: String = ""): String{
        return param
    }
    var bbb = funcWithDefaults()
    var ccc = funcWithDefaults("hola")

    fun funcionDePruebaParaElNuevoBranch(){
        println("solo es una prueba para validar el funcionamiento de los branch")
    }
}