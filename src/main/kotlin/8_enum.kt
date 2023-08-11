// enum 정의
// 코틀린에서는 enum class 로 정의 (java는 enum 으로 정의)
enum class PaymentStatus(val label: String): Payable {
    // enum 내부에서 함수를 정의할 수 있기 때문에, 이 경우에는 예외적으로 세미콜론으로 구분을 해줘야함.
    UNPAID("미지급") {
        override fun isPayable(): Boolean = true
    },
    PAID("지급완료"){
        override fun isPayable(): Boolean = false
    },
    FAILED("지급실패"){
        override fun isPayable(): Boolean = false
    },
    REFUNDED("환불"){
        override fun isPayable(): Boolean = false
    };


}

interface Payable {
    fun isPayable(): Boolean
}

fun main() {
    println(PaymentStatus.UNPAID.label)

    if(PaymentStatus.UNPAID.isPayable()) {
        println("결제 가능 상태")
    }

    // valueOf 를 통하여 인스턴스 생성가능
    val paymentStatus = PaymentStatus.valueOf("PAID")
    println(paymentStatus.label)

    // enum 비교는 == 키워드 사용
    if(paymentStatus == PaymentStatus.PAID) {
        println("결제 완료 상태")
    }

    // enum loop
    for(status in PaymentStatus.values()) {
        println("[$status](${status.label})")
    }

    println()

    // name, ordinal 은 enum에서 default 로 가지고 있음
    // name : enum 명칭으로 그대로 출력
    // ordianl : 정의한 순서를 출력( 0 ~ n )
    for(status in PaymentStatus.values()) {
        println("[${status.name}](${status.label}) : ${status.ordinal}")
    }

}