package study.book;

import java.util.Scanner;

public class Doit_15_Java_IO {

    public static void main(String[] args) {

//        1. 자바 입출력과 스트림
//        1) 스트림이란? 네트워크용어에서 유래됨. 자료 흐름이 물의 흐름과 같다는 의미. 입출력 장치는 매우
//        다양하기 때문에 장치에 따라 입출력 부분을 일일이 다르게 구현을 하면 프로그램 호환성이 떨어질 수밖에
//        없다. 따라서 자바는 입출력 장치와 무관하고 일관성 있게 프로그램을 구현할 수 있도록 일종의 가상
//        통로인 스트림을 제공. 자료를 읽어 들이려는 소스와 자료를 쓰려는 대상에 따라 각각 다른 스트림 클래스 제공

//        2. 표준 입출력(System. out / in / err)
//        1) System.in으로 화면에서 문자 입력받기
//        2) 그 외 입력 클래스
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해 주세요");
        String name = sc.nextLine();
        System.out.println("당신의 이름은 : "+name+" 입니다.");

//        3. 바이트 단위 스트림
//        1) InputStream : FileInputStream / ByteArrayInputStream / FilterInputStream
//                 메서드 : int read(), int read(byte b[]), void close()
//        2) FileInputStream


//        4. 문자 단위 스트림

//        5. 보조 스트림

//        6. 직렬화










    }


}
