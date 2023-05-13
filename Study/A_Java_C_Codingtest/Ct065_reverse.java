package Study.A_Java_C_Codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ct065_reverse {

    public static void main(String[] args) {

//        << 정수 내림차순으로 배치하기 >>

//        함수 solution은 정수 n을 매개변수로 입력받습니다.
//        n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//        예를들어 n이 118372면 873211을 리턴하면 됩니다.


/*

        입출력 예
           n	return
       118372	873211

*/
        long n = 118372;
        long answer = 0;

        List<String> lst = new ArrayList<>(Arrays.asList(String.valueOf(n).split("")));
        lst.sort(Comparator.reverseOrder());
        String n_str ="";

        for(String a : lst){
            n_str +=a;
        }

        answer = Long.valueOf(n_str);

        System.out.println(answer);


    }

}


class Ct065_others1 {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }
}

class Ct065_others2 {
    String res = "";

    public int reverseInt(int n) {
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char) c) + res);
        return Integer.parseInt(res);
    }
}