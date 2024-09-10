public class TipeDataArray {
    public static void main(String[] args) {


        // Array String
        String[]  stringArray;

        stringArray = new String[3];
        stringArray[0] = "Ikhsan";
        stringArray[1] = "Lintang";
        stringArray[2] = "Rizal";
        System.out.println(stringArray[2]);

        String[] names = {"Ikhsan", "Lintang", "Rizal"};
        System.out.println(names[2]);

        //Tidak ada penghapusan data array
        names[0]= null;

        names[2] = "Prakasa";
        System.out.println(names[2]);

        // Array Integer
        int[] arrayInt = new int[]{1,2,3,4,5};
        System.out.println(arrayInt[2]);

        //Array Long
        long[] arrayLong = {
            1,2,3,4
        };
        System.out.println(arrayLong[3]);

        // Array Di dalam Array
        String[][] members = {
                {"Ikhsan", "Lintang", "Rizal"},
                {"Prakasa", "Rizal", "Rizal"}
        };
        System.out.println(members[0][2]);
        System.out.println(members[0][1]);
        
        System.out.println(members[1][2]);
    }
}
