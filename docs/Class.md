# Class

# 구조

```kotlin
class : 키워드 FirstClass : 클래스 이름 constructor (name:String) {
	init {
		//init 블록
	}
	fun 함수 () {}
	private val 속성 = 값
}
```

# 실행 순서

`primary constructor` → `init` → `second constructor`

### **생성자 constructor**

- **`주 생성자 (primary constructor)`**
    
    ```kotlin
    class NameService constructor(name: String) *{ ... }*
    ```
    
    - 클래스 이름 옆에 위치
    - 기본 접근 제어자는 public → 생성자에서 선언된 변수는 public
    - 선언과 초기화를 동시에 한다.  → 변수에 var or val을 적으면
        
        ```kotlin
        class NameService constructor(var name: String) *{ ... }*
        ```
        
- **`보조 생성자 (secondary constructors)`**
    
    ```kotlin
    class : 키워드 FirstClass : 클래스 이름 constructor (name:String) {
    	constructor(name:String,value:Int) : this(name) {
    		
    	}
    }
    ```
    
    - body 내부에 constructor를 통하여 선언
    - 주 생성자가 있으면 반드시 this를 통하여 상속받아야한다.
    - 상속받으므로 주 생성자의 변수가 보조 생성자에도 있어야 한다.
    - 주로 오버로딩에 사용됨

### **init 블럭**

- 객체 생성시 실행
- 사용 가능 변수
    - 생성자에서 선언
    - init블록 보다 위에 선언된 변수

### 상속

- 규칙
    1. 부모클래스와 같은 이름의 속성을 자식클래스는 가질 수 없다.
    2. 같은 이름의 속성은 override를 통하여 진행
    3. 자식 클래스 생성 시 부모 클래스의 생성자도 실행
    4. 부모 클래스 앞에 `open` 키워드를 써야 한다.
    5. 오버라이딩을 하는 부모클래스의 속성에도 `open` 키워드를 사용해야 가능하다.

- 상속 예시
    
    ```kotlin
    open class ParentClass (val name:String) {
    
    }
    
    class ChildClass (name:String,val age:Int):ParentClass(name) {
    
    } 
    
    ```
    
- 오버 라이딩
    
    ```kotlin
    open class ParentClass (val name:String) {
    	open fun call() {
    		println("my name is $name")
    	}
    }
    
    class ChildClass (name:String,val age:Int):ParentClass(name) {
    	override fun call() {
    		super.introduce()
    		println("my age is $age")
    	}
    } 
    
    ```