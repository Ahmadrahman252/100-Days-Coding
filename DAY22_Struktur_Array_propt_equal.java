/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USE
 */
import java.util.Arrays;
public class struktur_array_metode_equals {
    public static void main(String[] args) {

        int[] nilai1 = {1, 2, 3, 4, 5};
        int[] nilai2 = {1, 2, 3, 4, 5};
        int[] nilai3 = {5, 4, 3, 2, 1};
        int[] nilai4 = {1, 0, 0, 1, 1};
        
        boolean hasil1 = Arrays.equals(nilai1, nilai2); //bandingkan array1 dan 2
        System.out.println("Apakah Nilai1 Dan Nilai2 Sama?: " + hasil1);
        boolean hasil2 = Arrays.equals(nilai4, nilai3);
        System.out.println("Apakah Nilai 3 dan 4 sama?: " + hasil2);
    }
}

