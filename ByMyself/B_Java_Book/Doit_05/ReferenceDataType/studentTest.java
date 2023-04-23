package ByMyself.B_Java_Book.Doit_05.ReferenceDataType;

public class studentTest {

    public static void main(String[] args) {

        Student studentPark = new Student(100,"Park");

        studentPark.setKorSubjectName("국어",90);
        studentPark.setMathSubjectName("수학",95);

        studentPark.showStudentInfo();




    }


}
