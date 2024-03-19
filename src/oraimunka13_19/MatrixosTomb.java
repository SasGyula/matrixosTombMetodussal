package oraimunka13_19;

import java.util.Random;

public class MatrixosTomb {
    static Random rnd = new Random();
    public static void main(String[] args) {
        matrixosTombKiiras();
    }

    private static void matrixosTombKiiras() {
        int [][] matrixA = tombFeltoltes(3, 2);
        kiir("A mátrix",matrixA);
        int [][] matrixB = tombFeltoltes(3, 2);
        kiir("B mátrix",matrixB);
        int [][] matrixC = matrixokatOsszead(matrixA, matrixB);
        kiir("C mátrix", matrixC);
    }
    public static void kiir(String cim, int[][] matrix){
        System.out.println(cim);
        int sor = matrix.length;
        for (int i = 0; i < sor; i++) {
            int oszlop = matrix[i].length;
            for (int j = 0; j < oszlop; j++) {
                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.println("");
        }
        
    }
    public static int[][] tombFeltoltes(int sor, int oszl){
        int[][] matrix = new int[sor][oszl];
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszl; j++) {
                matrix[i][j] = rnd.nextInt(-15,25);
            }
        }
        return matrix;
    }

    private static int[][] matrixokatOsszead(int[][] tomb, int[][] tomb2) {
        int sor = tomb.length;
        int oszlop = tomb[0].length;
        int [][] matrix = new int [sor][oszlop];
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                matrix[i][j] = tomb[i][j] + tomb2[i][j];
            }
        }
        return matrix;
    }
}
