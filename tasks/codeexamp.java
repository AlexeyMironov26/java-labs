import java.util.Arrays;
public class codeexamp {
    public static void main(String[] Args){
        System.out.println(Arrays.deepToString(nmat(5)));
    } 
    public static int[][] nmat(int n){
        int[][] mat = new int[n][n];
        for (int i=0;i<n;i++){

            for (int j=0;j<n;j++){
                mat[i][j] = 5;
            }
        }
        return mat;
    }
}
