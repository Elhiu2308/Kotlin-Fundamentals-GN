package sesion05.postwork

/**Crea una lista de números decimales que representen precios.
 Utiliza reduce para calcular el total de los precios. Luego, usa forEach para imprimir cada precio con un formato específico
 * (por ejemplo, con dos decimales y el símbolo de moneda).*/


fun main() {
    val precios = listOf(19.99, 24.50, 9.95, 4.20, 99.99)

    val total = precios.reduce { acc, precio -> acc + precio }

    println("Total: ${"%.2f".format(total)}")

    precios.forEach { precio ->
        println("${"$%.2f".format(precio)}")
    }
}