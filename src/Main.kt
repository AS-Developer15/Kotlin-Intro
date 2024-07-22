val name :String ="Aradhya" //Mutable Variable
fun main() {
    var age: Int? =1 //Immutable Variable
    age = 23
    if (age == 23){
        print("$age")
    }

    age = null
    if (age==null){
        print("$age")
    }
    age =12
    when(age){
        null-> print(12)
        12-> print("Age of his is $age ")
        else-> print("Age")
    }
    println("The name of the person is $name \nand his age is $age" )
}