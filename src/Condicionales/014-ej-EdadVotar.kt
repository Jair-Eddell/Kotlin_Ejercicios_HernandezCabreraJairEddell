package Condicionales

fun main(){

    println("ingrese su edad a votar")
    val edad = readln().toInt()

    if (edad < 17){
    println("No puede votar")
    }else if (edad >=18){
        println("Puedes votar")
    }

}