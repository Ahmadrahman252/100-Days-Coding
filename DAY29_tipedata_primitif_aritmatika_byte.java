public class tipedata_primitif_perkalian_byte {
    public static void main(String[] args) {
        byte nilai = 100;
        System.out.println("Nilai : " + nilai);

        byte nilai1 = 50;
        byte nilai2 = 30;
        
        byte hasil1 = (byte)(nilai1+nilai2);
        byte hasil2 = (byte)(nilai1*nilai2);
        byte hasil3 = (byte)(nilai1-nilai2);
        byte hasil4 = (byte)(nilai1/nilai2);
        byte hasil5 = (byte)(nilai1%nilai2);
        System.out.println("Hasil penjumlahan: " + hasil1);
        System.out.println("Hasil perkalian: " + hasil2);
        System.out.println("Hasil pengurangan: " + hasil3);
        System.out.println("Hasil pembagian: " + hasil4);
        System.out.println("Hasil modulus: " + hasil5);
    }
}
