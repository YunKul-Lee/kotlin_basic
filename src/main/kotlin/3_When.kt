fun main() {

    // java 의 switch 와 유사

    val day = 6

    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        else -> "공휴일"
    }
    println(result)

    // when 에서 else 생략가능
    when(getColor()) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
    }

    // 여러 조건을 콤마로 구분하여 정의
    when (getNumber()) {
        0, 1 -> println("0 or 1")
        else -> println("0, 1 아님")
    }
}

enum class Color {
    RED, GREEN
}

fun getColor() = Color.RED

fun getNumber() = 2