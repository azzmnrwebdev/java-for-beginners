public class Contoh2 {
    public static void main(String[] args) {
        int[] age = {2,5,4,7,9};
        for (int i=0; i<age.length; i+=2) {
            if(age[i] %2 != 0) {
                System.out.println(age[i]);
            }
        }
    }
}
