import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
    private int currentIndex;
    private int[] data;

    /*Construct the sequence by copying values from the other array into the data array*/
    public ArraySequence(int[] other) {
        data = new int[other.length];
        for (int i = 0; i < other.length; i++) {
            data[i] = other[i];
        }
        currentIndex = 0;
    }

    //Postcondition: The otherseq will be reset.
    //This constructor will copy ALL values of the `otherseq` into the data array.
    public ArraySequence(IntegerSequence otherseq) {
        otherseq.reset();
        data = new int[otherseq.length()];
        for (int i = 0; otherseq.hasNext(); i++) {
            data[i] = otherseq.next();
        }
        otherseq.reset();

        currentIndex = 0;
    }

    // Methods that must be implemented!
    public boolean hasNext() {
        return currentIndex < data.length;
    }

    public int next() {
        if (!hasNext()) {
            throw new NoSuchElementException("There is no next element between, use hasNext() to check when a sequence has ended.");
        }

        int out = data[currentIndex];
        currentIndex += 1;
        return out;
    }

    public int length() {
        return data.length;
    }

    public void reset() {
        currentIndex = 0;
    }
}