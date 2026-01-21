import java.util.Scanner;

public class Exp2 {
    public static void main(String[] args) {
        // Display current working directory
        String currentPath = System.getProperty("user.dir");
        System.out.println("Current Directory: " + currentPath);
        System.out.println("Name :- Rohit Kumar");
        System.out.println("Admission No :- 24SCSE2240093");

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        int[][] product = new int[rows][cols];

        // Input first matrix
        System.out.println("\nEnter elements of Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Matrix1[" + i + "][" + j + "] = ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("\nEnter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Matrix2[" + i + "][" + j + "] = ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                product[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display results
        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);
        System.out.println("Sum of two matrices:");
        displayMatrix(sum);
        System.out.println("Product of two matrices:");
        displayMatrix(product);

        sc.close();
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
