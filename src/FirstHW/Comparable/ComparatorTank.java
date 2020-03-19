import java.util.Comparator;

public class ComparatorTank implements Comparator<Tank> {
    @Override
    public int compare(Tank o1, Tank o2) {
        if(o1.armor > o2.armor) return 1;
        else if(o1.armor < o2.armor) return -1;
        else{
            if(o1.countryOfOrigin == o2.countryOfOrigin) return 1;
            else return o1.material.compareToIgnoreCase(o2.material);
        }
    }
}
