package `A y C`

fun main() {
    val numeros = intArrayOf(10, 25, 7, 34, 19)
    var mayor = numeros[0]

    for (i in numeros) {
        if (i > mayor) {
            mayor = i
        }
    }

    println("El número mayor es: $mayor")
}
