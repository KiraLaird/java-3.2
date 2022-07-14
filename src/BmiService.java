public class BmiService {

    private double imt;

    public double calculate(double a, double b) {
        double weight = a; //  в метрах
        double height = b; //  в киллограммах

        imt = a / (b * b);

        return imt;
    }

}

