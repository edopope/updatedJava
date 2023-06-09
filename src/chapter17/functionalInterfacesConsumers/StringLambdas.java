package chapter17.functionalInterfacesConsumers;

import chapter16.Person;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringLambdas {
    public static void main(String[] args) {
        int [] number = {10,11,12,13,14,15};
        System.out.println(Arrays.stream(number).mapToObj(element -> buildPerson(element)).collect(Collectors.toList()));
    }



    private static Person buildPerson(int element){
        Person person = new Person("Amirah",element);
        return person;
    }
}
