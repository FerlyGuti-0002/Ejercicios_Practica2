/*fun main()
{
    while (true) { 
        println("Esto se imprimirá por un largo tiempo!") 
    }

}*/

fun main()
{
    val array = arrayOf("a", "b", "c") 
    for (i in array.indices) { 
        println(array[i]) } 
    for (i in 6 downTo 0 step 2) { 
        println(i) }
}


//Ejemplo Do While
/*fun main(){
var numero:Int
do {
    println("Introduce un numero entre 1 y 100")
    numero = readLine()!!.toInt()
} while(numero !in 1..100) // numero < 1 || numero > 100
println("Gracias")
}*/