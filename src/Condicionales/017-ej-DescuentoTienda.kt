package Condicionales
//Pide el precio de un producto y aplica un
//descuento del 20% si supera los 1000.

fun main(){

    println("Precio del producto")
    val pre = readln().toDouble()

    if (pre >= 1000){
        val costoF = pre * 0.80
        println("Tu costo por ser un producto mayor a 1000 es $costoF")
    }else if (pre < 1000){
        println("tu costo es $pre")
    }

}