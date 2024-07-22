fun sayHello(greeting:String,age :Int,name:String , vararg toGreat:String){
    toGreat.forEach {
        value-> println("$greeting $value")
    }
    println(" $name is of $age ")
}
fun main() {
    val things = arrayOf("Python","Kotlin","Android")
    sayHello(greeting="Hi",age=16,name="Aradhya",*things)

}