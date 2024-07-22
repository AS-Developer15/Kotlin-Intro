fun main() {
    var person = Humans(firstName = "Aradhya", lastName = "Sharma", age = 12)
    print("${person.firstName} ")
    print("${person.lastName} ")
    print("${person.age} ")
    person.nickName="AS.Developer"
    print("${person.nickName} ")
    person.nickName="AS"
    print("${person.nickName} ")
    person.nickName="He"
    print("${person.nickName} ")
    person.printInfo()

}