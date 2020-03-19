import java.util.Comparator;

public class ComparatorShotMachine implements Comparator<ShotMachine> {
    @Override
    public int compare(ShotMachine o1, ShotMachine o2) {
        if(o1.caliber > o2.caliber) return 1;
        else if(o1.caliber < o2.caliber) return -1;
        else{
            if(o1.isManual == o2.isManual) return 1;
            else {
                return -1;
            }
        }
    }
}
