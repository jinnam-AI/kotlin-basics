# Data Class

# 사용 이유
- 로직을 가지고 있지 않으며 데이터들의 표현만 가지는 클래스를 만들고 싶을 때
- 간단하게 데이터 클래스를 만들고 싶을 때
- 데이터 클래스의 편리한 특징(표현,데이터 분리,일치 여부,복사 등)

# 규칙
- 기본 생성자에 파라미터가 1개 이상 있어야 함
- 생성자에 파라미터 선언을 해야함 (val,var를 사용해서)
- 다른 클래스를 상속받을 수 없다.
  - 예외로 sealed 클래스는 상속 가능,인터페이스 구현 가능(>v1.1)
- `abstract`,`open`,`sealed`,`inner` 키워드 사용 불가

# 사용
```kotlin
data class DataClassExample (val stringData:String,var integerData:Int)
```

# 특징
- `toString()`
  - 생성된 인스턴스를 출력시 프로퍼티 값들이 출력
    ```kotlin
    data class User(val name:String,val password:Int)
    val user = User("user1",1234)
    println(user)
    
    >>>
    User(name="user1",password=1234)
    ``` 
- `equals()`
  - 두 객체의 데이터가 같은지 비교
    - 일반적인 클래스는 데이터만 비교하지 않고 인스턴스 자체를 비교
    - 데이터 클래스는 `equals()`를 통하여 같은 클래스의 다른 객체 프로퍼티 비교가 가능
    - 비교 예시
    ```kotlin
    data class User(val name:String,val password:Int)
    
    val user1 = User("user1",1234)
    val user2 = User("user1",1234)
    
    println(user1==user2)
    >>>
    true
    ```
- `copy()`
  - 특정 필드만 바꿔 객체를 생성
    - 불필요하게 객체생성을 다시 하여 같은 데이터가 들어갈 필드를 전부 다시 지정할 필요가 없다.
  - 예시
    ```kotlin
    data class User(val name:String,val password:Int)
    
    val user1 = User("user1",1234)
    val user2 = user1.copy(password = 12345)
    ```
- `hashCode()`
  - `hashCode`는 객체를 식별하는 값으로 일반적으로 주소값을 사용하나 유니크한 값이면 된다. 
  - 같은 데이터 클래스의 다른 객체는 `hashCode()`의 값이 같다
    - 일반적인 클래스는 다름