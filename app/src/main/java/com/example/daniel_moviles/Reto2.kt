package com.example.daniel_moviles

class Reto2 {
}
fun main () {
    println(
        "Bienvenido al supermercado Noe, estamos de aniversario y te obsequiamos un descuento en el valor de tu compra, si esta es mayor a 50.000 y dependiendo de tu suerte:\n" +
                "Si scas 1 es la bolita roja, que tiene un descuento del 10% en el valor de tu compra\n" +
                "Si scas 2 es la bolita azul, que tiene un descuento del 30% en el valor de tu compra\n" +
                "Si scas 3 es la bolita amarilla, que tiene un descuento del 50% en el valor de tu compra\n" +
                "Si scas 4 es la bolita blanca, te llevas tu compra totalmente gratis\n"
    )

    println("Ingrese el valor de la compra")
    var compra = readLine()!!.toInt()
    var bola = (1..4).random()

    if (compra > 50000) {

        if (bola == 1) {
            println("Usted tiene un descuento del 10%, al sacar la bola roja");
            var desc = (compra + 10) / 100;
            var total = compra - desc;
            println("Su valor a pagar con el descuento es del: " + total);
        } else if (bola == 2) {
            println("Usted tiene un descuento del 30%, al sacar la bola azul");
            var desc = (compra + 30) / 100;
            var total = compra - desc;
            println("Su valor a pagar con el descuento es del: " + total);
        } else if (bola == 3) {
            println("Usted tiene un descuento del 50%, al sacar la bola amarilla");
            var desc = (compra + 50) / 100;
            var total = compra - desc;
            println("Su valor a pagar con el descuento es del: " + total);
        } else if (bola == 4) {
            println("Usted tiene un descuento del 100%, al sacar la bola blanca. Feliicidades su compra es gratis");
            var desc = (compra + 100) / 100;
            var total = compra - desc;
            println("Su valor a pagar con el descuento es del: " + total);
        } else {
            println("Usted no cuenta con ningun descuento.");
            println("Su total a pagar es ${compra}");
        }
    }
}