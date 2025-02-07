public class Register {
    private TaxCalculator taxCalc;
    public double computeTotal(double beforeTax) {
        return beforeTax + taxCalc.calculateTax(beforeTax);
    }
}