package business;

import java.util.ArrayList;

public class Rangee {
    public ArrayList<Integer> rangee1;
    public ArrayList<Integer> rangee2;
    public ArrayList<Integer> rangee3;

    public Rangee() {
        this.rangee1 = new ArrayList<Integer>();
        this.rangee2 = new ArrayList<Integer>();
        this.rangee3 = new ArrayList<Integer>();
    }

    public Rangee(ArrayList<Integer> rangee1, ArrayList<Integer> rangee2, ArrayList<Integer> rangee3) {
        this.rangee1 = rangee1;
        this.rangee2 = rangee2;
        this.rangee3 = rangee3;
    }

    public ArrayList<Integer> getRangee1() {
        return rangee1;
    }

    public void setRangee1(ArrayList<Integer> rangee1) {
        this.rangee1 = rangee1;
    }

    public ArrayList<Integer> getRangee2() {
        return rangee2;
    }

    public void setRangee2(ArrayList<Integer> rangee2) {
        this.rangee2 = rangee2;
    }

    public ArrayList<Integer> getRangee3() {
        return rangee3;
    }

    public void setRangee3(ArrayList<Integer> rangee3) {
        this.rangee3 = rangee3;
    }

    public String getRangees() {
        return rangee1.toString() + "\n" + rangee2.toString() + "\n" + rangee3.toString();
    }

    @Override
    public String toString() {
        return "Rangee{" +
                "rangee1=" + rangee1 +
                ", rangee2=" + rangee2 +
                ", rangee3=" + rangee3 +
                '}';
    }
}
