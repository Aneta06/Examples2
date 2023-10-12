package arrays2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixAdditionTest {

    @Test
    void matrixAdditionalTestOne() throws Exception {
        int[][] matrixOne = new int[][]{{1, 2}, {3, 4}};
        int[][] matrixTwo = new int[][]{{5, 6}, {7, 8}};
        assertArrayEquals(new int[][]{{6, 8,}, {10, 12}}, MatrixAddition.matrixAdditional(matrixOne, matrixTwo));
    }
    @Test
    void matrixAdditionalTestTwo() {
        int[][] matrixOne = new int[][]{{1, 2}, {3, 4}, {3, 4}};
        int[][] matrixTwo = new int[][]{{5, 6, 10}, {7, 8}};
        assertThrows(IllegalArgumentException.class, () -> MatrixAddition.matrixAdditional(matrixOne, matrixTwo));
    }
}