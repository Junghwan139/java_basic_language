public class Ct01_sum {
    public static void main(String[] args) {
//        정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후
//        정수 부분을 return 하도록 soltuion 함수를 완성해주세요.

        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        double a = 3;
        double b = 2;
        double ab = a / b * 1000;
        answer = (int) ab;
        System.out.println(answer);

//        첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
//        두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
//        두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로
//        담은 배열을 return 하도록 solution 함수를 완성해보세요.

/*        입출력 예 #1
        1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.
          입출력 예 #2
        9 / 2 + 1 / 3 = 29 / 6입니다. 따라서 [29, 6]을 return 합니다.*/

        int numer1 = 9; //분자
        int denom1 = 2; //분모
        int numer2 = 1; //분자
        int denom2 = 3; // 분모
        int c = 0;
        int d = 0;
        int[] answer2 = new int[2];

        if (denom2 > denom1) {
            if (denom2 % denom1 == 0) {
                c = numer1 * (denom2 / denom1);
                d = numer2;
                answer2[0] = c + d;
                answer2[1] = denom2;
            } else {
                c = numer1 * denom2;
                d = numer2 * denom1;
                answer2[0] = c + d;
                answer2[1] = denom1 * denom2;
            }
        } else {
            if (denom1 % denom2 == 0) {
                c = numer2 * (denom1 / denom2);
                d = numer1;
                answer2[0] = c + d;
                answer2[1] = denom1;
            } else {
                c = numer2 * denom1;
                d = numer1 * denom2;
                answer2[0] = c + d;
                answer2[1] = denom2 * denom1;
            }

        }
        System.out.printf("{%d},{%d}", answer2[0], answer2[1]);

//        정답
/*        int numerator = (numer1 * denom2) + (numer2 * denom1);
        int denominator = denom1 * denom2;

        for(int i = numerator-1; i > 1; i--) {
            // 기약분수로 만들기
            if(numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }

        int[] answer = { numerator, denominator };
        return answer;*/

    }

}
