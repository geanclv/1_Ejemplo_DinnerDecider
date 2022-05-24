package com.geancarloleiva.a1_ejemplo_dinnerdecider

class Lambdas {

    fun main(){
        //Lambda es una función no declarada que se escribe como expresión, características:
        //- siempre usa los "{...}",
        //- los parámetros van antes del "->"
        //- luego del "->" viene el cuerpo del lambda, lo que se devuelve
        val mensaje = {message: String, value: Int -> println("este es el mensaje: $message")}
        mensaje("hola", 2)

        //otras formas de escribir lambda
        val suma: (Int, Int) -> Int = {x, y -> x + y}
        println(suma(3, 4))

        //llamando a la función asincrona
        downloadData("fakeUrl", {
            println("este segmento es un lambda que se ejecuta luego de que la función haya terminado")
        })

        //otras formas de llamar la función asincrona
        downloadCarData("fakeUrl"){
            //toma "it" como el nombre del objeto retornado
            println(it.marca)
        }
        downloadCarData("url"){ carro-> //si declaramos este dato reemplaza el "it"
            println(carro.marca)
        }

        //función multi valores de retorno
        downloadMultiReturn("url"){auto, cantidad, exito ->
            if(exito){
                println("Existen $cantidad autos, marca: ${auto?.marca}, color: ${auto?.color}")
            } else {
                println("No existen autos")
            }
        }
    }

    //simulando una función asincrona
    //Unit es el similar a void, es decir al completar (completion) retornar "nada" (void)
    fun downloadData(url: String, completion: ()->Unit){
        //operations to download the data, update UI, or whatever you need
        //when complete we call "completion()"
        completion()
    }

    fun downloadCarData(url: String, completion: (Car)->Unit){
        //enviamos una solicitud de descarga... la data descarga
        val car = Car("tesla", "gris", "suv", 5)
        completion(car)
    }

    fun downloadMultiReturn(url: String, completion: (Car?, Int, Boolean) ->Unit){
        //enviamos una solicitud de descarga... la data descarga
        val existeData = true
        if(existeData){
            val car = Car("honda", "gris", "sedan", 5)
            completion(car, 1, true)
        } else {
            completion(null, 0, false)
        }
    }
}