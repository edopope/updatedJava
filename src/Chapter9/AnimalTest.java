package Chapter9;

import Chapter10.Car;
import Chapter10.Vehicle;

import java.util.Arrays;

public class AnimalTest {
    public static void main(String[] args) {
       Animal [] myAnimals = new Animal[]{
               new Cat(),
               new Dog()
       };
        for (Animal animal:myAnimals) {
            System.out.print(animal.toString());

        }
//      Animal bingo = new Dog();
//        animalMakeSound(bingo );
//        Animal bushy = new Cat();
//        animalDance(bushy);
//    }
//
//
//    private static void animalMakeSound(Animal animal){
//        animal.speak();
//
//}
//public static void animalDance(Animal animal){
//        animal.dance();
//}

    }

}
