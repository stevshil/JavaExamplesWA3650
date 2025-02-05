// In file: com/example/mypackage/MyClass.java
package com.example.mypackage;

import com.example.mypackage.MyClass;

public class AnotherClass {

    public void anotherMethod() {
        MyClass myOtherClass = new MyClass();
        int publicField = myOtherClass.publicField;
        int protectedField = myOtherClass.protectedField;
        // int privateField = myOtherClass.privateField; // Not allowed here
        int defaultField = myOtherClass.defaultField;
        System.out.println("AnotherClass method");
        System.out.println("AnotherClass publicField: " + String.valueOf(publicField));
        System.out.println("AnotherClass protectedField: " + String.valueOf(protectedField));
        // System.out.println("AnotherClass privateField: " + String.valueOf(privateField));  // We can't use this
        System.out.println("AnotherClass defaultField: " + String.valueOf(defaultField));
    }
}