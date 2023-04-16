package classforBackEnd.Java_Basic.completed.C_8W_1_Cla12_EnumIteratorCompare.EnumClass;

public class Student {

    private String student_name;
    private StudentClassNum student_class_num;
    private int age;

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public StudentClassNum getStudent_class_num() {
        return student_class_num;
    }

    public void setStudent_class_num(StudentClassNum student_class_num) {
        this.student_class_num = student_class_num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

enum StudentClassNum {
    first("First_1"),
    second("Secound_2"),
    third("Third_3");

    private final String label;
    StudentClassNum(String label){
        this.label = label;
    }

    public String label() {
        return label;
    }

}

