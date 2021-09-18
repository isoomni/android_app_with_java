package sessionOne;
public class FirstSection{
    // http://goo.gl/wlU5R9
    // Variables, Comments

    public static void main(String[] args){
        // main 도 메서드이다.

        int number = 100;
        String myString = "hihiihihih";
        char myChar = 'A';
        long myBigNumber = 3238741929792175L;
        float myFloat = 2345.325f;

        int numOne = 100;
        int numTwo = 24432;

        int plus = numOne + numTwo;
        int minus = numOne - numTwo;
        int multiply = numOne * numTwo;
        int divide = numTwo / numOne;
        int modulo = numTwo % numOne;


        System.out.println(number);
        System.out.println(myString);
        System.out.println(myChar);
        System.out.println(myBigNumber);
        System.out.println(myFloat);
        System.out.println("Hello World");

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modulo);

        // 메서드 실습
        // 덧셈 연산
        int plusResult = plus(1,2);
        System.out.println("덧셈 연산 : " + plusResult);

        printTwice("OO-AH");

    }

    static void printTwice(String text){
        System.out.println("두 번 출력 : ");
        System.out.println(text);
        System.out.println(text);
    }
    static int plus(int x, int y){
        return x + y;
    }
}