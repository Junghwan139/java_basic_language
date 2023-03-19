package classforjava.completed.C_7W_1_extends;

public class D_Animal {

    private String name;
    private int age;
    protected String Nick_name;
    protected int Nick_age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void play(){
        System.out.println("D_Animal_뛰어 다닙니다.");
    }

    void cry(){
        System.out.println("D_Animal_소리를 내어 웁니다.");
    }

    void shape(){
        System.out.println("D_Animal_척추 동물입니다.");
    }

    public D_Animal(String name, int age){
        this.name = name;
        this.age = age;

    }


}
