public class Main {
  public static void main(String[] args) {
    Register stc = new Register();

    double result = stc.computeTotal(120.00);

    System.out.println("Before Tax is: " + String.valueOf(result));

  }
}