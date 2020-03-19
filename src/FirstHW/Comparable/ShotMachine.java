public class ShotMachine implements Comparable<ShotMachine>{

    float caliber;
    String countryOfOrigin;
    boolean isManual;

    public ShotMachine(float caliber, String countryOfOrigin, boolean isManual) {
        this.caliber = caliber;
        this.countryOfOrigin = countryOfOrigin;
        this.isManual = isManual;
    }

    @Override
    public int compareTo(ShotMachine o) {
        if(caliber > o.caliber) return 1;
        else if(caliber < o.caliber) return -1;
        else{
            if(isManual == o.isManual) return 1;
            else {
                return -1;
            }
        }
    }
}