package classforBackEnd.A_Java_Basic.completed;

import java.util.Scanner;

public class C_2W_Cla03_ifstatement_C {
    public static void main(String[] args) {

//        현재, 나한테 13000원이 있다.
//        만약에 돈이 10000원 이상있으면, "택시를 타시오" 출력
//        만약에 돈이 2000원 이상 있으면, "버스를 타시오" 출력
//        1000원 이상 있으면 킥보드를 탓니오
//        그렇지 않으면, "걸어가시오" 출력

//        1. If문

        System.out.println("if문 예제 입니다.");
        System.out.print("돈을 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        int myMoney = sc.nextInt();

        if (myMoney >= 10000) {
            System.out.println("택시를 타시오");
        } else if (myMoney >= 2000 && myMoney < 10000) {
            System.out.println("버스를 타시오");
        } else if (myMoney >= 1000 && myMoney < 2000) {
            System.out.println("킥보드를 타시오");
        } else {
            System.out.println("걸어가시오");
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.println("if문 예제 입니다._2");

//        알파벳 문자 1개를 입력을 받아, 해당 문자가 대문자 인지 소문자 인지 출력
        Scanner st = new Scanner(System.in);

        System.out.print("문자를 입력해 주세요 : ");
        char input = st.nextLine().charAt(0);  //charAt 문자열 슬라이스
        System.out.println(input);
        byte num = (byte) input;

//        소문자는 아스키코드 97~122
//        대문자는 아스키코드 65~90


        if (num >= 97 && num <= 122) {
            System.out.println("소문자 입니다.");
        } else if (num >= 65 && num <= 90) {
            System.out.println("대문자 입니다.");
        } else {
            System.out.println("잘 못 입력하였습니다.");
        }
        System.out.println("---------------------------------------------------------------------");

//        2. switch문

//        은행고객센터
//        1번을 입력하면, "대출업무입니다."를 출력
//        2번을 입력하면, "예금업무입니다."를 출력
//        3번을 입력하면, "마이데이터업무입니다."를 출력
//        4번을 입력하면, "외화송금업무 입니다."를 출력
//        그외의 숫자를 입력하면, "상담원 연결합니다."를 출력

        System.out.println("switch문 예제 입니다.");

        System.out.print("번호를 입력하세요 : ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("대출업무 입니다.");
                break;
            case 2:
                System.out.println("예금업무 입니다.");
                break;
            case 3:
                System.out.println("마이데이터업무 입니다.");
                break;
            case 4:
                System.out.println("외화송금업무 입니다.");
                break;
            default:
                System.out.println("상담원을 연결합니다.");
                break;

        }


    }


}
