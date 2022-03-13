public class Contoh {
    public static void main(String[] args) {
        int a, b, sumA;
        a = 12; b = 6; sumA = 0;
        a = a * b;
        b = a / b;
        a = a / b;
        for (int i = 1; i<= a; i++) {
            sumA = sumA + a%i;
        }
        System.out.println(sumA);
    }
}
