package com.jake.kotlinjava.keyword

// 예약어의 경우 백틱(₩) 문자열을 사용하여 사용가능
enum class CountryCodeKotlin {
    kr, jp, us, `do`;
}

fun main() {
    val javaKeyword = JavaKeyword()
    javaKeyword.`in`
    javaKeyword.`is`
}