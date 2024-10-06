package `A y C`

fun main() {
    val num = arrayOf(1, 2, 3, 2, 4, 5, 1, 6, 3, 4)
    val repetidos = mutableSetOf<Int>()

    for (i in num.indices) {
        for (j in i + 1 until num.size) {
            if (num[i] == num[j]) {
                repetidos.add(num[i])
            }
        }
    }

    if (repetidos.isNotEmpty()) {
        println("Los números repetidos son: ${repetidos.joinToString(", ")}")
    } else {
        println("No hay números repetidos.")
    }
}
