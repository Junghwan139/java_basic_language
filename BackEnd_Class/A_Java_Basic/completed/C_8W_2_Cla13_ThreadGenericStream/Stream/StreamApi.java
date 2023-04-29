package BackEnd_Class.A_Java_Basic.completed.C_8W_2_Cla13_ThreadGenericStream.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApi {

    public static void main(String[] args) {

//        1. 스트림API : 스트림이란 데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 패러다임
//                     스트림을 통한 정렬과 출력 : 기본형을 입력값으로 하여, 출력값을 얻어내 원본에 영향을 끼치지 않는 함수형 패러다임
//                     프로그래밍 방식

        int[] arr = {20, 10, 4, 12};

        System.out.println(Arrays.toString(Arrays.stream(arr).filter(a -> a>10).toArray()));

//        1) 중개연산(스트림의 변환) : filter, sorted, map
//        2) 스트림의 최종연산(스트림의 소모) : ★reduce, foreach, count, sum, forEach

        List<String> lst = new ArrayList<>();
        lst.add("hello1");
        lst.add("hello2");
        lst.add("hello3");
        lst.add("hello4");
        lst.add("hello5");

        lst.stream().forEach(System.out::println);

//        메서드 참조 : (System.out::println)



    }


}
