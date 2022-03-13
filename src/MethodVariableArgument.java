public class MethodVariableArgument {
    public static void main(String[] args) {
        sayCongrats("Muhammad Azzam Nur Alwi Mansyur", 80, 78, 90, 95);
    }

    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values)  {
            total += value;
        }

        var finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
