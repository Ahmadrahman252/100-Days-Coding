/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Arrays;
import java.util.Collections;
public class struktur_array_sort_desc {
    public static void main(String[] args) {
        Integer[] nilai = {299,195, 822, 22, 21,2,45,1,2,38,-22};
        Arrays.sort(nilai, Collections.reverseOrder());
        System.out.println("Urut Array Desc Besar Kekecil: " + Arrays.toString(nilai));
    }
}

