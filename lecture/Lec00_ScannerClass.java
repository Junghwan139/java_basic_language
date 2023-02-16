package lecture;

import java.util.Scanner;

public class Lec00_ScannerClass {
    public static void main(String[] args) {
        System.out.println(12000  );
        System.out.print("이름을 입력하세요 : ");

        //입력 받을 때 하위 2줄 copy
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("당신의 이름은 "+name+"입니다");

    }
}
