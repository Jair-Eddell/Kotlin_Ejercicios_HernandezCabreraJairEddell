package Bucles

fun main() {
    print("Ingresa un numero: ")
    val numero = readln().toInt()

    var num = Math.abs(numero) //convierte lo negativos a positivos
    var contador = 0

    if (num == 0) {
        contador = 1
    } else {
        while (num > 0) {
            num /= 10
            contador++
        }
    }

    println("El numero $numero tiene $contador digito.")
}
