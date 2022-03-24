public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90;
        int height = 182;
        float bodyMassIndex = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела составляет=" + bodyMassIndex + " кг/кв.м");
    }
}

