public class Tank implements Comparable<Tank> {

    int armor;
    String countryOfOrigin;
    String material;

    public Tank(int armor, String countryOfOrigin, String material) {
        this.armor = armor;
        this.countryOfOrigin = countryOfOrigin;
        this.material = material;
    }

    @Override
    public int compareTo(Tank o) {
        if(armor > o.armor) return 1;
        else if(armor < o.armor) return -1;
        else{
            if(countryOfOrigin == o.countryOfOrigin) return 1;
            else return material.compareToIgnoreCase(o.material);
        }
    }
}
