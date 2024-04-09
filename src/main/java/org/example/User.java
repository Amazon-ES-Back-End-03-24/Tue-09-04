package org.example;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        //this.name = name;
        //this.age = age;
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //validations
        //if (name == null){
        //    this.name = "Jane Doe";
        //}
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static String concatenateName(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("First name and last name must both be positve");
        }
        return firstName + " " + lastName;
    }
}
