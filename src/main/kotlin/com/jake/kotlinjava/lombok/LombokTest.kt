package com.jake.kotlinjava.lombok

fun main() {

    val hero = Hero()

    // lombok 을 사용한 getter / setter 를 호출할 경우 오류 발생
    // delombok : lombok 을 우선 제거한 후 관련 메소드를 선언해야 함
    //  혹은 코틀린의 data 클래스로 마이그레이션
    hero.name = "아이언맨"
    println(hero.name)

    // data class 로 전환
    val heroKt = HeroKt(name = "아이언맨", age = 53, address = "스타크타워")
    println(heroKt)
}