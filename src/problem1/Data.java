package problem1;

public class Data{
    private double total;
    private double largest;
    private int count;

    public Data() {
        this.total = 0.0;
        this.largest = Double.NEGATIVE_INFINITY;
        this.count = 0;
    }

    public void addValue(double value) {
        total += value;
        count++;
        if (value > largest) {
            largest = value;
        }
    }

    public double average() {
        if (count == 0) {
            return 0;
        }
        return total / count;
    }

    public Double largest() {
        if (count == 0) {
            return null;
        }
        return largest;
    }
}

