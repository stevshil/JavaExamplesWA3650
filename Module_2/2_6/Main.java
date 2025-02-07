// Dependency Injection

public class Main {
  public static void main(String[] args) {
    TaxCalculator calc = new SalesTaxCalculator();
    Register stc = new Register(calc);

    double result = stc.computeTotal(120.00);

    System.out.println("Before Tax is: " + String.valueOf(result));

  }
}