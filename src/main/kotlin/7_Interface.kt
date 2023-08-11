class Product(val name: String, val price: Int)

interface Wheel {
    fun roll()
}

interface Cart: Wheel {

    // 인터페이스의 프로퍼티 정의 가능
    var coin: Int

    // 인터페이스에서는 백킹필드(field) 사용불가
    val weight: String
        get() = "20KG"

    fun add(product: Product)

    // java 와 동일하게 인터페이스에서 정의가능한 default 함수 정의가능
    fun rent() {
        if (coin > 0) {
            println("카드를 대여합니다.")
        }
    }

    override fun roll() {
        println("카트가 굴러갑니다.")
    }

    fun printId() = println("1234")
}

interface Order {
    fun add(product: Product) {
        println("${product.name} 주문이 완료되었습니다.")
    }

    fun printId() = println("5678")
}

// 다중 인터페이스 구현가능
class MyCart(override var coin: Int): Cart, Order {

    override fun add(product: Product) {
        if( coin <= 0) println("코인을 넣어주세요")
        else println("${product.name}이(가) 카트에 추가되었습니다.")

        // 주문하기
        // 서로다른 인터페이스에서 동일한 함수명이 존재할 경우 super<타입> 을 통하여 구분가능
        super<Order>.add(product)
    }

    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }
}

fun main() {
    val cart = MyCart(coin = 100)
    cart.rent()
    cart.roll()
    cart.add(Product(name = "장난감", price = 1000))
    cart.printId()
}