package codingtest;

public class Ct20_arrycount {
    public static void main(String[] args) {

//         << 배열 원소의 길이 >>
//        문자열 배열 strlist가 매개변수로 주어집니다.
//        strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.

        /*

                         입출력  예
                       strlist	result
["We", "are", "the", "world!"]	[2, 3, 3, 6]
["I", "Love", "Programmers."]	[1, 4, 12]


        */

        String[] strlist = {"We", "are", "the", "world!"};
        int[] answer = new int[strlist.length];
        for(int i = 0;i<strlist.length;i++){
            answer[i] = strlist[i].length();
        }



    }

}
