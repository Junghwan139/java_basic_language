package Study.A_Java_C_Codingtest;

public class Ct066_subak {

    public static void main(String[] args) {

//        << 수박수박수박수박수박수? >>

//        길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수,
//        solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를
//        리턴하면 됩니다.

/*

        입출력 예
        n	return
                3	"수박수"
        4	"수박수박"

*/

        int n = 3;
        String answer = "";

        if(n==1){
            answer = "수";
        }else if(n%2==0){
            answer = "수박".repeat(n/2);

        }else {
            answer = "수박".repeat(n/2)+"수".repeat(n%2);
        }

        System.out.println(answer);




    }

}
