public class NumberDataType {

    public static void main(String[] args) {
        byte iniByte = 10; // 1byte
        short iniShort = 100; // 2bytes
        int iniInt = 1000; // 4bytes
        long iniLong = 10000; // 8bytes
        long iniLong2 = 10000L; // L dibelakang optional

        float iniFloat = 10.10F; // 4bytes -> wajib ada F dibelakang
        double iniDouble = 12.2424; //8 bytes

        int hexInt = 0xA132B; //hexadecimal
        int binInt = 0b01010101; // binary

        // widening casting -> konversi tipe data secara otomatis
        // byte -> short -> int -> long -> float -> double
        int iniInt2 = iniByte;

        // Narrowing Casting -> konversi tipe data secara manual
        // double -> float -> long -> int -> char ->  short -> byte
        byte iniByte2 = (byte) iniInt;
        System.out.println(iniByte2);
    }

}
