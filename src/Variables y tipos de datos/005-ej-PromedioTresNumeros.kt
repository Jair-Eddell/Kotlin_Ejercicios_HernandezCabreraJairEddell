package `Variables y tipos de datos`

fun main(){

    print("Introduce el primer número: ")
    val num1 = readln().toDouble()


    print("Introduce el segundo número: ")
    val num2 = readln().toDouble()

    print("Introduce el Terser número: ")
    val num3 = readln().toDouble()

    val suma = (num1 + num2 + num3) / 3


    println("El promedio es: $suma")

}