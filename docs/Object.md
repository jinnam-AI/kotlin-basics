# Object

- Singleton을 지원해주는 코틀린의 선언 방법
- 인스턴스를 한 번만 생성
- 따로 생성할 필요없이 바로 접근이 가능


- 예시
```kotlin
// singleton
object CarFactory {
    val cars :MutableList<Car> = mutableListOf<Car>()
    fun makeCar(engine:Int):Car {
        val car =  Car(engine)
        cars.add(car)
        return car
    }
}

data class Car(val engine:Int)

fun main() {
    // 접근
    val car:Car = CarFactory.makeCar(2000)
    val car2:Car = CarFactory.makeCar(3000)
    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}
```