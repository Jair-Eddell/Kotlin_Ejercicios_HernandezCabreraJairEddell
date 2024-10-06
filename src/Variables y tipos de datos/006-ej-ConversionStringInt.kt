package `Variables y tipos de datos`

fun main(){

    print("Introduce el primer número: ")
    val dig1 = readln()

    try {
        val digCambio = dig1.toInt()

        println("el numero que cambio de String a Int es: $digCambio")

    }catch (e: NumberFormatException){
        println("Debe ser un numero")
    }



}