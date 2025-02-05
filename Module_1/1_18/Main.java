public class Main {
    public static void main(String[] args) {
        Book HHGTTG = new Book("Hitchhickers Guide To The Galaxy","Douglas Adams");
        Book SLATFATF = new Book("So Long And Thanks For All The Fish","Douglas Adams");
        
        System.out.println(HHGTTG.toString());
        if ( HHGTTG.equals(SLATFATF) ) {
            System.out.println("These books are the same");
        } else {
            System.out.println("Not the same books");
        }

        if ( HHGTTG.equals(HHGTTG) ) {
            System.out.println("These books are the same");
        } else {
            System.out.println("Not the same books");
        }
    }
}