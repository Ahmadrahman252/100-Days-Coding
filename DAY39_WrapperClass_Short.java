public class WrapperClass_Short {
    public static void main(String[] args) {
        Short nilai = new Short((short) 2000);

        System.out.println("Nilai Short: " + nilai);
        short hasil = nilai.shortValue();
        System.out.println("Nilai short dalam Short: " + hasil);
    }
}
