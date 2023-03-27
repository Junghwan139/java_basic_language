package study.book.Doit_08;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("사람이 두 발로 걷습니다.");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가 네 발로 걷습니다.");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");
    }
    public void eagletest(){
        System.out.println("eagle에서만 사용 가능한 함수입니다.");
    }
}

public class AnimalTest {

    public static void main(String[] args) {

        AnimalTest aTest = new AnimalTest();
        aTest.moveAnimal(new Human());
        aTest.moveAnimal(new Tiger());
        aTest.moveAnimal(new Eagle());

        Animal ani_eagle = new Eagle();


    }

    public void moveAnimal(Animal animal){
        animal.move();
    }

}
