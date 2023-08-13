package com.jake.advanced

class MyGenerics<out T>(val t: T) {

}

class Bag<T> {

    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>,
    ) {
        to.addAll(from)
    }
}

fun main() {
    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3", "4"))

    // 제네릭을 이용한 클래스 인스턴스를 만드려는 타입아규먼트 제공
    val generics1 = MyGenerics<String>("텍스트")
    val charGenerics: MyGenerics<CharSequence> = generics1

    // 타입 아규먼트 생략가능
    val generics2 = MyGenerics("텍스트")

    // 변수의 타입에 제네릭을 사용한 경우
    val list1: MutableList<String> = mutableListOf()

    // 타입 아규먼트를 생성자에서 추가
    val list2 = mutableListOf<String>()

    val list3: List<*> = listOf<String>("텍스트")
    val list4: List<*> = listOf<Int>(1, 2, 3, 4)

    // 변성 : 공변성/반공변성/무공변성
    // PECS(Producer-Extens, Consumer-Super)
    // 공변성은 자바 제네릭의 extends, 코틀린에서는 out
    // 반공변성은 자바 제네릭의 super, 코틀린에서는 int
}