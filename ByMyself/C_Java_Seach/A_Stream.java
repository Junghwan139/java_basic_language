package ByMyself.C_Java_Seach;

import java.util.Arrays;
import java.util.stream.Stream;

public class A_Stream {
    public static void main(String[] args) {

//        1. 생성하기
        String[] arr = {"a","b","c"};
        Stream<String> stream = Arrays.stream(arr);
        System.out.println(stream);






    }
}
