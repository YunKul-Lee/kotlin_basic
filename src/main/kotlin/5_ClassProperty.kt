// 기본 클래스 선언
class Coffee {

}

// 생성자 선언
class Tea constructor(
    val name: String,
    val price: Int,
    // 후행 쉼표 선언 가능
    val brand: String,
    ) {

}

// Property 정의
class Milk (
    var name: String = "",
    var price: Int = 0,
    var iced: Boolean = false
) {

    // Custom Getter
    // val 은 Getter 만 가능
    val brand: String
        get() {
          return "서울"
        }

    // var 은 Custom Setter 정의 가능
    var quantity: Int = 0
        set(value) {
            if (value > 0) {    // 수량이 0 이상인 경우에만 할당
                // field는 식별자. 여기서는 quantity 변수에 접근한다는 의미임.
                // (quantity = value 를 사용하면 StackOverflow 발생)
                field = value
            }
        }
}

// body 없는 클래스
class EmptyClass

fun main() {
    val milk = Milk()
    milk.name = "저지방우유"
    milk.price = 2000
    milk.quantity = 1
    milk.iced = true

    if (milk.iced) {
        println("차가운 우유")
    }

    print("${milk.brand} ${milk.name} 가격은 ${milk.price} 수량은 ${milk.quantity}")
}