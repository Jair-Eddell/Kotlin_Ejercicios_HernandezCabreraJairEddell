package Condicionales

fun main(){

    println("escibe el primer numero")
    val num1 = readln().toDouble()

    println("escribe el segundo")
    val  num2 = readln().toDouble()

    if(num1 == num2 ){
        println("es iguak")

    }else if (num1 > num2){
        println("el numero 1 es mayor")
    }else if (num2 > num1){
        println("el numero 2 es mayor ")

    }
}