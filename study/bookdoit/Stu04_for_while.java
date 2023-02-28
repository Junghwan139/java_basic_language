package study.bookdoit;

public class Stu04_for_while {
    public static void main(String[] args) {

//        1. 반복문
//        1) while문 : while(조건식) { 수행문; }
        System.out.println("1) while");
        System.out.println("(예제 1) 1~10까지 누적합");

        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            //sum = sum+num
            /*
              1. num = 1 sum = 0 + 1  → sum = 1
              2. num = 2 sum = 1 + 2   → sum = 3
              3. num = 3 sum = 3 + 3   → sum = 6
              4. num = 4 sum = 6 + 4   → sum = 10
              5. num = 5 sum = 10 + 5  → sum = 15
              6. num = 6 sum = 15 + 6   → sum = 21
              7. num = 7 sum = 21 + 7   → sum = 28
              8. num = 8 sum = 28 + 8   → sum = 36
              9. num = 9 sum = 36 + 9   → sum = 45
              10.num = 10 sum = 45 + 10   → sum = 55
            */
            num++;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
        System.out.println("---------------------------------------------------------------------");


//        2) do-while문 : do {수행문;} while(조건식) → do 이하 문이 1번 이상 수행해야할 때 사용
        System.out.println("2) do-while");
        System.out.println("(예제 1) 1~10까지 누적합(do-while)");

        int num1 = 1;
        int sum1 = 0;

        do {
            sum1 += num1;
            num1++;
        } while (num1 <= 10);
        System.out.println("1부터 10까지의 합은 " + sum1 + "입니다.");
        System.out.println("---------------------------------------------------------------------");

//        3) for문 : for(초기화식; 조건식 ; 증감식){수행문;}
        System.out.println("3) for");
        System.out.println("(예제 1) 1~10까지 누적합(for)");

        int i;
        int sum2;
        for (i = 1, sum2 = 0; i <= 10; i++) {
            sum2 += i;
        }
        System.out.println("1부터 10까지의 합은 " + sum2 + "입니다.");

        System.out.println("(예제 2) 구구단");
        int j;
        int k;
        for (j = 1; j < 10; j++) {
            for (k = 1; k < 10; k++) {
                System.out.printf("%d * %d = %d\n", j, k, j * k);
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------");

//        4) continue문 : 아래 문구 건너뛰기 기능(continue를 만나면 이후 문장은 수행을 하지 않고
//        for문의 처음으로 돌아가 ★증감식을 수행
        System.out.println("3) continue");
        System.out.println("(예제 1) 홀수합");

        int total = 0;
        int num2;

        for (num2 = 1; num2 < 100; num2++) {

            if (num2 % 2 == 0)
                continue;
            total += num2;
        }
        System.out.printf("1~100까지 홀수의 합은 %d 입니다.\n", total);
        System.out.println("---------------------------------------------------------------------");

//        4) break문 : 반복문 빠져 나오기
//           - break를 만나면 default는 가장 가까운 반복문을 빠져나옴.
//           - 가장 가까운 반복문이 아닌 다른 반복문을 빠져나오기 위해서는 반복문에
//             라벨링을 해주어야 함. (ex) label : for~
        System.out.println("4) break");
        System.out.println("(예제 1) ");

        int sum3 = 0;
        int num3 = 0;

        for (num3=0; ;num3++){
            sum3 += num3;
            if(sum3>=100)
                break;
        }
        System.out.println("num : "+num3);
        System.out.println("sum : "+sum3);


    }
}
