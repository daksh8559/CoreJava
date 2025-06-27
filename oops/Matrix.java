import java.io.Console;

public class Matrix {

    private int[][] arr;

    public Matrix() {
        arr = new int[3][3];
    }

    public Matrix(int row, int column){
        arr = new int[row][column];
    }

    public Matrix(Matrix matrix) {
        arr = new int[matrix.arr.length][];
        for(int i=0;i<matrix.arr.length;i++) {
            arr[i] = new int[matrix.arr[i].length];
        }

        
    }

    public void read() {
        int i, j;
        Console con = System.console();

        for(i=0; i<arr.length; i++) {
            for(j=0; j<arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(con.readLine());
            }
        }
    }

    public void show() {
        int i, j;

        for(i=0; i<arr.length; i++) {
            for(j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


}
