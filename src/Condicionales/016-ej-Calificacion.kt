package Condicionales

//Dada una calificación numérica (0-100), convierte y muestra la letra correspondiente (A, B, C, D o F).


fun main(){

    println("Ingresa tu calificacion")
    val cal = readln().toDouble()

    val calV = when (cal){
        in 90.0 .. 100.0 -> "A"
        in 80.0 .. 89.9 -> "B"
        in 70.0 .. 79.9 -> "C"
        in 60.0 .. 69.9 -> "D"
        else -> "F"

    }

    println("Tu calificacion en letra es $calV")

}