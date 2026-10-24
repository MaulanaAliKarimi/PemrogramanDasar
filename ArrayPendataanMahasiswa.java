/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraypendataanmahasiswa;

/**
 *
 * @author Maulana Ali
 */
import java.util.Scanner;

public class ArrayPendataanMahasiswa {
    
    static String[][][] ukuranArray (int prodi, int kelas, int jumlahMahasiswa) {
        return new String[prodi][kelas][jumlahMahasiswa];
    }
    
    static void inputmahasiswa (Scanner input, String[][][] namaMahasiswa){
        input.nextLine();
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.println("\n=== Program Studi ke-" + (i + 1) + " ===");
            for (int j = 0; j < namaMahasiswa[i].length; j++) {
                System.out.println("Kelas ke " + (j+1)  + ": ");

                for (int k = 0; k < namaMahasiswa[i][j].length; k++) {
                    System.out.println("Masukkan Nama Mahasiswa: " + (k + 1) + ": ");
                    namaMahasiswa[i][j][k] = input.nextLine();
                }
            }
        }
    }
    
    static void tampilkanData(String[][][] dataMahasiswa) {
        System.out.println("\n=================================");
        System.out.println("    HASIL PENDATAAN MAHASISWA    ");
        System.out.println("=================================");

        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println("Program Studi ke-" + (i + 1));
            
            for (int j = 0; j < dataMahasiswa[i].length; j++) {
                System.out.println("  Kelas ke-" + (j + 1) + ":");
                
                for (int k = 0; k < dataMahasiswa[i][j].length; k++) {
                    System.out.println("    " + (k + 1) + ". " + dataMahasiswa[i][j][k]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah Program Studi: ");
        int prodi = input.nextInt();
        System.out.print("Masukkan jumlah Kelas per Prodi: ");
        int kelas = input.nextInt();
        System.out.print("Masukkan jumlah Mahasiswa per Kelas: ");
        int jumlahMahasiswa = input.nextInt();
        
        String[][][] dataMahasiswa = ukuranArray(prodi, kelas, jumlahMahasiswa);

        System.out.println("\n--- SILAKAN INPUT NAMA MAHASISWA ---");
        inputmahasiswa(input, dataMahasiswa);

        input.close();
        tampilkanData(dataMahasiswa);
        System.out.println("\n==============");
        System.out.println("Hello class! Selamat Belajar");
        System.out.println("==============");
    }
}
