package FirstHW.Comparable;

import javafx.util.Pair;

public interface Number<T> extends Comparable{
    Pair<? extends T, ? extends T> getCoordinates();
    T add(T num);
    T remove(T num);
    T divide(T num);
    T multiply(T num);
}