package classforBackEnd.A_Java_Basic.typing.Cla12_Collection;

public class MathClass {

    public static void main(String[] args) {

        // Math.random()은 임의의 double형 0이하 실수값을 반환하는 것
        System.out.println((int)(Math.random()*100));
        // 0~99까지 임의 수를 출력

        // Math.abs()는 절대값을 반환하는 함수
        int input = -100;
        System.out.println(Math.abs(input));

        double d1 = 0.1234;
        // Math.floor() : 내림, Math.ceil() : 올림, Math.round() : 반올림
        System.out.println(Math.floor(d1));
        System.out.println(Math.ceil(d1));
        System.out.println(Math.round(d1));

        // 소수 3번째 자리 반올림 하도록 로직을 짜보자.

        double d2 = (double)Math.round(d1*100)/100;
        System.out.println(d2);

        // Math.max는 둘중에 더 큰 값, Math.min 둘중에 더 작은 값
        System.out.println(Math.max(1.03,1.06));
        System.out.println(Math.min(1.03,1.06));

        // Math.pow는 제곱 연산, Math.sqrt()는 제곱근을 연산
        System.out.println(Math.pow(10,2));
        System.out.println(Math.sqrt(10));

        // 박싱 언박싱?

        // Arrays클래스의 모든 메소드는 클래스 메소드(static method)








    }

}
