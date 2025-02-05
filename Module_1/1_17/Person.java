class Person {
    private String name; // Attribute
    private int age;    // Attribute

    public Person(String name, int age) { // Constructor
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; } // Property (Getter)
    public void setName(String name){ this.name = name;}//Property (Setter)

    public int getAge() { return age; }    // Property (Getter)
}