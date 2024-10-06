package Bucles

fun main() {
    print("Ingresa un número: ")
    val num = readln().toInt()

    println("Los números pares entre 1 y $num son:")
    for (i in 1..num) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
