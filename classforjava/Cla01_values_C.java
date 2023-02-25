package classforjava;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cla01_values_C {
    public static void main(String[] args) {

        //        1. 변수란 무엇일까.
//        변수 : 값을 저장하기 위한 공간
        int a = 3;
//        int 라는(자료형 / 명) 뜻은 a의 값이 정수값이 되어야 한다는 선언
//        a=3의 의미는 오른쪽의 3의 값을 왼쪽의 변수 a에 대입한다는 의미
//         a= a+1은 오른쪽의 a+1을 왼쪽의 a에 대입하다는 뜻.
//         오른쪽의 a+1은 현재 시점에서 3+1이므로 a는 4로 재정의 된다.
//         아래의 문구는 a를 1만큼 증가시킬때 관용적을 굉장히 많이 사용.
        a = a + 1;
        System.out.println("변수 a의 값 : " + a);
        System.out.println("---------------------------------------------------------------------");

//        2. 변수의 명명규칙
//        숫자로 시작할 수 없다. 띄어쓸 수 없다.

//      책) 1) 변수 이름은 영문자 (대문자, 소문자)나 숫자를 사용할 수 있고,
//          2) 특수문자 중에는 $, _만 사용할 수 있습니다.
//          3) 변수 이름은 숫자로 시작할 수 없습니다.
//          4) 자바에서 이미 사용중인 예약어는 사용할 수 없습니다.

        int abc = 3;
        int abc1 = 3;
        int abc2 = 3;
        int abc_3 = 3;
//        의미가 달라지는 단어 두개가 합쳐질때는 아래와 같이 대문자 하나로 구분
        int abcAlphabet = 3;
//        String int = "abc";
        System.out.println("---------------------------------------------------------------------");


//      3. 변수 선언방법
//        1) 초기화와 동시에 값 할당
        byte num1 = 127;
        System.out.println("byte자료 형 num1의 값 : " + num1);
//        2) 초기화 따로 값 할당 따로
        byte num2;
        num2 = 122;
        System.out.println("byte자료 형 num1의 값 : " + num2);
//        아래는 오버플로우 인해 에러가 발생 byte의 범위는 -128~127
//        num1 = num1 + 1;
//        num2 = num2 - 1;

        byte num3 = 127;
//        num3 = num3+1

        long a1 = 2;
        for (int i = 0; i < 80; i++) {
            a1 = a1 * 2;
        }
        System.out.println("long타입 a1값의 오버플로우 : " + a1);
        System.out.println("---------------------------------------------------------------------");


//        4. 자료형

//        1)정수 : byte(1바이트-8비트), short(2바이트-16비트), ★int(4바이트-32비트), long(8바이트-64비트)
//          int를 많이 사용. 오버플로우나면 long 사용
//          long 타입의 경우 숫자 뒤에 ★L을 붙여서 명시적으로 구분
        long l1 = 10L;
        System.out.println("long타입의 l1의 값 : " + l1);

//        2)실수 : float(4바이트-32비트), ★double(8바이트-64비트)
//          실수는 double을 많이 사용한다. float를 사용할 경우 관용적으로 ★f로 구분
//          float는 소수점 6자리다 보니, 오버플로우 발생
        float f1 = 1.23456789f;
        double d1 = 1.23456789;
        System.out.println("float타입의 f1의 값 : " + f1);
        System.out.println("double타입의 d1의 값 : " + d1);

//       ★3)부동소수점 : 컴퓨터에서는 2진 체계의 연산을 하다보니,
//           소수점 계산은 필연적으로 오차 발생

        double num = 0;
        for (int i = 0; i < 1000; i++) {
            num = num + 0.1;
        }
        System.out.println("num에 0.1씩 1000번 더하는 반복문 값 : " + num);

//        10의 자리를 곱하여 소숫점 자리를 없애고, 10으로 다시 나누는 방식을
//        쓰게 되면, 소수점 연산의 오류를 해결할 수 있다.

        double d2 = 0.1;
        double d3 = 0.2;
        System.out.println("(d2*10+d3*10)/10의 계산 결과 : " + (d2 * 10 + d3 * 10) / 10);

//        소숫점 자리 해결을 위해 BigDecimal 이라는 라이브러리 사용
//        import java.math.BigDecimal;
        BigDecimal d4 = new BigDecimal("0.1");
        BigDecimal d5 = new BigDecimal("0.2");
        System.out.println("BigDeciaml을 한 결과 : " + d4.add(d5));

//        4) 문자형 : (문자)char, (문자열)String
//        JAVA의 문자타입 2가지 1)char - 1글자 2)String - 1글자 이상
//        문자의 기본형은 char이고, 한글자를 쓸때 사용한다.
//        char = ' ', String = " "
//        타입변환 : char -> int

        char ch1 = 'a';
        System.out.println("char자료형 ch1의 값 : " + ch1);
        System.out.println("char자료형을 int로 형변환 했을 때 ch1의 값 : " + (int) ch1);

        char ch2 = 66;
        System.out.println("char자료형에 int값을 넣었을 때 ch2의 출력값 : " + ch2);

        int ch3 = 67;
        System.out.println("int자료형 ch3의 출력값 : " + ch3);
        System.out.println("int자료형 ch3를 char로 형변환 한 값 : " + (char) ch3);

        char ch4 = '한';
        char ch5 = '\uD55c';
        System.out.println("char자료형 ch4에 값 \'한\' 대입 : " + ch4);
        System.out.println("char자료형 ch5에 값 \\uD55c 대입 : " + ch5);

//        5) 논리 자료형 : boolean(1바이트)
        boolean isMarried = true;
        System.out.println("boolean 자료형 isMarried의 값 : " + isMarried);

//        6) 자료형 없이 변수 선언하기(java 10부터 생김)

        var noType1 = 10;
        var noType2 = 10.0;
        var noType3 = "hello";
        System.out.println("var자료형 noType1에 정수 입력한 값 : " + noType1);
        System.out.println("var자료형 noType1에 실수 입력한 값 : " + noType2);
        System.out.println("var자료형 noType1에 문자열 입력한 값 : " + noType3);

        ArrayList<String> list = new ArrayList<String>(); // 자료형 출력을 위한.. ★공부필요
        System.out.println("문자열 noType3 자료형 출력 : " + noType3.getClass().getName());
        System.out.println("---------------------------------------------------------------------");

//        5. 상수와 리터럴
//        1) 상수 선언하기 : final 자료형 상수이름 = 값; (상수이름은 주로 대문자)

        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0;

        System.out.println("변하지 않는 상수값 MAX_NUM 출력 : " + MAX_NUM);
        System.out.println("변하지 않는 상수값 MIN_NUM 출력 : " + MIN_NUM);
        System.out.println("---------------------------------------------------------------------");

//        6. 형 변환(type conversion)
//        정수와 실수는 컴퓨터 내부에서 표현되는 방식이 전혀 달라 연산할 경우 자료형 통일 후 연산 필요
//        원칙 : (1) 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어진다.
//              (2) 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 이루어진다.

//        1) 묵시적 형 변환(자동 형 변환)
        byte bNum = 10;
        int iNum = bNum;

        System.out.println("byte 자료형 bNum값 : " + bNum);
        System.out.println("int 자료형에 byte자료형 복사한 iNum값 : " + iNum);

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println("int 자료형 iNum2값 : " + iNum2);
        System.out.println("float 자료형에 int자료형 복사한 fNum값 : " + fNum);

        double dNum;
        dNum = fNum + iNum;
        System.out.println("double자료형에 float + int형 dum : " + dNum);

//        2) 명시적 형 변환(강제 형 변환)

        double dNum1 = 1.2;
        float fNum2 = 0.9f;

        int iNum3 = (int)dNum1 + (int)fNum2;
        int iNum4 = (int)(dNum1 + fNum2);
        System.out.println("int자료형 iNum3에 int(double)+int(float) 대입 : " + iNum3);
        System.out.println("int자료형 inum4에 int(double+float) 대입 : " + iNum4);





/*
        char c1 = '김';
        int n1 = (int)c1;
        System.out.println(n1);
        System.out.println(c1);


//        double -> int 변환? x
//        int -> double 변환? o

        int n1 = 10;
        double d1 = n1;
        System.out.println(d1);   //묵시적 타입변환

        //명시적 타입변환
        int n1 = 1;
        int n2 = 4;


        double d1 = n1/n2;
        System.out.println(d1);
        double d2 = (double)n1/n2;
        System.out.println(d2);
//        (double)을 통해 명시적으로 double로 타입변환 하였으므로,
//        double / int 하여 double 결과값이 나오게 된다.

        //타입변환 이슈 공부
//        null 데어터가 없다는 명시적인 표현


        int n1 = 10;
        int n2 = 20;
        int n3 = 30;

        if(n1<n2 && n2<n3){

            System.out.println("참입니다.");

        }else {

            System.out.println("거짓입니다.");
        }

        System.out.println("숫자 2개를 입력해주세요 ");
        System.out.print("첫 번째 숫자를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        System.out.println("firstNum : "+firstNum);
        System.out.print("두 번째 숫자를 입력해주세요 : ");
        int secondNum = sc.nextInt();
        System.out.println("secondNum : "+secondNum);
        if(firstNum > secondNum){
            System.out.println("더 큰 숫자는 : "+firstNum);
        }else{
            System.out.println("더 큰 숫자는 : "+secondNum);
        }


//        변수란 변할 수 있는 숫자, 상수는 변할 수 업는 숫자.
        int n1 = 20;
        n1 = 30;
        n1 = n1 + 10;
        System.out.println(n1);

//        final을 통해서 변할 수 없는 상수값을 지정, 상수값은 일반적으로 모두 대문자를 사용
        final int BUSFEE = 1000;
//        상수값은 선언과 초기화가 따로 될 수는 없다.

*/

    }
}
