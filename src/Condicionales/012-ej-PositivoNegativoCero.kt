package Condicionales

fun main (){

    println("ingrese el numero")
    val num = readln().toInt()

    if (num == 0){
        println("es cero")
    }else if (num > 0){
        println("es positivo")
    }else if (num < 0){
        println("es negativo")
    }

}