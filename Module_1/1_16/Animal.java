class Animal { // Encapsulation
    private String name;
    public Animal(String name) { this.name = name; }
    public String getName() { return name; }
    public void makeSound() { System.out.println("Generic animal sound"); }
}