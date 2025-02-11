package sesion04.postwork

/**
2. Clases Abstractas
Crea una clase abstracta Figura con un método abstracto calcularArea().
Luego, implementa dos clases concretas Circulo y Rectangulo que hereden de Figura e implementen el método calcularArea().
 */

abstract class Figura {
    abstract fun calcularArea(): Double
}

class Circulo(private val radio: Double) : Figura() {
    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }
}

class Rectangulo(private val base: Double, private val altura: Double) : Figura() {
    override fun calcularArea(): Double {
        return base * altura
    }
}

fun main() {
    val circulo = Circulo(5.0)
    val rectangulo = Rectangulo(4.0, 6.0)

    println("Área del círculo: ${circulo.calcularArea()}")
    println("Área del rectángulo: ${rectangulo.calcularArea()}")
}