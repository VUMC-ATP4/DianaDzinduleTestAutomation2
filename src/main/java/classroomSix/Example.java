package classroomSix;

import com.github.javafaker.Faker;

public class Example {
    Employee employee = new Employee ("diana", "dzindule", "38");
    Faker generators = new Faker();
    Faker faker = new Faker();
    String animalName = faker.animal().name();
    System.out.println(animalName);
    String name = faker.name().firstName();
    String lastName = faker.name().lastName();
    int age = faker.number().numberBetween(1,100);
    String vards = faker.name().firstName();
    String uzvards = faker.name().lastName();
    int vecums = faker.number().numberBetween(1,100);
    }
