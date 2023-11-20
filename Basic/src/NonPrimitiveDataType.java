public class NonPrimitiveDataType {
    public static void main(String[] args) {
//        int number = null; // error

        // Tipe data non primitve tidak ada default value, sehingga nilainya bisa null
        // selain itu tipe data non primitive bisa menggunakan method/function
        Integer number2 = null;
        Character name = null;
        // Cara membuat non primitive hanya dengan huruf kapital didepan dan dengan nama tipe data yang lengkap
        System.out.println(number2);

        Integer number = 1;
        String numberString = number.toString(); // jika primitive dia tidak bisa menggunakan method/function

    }
}
