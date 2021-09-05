package main.java.classes;

public class Person {
    private int age;
    private String name;
    public static int numberOfPeople = 0;
    public Person(int ageParam, String nameParam) {
        age = ageParam;
        name = nameParam;
        numberOfPeople++;
    }
}
