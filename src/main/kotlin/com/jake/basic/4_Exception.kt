fun main() {

    // Checked Exception 을 강제화 하지 않음
    Thread.sleep(1)

    // try ~ catch 는 필요시에만 사용
    try {
        Thread.sleep(1)
    } catch (e: Exception) {
        println(e)
    }

    // finally 가능
    try {
        throw Exception()
    } catch (e: Exception) {
        println(e)
    } finally {
        println("finally")
    }


    // try ~ catch 표현식으로 사용가능
    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println(e)
    }
    println(a)

    val b: String? = null
    val c: String = b ?: failFast("예외 발생. b is null")

    println(c.length)

    // failFast에서 Nothing 타입을 반환받았기 때문에 실행되지 않음
    println("메시지 출력될까?")
}

// Exception 같이 정상적으로 동작하는 것을 보장하지 않는경우 리턴 타입 Nothing 정의
fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}