/* Clases
class Persona{
    var nombre:String = ""
    var edad:Int = 0    
    constructor(nombre:String, edad:Int){
        this.nombre = nombre
        this.edad = edad
    }
}

fun main() {
    //var uno = Persona()
    //uno.nombre = "Pedro Pablo"
   // uno.edad = 25
   var uno = Persona("Pedro Pablo", 25)
   println(uno.nombre)
   println(uno.edad)
}

class Persona(var nombre:String="", var edad:Int=0){

}

fun main() {
   
    var uno = Persona("Pedro Pablo", 25)
    var dos = Persona("Juan Daniel", 26)
    var tres = Persona("Daniela Isidora", 19)
    var cuatro = Trabajador("Manuel Andres", 30)
    println(tres.edad)
    println(tres.saludar())
    println(cuatro.Trabajador)

}

*/
/* Clases
class Persona{
    var nombre:String = ""
    var edad:Int = 0    
    constructor(nombre:String, edad:Int){
        this.nombre = nombre
        this.edad = edad
    }
}

fun main() {
    //var uno = Persona()
    //uno.nombre = "Pedro Pablo"
   // uno.edad = 25
   var uno = Persona("Pedro Pablo", 25)
   println(uno.nombre)
   println(uno.edad)
}

class Persona(var nombre:String="", var edad:Int=0){

}

fun main() {
   
    var uno = Persona("Pedro Pablo", 25)
    var dos = Persona("Juan Daniel", 26)
    var tres = Persona("Daniela Isidora", 19)
    var cuatro = Trabajador("Manuel Andres", 30)
    println(tres.edad)
    println(tres.saludar())
    println(cuatro.Trabajador)

}

*/
/*Encapsulamiento*/

open class Persona(var nombre:String="", var edad:Int=0){ /*open es para declarar  que se generara una herencia */

        fun saludar():String{
            return "Hola, mi nombre es $nombre y tengo $edad años."
        }
}

class Trabajador(nombre:String, edad:Int):Persona(nombre, edad){

    }
}

fun main() {
   
    var uno = Persona("Pedro Pablo", 25)
    var dos = Persona("Juan Daniel", 26)
    var tres = Persona("Daniela Isidora", 19)
    var cuatro = Trabajador("Manuel Andres", 30)
    println(tres.edad)
    println(tres.saludar())
    println(cuatro.saludar())

}