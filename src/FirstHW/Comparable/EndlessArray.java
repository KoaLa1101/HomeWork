package FirstHW.Comparable;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Iterator;

public class EndlessArray<T> implements Iterable<T> {


    private final int BASE_CAPACITY = 10;
    private final float ARRAY_EXPANSION = 1.5f;
    private T[] arr;
    private int elementCount;
    private int cursor;

    public EndlessArray() {
        arr = (T[]) new Object[BASE_CAPACITY];
        elementCount = 0;
    }

    public EndlessArray(int length) {
        arr = (T[]) new Object[length];
        elementCount = 0;
    }

    public void add(T num) {
        if (arr.length == elementCount) arr = positiveArrayResize();
        arr[elementCount] = num;
        elementCount++;
    }


    public void remove(int index) {
        arr = negativeArrayResize(index);
        elementCount--;
    }


    public T get(int index) {
        return arr[index];
    }

    public int size() {
        return elementCount;
    }

    public int capacity() {
        return arr.length;
    }

    public int indexOf(T num) {
        for (int i = 0; i < size(); i++) {
            if (num == arr[i]) return i;
        }
        return -1;
    }

    public int lastIndexOf(T num) {
        for (int i = size() - 1; i >= 0; i--) {
            if (num == arr[i]) return i;
        }
        return -1;
    }

    public boolean contains(T num) {
        return indexOf(num) >= 0;
    }

    public T[] getArray() {
        T[] returnArray = (T[]) new Object[size()];
        System.arraycopy(arr, 0, returnArray, 0, size());
        return returnArray;
    }

    private T[] positiveArrayResize() {
        T[] returnArray = (T[]) new Object[(int) (arr.length * ARRAY_EXPANSION)];
        System.arraycopy(arr, 0, returnArray, 0, size());
        return returnArray;
    }

    private T[] negativeArrayResize(int index) {
        T[] returnArray = (T[]) new Object[capacity() - 1];
        System.arraycopy(arr, 0, returnArray, 0, index);
        System.arraycopy(arr, size() - (index - 1), returnArray, size() - index, size() - (index - 1));
        return returnArray;
    }



    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            public boolean hasNext() {
                return cursor>=size();
            }

            public T next() {
                cursor++;
                return arr[cursor-1];

            }
        };

    }
}

