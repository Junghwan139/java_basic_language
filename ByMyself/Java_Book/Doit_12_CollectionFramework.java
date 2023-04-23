package ByMyself.Java_Book;

public class Doit_12_CollectionFramework {

    public static void main(String[] args) {

//        1. 제네릭
//           어떤 값이 하나의 참조 자료형이 아닌 여러 참조 자료형을 사용할 수 있도록 프로그래밍 하는 것 '제네릭 프로그래밍'
//        1) 제네릭의 필요성
//        2) 제네릭 클래스 정의하기
//        3) 제네릭 클래스 사용하기

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());











    }

}


class Powder {
    public void doPrinting(){
        System.out.println("Powder 재료로 출력합니다.");
    }

    public String toString(){
        return "재료는 Powder입니다.";
    }

}

class Plastic {
    public void doPrinting(){
        System.out.println("Plastic 재료로 출력합니다.");
    }

    public String toString(){
        return "재료는 Plastic입니다.";
    }

}

class GenericPrinter<T>{

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString(){
        return material.toString();
    }

}

