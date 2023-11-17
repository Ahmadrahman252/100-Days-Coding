public class wrapperClass_Byte {
    public static void main(String[] args) {
        Byte nilai = new Byte((byte) 42);

        System.out.println("Nilai Byte: " + nilai);
        byte hasil = nilai.byteValue();
        System.out.println("Nilai byte dari objek Byte: " + hasil);
    }
}
