package com.example.daniel_moviles

class Reto1 {
}

fun main (){
    println("Bienvenido, este es un jego de lanzar 2 dados, Ganas si:" +
            "Sacas un par de unos en los dos dados " +
            "Sacas un total  de tres en los 2 dados\n " +
            "Sacas un total  de tres en los 2 dados\n ")
    var dado1= (1..6).random()
    var dado2= (1..6).random()

    if (dado1 ==1 && dado2 ==1)
    {
        println("Gano con un par de unos")
    }
    else if (dado1 ==2 && dado2 ==1 || dado1 ==2 && dado2 ==1)
    {
        println("Gano al sacar tres")
    }

    else if (dado1 ==5 && dado2 ==6 || dado1 ==6 && dado2 ==5)
    {
        println("Gano al sacar once")
    }
    else  if (dado1 ==6 && dado2 ==6 )
    {
        println("Gano con un par de seis")
    }
    else if (dado1 ==4 && dado2 ==3 || dado1 ==3 && dado2 ==4 || dado1 ==5 && dado2 ==2 || dado1 ==2 && dado2 ==5 || dado1 ==6 && dado2 ==1 || dado1 ==1 && dado2 ==6 )
    {
        println("Gano al sacar 7")
    }

    else {
        println("Perdio")
    }
}