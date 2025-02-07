package com.example.beandemo;

// Setter dependency injection

public class College {
 
    // Class data members
    private Principal principal;
 
    // Setter
    public void setPrincipal(Principal principal)
    {
 
        // this keywords refers to current instance itself
        this.principal = principal;
    }
 
    // Method
    public void test()
    {
        principal.principalInfo();
 
        // Print statement
        System.out.println("Test College Method");
    }
}