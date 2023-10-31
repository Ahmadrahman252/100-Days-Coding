/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Arrays;
public class struktur_array_metode_copyof {
    public static void main(String[] args) {
        int[] nilai1 = {1, 2, 3, 4, 5,6,7,8,9,10};
        int[] nilai2 = Arrays.copyOf(nilai1, 500); 
        System.out.println(Arrays.toString(nilai2));
    }
}


