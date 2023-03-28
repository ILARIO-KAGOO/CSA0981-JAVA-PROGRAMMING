import java.util.*;

public class matrixaddition
{
    public static void main(String args[]) {
        int row1, col1, row2, col2;
        try (Scanner s = new Scanner(System.in)) {
            // Input dimensions of First Matrix: A
            System.out.print("Enter number of rows in first matrix: ");
            row1 = s.nextInt();
            
            
            System.out.print("Enter number of columns in first matrix: ");
            col1 = s.nextInt();
            
            
            // Input dimensions of second matrix: B
            System.out.print("Enter number of rows in second matrix: ");
            row2 = s.nextInt();
            
            
            System.out.print("Enter number of columns in second matrix: ");
            col2 = s.nextInt();
            
            
            // Requirement check for matrix multiplication
            if (col1 != col2 || row1 != row2) {
                System.out.println("Matrix Addition is not possible");
                return;
            }
            
            int a[][] = new int[row1][col1];
            int b[][] = new int[row2][col2];
            int c[][] = new int[row1][col1];
            
            // Input the values of matrices
            System.out.println("\nEnter values for matrix A : ");
            for (int i = 0; i < row1; i++) 
            {
                for (int j = 0; j < col1; j++) 
                {
                    a[i][j] = s.nextInt();
                }   
            }
            System.out.println("\nEnter values for matrix B : ");
            for (int i = 0; i < row2; i++) 
            {
                for (int j = 0; j < col2; j++) 
                {
                    b[i][j] = s.nextInt();
                }
            }

            System.out.println("\nMatrix Addition: ");
            for (int i = 0; i < row1; i++)
            {
                for(int j = 0 ; j < col1 ; j++)
                {
                    c[i][j] = a[i][j] + b[i][j];
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
