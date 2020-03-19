public class Tommy implements Comparable<Tommy> {

    private int rank;
    private float militaryServiceTime;
    private float salary;

    public Tommy(int rank, float militaryServiceTime, float salary) {
        this.rank = rank;
        this.militaryServiceTime = militaryServiceTime;
        this.salary = salary;
    }

    @Override
    public int compareTo(Tommy o) {
        if(rank > o.rank) return 1;
        else if(rank < o.rank) return -1;
        else{
            if(militaryServiceTime > o.militaryServiceTime) return 1;
            else if(militaryServiceTime < o.militaryServiceTime) return -1;
            else{
                if(salary > o.salary) return 1;
                else if(salary < o.salary) return -1;

            }
        }

        return 0;
    }
}
