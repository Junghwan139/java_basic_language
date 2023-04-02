package classforjava.typing.Cla13_ThreadGeneriStream.StreamAndOptional;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {

        // 예외가 발생함으로서, 그 다음라인의 코드들이 실행되지 않는 문제가 발생한다.
//        String non_opt = null;
//        System.out.println(non_opt.compareTo("abc"));
//        System.out.println("hello world");

        // optional 객체 생성
        Optional<String> opt = Optional.of("aaa");  //opt변수에 null을 셋팅한 것
        // orElse : 값이 있으면 그 값, 없으면 none, orElseThrow등의 메서드를 통해 optional에서 String으로 꺼내줘야 한다.
        System.out.println(opt.orElse("none"));
        System.out.println(opt.orElse("none").compareTo("abc"));
        System.out.println("hello world");




    }

}
