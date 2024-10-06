package `Variables y tipos de datos`



    fun main() {
        // Solicitar la primera variable al usuario
        print("Introduce el primer valor: ")
        var valor1 = readLine()

        // Solicitar la segunda variable al usuario
        print("Introduce el segundo valor: ")
        var valor2 = readLine()

        // Intercambiar los valores
        var temp = valor1
         valor1 = valor2
         valor2 = temp

        // Mostrar los resultados
        println("nuevo del intercambio:")
        println("Primer valor: $valor1")
        println("Segundo valor: $valor2")

    }

