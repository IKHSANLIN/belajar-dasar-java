public class TenaryOperator {
    public static void main(String[] args) {
        var nilai = 70;
        String Ucapan;
        if (nilai == 75) {
            Ucapan = "Selamat Anda Lulus";
        }else{
            Ucapan = "Silakan Anda Coba Lagi";
        }
        System.out.println(Ucapan);
        String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silakan Coba Lagi";
        System.out.println(ucapan);
    }
    
}
