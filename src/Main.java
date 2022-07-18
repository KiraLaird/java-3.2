public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int imt = (int) service.calculate(75, 1.80);

        System.out.println((imt) + " Индекс Массы Тела");
    }
}
