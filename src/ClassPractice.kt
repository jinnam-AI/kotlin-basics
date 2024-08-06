open class Person(val name:String) {

    var race:String? = null

    init{
        println("I am Person")
    }

    constructor(name:String,race:String):this(name){
        this.race = race
    }

    open fun introduce(){
        println("my name is ${name}")
    }
}

class Korean(name:String,val nation:String):Person(name){
    init {
        println("i am korean")
    }

    override fun introduce() {
        super.introduce()
        println("my nation is $nation")
    }
}



fun main() {
    val person = Person("james")
    person.introduce()

    val korean = Korean("jinnam","korea")
    korean.introduce()
}