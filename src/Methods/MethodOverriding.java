package Methods;

public class MethodOverriding {
    // Make inner classes static for easier instantiation
    static class Animal {
        void sound() {
            System.out.println("Animal makes sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog Barks");
        }
    }

    public static void main(String[] args) {
        // Create objects directly
        Animal animal = new Animal();
        animal.sound(); // Calls Animal's sound()

        Dog dog = new Dog();
        dog.sound(); // Calls Dog's overridden sound()
    }
}