package Condicionales

//Solicita tres números y muestra el mayor, el
//intermedio y el menor.
fun main(){
    println("Ingresa un num: ")
    val num1 = readln().toDouble()
    println("Ingresa un num: ")
    val num2 = readln().toDouble()
    println("Ingresa un num: ")
    val num3 = readln().toDouble()

    if ( num1 > num2 && num1 >num3){
        if (num2 > num3){
            println("el Num mayor es $num1 el medio es $num2 y el ultimo es $num3")
        }else if(num3 > num2){
            println("el Num mayor es $num1 el medio es $num3 y el ultimo es $num2")
        }else{
            println("el Num mayor es $num1 el medio es igual $num2 y $num3")
        }
    }else if(num2 > num1 && num2 > num3){
        if (num1 > num3){
            println("el Num mayor es $num2 el medio es $num1 y el ultimo es $num3")
        }else if(num3 > num1){
            println("el Num mayor es $num2 el medio es $num3 y el ultimo es $num1")
        }else{
            println("el Num mayor es $num2 el medio es igual $num1 y $num3")
        }
    }else if(num3 > num1 && num3 > num2) {
        if (num1 > num2) {
            println("el Num mayor es $num3 el medio es $num1 y el ultimo es $num2")
        } else if (num2 > num1) {
            println("el Num mayor es $num3 el medio es $num2 y el ultimo es $num1")
        } else{
            println("el Num mayor es $num3 el medio es igual $num1 y $num2")
        }
    }else if (num1 == num2 && num1 == num3 && num2 == num3){
        println("Los tres numeros son iguales")
    }
}