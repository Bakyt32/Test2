public class Main {
    public static void main(String[] args) {
        int a = -1;
        int b = 20;
        System.out.println(add(a, b));
        System.out.println(sub(a, b));
    }

    private static int add(int a, int b){
        return a + b;
    }
    private static int sub(int a, int b){
        return a - b;
    }
}