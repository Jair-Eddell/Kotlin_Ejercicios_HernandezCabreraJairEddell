package `Variables y tipos de datos`

fun main(){

    println("ingrese un numero a convertir a kilometros")

    val metros = readln().toDouble()

    val kilom = metros / 1000

    println("Los kilometros son: $kilom")

}