// 외부에서 변수 선언가능
// Top Level 에 위치한 변수
var x = 5

fun main() {
    // Top Level 변수 참조가능
    x += 1
    println(x)


    // 변수 선언
    val a: Int = 1

    // 타입 생략하고 선언가능
    var b = 1

    // 지연 할당 (타입선언 필수)
    val c: Int
    c = 3

    // val(value)
    // java 의 final 키워드와 유사

    // var(variable)
    // 재할당 가능


}