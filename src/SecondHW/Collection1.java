package SecondHW;

import java.util.*;

public class Collection1<T> extends AbstractCollection<T> {
    private T[] col;
    private int size;
    private int cursor = 0;

    public Collection1() {
        T[] col = (T[]) new Object[0];
        size = 0;
    }

    public Collection1(Collection<? extends T> col) {
        int i = 0;
        this.size = col.size();
        this.col = (T[]) new Object[size];
        java.util.Iterator<? extends T> it = col.iterator();
        while (it.hasNext() && i < size) {

            this.col[i] = it.next();
            cursor += 1;
            i++;
        }

    }


    private void expandArray() {
        col = Arrays.copyOf((T[]) col, col.length * 2);
    }


    public boolean add(T el) {
        if (cursor >= col.length - 1) {
            expandArray();
            col[cursor] = el;
        }
        col[cursor] = el;
        cursor += 1;
        return true;
    }


    public boolean remove(Object el) {
        el = (T) el;
        for (int i = 0; i < col.length - 1; i++) {
            if (col[i].equals(el)) {
                while (i < col.length - 1) {
                    col[i] = col[i + 1];
                    i++;
                }
                cursor -= 1;
                return true;
            }
        }
        return false;
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
            try {
                T el = (T) col[cursor2];
                cursor2 += 1;
                return el;
            } catch (ArrayIndexOutOfBoundsException ex) {
                throw new NoSuchElementException();
            }
        }


    }
}

