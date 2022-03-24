public class BmiService {
    public float calculate(int weight, int height) {
        float bodyMassIndex = (float) weight / (height * height) * 100 * 100;
        return bodyMassIndex;

    }
}
