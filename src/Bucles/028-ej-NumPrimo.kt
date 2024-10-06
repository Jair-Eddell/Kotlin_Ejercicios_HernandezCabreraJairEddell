package Bucles

fun main() {
    print("Ingresa un número: ")
    val num = readln().toInt()

    var esPrimo = true


    for (i in 2..num / 2) {
        if (num % i == 0) {
            esPrimo = false
            break
        }
    }


    if (esPrimo) {
        println("El número $num es primo.")
    } else {
        println("El número $num no es primo.")
    }
}
