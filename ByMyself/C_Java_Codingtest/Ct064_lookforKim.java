package ByMyself.C_Java_Codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ct064_lookforKim {

    public static void main(String[] args) {

//        << 서울에서 김서방 찾기 >>

//        String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아,
//        "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
//        seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.


/*
        입출력 예
          seoul	return
["Jane", "Kim"]	"김서방은 1에 있다"

*/

        String[] seoul = {"Jane", "Kim"};
        String answer = "";

        List<String> lst = new ArrayList<>(Arrays.asList(seoul));
        answer = "김서방은 "+lst.indexOf("Kim")+"에 있다.";


    }

}
