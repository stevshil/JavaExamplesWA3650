public class Main {
    public static void main(String[] args) {
        Person steve = new Person("Steve", 21);
        Person rap = new Person("Rap",23);
        // Person ola = new Person();  // Throws compile error

        System.out.println("Rap's name: " + rap.getName());
        System.out.println("Steve's age: " + steve.getAge());

        // Change Steve's name
        steve.setName("Bob");
        System.out.println("Steve's new name: " + steve.getName());

        // Cannot use fields directly as private
        // System.out.println("Rap's age direct: " + String.valueOf(rap.age));
    }
}