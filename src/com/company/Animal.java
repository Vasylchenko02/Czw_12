package com.company;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }
}
class Dog extends Animal implements Run {
    private String name;

    public Dog(String name) {
        this.name = name;
        run(name);
        speak(name);
    }

    public void run(String name) {
        System.out.println(name + " biegnie");
    }

    public void speak(String name) {
        System.out.println(name + " szczeka");
    }
    public  String getName() {
        return  name;
    }
}

class Cat extends Animal implements Run {
    private String name;

    public Cat() {
        this.name = name;
        run(name);
        speak(name);
    }

    public void run(String name) {
        System.out.println(name + " biegnie");
    }
    public void speak(String name) {
        System.out.println(name + " miawczy");
    }
    public String getName() {
        return name;
    }
}

class Shark extends Animal {}
class HoneAnimal<T extends Run> {
    T ob;
    HoneAnimal(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Typem T jest " + ob.getClass().getName());
    }
    void sleepOnTheCouch() {
        System.out.println(ob.getName() + " je z miski");
    }
}
class Demo {
    public static void main(String[] args) {
        HoneAnimal<Cat> ob1 = new HoneAnimal<>(new Cat());
    }
}