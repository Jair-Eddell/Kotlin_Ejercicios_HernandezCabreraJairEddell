package Bucles
//Muestra todos los múltiplos de 5 entre 1 y
//un número dado n
fun main()
{
    print("Ingresa un numero: ")
    val n = readln().toInt()


    for (i in 1..n)
    {
        if (i % 5 == 0)
        {
            println("Los múltiplos de 5 entre 1 y $n son: $i")

        }
    }
}
