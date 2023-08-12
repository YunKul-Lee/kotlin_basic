// basic function
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 표현식 스타일 펑션
fun sum2(a: Int, b: Int): Int = a + b

// 표현식 & 반환타입 생략 (타입추론)
fun sum3(a: Int, b: Int) = a + b

// body( {} ) 가 있는 펑션의 경우 반환타입 생략 불가
//fun sum4(a: Int, b: Int) {
fun sum4(a: Int, b: Int): Int {
    return a + b
}

// 반환타입이 없는 함수는 Unit 반환
// java의 void 와 유사
//fun printSum(a: Int, b: Int): Unit {
fun printSum(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}

// 파라메터 기본값 설정
fun greeting(message: String = "Hi") {
    println(message)
}

fun log(level: String = "INFO", message: String) {
    println("[$level] $message")
}

fun main() {
    // Named Argument
    log(message = "Info Log")
    log(level = "DEBUG", "Debug Log")
    log("WARN", "Warn Log")
    log(level = "ERROR", message = "Error Log")
}