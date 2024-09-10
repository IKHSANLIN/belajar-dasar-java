public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 1000;
        Long iniLong = 100000L;
        Float iniFloat = 1.0f;


        int iniInt = 100;
        Integer iniObjek= iniInt;

        short iniShort = iniObjek.shortValue();
        Long iniLong2 = iniObjek.longValue();
        float iniFloat2 = iniObjek.floatValue();
    }
}
