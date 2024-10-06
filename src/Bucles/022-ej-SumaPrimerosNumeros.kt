package Bucles

fun main(){
    println("ingresa el num")
    val num = readln().toInt()

    var suma = 0
    for (i in 1 .. num){
        suma += i
    }
    println("La suma es de $num es $suma")
}