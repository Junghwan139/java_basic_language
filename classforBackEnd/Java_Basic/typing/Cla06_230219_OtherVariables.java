package classforBackEnd.Java_Basic.typing;

public class Cla06_230219_OtherVariables {

    public static void main(String[] args) {
/*

        int[] arr1 = {10, 20, 30};
        String[] arr2 = {"kim","lee","choi"};

//        기타자료형
//        java에서 배열의 문제는 배열의 길이를 줄이고 늘릴수가 없다.
//        List : 배열의 발전된 형태, 배열의 길이를 줄이고 늘릴 수 있다.
        List<String> lst = new ArrayList<>();
        lst.add("kim");
        lst.add("lee");
        lst.add("park");
        System.out.println(lst);
        lst.remove("park");
        System.out.println(lst);

//        map : key, value
//        set, queue, stack
//        현실세계의 상황을 자료형과 매치 시켜 문제 풀어야 함

//        1. String
//        1) 표현 방식
//        (1) 리터럴 표현방식(원시자료형의 표현방식) - stack저장
        char c1 = 'a';
        String st1 = "hello";
        System.out.println(st1);
        System.out.println(c1);
        char c2 ='a';
        System.out.println(c2);
        System.out.println(c1==c2);
//        (2) new String 표현방식 : 참조타입 - heap 메모리 저장
//        new 라는 키워드는 class를 기반으로 객체를 만들때 사용
        String st2 = new String("hello");
        System.out.println(st2);
//        원시타입은 메모리에 값을 담아 놓지만, 참조타입은 메모리에 메모리주소를 담아둔다.
        System.out.println(st1.equals(st2));
        String st3 = new String("hello");
        System.out.println(st2.equals(st3));
//        비교시 equals 사용

//        int와 Integer(int의 참조타입 wrapper class)
        int num1 = 10;
        String st4 = "20";
        //int num2 = (int)st4;
        int num2 = Integer.parseInt(st4);
        String st5 = Integer.toString(num2);
        System.out.println(num2);
        System.out.println(st5.getClass());

//        long의 참조타입 Long, char의 참조타입 Character
//        추후 사용하게 될 자료형은 wrapper 자료형 써야 함

*/


//        indexOf : 특정 문자가 특정문자에 몇번째 index에 해당하는지 int로 return
        String a = "Hello Java";
        int num = a.indexOf("Java");
        System.out.println(num);
        System.out.println(a.indexOf("Java"));

//        contains : 특정 문자가 특정문자에 포함되어 있는지 아닌지를 boolean으로 return
        System.out.println(a.contains("Java"));

        String st1 = "Hello Java World";
//        문자 o를 전부 a로 바꿔서 출력하는 게임을 만들어보자.

//        charAt() : String을 하나씩 잘라서 char형태로 return

        String st2 = "abcdefabcdef";
        String st3 = "abcdefabcdef";
        System.out.println(st2.charAt(3) == 'd');

//        st2이 가지고 있는 a의 숫자는 몇개인가?
//        길이 : length()

        int count = 0;
        for (int i = 0; i < st2.length(); i++) {
            if (st2.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);

//        replace : 특정 문자열을 특정문자열로 대체
//        replaceAll : 특정 문자열을 특정문자열로 대체, 정규표현식 사용가능
        String st4 = "abcabc";
        System.out.println(st4.replaceAll("a","o"));

//        String과 == 확인필요
//        정규표현식(메타문자열) : 특정한 패턴을 가진 문자열을 찾는것
//        regex regular expression
        String st5 = "01abc123한글123";
//        숫자를 제외한 문자만 새로운 문자열에 담아보자.
        String st6 = st5.replaceAll("[^a-z]","");  // 제외^, [a-z], [0-9]
        System.out.println(st6);





    } // 메인함수
} // 클래스
