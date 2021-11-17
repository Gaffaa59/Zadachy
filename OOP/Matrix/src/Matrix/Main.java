package Matrix;

public class Main {

    public static void main(String[] args) {

        System.out.println("");
        System.out.print("Matrix 1:");
	    Matrix matrix = new Matrix(2, 2);

        System.out.println("");
        System.out.print("Matrix 2:");
        Matrix matrix1 = new Matrix(2,2);

        System.out.println("");
        System.out.print("Sum Matrix:");
        matrix.printMatrix(matrix.sum(matrix1.matrix));

        System.out.println("");
        System.out.print("Multiply Int:");
        matrix.printMatrix(matrix.multiplyInt(2));

        System.out.println("");
        System.out.print("Multiply Matrix:");
        matrix.printMatrix(matrix.multiplyMatrix(matrix1.matrix));
    }
}


class Matrix {
    double[][] matrix;
    int height, width;
    Matrix(int height, int width){
        this.height = height;
        this.width = width;
        this.matrix = new double[height][width];
        System.out.println(" ");
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++) {
                matrix[i][j] = Math.round((0 + (float) (Math.random() * 100)) * 100.0) / 100.0;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    double[][] sum(double matrix2[][]){
        double[][] temp = new double[this.height][this.width];
        for(int i = 0; i < this.height; i++){
            for(int j = 0; j < this.width; j++) {
                temp[i][j] = Math.round((matrix[i][j] + matrix2[i][j]) * 100.0) / 100.0;
            }
        }
        return temp;
    }

    double[][] multiplyInt(int num){
        double[][] temp = new double[this.height][this.width];
        for(int i = 0; i < this.height; i++){
            for(int j = 0; j < this.width; j++) {
                temp[i][j] = Math.round((matrix[i][j] * num) * 100.0) / 100.0;
            }
        }
        return temp;
    }

    double[][] multiplyMatrix(double matrix2[][]){
        double[][] temp = new double[this.height][this.width];
        for(int i = 0; i < this.height; i++){
            for(int j = 0; j < this.width; j++) {
                temp[i][j] = Math.round((matrix[i][j] * matrix2[i][j]) * 100.0) / 100.0;
            }
        }
        return temp;
    }

    void printMatrix(double temp[][]){
        System.out.println(" ");
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp[0].length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println(" ");
        }
    }


    class squareMatrix {
        double[][] matrix;
        int height, width;
        squareMatrix(int height, int width){
            this.height = height;
            this.width = width;
            System.out.println(" ");
            for(int i = 0; i < height; i++){
                for(int j = 0; j < width; j++) {
                    matrix[i][j] = Math.round((0 + (float) (Math.random() * 100)) * 100.0) / 100.0;
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(" ");
            }
        }

        double[][] doSquare(){
            double[][] temp = new double[this.height][this.width];
            for(int i = 0; i < this.height; i++){
                for(int j = 0; j < this.width; j++) {
                    temp[i][j] = Math.round((matrix[i][j] * matrix[i][j]) * 100.0) / 100.0;
                }
            }
            return temp;
        }
    }

}