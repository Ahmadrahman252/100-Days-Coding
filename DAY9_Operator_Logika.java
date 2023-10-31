public class logika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean hasilAND = a && b; //menghasilkan true hanya jika keduanya bernilai true.
        System.out.println("Hasil AND: " + hasilAND);

        boolean hasilOR = a || b; //menghasilkan true jika salah satu atau keduanya bernilai true.
        System.out.println("Hasil OR: " + hasilOR);

        boolean hasilNOT = !a; //digunakan untuk membalikkan nilai, Jika awalnya true, hasilnya menjadi false, dan sebaliknya.
        System.out.println("Hasil NOT: " + hasilNOT);
    }
}
