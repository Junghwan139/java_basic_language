package codingtest;

public class Ct024_howmanyresemble {

    public static void main(String[] args) {

//        << 배열의 유사도 >>
//        두 배열이 얼마나 유사한지 확인해보려고 합니다.
//        문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.

        /*

         입출력 예
              s1	                     s2	result
["a", "b", "c"]	["com", "b", "d", "p", "c"]	2
   ["n", "omg"]                ["m", "dot"]	0

        */


        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        int answer = 0;
        for(int i = 0;i<s1.length;i++){
            for(int j = 0; j<s2.length;j++){
                if(s1[i].equals(s2[j])){
                    answer++;
                }
            }
        }

        System.out.println(answer);




    }

}
