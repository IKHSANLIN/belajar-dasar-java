public class RecrusiveMethod {

    public static void main(String[] args) {
        factorialLoop(5);
        System.out.println(factorialRecursive(5));
        loop(10000);
    }

    static void factorialLoop(int value){
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    static int factorialRecursive(int value){
        if (value == 1){
            return 1;
        }
        return value * factorialRecursive(value - 1);
    }
    static void loop(int value){
        if (value==0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
        }
}

