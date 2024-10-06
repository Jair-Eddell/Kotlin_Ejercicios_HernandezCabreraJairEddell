package Condicionales

fun main(){
    println("Que operacion quire realizar")
    println("sumar es igual a 1")
    println("restar es iagual a 2")
    println("multiplicar es igula a 3")
    println("dividir es igual a 4")

    println("Escriba el numero de su operacion a realizar")
    val num = readln().toInt()
    /*
    val sum = 1
    val res = 2
    val div = 4
    val mul = 3
    */
    if (num == 1){
        println("ingrese su primer numero")
        val num1 = readln().toInt()
        println("ingrese su segundo numero")
        val num2 = readln().toInt()

        val suma = num1 + num2
        println("el resultado de la suma es $suma")
    }else if (num == 2){
        println("ingrese su primer numero")
        val num1 = readln().toInt()
        println("ingrese su segundo numero")
        val num2 = readln().toInt()

        val restar = num1 - num2
        println("Su resultado de la resta es: $restar")
    }else if (num == 3){
        println("ingrese su primer numero")
        val num1 = readln().toInt()
        println("ingrese su segundo numero")
        val num2 = readln().toInt()

        val mul = num1 * num2
        println("La multiplicacion es: $mul")
    }else if (num == 4){
        println("ingrese su primer numero")
        val num1 = readln().toInt()
        println("ingrese su segundo numero")
        val num2 = readln().toInt()

        val div = num1 / num2
        println("La divicion es: $div")
    }
}