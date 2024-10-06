package Bucles
//Dado un número entero, invierte el orden de sus
//dígitos.
fun main() {
    print("Ingresa un numero entero: ")
    var num = readln().toInt()


    var numeroI = 0

    while (num > 0) {
        val digito = num % 10
        numeroI = numeroI * 10 + digito
        num /= 10
    }



    println("El número invertido es: $numeroI")
}