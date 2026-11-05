/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nilaiterbesarmatriks;

/**
 *
 * @author Maulana Ali
 */
public class Nilaiterbesarmatriks {

    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int nilaiMax = matriks[0][0];
        int barisMax = 0;
        int kolomMax = 0;
        
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                if (matriks[i][j] > nilaiMax) {
                    nilaiMax = matriks[i][j];
                    barisMax = i; // Simpan indeks baris
                    kolomMax = j; // Simpan indeks kolom
                }
            }
        }
        System.out.println("Nilai terbesar : " + nilaiMax);
        System.out.println("Posisi (Indeks Java) : Baris " + barisMax + ", Kolom " + kolomMax);
        System.out.println("Posisi (Baris & Kolom): Baris " + (barisMax + 1) + ", Kolom " + (kolomMax + 1));
    }
}
