package `A y C`

fun main() {
    val numeros = arrayOf(10, 20, 30, 40, 50)
    var suma = 0

    for (numero in numeros) {
        suma += numero
    }

    val promedio = suma.toDouble() / numeros.size

    println("El promedio de los elementos es: $promedio")
}
