public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        // switch case
        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case  "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah Jurusan");
        }

        // switch lambda
        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda salah Jurusan");
            }
        }

        // switch tanpa yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda salah Jurusan";
            }
        }

        System.out.println(ucapan);

        // switch dengan yield
        ucapan = switch (nilai) {
            case "A":
                yield "Wow, Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Nilai Anda Cukup Baik";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda salah Jurusan";
        };

        System.out.println(ucapan);
    }
}
