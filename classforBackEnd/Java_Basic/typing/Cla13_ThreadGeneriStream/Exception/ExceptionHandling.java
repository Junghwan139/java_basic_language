package classforBackEnd.Java_Basic.typing.Cla13_ThreadGeneriStream.Exception;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        System.out.println("나누실 숫자 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int child = 10;

        // 예외 발생 가능성이 있는 구간에 try catch를 통해 예외를 감싼다.

        try{
            System.out.println("나눗셈의 결과는 "+child/input);
        } catch (ArithmeticException e){   // 모든 예외의 조상 : Exception e
            System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println("0으로 나눠서 예외가 발생했습니다.");
        } catch (Exception e){   // 모든 예외의 조상 : Exception e
            System.out.println("나눗셈에서 예외가 발생했습니다.");
        }finally {
            System.out.println("무조건 실행되는 finally 구문");
        }

        System.out.println("감사합니다.");





    }

}
