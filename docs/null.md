# null

## Kotlin의 Null, NPE

Kotlin은 NullPointerException(NPE)을 방지하기 위해 설계된 언어입니다. 이를 위해 Kotlin은 타입 시스템에 null 안전성을 추가하여 개발자가 null 값을 명시적으로 처리하도록 합니다.

### Null 안전성

Kotlin에서 변수는 기본적으로 null 값을 가질 수 없습니다. null 값을 가질 수 있는 변수는 타입 뒤에 물음표(?)를 붙여서 선언해야 합니다.

```kotlin
var nonNullable: String = "Hello"
// nonNullable = null // 컴파일 오류 발생

var nullable: String? = "Hello"
nullable = null // 정상 작동

```

### 안전한 호출 (Safe Call)

null 가능 변수를 사용할 때는 안전한 호출 연산자(?.)를 사용하여 null 검사를 수행할 수 있습니다.

```kotlin
val length = nullable?.length // nullable이 null이면 length는 null

```

### 엘비스 연산자 (Elvis Operator)

엘비스 연산자(?:)를 사용하여 null일 경우 기본값을 제공할 수 있습니다.

```kotlin
val length = nullable?.length ?: 0 // nullable이 null이면 length는 0

```

### 강제 언래핑 (Not-null assertion)

느낌표 두 개(!!)를 사용하여 null 가능 변수를 강제로 non-null 변수로 변환할 수 있지만, 해당 변수가 null이면 NPE가 발생합니다.

```kotlin
val length = nullable!!.length // nullable이 null이면 NPE 발생

```