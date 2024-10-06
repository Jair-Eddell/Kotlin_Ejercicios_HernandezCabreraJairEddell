package Bucles

//Lee un número entero y calcula la
//suma de sus dígitos.
//Nota este ejercicio no puede realizarlo solo es su totalidad
fun main() {
    print("Ingresa un número : ")
    val numero = readln().toInt()

    var suma = 0
    var num = Math.abs(numero)

    while (num > 0) {
        suma += num % 10
        num /= 10
    }

    println("La suma de los dígitos de $numero es: $suma")
}
