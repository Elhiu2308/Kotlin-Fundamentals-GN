package sesion05.postwork

/**
Ejercicio map:
Ejercicio: Crea una función que tome una lista de temperaturas en Celsius y las convierta a Fahrenheit.
Luego, en la función main, crea una lista de temperaturas en Celsius, aplica la conversión, e imprime los resultados.
 * */


fun CelsiusFarenheit(temperaturas: List<Double>) : List<Double> {
    return temperaturas.map { it * 9/5 + 32 }
}

fun main(){
    val temperaturasC = listOf(10.0, 120.0, 40.0, 35.0)
    val temperaturasF = CelsiusFarenheit(temperaturasC)

    println("Temperaturas en Farenheit: $temperaturasF")
}



