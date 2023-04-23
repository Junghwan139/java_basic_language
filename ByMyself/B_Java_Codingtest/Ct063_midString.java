package ByMyself.B_Java_Codingtest;

public class Ct063_midString {

    public static void main(String[] args) {

//        << 가운데 글자 가져오기 >>

//        단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
//        단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.


/*
              s	return
        "abcde"	"c"
        "qwer"	"we"
*/



        String s = "abcde";
        String answer = "";

        if(s.length()%2!=0){
            answer = s.substring(s.length()/2,s.length()/2+1);
        }else{
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }


        System.out.println(answer);






    }
}
