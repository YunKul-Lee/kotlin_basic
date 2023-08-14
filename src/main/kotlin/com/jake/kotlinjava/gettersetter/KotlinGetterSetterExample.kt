package com.jake.kotlinjava.gettersetter

fun main() {

    // 자바 스타일
    val person = Person()
    person.setName("토니")
    person.setAge(44)
    person.setAddress("스타크타워")

    println(person.getName())
    println(person.getAge())


    // 코틀린 스타일
    val person2 =  Person()
    person2.name = "토니"
    person2.age = 44

    println(person2.name)
    println(person2.age)

    // 프로퍼티가 없음에도 게터 메서드라면 프로퍼티처럼 사용가능
    println(person2.uuid)

    // 세터가 존재함에도 컴파일 오류발생
    // getter / setter 가 정상적으로 존재할 경우에만 프로퍼티 접근 가능
    // address를 가져오는 메서드를 게터가 아닌 myAddress로 정의했기 때문에 setter도 생성되지 않음
    person2.myAddress()


}