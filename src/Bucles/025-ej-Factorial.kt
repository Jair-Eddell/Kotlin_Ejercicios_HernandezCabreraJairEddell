package Bucles

//Calcula el factorial de un número dado.
fun main() {
    print("Ingresa un número: ")
    val n = readLine()?.toIntOrNull() ?: 0

    var factorial = 1

    for (i in 1..n) {
        factorial *= i
    }

    println("El factorial de $n es: $factorial")
}
