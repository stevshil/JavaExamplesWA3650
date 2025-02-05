class Dog extends Animal { // Inheritance
    public Dog(String name) { super(name); }
    @Override // Polymorphism (Method Overriding)
    public void makeSound() { System.out.println("Woof!"); }
}