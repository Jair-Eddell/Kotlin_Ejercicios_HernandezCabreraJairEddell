package Bucles

fun main(){

    println("Ingresa un numero")
    val num = readln().toInt()


    for (i in 1 .. 10){
        println( "La tabla es $num :" +" "+ i*num)

    }
}