package chapter17.functionalInterfacesConsumers.stream8;

import java.util.Set;
import java.util.stream.Collectors;

public class Example1 {
  public static void main(String[] args) {
        Set<Employee> employees = Set.of(
                new Employee("godwin",90),
                new Employee("angel",90),
                new Employee("jane",90),
                new Employee("fred",90));

        System.out.println(employees);
        System.out.println(employees.stream().sorted().collect(Collectors.toList()));
    }

}
