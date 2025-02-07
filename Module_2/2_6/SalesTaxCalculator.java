public class SalesTaxCalculator implements TaxCalculator {
    private double taxRate = 0.05; // default rate
    public double calculateTax(double amount) {
        return amount * taxRate;
    }
}