fun main()
{
    val calificacion =  71
    if(calificacion > 60)
{
      when(calificacion) { 
        in 10..20 -> println("Hay que motivarse por completo") 
        in 30..50 -> println("Demuestra un poco mas de trabajo") 
        in 50..59 -> println("Por poco") 
        60 -> println("Estuvo peligroso esta operacion")
        in 61..80 -> println("Sigamos adelante") 
        in 61..100 -> println("Aprobado") 
        in 80..100 -> println("Excelente resultado") 
        !in 1..100 -> println("No conozco ese resultado") 
        else -> println("Sigo sin conocer esto") 
        }
}
}
