import kotlin.reflect.typeOf

class NewType {

}


//조건문 if
fun maxBy(a:Int,b:Int):Int {
    if (a>b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a:Int,b:Int):Int = if(a>b) a else b

//조건문 when
fun checkNum(score:Int) {
    when(score) {
        in 91..100-> println("1등급")
        in 81..90-> println("2등급")
        in 71..80-> println("3등급")
        in 61..70-> println("4등급")
        1,2 -> println("점수 오류")
        0 -> println("백지")
        else -> println("공부 안 할래?")
    }
}

// when 조건문 state
fun checkType(value:Any):Unit{
    val check:String = when(value) {
        //타입 비교
        is String -> "문자열입니다"
        is Int -> "정수입니다"
        is Float -> "부동소수입니다"
        // 타입 출력
        else ->"${value::class.simpleName}입니다"
    }
    println(check)
}

// 배열 array
// 크기변경 x
fun array() {
    val array1:Array<Int> = arrayOf(1,2,3)
    val array2:Array<Any> = arrayOf(1,2.3f,"a")

    //값 얻기
    val element1 = array1[0]
    val element2 = array1.get(1)

    //값 변경
    //크기가 넘어가면 안된다
    array1.set(2,11)

}

/*
* List
* 1. List 읽기전용,크기변경x
* 2. MutableList 읽기/쓰기 크기변경o
* */

fun proccessList() {

    val list1:List<Int> = listOf(1,2,3)

    val list2:ArrayList<Any> = arrayListOf(1,2.3f,"a")

    val list3 = (1..5).toMutableList()

    //값 얻기
    //List
    val element1 = list1[0]
    val element2 = list1.get(1)

    //MutableList
    val element3 = list2[0]
    val element4 = list2.get(1)

    //값 추가
    list2.add(9)
    list3.addAll(arrayListOf(1,2,3,4))

    println("list2.add(9) result : ${list2.toString()}")
    println("list3.addAll(arrayListOf(1,2,3,4)) result : ${list3.toString()}")
    println("toMutableList 결과 : ${list3::class.simpleName}")
}

// 반복문
// For / While
fun processFor() {
    val players = arrayListOf("curry","james","davis","george")
    for (name in players){
        println(name)
    }

    var sum = 0
    for (i in 1..10 step 2){
        sum += i
    }

    for ((index,name) in players.withIndex()){
        println("index : ${index} name : ${name}")
    }

    var index = 0
    while(index<10){
        index+=1
        println("current index $index")
    }
    println("sum : $sum")
}

fun nullCheck(){
    //NPE : Null Pointer Exception
    var name : String = "anthony"

    // null을 설정하기 위해서는 타입에 ?를 추가해야 한다.
    var nullName : String? = null

    var nameInUpperCase:String = name.uppercase()

    // null safe call (?.)
    var nullNameInUpperCase:String? = nullName?.uppercase()

    // ?: elvis operator
    // ?: 을 사용해서 null일 경우 기본값 정하기
    val lastName : String? = null
    val fullName : String = name+" "+(lastName?: "NO lastName")

//    var mLastName : String = lastName ?: throw IllegalArgumentException("No last name")

    println(fullName)
}

fun main() {
    println("Hello Kotlin!")
    val val1 = maxBy(1,2)
    val val2 = maxBy2(1,2)
    val newtype = NewType()

    println("maxby1 : ${val1} maxby2 : ${val2}")
    checkNum(1)
    checkType("문자열")
    checkType(newtype)

    //배열
    array()
    proccessList()

    //반복문
    processFor()

    // null
    nullCheck()
}