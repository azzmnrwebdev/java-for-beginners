public class DoWhileLoop {
    public static void main(String[] args) {
        // Do While Loop perulangan mirip dengan while
        // perbedaan hanya pada pengecekan kondisi
        /**
         * pengecekan kondisi di while loop dilakukan di awal
         * sebelum perulangan dilakukan, sedangkan di do while loop
         * dilakukan setelah perulangan dilakukan
         *
         * Oleh karena itu dalam do while loop, minimal pasti sekali
         * perulangan dilakukan walaupun kondisi tidak bernilai true
         */

        var counter = 100;

        do {
            System.out.println("Perulangan Ke-" + counter);
            counter++;
        } while (counter <= 10);
    }
}
