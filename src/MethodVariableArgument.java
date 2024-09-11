public class MethodVariableArgument {

    public static void main(String[] args) {
        // int[] values = {70, 70, 90,60};
        sayCongrats("Ikhsan", 70, 70, 90,60);
    }

    static void sayCongrats(String names, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;
        if(finalValue > 75) {
            System.out.println("Selamat " + names + " Anda lulus dengan nilai : " + finalValue);
        }else{
            System.out.println("Maaf " + names + " Anda tidak lulus dengan nilai : " + finalValue);
        }
        
    }
}
