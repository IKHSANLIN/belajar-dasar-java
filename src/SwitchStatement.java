public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "B";
        switch (nilai) {
            case "A" -> System.out.println("Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus Cukup baik");
            default -> System.out.println("Anda Tidak Lulus");
        }
        //Switch Lamda
        switch (nilai) {
            case "A" -> System.out.println("Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus Cukup baik");
            default -> System.out.println("Anda Tidak Lulus");
        }
        // Switch tanpa yield
        String Ucapan;
        switch (nilai) {
            case "A" -> Ucapan = ("Anda Lulus Dengan Baik");
            case "B", "C" -> Ucapan = ("Anda Lulus Cukup baik");
            default -> Ucapan = ("Anda Tidak Lulus");
        }
        System.out.println(Ucapan);

        //Switch menggunakan Yield
        String ucapan = switch (nilai) {
            case "A" : yield  ("Anda Lulus Dengan Baik");
            case "B", "C" : yield  ("Anda Lulus Cukup baik");
            default: yield ("Anda Tidak Lulus");
        };
        System.out.println(ucapan);
    }
}
