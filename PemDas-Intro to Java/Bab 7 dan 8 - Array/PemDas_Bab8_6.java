// Ahmad Thoriq Hafidzurrohman
// 245150701111026
// Teknologi Informasi - C

import java.util.Scanner;

public class PemDas_Bab8_6 {
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];

        System.out.print("Masukkan matriks pertama: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = sc.nextDouble();
            }
        }

        System.out.print("Masukkan matriks kedua: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = sc.nextDouble();
            }
        }

        double[][] result = multiplyMatrix(matrix1, matrix2);

        System.out.println("Hasil perkalian matriksnya adalah: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}