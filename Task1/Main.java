package Task1;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение " + test.getNext());
        }
        System.out.println("Сброс");
        test.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение " + test.getNext());
        }
        System.out.println("Начальное значение = 100");
        test.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение " + test.getNext());
        }
    }
}
