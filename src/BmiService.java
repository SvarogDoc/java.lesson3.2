public class BmiService {
    public float calculate(int index) {
        int weight = 90;
        int height = 182;
        float bodyMassIndex = (float) weight / (height * height) * 100 * 100;
        return bodyMassIndex;

    }
}
