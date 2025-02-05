// In file: com/example/mypackage/MyClass.java
package com.example.mypackage;

public class MyClass {

    // Accessible from anywhere
    public int publicField=42;

    // Accessible within the package and by subclasses
    protected int protectedField=5;

    // Accessible only within MyClass
    private int privateField=1;

    // Accessible within the package
    int defaultField=0;

    public void myMethod() {
        System.out.println("MyClass method");
        System.out.println("MyClass publicField: " + String.valueOf(publicField));
        System.out.println("MyClass protectedField: " + String.valueOf(protectedField));
        System.out.println("MyClass privateField: " + String.valueOf(privateField));
        System.out.println("MyClass defaultField: " + String.valueOf(defaultField));
    }
}