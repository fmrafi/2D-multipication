package pkg2d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum=0;
		            
		          Scanner input = new Scanner(System.in);
		          
		    int matrix1[ ][ ]=new int [2][2];
		    
		    System.out.println("Enter " + matrix1.length + " rows and " + matrix1[0].length + " columns: ");
		    
		    for (int row = 0; row < matrix1.length; row++) {
		    for (int column = 0; column < matrix1[row].length; column++) {
		    	matrix1[row][column] = input.nextInt(); 
		       }    
		    }
		    
		   for (int row = 0; row < matrix1.length; row++) {
		   for (int column = 0; column < matrix1[row].length; column++) {
		    	System.out.print(matrix1[row][column] + " ");
		    }
		  System.out.println();  }
		   
		   
		   int matrix2[ ][ ]=new int [2][2];
		    System.out.println("Enter " + matrix2.length + " rows and " + matrix2[0].length + " columns: ");
		    for (int row = 0; row < matrix2.length; row++) {
		    for (int column = 0; column < matrix2[row].length; column++) {
		    	matrix2[row][column] = input.nextInt(); 
		       }    }
		    
		    	    
		   for (int row = 0; row < matrix2.length; row++) {
		   for (int column = 0; column < matrix2[row].length; column++) {
		    	System.out.print(matrix2[row][column] + " ");
		    }
		  System.out.println();  }

		   

		   int matrix3[ ][ ]=new int [2][2];
		   
		  
		   
		   
		    for(int row=0;row<matrix1.length;row++){
		        for(int column=0;column<matrix2[row].length;column++){
		            for(int srow=0;srow<matrix2.length;srow++){
		                sum=sum+matrix1[row][srow]*matrix2[srow][column];
		            }
		              matrix3[row][column]=sum;
		            sum=0;
		            }
		    }
		    
		    
		        
		    System.out.println("The " + matrix3.length + " rows and " + matrix3[0].length + " columns Multiplication is: ");
		        for(int row=0;row<matrix1.length;row++){
		            for(int column=0;column<matrix2[row].length;column++){
		                System.out.print(matrix3[row][column]+" ");}
		        System.out.println();}
		        
    }
    
}
