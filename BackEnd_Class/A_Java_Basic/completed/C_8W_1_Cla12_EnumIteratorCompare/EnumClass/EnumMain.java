package BackEnd_Class.A_Java_Basic.completed.C_8W_1_Cla12_EnumIteratorCompare.EnumClass;

public class EnumMain {

    public static void main(String[] args) {

        Student st1 = new Student();

        st1.setStudent_name("홍길동");
        st1.setAge(15);
        st1.setStudent_class_num(StudentClassNum.first);

        System.out.println(st1.getStudent_name()+st1.getStudent_class_num()+st1.getAge()+st1.getStudent_class_num().label());
        // 추가 공부 : https://bcp0109.tistory.com/334





    }

}
