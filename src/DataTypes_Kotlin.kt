fun main() {
    println("Immutale List")
    var listVal= listOf("Python", "Java","JS")
    listVal.forEach{value->println("$value")}
    println()

    println("Mutable List")
    var mutListVal= mutableListOf("Harry Styles", "Taylor Swift", "Starboy")
    mutListVal.add("Charlie Puth")
    println()

    println("Immutable Map")
    var mapOfLeader= mapOf("India" to "Modi", "Russia" to "Putin", "America" to "Trumph" )
    mapOfLeader.forEach{key, value ->println("$key->$value")}
    println()

    println("Mutable Map")
    var mutMapOfMath= mutableMapOf("Algebra" to listOf("Quadratics","Progression","Calculations"))
    mutMapOfMath.put("Pre Calculus", listOf("Trignometery", "Coordinate Geometery"))
    mutMapOfMath.put("Calculus",listOf("Functions","Limits","Derrivatives", "Integrals","Differentials"))
    mutMapOfMath.forEach{key,value-> println("$key -> $value")}
    println()

    println("Immutable Set")

    var newSetVal= setOf("Aradhya",1,2,3,4,listVal,mutListVal,"Aradhya","Aradhya","Aradhya","Aradhya","Aradhya")
    newSetVal.forEach{value-> println("Value is $value")}
}