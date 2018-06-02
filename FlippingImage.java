public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int M = A.length;
        int N = A[0].length;
        int[][] B = new int[M][N];
        for(int i = 0; i < M; i++) {
            for(int j = N - 1; j > -1; j--) {
                B[i][N-1-j] = 1-A[i][j];
            }
        }
        return B;
    }
}
