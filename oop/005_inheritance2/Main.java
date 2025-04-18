// Let's dig through inheritance a little bit further

public class Main {
    public static void main(String[] args) {
        Dog blues = new Dog();
        blues.eat();
        blues.speak();
    }
}

class Animal {
    public void speak() {
        System.out.println("Animal is speaking...");
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    // declaring a function that already exists in the super would override it.
    public void eat() {
        System.out.println("Dog is eating...");
    }

    // in-case you'd like to still call the original function from our super class when declaring the same
    // function name, you could use `super` keyword to access the members from our super.
    public void speak() {
        super.???();
        System.out.println("Dog is barking...");
    }
}