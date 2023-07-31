package com.example.daniel_moviles

import kotlin.random.Random

class Nequi {
    private var saldoD = 1000000.0
    private val celular = "23212332"
    private val clave = "12345"

    fun iniciar() {
        var intentos = 3
        while (intentos > 0) {
            println("¡Hola! Bienvenido a Nequi.")
            println("Ingrese su número de celular:")
            val celularInput = readLine()
            println("Ingrese su contraseña de 4 dígitos:")
            val contrasena = readLine()

            if (celular == celularInput && clave == contrasena) {
                println("¡Bienvenido de nuevo! Acceso concedido.")
                mostrarSaldo()

                while (true) {
                    mostrarMenu()
                    val opcion = readLine()?.toIntOrNull()

                    when (opcion) {
                        1 -> sacar()
                        2 -> enviar()
                        3 -> recargar()
                        4 -> pagarServicioPublico()
                        5 -> {
                            println("Gracias por usar Nequi. Hasta luego.")
                            return
                        }
                        else -> println("Opción inválida, por favor ingrese una opción válida.")
                    }
                }
            } else {
                intentos--
                println("¡Upps! Datos de acceso no son correctos. Tiene $intentos  más.")
            }
        }

        println("Ha excedido el número máximo de intentos. La aplicación se cerrará.")
    }

    fun mostrarMenu() {
        println("----- Menú de opciones -----")
        println("1. Sacar")
        println("2. Enviar")
        println("3. Recargar")
        println("4. Pagar servicio público")
        println("5. Salir")
        println("----------------------------")
    }

    fun mostrarSaldo() {
        println("Saldo disponible: $saldoD")
    }

    fun sacar() {
        if (saldoD < 2000) {
            println("No te alcanza para retirar.")
        } else {
            println("Elige una opción:")
            println("1. Cajero")
            println("2. Punto físico")
            val opcion = readLine()?.toIntOrNull()

            if (opcion == 1 || opcion == 2) {
                println("Ingrese el valor que quiere retirar:")
                val valorRetiro = readLine()?.toDoubleOrNull()

                if (valorRetiro != null && valorRetiro <= saldoD) {
                    println("Retiro exitoso: ${generarCodigoRetiro()}")
                    saldoD -= valorRetiro
                } else {
                    println("Valor inválido o saldo insuficiente para el retiro.")
                }
            } else {
                println("Opción inválida.")
            }
        }
        mostrarSaldo()
    }

    fun enviar() {
        println("Ingrese el número de teléfono al que desea realizar la transaccion:")
        val numeroTelefono = readLine()
        println("Ingrese el valor a enviar:")
        val valorEnviar = readLine()?.toDoubleOrNull()

        if (valorEnviar != null && valorEnviar <= saldoD) {
            println("Transferencia exitosa. Se envió $valorEnviar a $numeroTelefono")
            saldoD -= valorEnviar
        } else {
            println("Valor inválido o saldo insuficiente para enviar dinero.")
        }
        mostrarSaldo()
    }

    fun recargar() {
        println("Ingrese el valor a recargar:")
        val valorRecarga = readLine()?.toDoubleOrNull()

        if (valorRecarga != null) {
            println("¿Desea realizar la recarga? (Sí/No)")
            val confirmacion = readLine()

            if (confirmacion?.equals("Sí", true) == true) {
                saldoD += valorRecarga
                println("Recarga exitosa. Nuevo saldo: $saldoD")
            } else {
                println("Recarga cancelada.")
            }
        } else {
            println("Valor inválido para la recarga.")
        }
        mostrarSaldo()
    }


    fun pagarServicioPublico() {
        println("Ingrese el valor a pagar por el servicio público:")
        val valorPagar = readLine()?.toDoubleOrNull()

        if (valorPagar != null && valorPagar <= saldoD) {
            println("¿Desea confirmar el pago de $valorPagar por el servicio público? (Sí/No)")
            val confirmacion = readLine()

            if (confirmacion?.equals("Sí", true) == true) {
                saldoD -= valorPagar
                println("Pago exitoso. Nuevo saldo disponible: $saldoD")
            } else {
                println("Pago cancelado.")
            }
        } else {
            println("Valor inválido o saldo insuficiente para realizar el pago del servicio público.")
        }
        mostrarSaldo()
    }

    fun generarCodigoRetiro(): Int {
        return Random.nextInt(100000, 999999)
    }
}

fun main() {
    val nequi = Nequi()
    nequi.iniciar()
}