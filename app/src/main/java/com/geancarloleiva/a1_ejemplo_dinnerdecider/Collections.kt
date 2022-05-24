package com.geancarloleiva.a1_ejemplo_dinnerdecider

class Collections {

    fun arrays(){
        //list es inmutable
        val lstStr = listOf<String>()
        val lstObj = listOf("Ave", "Perro", "Camello", "Jirafa")
        lstObj.sorted() //Ordena
        lstObj[2]
        lstObj.last()
        lstObj.contains("Perro") //true

        //array es mutable
        var lstLista = arrayListOf<String>()
        lstLista.add("1")
        lstLista.add(0, "2")
        lstLista.remove("1")
        lstLista.add("3")
        lstLista.removeAt(0)

        //map es inmutable
        var mapEjemplo = mapOf("val1" to "valor", "val2" to "ejemplo")
        println(mapEjemplo["val1"]) // igual a .get
        println(mapEjemplo.get("val1")) //igual a []
        mapEjemplo.getOrDefault("val4", "este valor no existe pero se le da un default")

        //hashmap es mutable
        val mapStr = hashMapOf<Int, String>()
        mapStr[0] = "valor"
        mapStr[1] = "otro"
        mapStr.put(2, "mas")
        mapStr.remove(0)

        //llamando al loop
        loops(lstLista, mapStr)
    }

    fun loops(arrayList: ArrayList<String>, mapStr: Map<Int, String>){
        for(str in arrayList){
            println("cada string del arreglo: $str")
        }

        for((key, value) in mapStr){
            println("la clave es $key, y el valor es $value")
        }

        var contador = arrayList.size
        while(!arrayList.isEmpty()){
            contador--
            println(arrayList[contador])
            arrayList.removeAt(contador)
        }
    }

    fun nullable(){
        //si quieres que una variable pueda ser nulo se debe indicar un "?" en su declaración
        val nullStr: String? = null
        var nullStr2: String? = "valor"
        nullStr2 = null

        val nullInt: Int? = null
        var nullInt2: Int? = 2
        nullInt2 = null

        val noNullStr: String = "no Null"
        //para las variables que son definidas como posibilidad de nuelo se debe continuar el "?" para operarlas
        println(noNullStr.length)
        println(nullStr?.length) //sin el "?" nos da error para evitar los NullPointerError

        //haciendo una asignación segura con el "operador Elvis" (como un if corto)
        val len = nullStr2?.length ?: "nullStr2 es nulo, entonces se toma este valor"
    }

}