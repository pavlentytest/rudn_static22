public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.doSmth();
        test.doAction();
        Test.counter++;

        Test test2 = new Test();
        System.out.println(test2.counter);      //2

        Test.VAL++;
    }
}
class Test {

    public static int counter = 1;
    public static final int VAL = 500; // константа

    void doSmth() {

    }

    static void doAction() {

    }
}