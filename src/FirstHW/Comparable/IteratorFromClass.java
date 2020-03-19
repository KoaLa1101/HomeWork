package FirstHW.Comparable;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorFromClass<T> implements Iterator<T> {

    private T[] arr;
    private int cursor;

    public IteratorFromClass(T[] arr) {
        this.arr = arr;
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        for (int i = cursor + 2; i < arr.length; i += 2) {
            if (arr[i] != null) return true;
        }
        return false;
    }

    public T next() {
        T el = arr[cursor];
        cursor += 2;
        if (el == null) {
            for (int i = cursor; i < arr.length; i += 2) {
                if (arr[i] != null) {
                    el = arr[i];
                    cursor += 2;
                    break;
                }
            }
        }
        if (el != null) return el;
        else throw new NoSuchElementException();
    }
}