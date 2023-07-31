import kotlin.math.PI

fun main() {
    println("¿Qué figura deseas calcular? (1 - Círculo):")
    val opcion = readLine()?.toInt() ?: return

    when (opcion) {
        1 -> calcularCirculo()
        else -> println("Opción no válida.")
    }
}

fun calcularCirculo() {
    println("Ingrese el radio del círculo:")
    val radio = readLine()?.toDouble() ?: return

    val perimetro = calcularPerimetroCirculo(radio)
    val area = calcularAreaCirculo(radio)

    println("El perímetro del círculo es: $perimetro")
    println("El área del círculo es: $area")
}

fun calcularPerimetroCirculo(radio: Double): Double {
    return 2 * PI * radio
}

fun calcularAreaCirculo(radio: Double): Double {
    return PI * radio * radio
}
