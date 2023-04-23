package ByMyself.Java_Book.Doit_05.ReferenceDataType;

public class Student {

    public int studentID;
    public String studentName;
    public static Subject korea;
    public Subject math;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();


    }

    public void setKorSubjectName(String subjectName, int subjectScore){
        korea.subjectName = subjectName;
        korea.subjectScore = subjectScore;
    }

    public void setMathSubjectName(String subjectName, int subjectScore){
        math.subjectName = subjectName;
        math.subjectScore = subjectScore;
    }

    public void showStudentInfo() {
        int total = korea.subjectScore+ math.subjectScore;
        System.out.println("학번 : " + studentID);
        System.out.println("이름 : " + studentName);
        System.out.println("총점 : " + total);
    }










}
