public class operatorperbandingan {
    public static void main(String[] args) {
        int umur_ari = 5;
        int umur_yanto = 10;

        boolean lebihbesar = umur_ari > umur_yanto;
        boolean lebihkecil = umur_ari < umur_yanto;
        boolean samadengan = umur_ari == umur_yanto;
        boolean tidaksama = umur_ari != umur_yanto; //tidak sama dengan
        boolean besarsamadengan = umur_ari >= umur_yanto; //lebih besar atau samadengan
        boolean kecilsamadengan = umur_ari <= umur_yanto; //lebih kecilr atau samadengan

        System.out.println(lebihbesar);
        System.out.println(lebihkecil);
        System.out.println(samadengan);
        System.out.println(tidaksama);
        System.out.println( besarsamadengan);
        System.out.println(kecilsamadengan);
    }
}
