package study;

import java.util.Scanner;

public class Stu06_object_2 {
    public static void main(String[] args) {

        Student stu1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 하세요");
        stu1.studentName = sc.nextLine();
        System.out.println("당신의 이름은 "+ stu1.getStudentName()+" 입니다.");
        System.out.println(stu1.studentName);
        stu1.setStudentName("길동");
        System.out.println(stu1.studentName);

    }
}

// 학생 이름을 반환하고 부여하는 메서드 포함 클래스
class Student {

    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public static void main(String[] args) {

    }


}
