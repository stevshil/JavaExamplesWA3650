// Import individually
// import com.example.mypackage.MyClass;
// import com.example.mypackage.AnotherClass;

import com.example.mypackage.*;  // Import everything in that package

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();

        AnotherClass obj2 = new AnotherClass();
        obj2.anotherMethod();

        System.out.println("Main publicField: " + obj.publicField);
        System.out.println("Main publicField: " + obj.defaultField); // Not allowed here
        obj.publicField=52;
        System.out.println("Main publicField: " + obj.publicField);
    }
}