# Lambda

# 형식

`val` or `var`  `람다이름` : `(input Type)→(return Type)` = `{input변수명:타입→함수바디}`

```kotlin
val square:(Int)->(Int) = {value:Int->value*value}
```

# 확장 함수 람다식

이미 설정된 클래스에 메서드를 추가 하는 방법

- 형식
- `val` `람다이름` : `대상클래스.()` → `리턴타입` = `{함수바디}`

```kotlin
val extesionFunc : String.() -> String = {this + " | 추가적인 기능"}
```