package ByMyself.Java_Book.Doit_08.AnimalExample;

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
