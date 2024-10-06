package `A y C`

fun main() {
    print("Ingresa una cadena: ")
    val txt = readln()
    var sumarV = 0
    val vocales = arrayOf("a", "e", "i", "o", "u", "A", "E", "I", "O", "U")

    for (caracter in txt) {
        for (vocal in vocales) {
            if (caracter.toString() == vocal) {
                sumarV++
                break
            }
        }
    }

    println("La cadena contiene $sumarV vocales.")
}

