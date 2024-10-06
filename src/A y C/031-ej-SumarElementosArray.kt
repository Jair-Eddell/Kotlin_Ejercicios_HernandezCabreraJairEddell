package `A y C`

fun main() {
    val num = intArrayOf(1, 5, 3, 5, 5)
    var suma = 0

    for (numero in num) {
        suma += numero
    }

    println("La suma del array es: $suma")
}
