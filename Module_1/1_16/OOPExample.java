public class OOPExample {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy");
        animal.makeSound(); // Output: Generic animal sound
        dog.makeSound();    // Output: Woof!
    }
}