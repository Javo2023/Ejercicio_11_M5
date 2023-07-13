package com.example.ejercicio_11_m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
/*
fun main(){
    var numero1 = 10
    val numero2 = 33
    val numero3 = 66

    var suma = numero1+numero2+numero3
    println(suma)

    numero1=55
    suma = numero1+numero2+numero3
    println(suma)

    var promedio = suma / 3
    println(promedio)

}*/

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("name: $name")
        println("age: $age")
        println("likes to: $hobby")
        if (referrer==null){
            println("Doesn't have a referrer")
        } else {
            println("Has a referrer named ${referrer.name} who likes to play ${referrer.hobby}" )
        }

    }
}