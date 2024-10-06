package `A y C`

fun main() {
    print("Ingresa una cadena: ")
    val cadena = readln()

    val cadenaSinEspacios = cadena.replace(" ", "")

    println("La cadena sin espacios es: $cadenaSinEspacios")
}
