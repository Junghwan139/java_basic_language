package Study.A_Java_C_Codingtest;

import java.util.Scanner;

public class Ct147_num {

    public static void main(String[] args) {


        System.out.println("숫자를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String k = n%2==0? "n is even":"n is odd";

        System.out.println(k);

    }




}
