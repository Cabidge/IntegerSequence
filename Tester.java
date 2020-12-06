public class Tester {
    public static void main(String[] zqfr) {
        IntegerSequence r = new Range(10,15);
        System.out.println("Expected:\n10, 11, 12, 13, 14, 15");
        while (r.hasNext()) {
            System.out.print(r.next());
            if (r.hasNext()) {       
                System.out.print( ", " );
            }
        }
        System.out.println();
    }
}