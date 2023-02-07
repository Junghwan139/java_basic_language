public class Ex04_for_while {
    public static void main(String[] args) {

//        << 공부 >>

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
            sum1 +=num1;
            num1++;
        }while(num1<=10);
        System.out.println("1부터 10까지의 합은 "+sum1+"입니다.");
        System.out.println("---------------------------------------------------------------------");

//        3) for문 : for(초기화식; 조건식 ; 증감식){수행문;}
        System.out.println("3) for");
        System.out.println("(예제 1) 1~10까지 누적합(for)");

        int i;
        int sum2;
        for(i=1,sum2=0; i<=10;i++) {
            sum2+=i;
        }
        System.out.println("1부터 10까지의 합은 "+sum2+"입니다.");




    }
}
