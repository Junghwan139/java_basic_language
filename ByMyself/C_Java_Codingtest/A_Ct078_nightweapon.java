package ByMyself.C_Java_Codingtest;

public class A_Ct078_nightweapon {
    public static void main(String[] args) {


//    << 기사단원의 무기 >>

//    기사단원의 수를 나타내는 정수 number와 이웃나라와 협약으로 정해진 공격력의 제한수치를
//    나타내는 정수 limit와 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수 power가 주어졌을 때,
//    무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return 하는 solution 함수를 완성하시오.

/*

입출력 예
number	limit	power	result
5	3	2	10
10	3	2	21

*/

        int number = 10;
        int limit = 3;
        int power = 2;
        int answer = 0;

        int count = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
            count = 0;
        }

        System.out.println(answer);


    }
}
