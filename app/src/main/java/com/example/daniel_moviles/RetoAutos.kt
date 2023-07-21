package com.example.daniel_moviles

class RetoAutos {
}

fun main() {
    val automoviles= mutableListOf <String>()

    var des: Int=1

    do {
        println("1.Registrar auto 2.Mostrar auto 3.Buscar auto 4.Modificar auto 5.Eliminar auto 6. Borrar lista")
        var desci= readLine()!!.toInt()
        when (desci){
        1 ->{
            println("Ingrese el nombre del auto:")
            val nuevoAuto = readLine()?.trim()
            if (!nuevoAuto.isNullOrEmpty()) {
                if (!automoviles.contains(nuevoAuto)) {
                    automoviles.add(nuevoAuto)
                    println("El auto '$nuevoAuto' ha sido registrado.")
                } else {
                    println("El auto '$nuevoAuto' ya está registrado.")
                }
            }
            else {
                println("Nombre de auto inválido.")
            }
        }
            2 -> {
                if (automoviles.isNotEmpty()) {
                    println("\nListado de autos:")
                    automoviles.forEach { auto ->
                        println(auto)
                    }
                } else {
                    println("La lista de autos está vacía.")
                }
            }
            3 -> {
                println("Ingrese el nombre del auto a buscar:")
                val buscarAuto = readLine()?.trim()
                if (!buscarAuto.isNullOrEmpty()) {
                    if (automoviles.contains(buscarAuto)) {
                        println("El auto '$buscarAuto' está en la lista.")
                    } else {
                        println("El auto '$buscarAuto' no está en la lista.")
                    }
                } else {
                    println("Nombre de auto inválido.")
                }
            }
            4 -> {
                println("Ingrese el nombre del auto a modificar:")
                val autoModificar = readLine()?.trim()
                if (!autoModificar.isNullOrEmpty()) {
                    if (automoviles.contains(autoModificar)) {
                        println("Ingrese el nuevo nombre del auto:")
                        val nuevoNombre = readLine()?.trim()
                        if (!nuevoNombre.isNullOrEmpty()) {
                            automoviles[automoviles.indexOf(autoModificar)] = nuevoNombre
                            println("El auto '$autoModificar' ha sido modificado por '$nuevoNombre'.")
                        } else {
                            println("Nombre de auto inválido.")
                        }
                    } else {
                        println("El auto '$autoModificar' no está en la lista.")
                    }
                } else {
                    println("Nombre de auto inválido.")
                }
            }
            5 -> {
                println("Ingrese el nombre del auto a eliminar:")
                val autoEliminar = readLine()?.trim()
                if (!autoEliminar.isNullOrEmpty()) {
                    if (automoviles.remove(autoEliminar)) {
                        println("El auto '$autoEliminar' ha sido eliminado.")
                    } else {
                        println("El auto '$autoEliminar' no se pudo eliminar porque no está en la lista.")
                    }
                } else {
                    println("Nombre de auto inválido.")
                }
            }
            6 -> {
                automoviles.clear()
                println("La lista de autos ha sido borrada.")
            }
        }
        println("Desea seguir realizando acciones 1.Si 2.No")
        des= readLine()!!.toInt()
    }
        while (des ==1)
}
