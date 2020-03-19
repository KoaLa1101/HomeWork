package SecondHW;

import java.util.*;

public class Collection2<T> extends AbstractCollection<T> {
    private T[] col;
    private int size;
    private int cursor = 0;

    public Collection2() {
        T[] col = (T[]) new Object[0];
        size = 0;
    }

    public Collection2(Collection<? extends T> col) {
        int i = 0;
        this.size = col.size();
        this.col = (T[]) new Object[size + 1];

        for (T t : col) {

            this.col[i] = t;
            cursor += 1;
            i++;
        }

    }

    private void expandArray() {
        col = Arrays.copyOf((T[]) col, col.length * 2);
    }

    public int size() {
        return cursor;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        Iter<T> iter = new Iter<>();
        return iter;
    }

    private class Iter<T> implements java.util.Iterator<T> {
        protected int cursor2;

        public Iter() {
            cursor2 = 0;
        }

        @Override
        public boolean hasNext() {
            return col.length > cursor2;
        }

        @Override
        public T next() {
            T el = (T) col[cursor2];
            cursor2 += 1;
            return el;
        }
    }


}