#1 
자바 기본문법 , 응용

1. 자바의 기본 지식 복습 및 확인

- 자바의 특징 : Write Once , Run Anywhere -> 운영체제에 독립적 (소스코드가 JVM위에서만 동작한다)

- 자바의 특징 중 하나로 	더 이상 사용하지 않는 메모리를 자동으로 정리하는 기능 -> 가비지 콜렉션(Garbage Collection) -> 일어나는 시점 알 수 없음 , 언젠간 일어남

- 자바 프로그램을 개발 할 때 일반 Editor를 사용하면 단점 , Eclipse 같은 IDE 사용시 장점 -> 코드편집 , 코드 assistant , 소스 버전 관리 , 프로젝트관리 , 코드 리펙토링 등..

실수가 줄어들고 개발 생산성이 향상된다!

- 변수 : 메모리 공간 , 그릇 -> 메모리 공간에 값을 할당(assign) 후 사용

- 공간의 크기는 타입별로 달라짐.

- 타입 : 변수에 저장되는 데이터의 종류.

* Primitive : 미리 정해진 Memory size로 표현 , 변수 자체에 값 포함.

* Reference : 미리 정해질 수 없는 데이터 표현 , 변수에는 실제 값을 참조한 주소를 저장

- 큰 타입의 변수는 작은 타입의 변수에 바로 할당할 수 없음. 명시적 형변환 가능

- 형 변환 : 변수의 타입을 다른 타입으로 변환하는 것. primitive / Referecnce 끼리 가능

- Reference 타입은 미리 만들 수 없는 데이터를 별도의 공간(Heap) 에 표현, 주소를 저장

- 일반적으로 횟수가 정해져있는 경우에는 for문 이외에는 while문을 사용해 반복








#2 자바 기본문법 복습 및 확인 - 객체 지향 프로그래밍.

- 동일한 타입의 변수를 여러개 사용?? => 변수의 수 증가 , 코드 증가 , 반복문X , 변수의 수가 동적일 경우 사용 X

- 배열을 사용하여 동일 타입 변수 대신하기 ->요소에 접근하는 속도 빠르며 크기 변경 불가

-Array is immutable

객체지향 프로그래밍 이란??? 
-> 주변의 많은것들을 객체화 하여 프로그래밍
장점  : 블록형태의 모듈화된 프로그래밍 , 신뢰성 높음 , 추가/수정/삭제 용이 , 재사용성

현실 세계 객체 , 클래스 ,프로그램 의 객체의관계
- 현실의 객체가 갖는 속성과 기능은 추상화(Abstraction)되어 클래스에 정의
- 클래스는 구체화 되어 프로그램의 객체(instance , obkect)가 된다

현실의 객체는 우리가 만지고 느낄 수 있는 것 -> 실생활 구체화.
- 클래스 : 객체를 정의해 놓은 것 즉 객체의 설계도 , 클래스는 직접 사용할 수 ㅇ없고 직접 사용되는 객체를 만들기 위한 틀을 제공할 뿐
- 객체 : 클래스를 데이터 타입으로 메모리에 생성된 것

