//WAP to take the elements of a matrix of size 3*3 from user and display the matrix
//and all diagonal elements.

import java.util.Scanner;

public class num2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int[][] matrix=new int[3][3];

        System.out.println("Enter the elements of 3*3 matrix:");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter element at position ("+(i+1)+","+(j+1)+"):");
                matrix[i][j]=input.nextInt();
            }
        }
        System.out.println("The ");
    }
}