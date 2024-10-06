package `Variables y tipos de datos`

fun main(){

    println("ingresa un numero")
    val num = readln().toInt()

    if (num % 2 == 0) {
        println("$num es par.")
    } else {
        println("$num es impar.")
    }

}