package `Variables y tipos de datos`

/*Crea un programa que
convierta una temperatura dada en grados Celsius a Fahrenheit.
*/
fun main(){

    print("Introduce los grados Celsius: ")
    val gC = readln().toDouble()

    val gF = (gC * 1.8) + 32

    println("La convercion de Grados Celsius: $gC a Grados Fahrenheit es: $gF")

}