import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
    private int currentIndex;
    private int[] data;

    /*Construct the sequence by copying values from the other array into the data array*/
    public ArraySequence(int [] other) {

    }

    // Methods that must be implemented!
    public boolean hasNext() {
        return false;
    }

    public int next() {
        return 0;
    }

    public int length() {
        return 0;
    }

    public void reset() {

    }
}