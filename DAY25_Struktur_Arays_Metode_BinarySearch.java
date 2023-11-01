/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *
 * @author USER
 */
import java.util.Arrays;
public class struktur_array_binarysearch {
    public static void main(String[] args) {
        int[] angka = {2, 3, 4, 5, 6,7,8,12};

        int nilai = 7;
        int indeks = Arrays.binarySearch(angka, nilai);

        if (indeks >= 0) {
            System.out.println("nilai " +nilai + " berada pada indeks " + indeks);
        } else {
            System.out.println("Elemen " + nilai + " tidak ditemukan didalam array");
        }
    }
}

