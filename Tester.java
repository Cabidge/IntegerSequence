import java.util.NoSuchElementException;
public class Tester {
    public static void main(String[] zqfr) {
        IntegerSequence r = new Range(10,15);
        System.out.println("Expected sequence:\n10, 11, 12, 13, 14, 15");
        while (r.hasNext()) {
            System.out.print(r.next());
            if (r.hasNext()) {       
                System.out.print( ", " );
            }
        }
        System.out.println();

        System.out.println("Expected length:\n6");
        System.out.println(r.length());
        System.out.println();

        System.out.println("Must throw an exception!");
        try {
            r.next();
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught!");
        }
        System.out.println();

        System.out.println("Testing Reset:");
        System.out.println("Expected value:\n10");
        r.reset();
        System.out.println(r.next());
        System.out.println();

        // ArraySequence
        int[]nums = {1,3,5,0,-1,3,9};
        IntegerSequence as = new ArraySequence(nums);

        System.out.println("ArraySequence(array):");
        while(as.hasNext()){
            System.out.print(as.next()+", ");
        }
        System.out.println();

        System.out.println("Expected length:\n7");
        System.out.println(as.length());
        System.out.println();

        System.out.println("Must throw an exception!");
        try {
            as.next();
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught!");
        }
        System.out.println();

        System.out.println("Testing Reset:");
        System.out.println("Expected value:\n1");
        as.reset();
        System.out.println(as.next());
        System.out.println();
    }
}