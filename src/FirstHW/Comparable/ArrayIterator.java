package FirstHW.Comparable;

public class ArrayIterator implements java.util.Iterator<String> {

    protected String[] data;
    protected int cursor;

    public ArrayIterator(String[] data) {
        this.cursor = 0;
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        int cursor1 = cursor;
        if(data.length == 0)
            return false;
        while (data[cursor1] != null && data.length>cursor1) {
            if (data[cursor1] != null)
                return true;
            else
                cursor1 += 2;
        }
        cursor1 += 2;
        return data.length > cursor1;
    }


    @Override
    public String next() {
        try {
            while(data[cursor] == null)
                cursor+=2;
            String el = data[cursor];
            cursor += 2;
            return el;
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new java.util.NoSuchElementException();
        }
    }
}
