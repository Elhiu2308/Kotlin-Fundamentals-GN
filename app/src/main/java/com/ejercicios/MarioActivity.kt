package com.ejercicios


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.practica01.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        println("Creando un Goomba:")
        val goomba = Goomba()
        goomba.collision("Enemy")
        goomba.collision("Weapon")

        println("\nCreando un Koopa:")
        val koopa = Koopa()
        koopa.collision("Enemy")
        koopa.collision("Weapon")
    }
}
open class Enemy(val name: String, val strenght: Int) : Any(){
    init{
        println("Iniciando superclase de $name")
    }

    protected var direction: String = "LEFT"

    protected fun changeDirection(){
        direction = if(direction == "RIGHT") "LEFT" else "RIGHT"
        println("$name va en direcciíon $direction")
    }

    protected fun die(){
        println("$name ha muerto")
    }

    open fun collision(collider: String){
        when(collider){
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }

}
class Goomba : Enemy("Goomba", 1){
    init{
        println("Iniciando subclase de $name")
    }
}
class Koopa : Enemy("Koopa", 2){
    var state: String = "Walking"

    override fun collision(collider: String){
        when(collider){
            "Weapon" -> {
                state = "Shell"
                println("El estado de $name es ahora $state")
            }
            "Enemy" -> changeDirection()
        }
    }
}