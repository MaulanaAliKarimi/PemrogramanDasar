/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elemendiagonalutamamatriks;

/**
 *
 * @author Maulana Ali
 */
public class ElemenDiagonalUtamaMatriks {

    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int totalDiagonal = 0;
        
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                if (i == j) {
                    totalDiagonal += matriks[i][j];
                }
            }
        }
        System.out.println("Jumlah diagonal utama: " + totalDiagonal);
    }
}
