package daaa;
import java.util.Scanner;

public class matrixmultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows of first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns of first matrix / rows of second matrix: ");
        int cols1 = scanner.nextInt();
        System.out.print("Enter number of columns of second matrix: ");
        int cols2 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[cols1][cols2];
        int[][] result = new int[rows1][cols2];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < cols1; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
