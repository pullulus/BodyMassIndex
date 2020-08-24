public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 70;
        int height = 160;
        // рост указывается в сантиметрах
        int bmi = service.calculate(mass, height);

        System.out.println(bmi);
    }
}
