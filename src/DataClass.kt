class NormalUser(val name:String,val email:String) {

}

// 데이터 클래스 선언
data class User(val name:String,val email:String)


fun main () {
    // 사용
    val dataUser = User("user1","user1@user.com")
    val dataUser2 = User("user1","user1@user.com")
    val normalUser = NormalUser("user1","user1@user.com")

    //toString()
    println("data class print : ${dataUser}")
    println("normal class print : ${normalUser}")

    //copy()
    val copyDataUser = dataUser.copy(name="copyuser")
    println("origin : ${dataUser} \ncopy : ${copyDataUser}")

    //hashcode()
    println("hashcode \n1) ${dataUser.hashCode()} \n2) ${dataUser2.hashCode()}")

    //equals()
    println(dataUser==dataUser2)
}