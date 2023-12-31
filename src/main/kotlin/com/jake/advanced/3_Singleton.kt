package com.jake.advanced

import java.time.LocalDateTime

// object 는 기본적으로 싱글톤
//object Singleton {
//
//    val a = 1234
//
//    fun printA() = println(a)
//}
//
//fun main() {
//    println(Singleton.a)
//    Singleton.printA()
//}

object DatetimeUtils {

    val now: LocalDateTime
        get() = LocalDateTime.now()

    const val DEFAULT_FORMAT = "YYYY-MM-DD"

    fun same(a: LocalDateTime, b: LocalDateTime): Boolean {
        return a == b
    }
}

class MyClass {

    private constructor()

    // 동반객체
    companion object MyCompanion {
        val a = 1234

        fun newInstance() = MyClass()
    }
}

fun main() {
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.now)
//
//    println(DatetimeUtils.DEFAULT_FORMAT)
//
//    val now = LocalDateTime.now()
//    println(DatetimeUtils.same(now, now))

    println(MyClass.a)
    println(MyClass.newInstance())

    // companion 에 이름을 부여하고 해당 이름으로 호출가능. 권장하지 않음.
    println(MyClass.MyCompanion.a)
    println(MyClass.MyCompanion.newInstance())
}