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
    val car:Car = CarFactory.makeCar(2000)
    val car2:Car = CarFactory.makeCar(3000)
    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}