package primitivetypes;

public class Main {
    public static void main(String[] args) {
        boolean myBoolean = true;
        // 1 bajt (8 bitów)
        // 2^8 różnych wartości
        // -128 ... 127
        byte myByte = 127;
        // 2 bajty (16 bitów)
        // 2^16 różnych wartości
        // -2^15 ... 2^15 - 1
        // -32768 ... 32767
        short myShort = 32767;
        // 2 bajty (16 bitów)
        // 2^16 różnych wartości
        // 0 ... 2^16 - 1
        // 0 ... 65536
        char myChar = 'a';
        // 4 bajty (32 bity)
        // 2^32 różnych wartości
        // -2^31 ... 2^31-1
        int myInt = 2147483647;
        // 8 bajtów (64 bity)
        // 2^64 różnych wartości
        // -2^63 ... 2^63 - 1
        long myLong = 5_000_000_000_000L;

        // Typy zmiennoprzecinkowe:
        // 4 bajty (32 bity)
        float myFloat = 15.8f;
        // 8 bajtów (64 bity)
        double myDouble = 5433.124;

        myInt = myShort;
//        myShort = myInt;
        myShort = (short) myInt;

        myFloat = myLong;

        myDouble = 50.53;
        int a = (int) myDouble;

    }
}
