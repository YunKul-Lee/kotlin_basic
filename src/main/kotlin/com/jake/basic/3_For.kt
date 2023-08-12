fun main() {

    // 범위 연산자
    // .. 은 범위 모두 포함
    for(i in 0 .. 3) {
        println(i)
    }

    // util 은 마지막 범위는 포함하지 않음
    for (i in 0 until 3) {
        println(i)
    }

    // step 만큼 증가
    for(i in 0 .. 6 step 2) {
        println(i)
    }

    // 값을 감소 (downTo)
    for(i in 3 downTo 1) {
        println(i)
    }

    // 배열을 통한 반복
    val numbers = arrayOf(1, 2, 3)
    for(i in numbers) {
        println(i)
    }

}