public class SwitchCase {
    public static void main(String[] args) {
        var nilai = "A";

        String ucapan;
        String ucapan2;

        switch(nilai){ // Switch lambda tidak perlu break lagi
            case "A" -> ucapan = "wow";
            case "B" -> ucapan = "b";
            case "C"-> ucapan = "c";
            default -> ucapan ="default";
        };

        ucapan = switch(nilai){ // Yield menghasilkan return value
            case "A" :
                yield "wow";
            case "B" :
                yield "b";
            case "C":
                yield "c";
            default :
                yield "default";
        };

    }
}
