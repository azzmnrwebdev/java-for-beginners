public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInt = 100;
        long iniLong = 10000L;

        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        int iniInt2 = 100;
        Integer iniObject = iniInt2;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.shortValue();
        float iniFloat = iniObject.shortValue();

        Long amount = 1000000L;
    }
}
