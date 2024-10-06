package `A y C`

fun main() {
    print("Ingresa una palabra: ")
    val palabra = readln()

    val esPalindromo = palabra == palabra.reversed()

    if (esPalindromo) {
        println("La palabra '$palabra' es un palíndromo.")
    } else {
        println("La palabra '$palabra' no es un palíndromo.")
    }
}
