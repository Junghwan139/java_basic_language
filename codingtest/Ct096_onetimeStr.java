package codingtest;

import java.util.Map;
import java.util.TreeMap;

public class Ct096_onetimeStr {

    public static void main(String[] args) {



/*


한 번만 등장한 문자
문제 설명
문자열 s가 매개변수로 주어집니다.
s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

제한사항
0 < s의 길이 < 1,000
s는 소문자로만 이루어져 있습니다.
    입출력 예
          s	result
"abcabcadc"	"d"
     "abdc"	"abcd"
    "hello"	"eho"
       입출력 예 설명
       입출력 예 #1

"abcabcadc"에서 하나만 등장하는 문자는 "d"입니다.
입출력 예 #2

"abdc"에서 모든 문자가 한 번씩 등장하므로 사전 순으로 정렬한 "abcd"를 return 합니다.
입출력 예 #3

"hello"에서 한 번씩 등장한 문자는 "heo"이고 이를 사전 순으로 정렬한 "eho"를 return 합니다.


*/

        String s = "abcabcadc";
        String answer = "";

//        s를 1자씩 자른다 -> map에 알파벳을 키로 넣고 카운트 값을 값으로 넣는다. -> 값이 1인 키만 answer에 담는다

        Map<String, Integer> mp = new TreeMap<>();

        for(String a : s.split("")){

            if(mp.isEmpty()){
                mp.put(a,1);
            }else {
                mp.put(a,mp.getOrDefault(a,0)+1);
            }

        }

        for(String a : mp.keySet()){

            if(mp.get(a)==1){
                answer += a;
            }

        }

        System.out.println(answer);



    }

}