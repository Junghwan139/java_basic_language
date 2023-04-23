package ByMyself.Java_Codingtest;

import java.util.Scanner;

public class Ct022_triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int n = sc.nextInt();
        for(int i =1;i<n+1;i++){
            for(int j = 0; j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }


        System.out.println("*".repeat(30));
        String test = "aa";
        String test2 = test.repeat(20);
        System.out.println(test2);



    }
}