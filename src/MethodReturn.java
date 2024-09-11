public class MethodReturn {
    public static void main(String[] args) {
        var a = 10;
        var b = 20;
        var c = sum(a, b);
        System.out.println(c);
    }
    static int sum(int a, int b) {
        var total = a + b;
        return total;
    }
}
