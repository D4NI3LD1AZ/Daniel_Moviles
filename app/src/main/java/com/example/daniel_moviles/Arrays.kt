package com.example.daniel_moviles

class Arrays {
}
fun main() {
   val pets = arrayOf("dog", "cat", "canary")
    println(pets.contentToString())
    print(pets[1])

    pets[2] = "parrot"
    print(pets[2])
    println(pets.contentToString())

    /*for ((index, element) in pets.withIndex()) {
        println("la mascota en la posicion $index es $element")
    }

    val instruments = mutableListOf("trumpet", "piano", "violin")
    println(instruments)

    val instrumentos: List<String> = listOf("trumpet", "piano", "violin")
    println(instrumentos)
    print(instruments[1])

    instruments[2] = "guitar"
    println(instruments)*/

    val instruments = mutableListOf("trumpet", "piano", "violin")

    //mostrar primer y ultimo elemento de una lista
    val primer= instruments.first()
    val ultimo= instruments.last()
    println("El primer elemento es $primer")
    println("El primer elemento es $ultimo")

    //agregar un elemento a una lista mutable
    instruments.add("maracas")
    println(instruments)
    //varios elementos
    instruments.addAll (listOf("flauta","drums"))
    println(instruments)

    //como quitar elementos a una lista mutable
    instruments.remove("flauta")
    println(instruments)

    //Buscar elementos en una lista mutable
    val busc = "violin"

    if (instruments.contains(busc)) {
        println("$busc está presente en la lista.")
    } else {
        println("$busc no está en la lista.")
    }

    //Que pasa si se quita un elemento  que no existe
    instruments.removeAt(8)
    println(instruments)

    //como quitar elemntos de una lista a traves del index
    instruments.removeAt(3)
    println(instruments)

    //como borrar la lista completa
    instruments.removeAll(instruments)
    println(instruments)

}
