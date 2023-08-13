package com.jake.advanced

// sealed 클래스는 하위클래스를 제한조건에 따라 정의해야 함.
// 동일 패키지, 동일 모듈내에 위치해야 함
// 컴파일러가 컴파일 시점에 하위클래스를 판단할 수 있음.
sealed class Developer {

    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(override val name: String): Developer() {
    override fun code(language: String) {
        println("저는 백엔드 개발자입니다. ${language}를 사용합니다.")
    }
}

object OtherDeveloper: Developer() {
    override val name: String = "익명"

    override fun code(language: String) {
        TODO("Not yet implemented")
    }

}

data class FrontendDeveloper(override val name: String): Developer() {
    override fun code(language: String) {
        println("저는 프론트엔드 개발자입니다. ${language}를 사용합니다.")
    }
}

object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper-> pool[developer.name] = developer
        is OtherDeveloper-> println("지원하지 않는 개발자타입 입니다.")
//        else -> {
//            println("지원하지 않는 개발자입니다.")
//        }
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = BackendDeveloper("토니")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper("스티브")
    DeveloperPool.add(frontendDeveloper)

    println(DeveloperPool.get("토니"))
    println(DeveloperPool.get("스티브"))
}