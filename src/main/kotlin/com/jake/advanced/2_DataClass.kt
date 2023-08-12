package com.jake.advanced

data class Person(val name: String, val age: Int) {
}

fun main() {
    val person1 = Person(name = "tony", age = 12)

    // 구조분해 할당
    val (name, age) = person1

    println("이름=${name}, 나이=${age}")

//    val set = hashSetOf(person1)
//    println(set.contains(person1))

    var person2 = person1.copy(name = "strange")
    println(person2)

}

