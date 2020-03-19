package FirstHW.Comparable;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class HomeWorkIterator<T> implements Iterator<T> {

    private T[] arr;
    private int forwardCursor, backwardCursor;
    private boolean check;

    public HomeWorkIterator(T[] arr) {
        this.arr = arr;
        forwardCursor = 0;
        backwardCursor = arr.length - 1;
        check = true;
    }

    @Override
    public boolean hasNext() {
        if(check) return forwardCursor < backwardCursor;
        else return backwardCursor >= forwardCursor;
    }

    @Override
    public T next() {
        if (backwardCursor >= forwardCursor) {
            if (check) {
                forwardCursor++;
                check = false;
                return arr[forwardCursor-1];
            } else {
                backwardCursor--;
                check = true;
                return arr[backwardCursor+1];
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}