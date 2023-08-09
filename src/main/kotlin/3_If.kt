fun main() {

    // if..else
    val job = "Software Developer"

    if (job == "Software Developer") {
        println("개발자")
    } else {
       println("개발자 아님")
    }


    // if..else 표현식으로 사용.
    // 3항 연산자도 해당 표현식으로 대응
    val age: Int = 18

    var str = if (age > 18) {
        "성인"
    } else {
        "미성년자"
    }

    val a = 1
    val b = 2
    val c = if (b > a) b else a
}