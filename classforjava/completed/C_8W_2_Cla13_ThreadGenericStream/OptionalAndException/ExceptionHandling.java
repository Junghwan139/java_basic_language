package classforjava.completed.C_8W_2_Cla13_ThreadGenericStream.OptionalAndException;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {


        System.out.println(" 나누실 숫자를 입력해주세요 ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int child = 10;

        try {
            System.out.println(child / input);
        } catch (Exception e){
            e.printStackTrace();  // 발생 에러를 그대로 출력
        } finally {
            System.out.println("무조건 실행되는 finally");
        }


        System.out.println("에러가 발생한 채로 실행이 완료 되었습니다.");






    }

}
