/*
1. Lambda
1) 메소드의 파라미터로 사용가능
2) return 값으로 사용가능

- 확장 함수
1) Lambda 형식으로 특정 타입에 기능을 추가
 */



val square:(Int)->(Int) = {value:Int->value*value}

val add:(Int,Int)->(Int) = {num1:Int,num2:Int -> num1+num2}

//확장함수 예시
val extesionFunc : String.() -> String = {this + " | 추가적인 기능"}


// lambda를 매개변수로 받는 함수
fun expression (func1:(Int)->(Int),value:Int) {
    println("결과는 ${func1(value)} 입니다")
}


fun main() {
    expression(square,6)
    val sentence = "예시 글"
    println(sentence.extesionFunc())
}