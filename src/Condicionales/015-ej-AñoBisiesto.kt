package Condicionales
//Escribe un programa que determine si un año es bisiesto.


fun main() {

    print("Ingresa un año: ")
    val año = readln().toInt()

    fun isLeapYear(año: Int): Boolean {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)
    }


    // Verificar si el año es válido
        if (isLeapYear(año)) {
            println("$año es un año bisiesto.")
        } else {
            println("$año no es un año bisiesto.")
        }
    }







