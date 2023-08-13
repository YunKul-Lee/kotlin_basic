package com.jake.advanced

// String 확장 예시1
fun String.first(): Char {
    // this 키워드는 리시버 또는 수신자객체 라고 부른다.
    return this[0]
}

// String 확장 예시2
fun String.addFirst(char: Char): String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("클래스 출력")
}
// 클래스 메소드 확장
fun MyExample.printMessage(message: String) = println(message)

// null 안정성 확장
// 내부에서 null 체크
fun MyExample?.printNullOrNotNull() {
    if (this == null) println("널인 경우에만 출력")
    else println("널이 아닌 경우에만 출력")
}

fun main() {
    println("ABCD".first())

    println("ABCD".addFirst('Z'))

    MyExample().printMessage("확장 출력")

    // 안전연산자를 사용하지 않아도 컴파일 오류 발생하지 않음.
    var myExample: MyExample? = null
    myExample.printNullOrNotNull()

    myExample = MyExample()
    myExample.printNullOrNotNull()
}
