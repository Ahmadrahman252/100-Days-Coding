public class Variabel {
    public static void main(String[] args) {
        // Tipe data integer Int
        int umur = 18;
                
        // Tipe data string String
        String namaDepan = "Akhmad";
        String namaBelakang = "Rahman";
        
        // Menampilkan nilai variable
        System.out.println("Nama: " + namaDepan + " " + namaBelakang);
        System.out.println("Umur: " + umur + " tahun");

        // Melakukan operasi matematika
        double tinggiBadan = 177.5;
        double beratBadan = 802;
        
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Berat Badan: " + beratBadan + " kg");
        
        // Gabungkan string
        String pesan = "Hai, Nama Saya " + namaDepan + " Saya berusia " + umur + " tahun.";
        System.out.println(pesan);
    }
}

