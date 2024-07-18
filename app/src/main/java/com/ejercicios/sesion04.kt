package com.ejercicios
/**
Ejemplo clases abstractas:
 */


//interface Animal{
//    fun hacerSonido()
//    fun moverse()
//}
//
//class Perro : Animal {
//    override fun hacerSonido(){
//        println("Guau guau")
//    }
//    override fun moverse(){
//        println("El perro corre")
//    }


/**
Ejercicio 1: Clase abstracta básica
Problema
Crea una clase abstracta Animal con una propiedad nombre y un método abstracto hacerSonido().
Luego, crea dos clases derivadas, Perro y Gato, que implementen el método hacerSonido() de manera específica. */

//abstract class Animal(val nombre: String){
//    abstract fun hacerSonido(): String
//}
//
//class Perro (nombre: String) : Animal(nombre) {
//    override fun hacerSonido() = "Guau Guau"
//}
//
//class Gato (nombre: String) : Animal(nombre) {
//    override fun hacerSonido() = "Miau Miau"
//}
//fun main(){
//    val perro = Perro("Firulais")
//    val gato = Gato("Michi")
//
//    println("${perro.nombre} dice ${perro.hacerSonido()}")
//    println("${gato.nombre} dice ${gato.hacerSonido()}")
//}

/**
Ejercicio 1: Clase abstracta básica
Problema
Crea una clase abstracta Animal con una propiedad nombre y un método abstracto hacerSonido().
Luego, crea dos clases derivadas, Perro y Gato, que implementen el método hacerSonido() de manera específica.

Ejercicio 2: Clase abstracta con método concreto
Problema
Extiende el ejercicio anterior agregando un método concreto describir() en la clase Animal, que retorne una cadena con el nombre del animal y el sonido que hace.*/

//abstract class Animal(val nombre: String){
//    abstract fun hacerSonido(): String
//    fun describir() : String{
//        return "$nombre dice ${hacerSonido()}"
//    }
//}
//
//class Perro (nombre: String) : Animal(nombre) {
//    override fun hacerSonido() = "Guau Guau"
//}
//
//class Gato (nombre: String) : Animal(nombre) {
//    override fun hacerSonido() = "Miau Miau"
//}
//fun main(){
//    val perro = Perro("Firulais")
//    val gato = Gato("Michi")
//
//    println(perro.describir())
//    println(gato.describir())
//}


/**
Ejercicio 3: Clase abstracta con propiedades abstractas
Problema
Crea una clase abstracta Figura con una propiedad abstracta area y un método abstracto calcularArea().
Luego, crea dos clases derivadas Circulo y Rectangulo que implementen la propiedad area y el método calcularArea() de manera específica.*/

//abstract class Figura(){
//    abstract val area: Double
//    abstract fun calcularArea()
//}
//
//class Circulo (val radio:Double) : Figura() {
//    override val area: Double
//        get() = Math.PI * radio * radio
//
//    override calcularArea(){
//        println("El Área del Circulo es: $area")
//    }
//}
//
//class Rectangulo (val base:Double,  val altura:Double) : Figura() {
//    override val area: Double
//        get() = base * altura
//
//    override calcularArea(){
//        println("El Área del Rectangulo es: $area")
//    }
//}
//
//fun main(){
//    val circulo = Circulo (2.5)
//    val rectangulo = Rectangulo (2.5, 5.0)
//
//    println(circulo.calcularArea())
//    println(rectangulo.calcularArea())
//}


/**
Ejercicio 4: Clase abstracta con métodos abstractos y concretos
Problema
Crea una clase abstracta Empleado con una propiedad nombre y dos métodos, uno abstracto calcularSalario() y otro concreto mostrarInfo().
Luego, crea dos clases derivadas EmpleadoFijo y EmpleadoTemporal que implementen el método calcularSalario() de manera específica.
 */

//abstract class Empleado(val nombre: String){
//    abstract fun calcularSalario(): Double
//
//
//    fun mostrarInfo() : String{
//        return "Nombre: $nombre Salario: ${calcularSalario()}"
//    }
//
//}
//
////    fun mostrarInfo(){
////         println("Nombre: $nombre, Salario: ${calcularSalario()}")
////     }
////   }
//
//
//class EmpleadoFijo (nombre: String,  val salarioMensual: Double) : Empleado(nombre){
//    override fun calcularSalario(): Double = salarioMensual
//}
//
//class EmpleadoTemporal (nombre: String, val horasTrabajadas: Int, val tarifaPorHora: Double): Empleado(nombre){
//    override fun calcularSalario(): Double = horasTrabajadas * tarifaPorHora
//}
//
//fun main(){
//
//    fun main(){
//        val fijo = EmpleadoFijo("Juan", 20000.0)
//        val temporal = EmpleadoTemporal("Pedro", 80, 150.0)
//
//        println(fijo.mostrarInfo())
//        println(temporal.mostrarInfo())
//    }
//}
//

/**
Ejercicio 5: Interfaz básica
Problema
Crea una interfaz Vehiculo con dos métodos, acelerar() y frenar(). Luego, crea dos clases Coche y Bicicleta que implementen la interfaz de manera específica.
 */
//
//interface Vehiculo{
//    fun acelerar(): String
//    fun frenar(): String
//}
//
//class Coche : Vehiculo{
//    override fun acelerar() = "El coche esta acelerando"
//    override fun frenar() = "El coche esta frenando"
//}
//
//class Bicicleta : Vehiculo{
//    override fun acelerar() = "La bicicleta esta acelerando"
//    override fun frenar() = "La bicicleta esta frenando"
//}
//
//fun main(){
//    val coche = Coche()
//    val bicicleta = Bicicleta()
//
//
//    println(coche.acelerar())
//    println(coche.frenar())
//    println(bicicleta.acelerar())
//    println(bicicleta.frenar())
//}


/**
Ejercicio 6: Interfaz con propiedades
Problema
Crea una interfaz Operable con una propiedad estado y dos métodos encender() y apagar(). Luego, crea una clase Lampara que implemente la interfaz.
 */
//
//interface Operable{
//    var estado: String
//    fun encender()
//    fun apagar()
//}
//
//class Lampara : Operable {
//    override var estado: String = "apagada"
//
//    override fun encender(){
//        estado = "encendida"
//        println("La lampara esta $estado")
//    }
//
//    override fun apagar(){
//        estado = "apagada"
//        println("La lampara esta $estado")
//    }
//
//}
//fun main(){
//    val lampara = Lampara()
//
//    println(lampara.encender())
//    println(lampara.apagar())
//
//}

/**
Ejercicio 7: Múltiples interfaces
Problema
Crea dos interfaces Reproductor con un método reproducir(), y Grabador con un método grabar().
Luego, crea una clase DispositivoMultimedia que implemente ambas interfaces.
 */
//
//interface Reproductor{
//    fun reproducir(): String
//}
//
//interface Grabador{
//    fun grabar(): String
//}
//
//class DispositivoMultimedia: Reproductor, Grabador{
//    override fun reproducir() = "El dispositivo está reproduciendo"
//    override fun grabar() = "El dispositivo está grabando"
//}
//
//fun main(){
//    val dispositivo = DispositivoMultimedia()
//    println(dispositivo.reproducir())
//    println(dispositivo.grabar())
//}


/**
Ejercicio 8: Interfaz con un método
Problema
Crea una interfaz Volable con un método volar(). Luego, crea dos clases Ave y Avion que implementen la interfaz de manera específica.
 */

//interface Volable {
//    fun volar():String
//}
//
//class Ave : Volable {
//    override fun volar() = "El ave está volando."
//
//}
//
//class Avion : Volable {
//    override fun volar() = "El avión está volando."
//}
//
//fun main() {
//    val ave = Ave()
//    val avion = Avion()
//    println(ave.volar())
//    println(avion.volar())
//
//}

// interface Volable {
//     fun volar()
// }

// class Ave : Volable {
//     override fun volar() {
//         println("El ave está volando.")
//     }
// }

// class Avion : Volable {
//     override fun volar() {
//         println("El avión está volando a gran velocidad.")
//     }
// }

// // Ejemplo de uso
// fun main() {
//     val pajaro = Ave()
//     pajaro.volar()

//     val jet = Avion()
//     jet.volar()
// }


/**
Ejercicio 9: Interfaz con una propiedad y un método
Problema
Crea una interfaz Nadador con una propiedad velocidad y un método nadar(). Luego, crea dos clases Delfin y Humano que implementen la interfaz de manera específica..
 */
//
//interface Nadador{
//    val velocidad: Double
//    fun nadar():String
//}
//
//class Delfin(override val velocidad: Double) : Nadador {
//    override fun nadar() = "El Delfín nada a una velocidad de ${velocidad} km/h."
//
////             class Delfin : Nadador {
////             override val velocidad:Double = 15.0
////             override fun nadar() = "El Delfín nada a una velocidad de ${velocidad} km/h."
//
//}
//
//
//// class Humano : Nadador {
////     override fun nadar() = "El Humano está nadando."
//
//
//class Humano(override val velocidad: Double) : Nadador {
//    override fun nadar() = "El Humano nada a una velocidad de ${velocidad} km/h."
//
//}
//
//fun main() {
//    val delfin = Delfin(15.0)
//    val humano = Humano(5.0)
//    println(delfin.nadar())
//    println(humano.nadar())
//
//
//}



/**
Ejercicio 9: Interfaz con una propiedad y un método
Problema
Crea una interfaz Nadador con una propiedad velocidad y un método nadar(). Luego, crea dos clases Delfin y Humano que implementen la interfaz de manera específica..
 */

//interface Nadador{
//    val velocidad: Double
//    fun nadar():String
//}
//
//class Delfin(override val velocidad: Double) : Nadador {
//    override fun nadar() = "El Delfín nada a una velocidad de ${velocidad} km/h."
//
////             class Delfin : Nadador {
////             override val velocidad:Double = 15.0
////             override fun nadar() = "El Delfín nada a una velocidad de ${velocidad} km/h."
//
//}
//
//
//// class Humano : Nadador {
////     override fun nadar() = "El Humano está nadando."
//
//
//class Humano(override val velocidad: Double) : Nadador {
//    override fun nadar() = "El Humano nada a una velocidad de ${velocidad} km/h."
//
//}
//
//fun main() {
//    val delfin = Delfin(15.0)
//    val humano = Humano(5.0)
//    println(delfin.nadar())
//    println(humano.nadar())

//}


////Data class
//data class Persona(val name: String, val edad: Int)
//
////Companion object
//object PersonaOperaciones{
//    fun esAdulto(persona:Persona): Boolean = persona.edad >= 18
//    fun nombre(persona:Persona): String = "${persona.name} Sanchez"
//    fun retiro(persona:Persona): Int = 65 - persona.edad
//}
//fun main(){
//    val vicente = Persona("Vicente", 28)
//
//    println(PersonaOperaciones.esAdulto(vicente))
//    println(PersonaOperaciones.nombre(vicente))
//    println(PersonaOperaciones.retiro(vicente))
//
//}


////Data class, extensiones o funsiones de extensión
//data class Persona(val name: String, val edad: Int)
//
//
//fun Persona.esAdulto() = edad >= 18
//fun Persona.nombre() = "$name Sanchez"
//fun Persona.retiro() = 65 - edad
//
//fun main(){
//    val vicente = Persona("Vicente", 28)
//
//    println(vicente.esAdulto())
//    println(vicente.nombre())
//    println(vicente.retiro())
//
//}



/*Ejercicios Companion and Object
Ejercicio 1: Calcular el promedio de una lista de números (con data class y companion object)
Problema: Escribe una función que tome una lista de números enteros y devuelva el promedio de esos números.
Usa una data class para representar los números y un companion object para calcular el promedio. (editado) */


//data class Numeros(val lista: List<Int>)
//
//object NumerosOperations{
//    fun calcularPromedio(numeros: Numeros): Double{
//        return numeros.lista.average()
//    }
//}
//fun main(){
//    val numeros = Numeros(listOf(1,2,3,4,5))
//
//    println("El promedio es: ${NumerosOperations.calcularPromedio(numeros)}")
//
//}



/*Ejercicios Companion and Object
Ejercicio 1: Calcular el promedio de una lista de números (con data class y companion object)
Problema: Escribe una función que tome una lista de números enteros y devuelva el promedio de esos números.
Usa una data class para representar los números y un companion object para calcular el promedio. (editado)



Ejercicio 2: Clase Persona con función de presentación (con data class y companion object)
Problema: Crea una data class Persona con propiedades nombre y edad.
Añade funciones en un companion object para presentar a la persona y verificar si es mayor de edad.*/


class Persona(val nombre: String, val edad: Int)
object PresentarPersona {
    fun presentar(persona: Persona):String {
        return "Hola, soy ${persona.nombre} y tengo ${persona.edad} años"
    }

    fun mayorEdad(persona: Persona): Boolean {
        return persona.edad >= 18
    }
}

fun main() {
    val persona = Persona("Juan", 25)


    println(PresentarPersona.presentar(persona))
    println(PresentarPersona.mayorEdad(persona))
}







