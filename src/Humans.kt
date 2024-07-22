public class Humans(var firstName: String, var lastName:String , var age:Int)
{
    var nickName:String?=null
        set(value){ //Setter of Kotlin
            field=value
            println("New Nickname is in setup.")
        }
        get() {
            println("Hello World the new nickname is $field")
            return field
        }

    // To Define a method we just have to create a function inside the class
    fun printInfo() {
        println("The name of the human is $firstName $lastName \n$firstName $lastName is of $age years. \nJust a secret his nickname is $nickName  ")
    }
}