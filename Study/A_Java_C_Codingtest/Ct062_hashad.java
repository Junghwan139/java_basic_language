package Study.A_Java_C_Codingtest;

public class Ct062_hashad {
    public static void main(String[] args) {

//        << 하샤드 수 >>

//        양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
//        예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
//        자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.


/*
        입출력 예
        arr	return
        10	true
        12	true
        11	false
        13	false
*/



        int x = 12;
        boolean answer = true;

        int[] x_arr = new int[String.valueOf(x).split("").length];
        int i = 0;
        for(String a : String.valueOf(x).split("")){

            x_arr[i] = Integer.parseInt(a);
            i++;

        }

        i = 0;

        for(int a : x_arr){
            i += a;
        }

        System.out.println(i);

        if(x%i!=0){
            answer = false;
        }

        System.out.println(answer);


    }
}
