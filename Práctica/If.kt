import java.util.Date;
fun main()
{
    val fecha = Date()
    val hoy = if (fecha.year == 2019) true else false
    println(hoy)
}

/*fun main()
{
    val edad = 20
    if(edad >= 20) 
    { 
        println("Eres mayor de edad") 
    } else { 
        println("Aun eres menor") 
    }
}


//Ingresado por teclado
fun main()
{
    println("¿Cuantos años tienes?")
    var edad = readLine()!!.toInt();
    if (edad >= 20) {
        println("Eres mayor de edad")
    } else {
        println("Eres menor de edad")
    }
}*/

