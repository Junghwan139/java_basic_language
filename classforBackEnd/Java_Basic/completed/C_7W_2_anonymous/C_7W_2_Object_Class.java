package classforBackEnd.Java_Basic.completed.C_7W_2_anonymous;

public class C_7W_2_Object_Class {

    public static void main(String[] args) {

//        1. Object : 자바의 모든 클래스의 조상클래스, 별도로 만든 개별클래스의 부모도 extends object가 생략되어 있는 것.
//           toString(), equals()는 object에서 왔음


//        2. Math
//        1) .random() : 임의의 double형 0이하 실수값을 반환하는 것
//        2) .abs() : 절대값을 반환
//        3) .floor() : 버림, .ceil() : 올림, .round() : 반올림
//        4) .max() / .min() : 두 수 중에서 큰값, 작은 값
//        5) .pow() : 제곱연산, .sqrt() : 제곱근 연산

//        3. time package
//        1) LocalTime, LocalDate, LocalDateTime 함수 사용

/*
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime present = LocalTime.now();
        System.out.println(present);

        LocalDateTime now = LocalDateTime.now();
        //지금과 비교할때
        // of()는 내가 직접 만드는 것
        LocalDateTime input = LocalDateTime.of(2024,02,16,17,05,16);
        System.out.println(input);
        System.out.println(now);
        System.out.println(input.isBefore(now));

        // 오늘 연도만 출력하려면 getyear -> return : int
        System.out.println(now.getYear());
        System.out.println(now.getDayOfWeek());

        // 오전 / 오후 구분짓는 법 : ChronoField.AMPM_OF_DAY 사용하여 오전이면 0, 오후면 1을 구할 수 있다.
        System.out.println(now.get(ChronoField.AMPM_OF_DAY));

        String ampm = "";

        if(now.get(ChronoField.AMPM_OF_DAY)==0) {
            ampm = "오전";
        }else{
            ampm = "오후";
        }

        System.out.println(ampm);
*/






    }

}
