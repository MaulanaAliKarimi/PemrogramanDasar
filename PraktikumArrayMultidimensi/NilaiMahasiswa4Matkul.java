/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nilaimahasiswa4matkul;

/**
 *
 * @author Maulana Ali
 */
public class NilaiMahasiswa4Matkul {

    public static void main(String[] args) {
        String[] matkul = {"Pemrograman", "Matematika", "Literasi Digital", "Konsep Sistem Informasi"};
        String[] namaMahasiswa = {"Ali", "Huda", "Rayyan"};
        int[][] nilaiMahasiswa = {
            {88, 95, 75, 77},
            {78, 88, 89, 93}, 
            {77, 84, 92, 89}
        };
        
        for (int i = 0; i < nilaiMahasiswa.length; i++){
            int totalnilai = 0;
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                totalnilai += nilaiMahasiswa[i][j];
            }
            double rataRata = (double) totalnilai / nilaiMahasiswa[i].length;
            System.out.println("Rata-rata " + namaMahasiswa[i] + " : " + rataRata);
        }
    }
}
