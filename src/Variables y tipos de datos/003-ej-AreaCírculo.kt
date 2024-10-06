package `Variables y tipos de datos`

fun main(){

    print("Introduce el numumero a calcular el area: ")
    val radio = readln().toDouble()

    val area = 3.1416* (radio * radio)

    println("El area es: $area ")
}