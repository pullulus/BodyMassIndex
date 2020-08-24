public class BmiService {
    public int calculate(int mass, int height) {
        int bmi = mass * 10_000 / (height * height);

        return bmi;
    }
}

