package Condicionales

//Multiplica dos números sin usar el
//operador de multiplicación.

//Nota No consegui realizarlo con numero decimales

fun main (){

    println("Ingresa tu num: ")
    val num1 = readln().toInt()
    println("ingresa el segundo num: ")
    val num2 = readln().toInt()

    var res = 0

    for (i in 1..num2) {
        res += num1
    }

    println("el resultado es: $res")
}

