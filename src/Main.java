public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float mass = 74;
        float height = 1.72F;
        float Imt = service.calculate(mass, height);
        System.out.println(Imt);
    }
}