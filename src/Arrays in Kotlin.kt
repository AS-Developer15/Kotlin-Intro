fun main() {
    var topProgrammingLanguages = arrayOf("Kotlin","Visual Basic", "Java","Python")
    println(topProgrammingLanguages[0])
    println(topProgrammingLanguages.size)
    println(topProgrammingLanguages.get(1))
    var topLanguage = arrayOf("JavaScript")
    var mutTopLanguage= topLanguage.toMutableList()

    for (lang in topProgrammingLanguages){
        println(lang)
        mutTopLanguage.add(lang)

    }
    println(topProgrammingLanguages)
    for(langs in mutTopLanguage){
        println(langs)
    }


}