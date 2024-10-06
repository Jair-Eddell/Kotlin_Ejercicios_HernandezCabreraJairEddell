package `Variables y tipos de datos`

fun main(){

    println("Escribe un numero para los dias para saber el dia de la semana")
    val num = readln().toInt()

    when(num) {
        1-> println("lunes")
        2-> println("martes")
        3-> println("miercoloes")
        4-> println("jueves")
        5-> println("viernes")
        6-> println("sabado")
        7-> println("domingo")
        else-> println("no hay mas dias")
    }

}