package Matrix;

public class MyMatrix {

    int[][] data;
    int row;
    int col;

    public MyMatrix(int row, int col) {
        this.row = row;
        this.col = col;

        this.data = new int[row][col];
    }

    public void set(int row, int col, int value) throws Exception {
        if (row < 0 || row >= this.row) {
            throw new Exception("Invalid Input For Row!");
        }
        if (col < 0 || col >= this.col) {
            throw new Exception("Invalid Input For Column!");
        }

        this.data[row][col] = value;
    }

    public int get(int row, int col) throws Exception {

        if (row < 0 || row >= this.row) {
            throw new Exception("Invalid Input For Row!");
        }
        if (col < 0 || col >= this.col) {
            throw new Exception("Invalid Input For Column!");
        } 

        return this.data[row][col];
    }




    
}
