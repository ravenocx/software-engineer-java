public class VarArgs {

    public static void PushUp(String name, int... count){
        // variabel argument -> menerima input untuk paramter yang tidak terbatas
        // paramater varagrs akan berupa array
        // varagrs hanya bisa diakhir paramater
        for (var value: count) {

            System.out.println(name + " Melakukan Push up ke - "+ value);
        }
    }

    public static void main(String[] args) {
        PushUp("Haris",1,2,3,4,5);
    }

    
}
