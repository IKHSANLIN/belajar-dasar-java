public class ForEach {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] names = {"Ikhsan", "Lintang", "Rizal", "Prakasa"};
        for (int i = 0; i < angka.length; i++){
            System.out.println(angka[i]);
        }
        System.out.println("============For Each ============");
        for (String name : names){
            System.out.println(name);
        }
    }
}
