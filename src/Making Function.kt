// Kotlin provide us with all functionalities to reduce code.

fun greet(name:String):String
{
    return "Hello $name"
}

fun getAge() :Int {
    val age = 12
    return  age
}
fun main() {
    val agePerson =getAge()
    println("Age of the person is $agePerson")
    println(greet("Aradhya"))
}

