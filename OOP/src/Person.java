public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor adalah method yang akan dipanggil saat object dibuat untuk menginisialisasi atribut
    // nama constructor harus sama dengan nama class
    // tidak ada kata kunci void ataupun return value

    void sayHello(String name){
        System.out.println("Hello "+ name + ", My Name is " + name); // field name tidak bisa diakses
        // Variable Shadowing -> nama variable nya sama dengan scope diatasnya
    }

    public Person(String name, String address){
        this.name = name; // menghindari variable shadowing
        this.address = address; // this merujuk pada object saat ini
    }

    void sayHello(){
        this.sayHello("Bos");
    }

    // overloading constructor
//    public Person(String paramName){
//        name = paramName;
//    }

    public Person(String paramName){ // Calling other constructor
        this(paramName,null); // this akan memanggil constructor yang menyesuaikan jumlah parameter
    }
    public Person(){
        this(null);
    }


}
