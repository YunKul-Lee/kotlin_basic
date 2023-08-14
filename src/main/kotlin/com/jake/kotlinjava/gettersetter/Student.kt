package com.jake.kotlinjava.gettersetter

import java.time.LocalDate

class Student {

    // @JvmField 를 사용하게 되면, Java 코드에서 getter/setter 가 아닌 필드명으로 접근가능
    @JvmField
    var name: String? = null

    var birthDate: LocalDate? = null

    // 불변변수는 setter 사용불가. getter만 접근가능
    val age: Int = 10

    // private set는 내부 클래스에서만 접근가능
    var grade: String? = null
        private set

    fun changeGrade(grade: String) {
        this.grade = grade
    }
}