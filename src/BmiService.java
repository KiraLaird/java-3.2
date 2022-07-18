public class BmiService {

    private double imt;

    public double calculate(double weight, double height) {

        imt = weight / (height * height);

        return imt;
    }

}

