/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transposematriks;

/**
 *
 * @author Maulana Ali
 */
public class Transposematriks {

    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.println(matriks[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("====== Hasil transpose ======");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.println(matriks[j][i]);
            }
            System.out.println();
        }
        System.out.println("Hello World!");
    }
}
