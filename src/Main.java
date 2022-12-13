public class Main {
    public static void main(String[] args) {
        boolean s = Data.che("test","test","test");
        if (s) {
            System.out.println("Данные корректны");
        } else {
            System.out.println("Данные не корректны");
        }
        System.out.println(s);
    }
}