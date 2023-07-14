package com.example.daniel_moviles

class Ciclos {

}
fun main() {
    var contador1: Int = 0
    var contador2: Int = 0
    var sumapar: Int = 0
    var sumaimpar: Int = 0

    var number: Int = 1
    do{
        println("Ingrese un numero")
        var num = readLine()!!.toInt()
        if (num <= 0) {
            println("El numero es negativo o cero")
            break
        } else {
            var value = num % 2
            if (value == 0) {
                contador1 = contador1 + 1
                sumapar = sumapar + num
            }
            else {
                contador2 = contador2 + 1
                sumaimpar = sumaimpar + num
            }
        }
        print("Desea Seguir ingresando  numeros 1.Si 2.No")
        number= readLine()!!.toInt()
    }
    while (number == 1)

println("El total de numeros pares es $contador1")
println("El total de numeros impares es $contador2")
println("La suma de los pares es $sumapar")
println("La suma de los impares es $sumaimpar")


    /*while (number == 1){
        println("Ingrese un numero")
        var num = readLine()!!.toInt()
        if (num <= 0) {
            println("El numero es negativo o cero")
            break
        } else {
            var value = num % 2
            if (value == 0) {
                contador1 = contador1 + 1
                sumapar = sumapar + num
            }
            else {
                contador2 = contador2 + 1
                sumaimpar = sumaimpar + num
            }
        }
        print("Desea Seguir ingresando  numeros 1.Si 2.No")
        number= readLine()!!.toInt()
    }
    println("El total de numeros pares es $contador1")
    println("El total de numeros impares es $contador2")
    println("La suma de los pares es $sumapar")
    println("La suma de los impares es $sumaimpar")*/

 /*   var contador1:Int=0
    var contador2: Int=0
    var sumapar:Int=0
    var sumaimpar:Int=0

    for (i in 1..10){
        println("Ingrese un numero")
        var num= readLine()!!.toInt()
        if (num <=0){
            println("El numero es negativo o cero")
            break
        }
        else {
            var value = num % 2
            if (value == 0) {
                contador1 = contador1 + 1
                sumapar=sumapar+num
            } else {
                contador2 = contador2 + 1
                sumaimpar=sumaimpar+num
            }
        }
    }
    println("El total de numeros pares es $contador1")
    println("El total de numeros impares es $contador2")
    println("La suma de los pares es $sumapar")
    println("La suma de los impares es $sumaimpar")*/
}

