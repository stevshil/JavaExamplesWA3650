public class Main {
  public static void main(String[] args) {
    SalesTaxCalculator stc = new SalesTaxCalculator();

    double result = stc.calculateTax(120.00);

    System.out.println("Tax is: " + String.valueOf(result));

  }
}