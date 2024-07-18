package com.ejercicios

/**
Ejercicio 1: Declaración de Variables
Declara variables para representar la información de un producto:

Nombre del producto (String)
Precio (Double)
Disponible en inventario (Boolean)
Código de producto (String) Imprime todas las variables..**/

//class Persona
//var nombre: String = " "
//var edad: Int = 0
//
//fun presentarse() {
//    println(" Hola, soy $nombre y tengo $edad años")
//}


/**constructor primario*/

//class Persona (var nombre: String, var edad: Int) {
//
//    fun presentarse() {
//        println(" Hola, soy $nombre y tengo $edad años")
//
//    }
//
//}

/**constructor secundario para expandir al primario*/

//class Persona (var nombre: String){
//    var edad: Int = 0
//
//    constructor( nombre: String, edad: Int): this (nombre){
//        this.edad = edad
//    }
//    fun presentarse(){
//        println(" Hola, soy $nombre y tengo $edad años")
//    }
//}


/**
Crea una clase Rectangulo con atributos ancho y alto. Incluye un constructor primario y un constructor secundario que inicialice ambos valores con el mismo número.
 */

//class figuraGeometrica(val ancho: Double, val alto: Double){
//
//    constructor (lado: Double): this(lado,lado)
//
//    fun area() = ancho * alto
//}
//
//
//fun main() {
//    val rectangulo = figuraGeometrica(2.5, 3.0)
//    val cuadrado = figuraGeometrica(2.5)
//
//    println("Área del rectángulo: ${rectangulo.area()}")
//    println("Área del cuadrado: ${cuadrado.area()}")
//}


/**
Implementa una clase Temperatura con un atributo en Celsius. Incluye getters y setters personalizados para obtener y establecer la temperatura en Fahrenheit.
 */

//class Temperatura(celsius: Double) {
//    var celsius = celsius
//        set(value) {
//            field = value
//            println("Temperatura establecida a $value°C")
//        }
//
//    var fahrenheit: Double
//        get() = celsius * 9/5 + 32
//        set(value) {
//            celsius = (value - 32) * 5/9
//            println("Temperatura establecida a $value°F")
//        }
//}
//
//fun main() {
//    val temp = Temperatura(25.0)
//    println("En Fahrenheit: ${temp.fahrenheit}°F")
//    temp.fahrenheit = 68.0
//    println("En Celsius: ${temp.celsius}°C")
//}



/**
.
 */

//class cuentaBancaria{
//    private var saldo = 0.0
//
//    fun getsaldo():Double {
//        return saldo
//    }
//
//    fun depositar(cantidad: Double){
//        if (cantidad > 0){
//            saldo += cantidad
//        }
//    }
//}
//fun main(){
//    val cuenta = cuentaBancaria()
//    cuenta.depositar(100.0)
//    println("Saldo: ${cuenta.getsaldo()}")
//}
//


/**
.
 */
//
//class persona{
//    var edad = 0
//        set(value) {
//            if(value >= 0){
//                field = value
//            }
//        }
//}
//
//fun main(){
//    val sujeto = persona()
//    sujeto.edad = 25
//    println("Edad: ${sujeto.edad}")
//    sujeto.edad = -5
//    println("Edad despues de interntar poner -5: ${sujeto.edad}")
//
//}


/**
.
 */

//class termometro{
//    var celsius = 0.0
//        get()= field
//        set(value){
//            field = value
//            println ("Temperatura ajustada a $value °C")
//        }
//
//    val farenheit: Double
//        get() = celsius * 9/5 +32
//}
//
//fun main(){
//    val temp = termometro()
//    temp.celsius = 25.0
//    println("En farenheit: ${temp.farenheit}°F")
//}
//Ejercicio: Herencia
//Clase base
//open class Empleado(val nombre: String, var salario: Double){
//    open fun calcularBono(): Double{
//        return salario * 0.1
//    }
//
//    open fun mostrarDetalles(){
//        println("Nombre: $nombre, Salario: $salario, Bono: ${calcularBono()}")
//    }
//}
////Subclase
//class Gerente(nombre: String, salario: Double, val departamento: String) : Empleado(nombre, salario) {
//    override fun calcularBono(): Double{
//        return salario * 0.2
//    }
//
//    override fun mostrarDetalles(){
//        println("Departamento: $departamento")
//    }
//
//    fun asignarTarea(){
//        println("El gerente $nombre esta asignando tareas.")
//    }
//}
////Otra subclase
//class Desarrollador(nombre: String, salario: Double, val lenguajePrincipal: String): Empleado(nombre, salario) {
//    override fun mostrarDetalles(){
//        super.mostrarDetalles() //Manda a llamar un metodo de la superclase o clase padre
//        println("Lenguaje principal: $lenguajePrincipal")
//    }
//
//    fun codificar(){
//        println("El desarrollador $nombre está codificando en $lenguajePrincipal")
//    }
//}
//fun main(){
//    val empleado = Empleado("Juan", 50000.0)
//    val gerente = Gerente("Maria", 80000.0, "TI")
//    val desarrollador = Desarrollador("Carlos", 60000.0, "Kotlin")
//
//    println("Detalles del empleado:")
//    empleado.mostrarDetalles()
//
//    println("\nDetalles del Gerente:")
//    gerente.mostrarDetalles()
//    gerente.asignarTarea()
//
//    println("\nDetalles del Desarrollador:")
//    desarrollador.mostrarDetalles()
//    desarrollador.codificar()
//}



/**
Diseña un sistema para una biblioteca que maneje sistintos tipos de medios (libros, revistas y dvds) cada medio debe tener un titulo y un metodo para
mostrar información
Herencia
 */

//open class MedioBiblioteca(val titulo: String, val año: Int){
//    open fun mostrarInfo(){
//        println("Titulo: $titulo, Año: $año")
//    }
//}
//class Libro(titulo: String, año: Int, val autor: String, val numPaginas: Int): MedioBiblioteca(titulo, año){
//    override fun mostrarInfo(){
//        super.mostrarInfo()
//        println("Autor: $autor, Páginas: $numPaginas páginas")
//    }
//}
//class Dvd(titulo: String, año: Int, val director: String, val duracion: Int): MedioBiblioteca(titulo, año){
//    override fun mostrarInfo(){
//        super.mostrarInfo()
//        println("Director: $director, Duración: $duracion minutos")
//    }
//}
//
//class Revista(titulo: String, año: Int, val editorial: String, val articulos: Int): MedioBiblioteca(titulo, año){
//    override fun mostrarInfo(){
//        super.mostrarInfo()
//        println("Editorial: $editorial, Articulos: $articulos articulos")
//
//    }
//}
//
//
//
//fun main(){
//    val libro = Libro("Cien años de soledad", 1967, "Gabriel García Márquez", 432)
//    val dvd = Dvd("El Padrino", 1972, "Francis Ford Coppola", 175)
//    val revista = Revista("Muy Interesante", 2024, "Zinet Media Global", 44)
//
//    println("Información del libro:")
//    libro.mostrarInfo()
//    println("Información del dvd:")
//    dvd.mostrarInfo()
//    println("Información de la revista:")
//    revista.mostrarInfo()
//}



/**
Polimorfismo
 */

//open class Figura{
//    open fun area(): Double = 0.0
//}
//
//class Circulo(val radio: Double): Figura(){
//    override fun area(): Double = Math.PI * radio * radio
//}
//class Rectangulo(val ancho: Double, val alto: Double): Figura(){
//    override fun area(): Double = ancho * alto
//}
//fun calcularArea(figura: Figura){
//    println("El área es: ${figura.area()}")
//}
//fun main(){
//    val circulo = Circulo(5.0)
//    val rectangulo = Rectangulo(4.0, 6.0)
//
//    calcularArea(circulo)
//    calcularArea(rectangulo)
//}



/**
Crea una clase base Animal con un método hacerSonido(). Luego, crea dos clases derivadas Perro y Gato que hereden de Animal y
sobrescriban el método hacerSonido(). Finalmente, crea una función que reciba un Animal y llame a su método hacerSonido().
 */
//
//open class baseAnimal(val tipo: String, ){
//    open fun hacerSonido(){
//        println("Tipo: $tipo")
//    }
//}
//class Perro(tipo: String, val nombre: String, val ladrido: String): baseAnimal(tipo){
//    override fun hacerSonido(){
//        super.hacerSonido()
//        println("Nombre: $nombre, Sonido: $ladrido")
//    }
//}
//class Gato(tipo: String, val nombre: String, val maullido: String): baseAnimal(tipo){
//    override fun hacerSonido(){
//        super.hacerSonido()
//        println("Nombre: $nombre, Sonido: $maullido")
//    }
//}
//
//
//fun main(){
//    val perro = Perro("Perro", "Odie", "Gua Gua")
//    val gato = Perro("Gato", "Garfield", "Miau Miau")
//
//
//    println("El Perro suena asi:")
//    perro.hacerSonido()
//    println("El Gato suena asi:")
//    gato.hacerSonido()
//
//}



/**
Problema: Sistema de Gestión de Empleados
Desarrolla un sistema para gestionar diferentes tipos de empleados en una empresa.
Debes crear una clase base Empleado y dos clases derivadas: EmpleadoTiempoCompleto y EmpleadoTiempoParcial.
Cada empleado debe tener un método para calcular su salario, pero este cálculo varía según el tipo de empleado.
 */

//open class Empleado(val nombre: String, val id: Int){
//    open fun calcularSalario(): Double = 0.0
//}
//
//class EmpleadoTiempoCompleto(nombre: String, id: Int, private val salarioMensual: Double): Empleado(nombre, id){
//    override fun calcularSalario(): Double = salarioMensual
//}
//class EmpleadoTiempoParcial(nombre: String, id: Int, private val horasTrabajadas: Int, private val tarifaPorHora: Double): Empleado(nombre, id){
//    override fun calcularSalario(): Double = horasTrabajadas * tarifaPorHora
//}
//
//fun main(){
//    val empleado1 = EmpleadoTiempoCompleto("Juan", 1, 20000.0)
//    val empleado2 = EmpleadoTiempoParcial("Pedro", 2, 80,150.0)
//
//
//    println ("Nombre: ${empleado1.nombre}, ID: ${empleado1.id}, Salario: ${empleado1.calcularSalario()}")
//    println ("Nombre: ${empleado2.nombre}, ID: ${empleado2.id}, Salario: ${empleado2.calcularSalario()}")
//
//}


/**
Problema: Formas Geométricas
Crea un sistema para calcular el área de diferentes formas geométricas.
Debes implementar una clase base Forma y al menos tres clases que la hereden: Circulo, Rectangulo y Triangulo.
 */

//open class Forma{
//    open fun calcularArea(): Double = 0.0
//}
//
//class Circulo(val radio: Double): Forma(){
//    override fun calcularArea(): Double = Math.PI * radio * radio
//}
//class Rectangulo(val base: Double, val altura: Double): Forma(){
//    override fun calcularArea(): Double = base * altura
//}
//class Cuadrado(val lado: Double): Forma(){
//    override fun calcularArea(): Double = lado * 4
//}
//
//fun main(){
//    val circulo = Circulo(3.0)
//    val rectangulo = Rectangulo(5.0,5.0)
//    val cuadrado = Cuadrado(4.0)
//
//
//    println ("El Área del circulo es: ${circulo.calcularArea()}")
//    println ("El Área del rectangulo es: ${rectangulo.calcularArea()}")
//    println ("El Área del cuadrado es: ${cuadrado.calcularArea()}")
//
//
//
//}




/**
Problema: Sistema de Notificaciones
Implementa un sistema de notificaciones que pueda enviar mensajes a través de diferentes canales (email, SMS, notificación push).
Crea una interfaz Notificador y clases que la implementen para cada tipo de notificación.
 */
//
//open class Notificaciones(val mensaje: String, val id: Int){
//    open fun mostrarMensaje(): String = "Mensaje Inicial"
//}
//
//class Email(mensaje: String, id: Int, val correoElectronico: String): Notificaciones(mensaje, id){
//    override fun mostrarMensaje(): String = correoElectronico
//}
//class SMS (mensaje: String, id: Int, val numeroTelefonico: String): Notificaciones(mensaje, id){
//    override fun mostrarMensaje(): String = numeroTelefonico
//}
//class NotificacionPush (mensaje: String, id: Int, val Titulo: String): Notificaciones(mensaje, id){
//    override fun mostrarMensaje(): String = Titulo
//}
//
//fun main(){
//    val email = Email("Hola buenos días", 1, "elhiuchristia@hotmail.com")
//    val sms = SMS("Hola buenos tardes", 2, "55372929990")
//    val notificacion = NotificacionPush("Hola buenos noches", 3, "Saludos")
//
//
//    println ("Mensaje: ${email.mensaje}, ID: ${email.id}, Email: ${email.correoElectronico}")
//    println ("Mensaje: ${sms.mensaje}, ID: ${sms.id}, Télefono: ${sms.numeroTelefonico}")
//    println ("Mensaje: ${notificacion.mensaje}, ID: ${notificacion.id}, Titulo: ${notificacion.Titulo}")
//
//}


/**
Problema: Sistema de Gestión de Empleados
Desarrolla un sistema para gestionar diferentes tipos de empleados en una empresa.
Debes crear una clase base Empleado y dos clases derivadas: EmpleadoTiempoCompleto y EmpleadoTiempoParcial.
Cada empleado debe tener un método para calcular su salario, pero este cálculo varía según el tipo de empleado.
 */
//
//open class Empleado(val nombre: String, val id: Int){
//    open fun calcularSalario(): Double = 0.0
//}
//
//class EmpleadoTiempoCompleto(nombre: String, id: Int, private val salarioMensual: Double): Empleado(nombre, id){
//    override fun calcularSalario(): Double = salarioMensual
//}
//class EmpleadoTiempoParcial(nombre: String, id: Int, private val horasTrabajadas: Int, private val tarifaPorHora: Double): Empleado(nombre, id){
//    override fun calcularSalario(): Double = horasTrabajadas * tarifaPorHora
//}
//
//fun main(){
//    val empleado1 = EmpleadoTiempoCompleto("Juan", 1, 20000.0)
//    val empleado2 = EmpleadoTiempoParcial("Pedro", 2, 80,150.0)
//
//
//    println ("Nombre: ${empleado1.nombre}, ID: ${empleado1.id}, Salario: ${empleado1.calcularSalario()}")
//    println ("Nombre: ${empleado2.nombre}, ID: ${empleado2.id}, Salario: ${empleado2.calcularSalario()}")
//
//}



/**
Ejemplo clases abstractas:
 */

//
//abstract class Figura{
//    abstract fun dibujar()
//    fun color(): String{
//        return "Rojo"
//    }
//}
//class Cuadrado : Figura(){
//    override fun dibujar(){
//        println("Dibujando un cuadrado")
//    }
//}


/**
Ejemplo clases abstractas:
 */

//
//abstract class Animal{
//    abstract fun hacerSonido()
//
//    fun moverse(){
//        println("El animal se esta moviendo")
//    }
//}
//class Perro:Animal(){
//    override fun hacerSonido(){
//        println("Guau")
//    }
//}
//
//class Gato: Animal(){
//    override fun hacerSonido(){
//        println("Miau")
//    }
//}
//
//
//fun main (){
//    val perro = Perro()
//    val gato = Gato()
//
//
//    perro.hacerSonido()
//    perro.moverse()
//
//    gato.hacerSonido()
//    gato.moverse()
//
//}