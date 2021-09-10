# Inflearn Java Study
자바 스터디 인프런 강의 필기 및 실습을 기록합니다.

## 2021-09-05
### Java - Write Once, Run Anywhere
+ Java - 객체지향형 프로그래밍 언어
+ 목적 - 한 번의 코드 작성으로 CPU나 운영 체제와 관계없이 사용할 수 있게 
하겠다.
+ 코드는 컴퓨터에 설치된 가상머신이 실행시킨다.
+ 안드로이드용 가상머신 - Dalvik( -> ART)


### Java 자료형, 변수, 주석

+ 자료형

    + int : 정수형

    + long : +-21억이 넘어가면 사용

    + float : 소수점이 들어가면 사용

    + string : 메모리가 터질 때까지 사용가능

    + boolean : 참, 거짓

    + char : 'A', 'B' - String은 char의 집합

+ 변수

    + int myNumber  = 10000;

    + myNumber 에 10000을 넣는다.


+ 주석

// int myNumber  = 10000;

### 메서드

+ Java 에서는 method, C에서는 함수이다.

+ 변수가 하나의 자료라면 함수는 하나의 행동

+ 변수를 넣으면 리턴을 뱉어내는 기계 부품이다.

### if / Array / for

+ 배열 - 형태가 같은 자료를 줄세워 둔 '자료구조' 중 하나

    + 배열은 출석부와 같다. 다만 0부터 시작한다. 

            출석부[번호] = "이름"

            name[7] = "신영수"

            String[] names = new String[11];

+ 반복문

    + For 문 - 횟수를 알고 있을 때 좋다.

    + While 문 - 종료 조건을 알고 있을 때 좋다.

## 2021-09-10

우리는 객체를 지향한다.
1. Onject-oriented Programming 줄여서 OOP 라고 한다.
2. Java, C++, C#, Object-C 등
3. 제일 중요한 것은 '객체(Object)'

### 객체 
1. 아무거나 하나 집어서 객체일 확률 99%
2. 객체는 내가 작성한 **class**에 숨을 불어넣어 만든다. (new)
3. 객체는 정보(변수)와 행동(메소드)를 가진다.

