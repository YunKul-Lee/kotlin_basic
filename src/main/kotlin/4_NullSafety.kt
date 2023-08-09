fun main() {

    // 변수 정의시 nullable 여부를 지정해야 함
//    val a: String = null
//    var b: String = "abcd"
//    b = null

    var a: String? = null
    // nullable 안전 연산자(?)
    println(a?.length)

    val b: Int = if (a != null) a.length else 0
    println(b)

    // 엘비스 연산자 (?:)
    // a가 null 아니면 a.length, null 이면 0 리턴
    val c = a?.length ?: 0
    println(c)

    val d: String? = null
    // 단언 연산자
    val e = d!!.length

}

