package classforjava.typing.Cla10;

public class InstanceUserSample {
    //    변수는 private으로 접근제어를 하면서, public한 메서드를 통해서 값을 세팅하도록 한다.
    //    private의 유효범위는 해당 class 내부에서만 접근가능
    private String name;
    private String email;
    private String password;
    private int age;

    //일반적인 형태는 변수별로 set, get 메서드가 각각 있음
    public void setName(String name){
        if(name.length()<2){
            System.out.println("이름이 너무 짧습니다.");
            return;
        }
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //public 접근제어자는 모든 클래스에서 접근가능.
    //그래서 public 메서드를 통해 private한 변수를 접근하는 전략을 취한다.
    // default : 접근제어자 생략가능하고 같은 패키지내에서만 유효
    // protected
    public void whoIs(String name, String email, String password, int age) {
        if(name.length()<2){
            System.out.println("이름을 잘못 입력하였습니다.");
            return;
        }

        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;

    }

    public void getUserInfor(){
        System.out.println("이름 : "+this.name);
        System.out.println("email : "+this.email);
        System.out.println("password : "+this.password);
        System.out.println("age : "+this.age);

    }

    //지역변수를 쓰려다보니, 지역변수는 return을 받아 사용해야 했다.
// 1. 지역변수 사용
//    public static int method1(int a, int b){
//        int c = (a+b)*2+3;
//        return c;
//    }


    // 1.객체변수로 만들어 보자. method1
    int instance_result;
    void method1(int a, int b){
        instance_result = a+b;
    }

    // 2.클래스변수로 만들어서 사용해보자. method2
    static int result;
    static void method2(int a, int b){
        result = (a+b)*2+3;
    }




//    같은 클래스 내에서 함수 선언 시 객체 생성이 번거로우니 static으로 사용
//    메소드의 입력값은 매개변수(parameter), 인수(arguments), 입력값 등으로 불림






}
