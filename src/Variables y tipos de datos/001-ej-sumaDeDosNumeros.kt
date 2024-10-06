package `Variables y tipos de datos`

/*Escribe un programa que solicite dos
números al usuario y muestre su suma.
*/
fun main(){
    print("Introduce el primer número: ")
    val num1 = readln().toDouble()


    print("Introduce el segundo número: ")
    val num2 = readln().toDouble()

    val suma = num1 + num2


    println("La suma es: $suma")
}