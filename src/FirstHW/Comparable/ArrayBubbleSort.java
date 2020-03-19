package FirstHW.Comparable;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ArrayBubbleSort {

    private static boolean change;

    public static <T> Collection<T> sort(List<T> arr, Comparator<? super T> comparator) {
        for (int i = 0; i < arr.size() - 1; i++) {
            change = false;
            for (int j = i + 1; j < arr.size(); j++) {
                if (comparator.compare(arr.get(i), arr.get(j)) > 0) {
                    T iter = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, iter);
                    change = true;
                }
            }
            if(!change) return arr;
        }

        return arr;
    }

    public static <T> T[] sort(T[] arr, Comparator<? super T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            change = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[i], arr[j]) > 0) {
                    T iter = arr[i];
                    arr[i] = arr[j];
                    arr[j] = iter;
                    change = true;
                }
            }
            if(!change) return arr;
        }

        return arr;
    }

}