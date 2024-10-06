package Condicionales
//Pide un número del 1 al 12 y muestra el mes
//correspondiente.
fun main() {
    print("Ingresa un número del 1 al 12: ")
    val num = readln().toInt()

    if (num in 1..12) {
        when (num) {
            1 -> println("Enero")
            2 -> println("Febrero")
            3 -> println("Marzo")
            4 -> println("Abril")
            5 -> println("Mayo")
            6 -> println("Junio")
            7 -> println("Julio")
            8 -> println("Agosto")
            9 -> println("Septiembre")
            10 -> println("Octubre")
            11 -> println("Noviembre")
            12 -> println("Diciembre")
        }
    } else {
        println("ingresa un número del 1 al 12.")
    }
}
