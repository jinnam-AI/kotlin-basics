# Companion Object(동반객체)

# Companion Object?
- 정적 메소드 또는 정적 변수를 선언할 때 클래스 내부에 `Companion Object`를 활용
- 클래스 당 하나의 `Companion Object`를 만들 수 있다.
- 별도의 인스턴스 생성 없이 접근이 가능
- `static`과의 차이점은 객체로써 생성


# 사용처
1. `private` `property` 또는 `method`를 읽어오기 위해 사용
   1. `private`를 통하여 실수 혹은 원치 않게 접근이 되면 안되는 변수 혹은 기능을 넣는다.
   2. 그 후에 `Companion Object`를 통하여 원하는 접근 방식을 만들어 관리한다.
   3. 즉 함부로 변하면 안되지만 내가 필요할 땐 접근이 가능하고 정적으로 여러 객체에서 사용하기 위해 쓰는것 

