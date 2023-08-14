package com.jake.kotlinjava.exception

import java.io.IOException

class KotlinThrow {

    // 익셉션 전파를 하고싶은 경우 @Throws 사용
    @Throws(IOException::class)
    fun throwIOException() {
        throw IOException("체크드 익셉션인 IOException 발생")
    }
}

fun main() {
    // 코틀린에서는 예외처리가 강제가 아님 try ~ catch 제외
    val javaThrow = JavaThrow()
    javaThrow.throwIOException()

    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()
}