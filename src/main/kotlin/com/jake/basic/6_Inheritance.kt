// 코틀린은 기본적으로 상속을 default로 막고있음
// java의 final class 와 유사.
// open 키워드를 통하여 상속을 허용할 수 있음

// 상속이 가능한 Dog class
open class Dog {
    // 변수를 재정의 하기 위하여 open 키워드 정의
    open var age: Int = 0

    // 함수 재정의 하기 위하여 open 키워드 정의
    open fun bark() {
        println("Bark Bark")
    }
}

// Dog 를 상속받은 Bulldog 클래스
open class Bulldog(override var age: Int = 0): Dog() {

//    override var age: Int = 0

    // override 된 변수나 함수는 자동으로 open 키워드가 적용됨
    // 하위 클래스에서 재정의 가능

    // 상속을 막기 위해서는 final 키워드 사용
    final override fun bark() {
//        println("컹컹")
        // 상위클래스 호출은 java와 동일하게 super를 사용
        super.bark()
    }
}

// 추상클래스
// abstract 키워드 사용
abstract class Developer {

    abstract var age: Int
    abstract fun code(language: String)
}

class BackendDeveloper(override var age: Int): Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }

}

fun main() {
    val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()

    var backendDeveloper = BackendDeveloper(age = 30)
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")
}