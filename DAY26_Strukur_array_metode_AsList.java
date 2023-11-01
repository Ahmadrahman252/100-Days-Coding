/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Arrays;
import java.util.List;
public class struktur_array_aslist {
    public static void main(String[] args) {
        Integer[] nilai = {1, 2, 3, 4, 5};
        List<Integer> daftar = Arrays.asList(nilai);
        System.out.println("nilai pertama: " + daftar.get(0));
        System.out.println("nilai kedua: " + daftar.get(1));
        System.out.println("nilai ketiga: " + daftar.get(2));
        System.out.println("nilai keempat: " + daftar.get(3));
        System.out.println("nilai kelima: " + daftar.get(4));
    }
}

