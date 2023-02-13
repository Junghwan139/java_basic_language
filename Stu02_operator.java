public class Stu02_operator {
    public static void main(String[] args) {

//        1. 기본 연산자
//        1) 대입 연산자 : =
//        2) 부효 연산자 : +, -
//        3) 산술 연산자 : 사칙연산(+, -, *, /, %)

        int mathScore = 90;
        int engScore = 70;

        int totalScore = mathScore + engScore;
        System.out.println("mathScore + engScore : " + totalScore);

        double avgScore = totalScore / 2.0;
        System.out.println("avgScore : " + avgScore);

//      4) 증가·감소 연산자 : ++, --

        int gameScore = 150;
        int lastScore1 = ++gameScore;
        System.out.println("++gameScore : " + lastScore1);

        int lastScore2 = --gameScore;
        System.out.println("--(++gameScore) : " + lastScore2);
        System.out.println("---------------------------------------------------------------------");

        int gameScore1 = 150;
        int lastScore3 = gameScore1++;
        System.out.println("gameScore1++ : " + lastScore3 + ", gameScore1 : " + gameScore1);

        int lastScore4 = gameScore1--;
        System.out.println("(gameScore1++)-- : " + lastScore2 + ", gameScore1 : " + gameScore1);
        System.out.println("---------------------------------------------------------------------");

//        5) 관계 연산자(비교연산자) : >, <, >=, <=, ==, !=
//        6) 논리 연산자 : &&, ||, !

        int num1 = 10;
        int i = 2;
        System.out.println("최초 num1 : " + num1);
        System.out.println("최초 i : " + i);

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
//        - 거짓 && 참
        System.out.println("value(거짓&&참) : " + value);
        System.out.println("거짓(num1) &&참(i) 연산 후 num1 : " + num1);
        System.out.println("거짓(num1) &&참(i) 연산 후  i : " + i);
//        - (1) && (2) 일 경우 (1)이 거짓이면 (2)은 실행하지 않는다.

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
//        - 참 && 참
        System.out.println("value(참&&참) : " + value);
        System.out.println("참(num1) &&참(i) 연산 후 num1 : " + num1);
        System.out.println("참(num1) &&참(i) 연산 후  i : " + i);
//        - (1) || (2) 일 경우 (1)이 참이면 (2)은 실행하지 않는다.

//        7) 조건 연산자(삼항 연산자)

        int fatherAge = 45;
        int motherAge = 47;

        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F';
        System.out.println("(fatherAge > motherAge) ? \'T\' : \'F\' : " + ch);

//        8) 비트 논리 연산자

    }
}
