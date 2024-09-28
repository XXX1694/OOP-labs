package problem3;

public class Temperature {
    private double value;
    private char scale;

    public Temperature() {
        this.value = 0.0;
        this.scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.value = 0.0;
        this.scale = scale;
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double toCelsius() {
        if (scale == 'F') {
            return (5 * (value - 32)) / 9;
        }
        return value;
    }

    public double toFahrenheit() {
        if (scale == 'C') {
            return (9 * value) / 5 + 32;
        }
        return value;
    }


    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            throw new IllegalArgumentException("Scale must be 'C' or 'F'");
        }
    }

    public void setTemperature(double value, char scale) {
        setValue(value);
        setScale(scale);
    }

    public char getScale() {
        return scale;
    }

    public double getValue() {
        return value;
    }

    public static void main(String[] args) {
        Temperature temp1 = new Temperature();
        Temperature temp2 = new Temperature(100);
        Temperature temp3 = new Temperature('F');
        Temperature temp4 = new Temperature(212, 'F');

        System.out.println("Temp1 in Celsius: " + temp1.toCelsius());
        System.out.println("Temp2 in Fahrenheit: " + temp2.toFahrenheit());
        System.out.println("Temp3 in Celsius: " + temp3.toCelsius());
        System.out.println("Temp4 in Celsius: " + temp4.toCelsius());

        temp1.setTemperature(25, 'C');
        System.out.println("Updated Temp1 in Fahrenheit: " + temp1.toFahrenheit());
    }
}
