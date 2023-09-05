public class Main {
    public static void main(String[] args) {
        sumNumber();
        //Give int a and int b two arbitrary values of number type
        sumNumber2(10, 20);
        //Give int a and int b two arbitrary values of number type
        sumNumber3(15, 50);
        //
        int[] a = new int[6];
        a[4] = 5;
        //

    }

    private static void sumNumber() {
        int a = 15;
        int b = 10;
        System.out.println("sum = " + (a + b));
    }

    private static void sumNumber2(int a, int b) {
        System.out.println("sum = " + (a + b));
    }

    private static void sumNumber3(int a, int b) {
        int sum = a + b;
        String sumShow = String.valueOf(sum);
        System.out.println(sumShow);
    }
}