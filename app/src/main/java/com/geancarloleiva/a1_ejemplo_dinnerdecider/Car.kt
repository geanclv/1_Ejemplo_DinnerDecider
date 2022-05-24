package com.geancarloleiva.a1_ejemplo_dinnerdecider

//es necesario que la clase que vaya a ser heredada tenga la palabra "open" al inicio
open class Vehicle constructor(marca: String, var color: String, val modelo: String) {
    //no es necesario tener getters ni setters, lo gestiona automáticamente Kotlin
    val marca = marca

    fun accelerate(){
        println("acelera")
    }

    //"open" hace posible que sea sobreescrita ("override")
    open fun start(){
        println("press the button")
    }
}

class Car(marca: String, color: String, modelo: String, nroPuertas: Int): Vehicle(marca, color, modelo){

    override fun start(){
        super.start() //ejecuta lo del método del padre, y luego lo nuestro (es opcional)
        println("insert the key")
    }

    fun open(){
        println("insert the key from $modelo")
    }
}

fun main (){
    val car = Car("Hyundai", "azul", "deportivo", 3)
    car.accelerate()
    car.start()
    car.open()
}