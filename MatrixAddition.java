package arrays2d;

import java.io.IOException;

public class MatrixAddition {
    public static int[][] matrixAdditional(int[][] matrixOne, int[][] matrixTwo) throws Exception {
        if (matrixOne.length != matrixTwo.length || matrixOne[0].length != matrixTwo[0].length) {
            throw new IllegalArgumentException("Invalid input");
        }
        int[][] matrixSum = new int[matrixOne.length][matrixOne[0].length];
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                matrixSum[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }
        return matrixSum;
    }
}
