package com.ejercicios

/**
Cuenta bancaria
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
//    val cuenta = sesion03.postwork.cuentaBancaria()
//    cuenta.depositar(100.0)
//    println("Saldo: ${cuenta.getsaldo()}")
//}


/**
.
 */

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
//
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
//    val libro = sesion03.postwork.Libro("Cien años de soledad", 1967, "Gabriel García Márquez", 432)
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
Crea una clase base Animal con un método hacerSonido(). Luego, crea dos clases derivadas Perro y Gato que hereden de Animal y
sobrescriban el método hacerSonido(). Finalmente, crea una función que reciba un Animal y llame a su método hacerSonido().
 */
//
//open class Animal {
//    open fun hacerSonido() {
//        println("El animal hace un sonido")
//    }
//}
//
//class Perro : Animal() {
//    override fun hacerSonido() {
//        println("El perro ladra")
//    }
//}
//
//class Gato : Animal() {
//    override fun hacerSonido() {
//        println("El gato maulla")
//    }
//}
//
//fun hacerSonar(animal: Animal) {
//    animal.hacerSonido()
//}
//
//fun main() {
//    val perro = Perro()
//    val gato = Gato()
//
//    hacerSonar(perro) // Imprime: El perro ladra
//    hacerSonar(gato)  // Imprime: El gato maulla
//}

