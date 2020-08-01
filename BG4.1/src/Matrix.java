import java.util.Scanner;
 
class Matrix {
	int matrix[][];
	int row, column;
	void create() {
		Scanner input = new Scanner(System.in);		
		System.out.println("Number of rows :");
		row = input.nextInt();
		System.out.println("Number of columns :");
		column = input.nextInt();
		matrix = new int[row][column];
		System.out.println("Enter the numbers :");
		for(int i=0; i < row; i++) {
			for(int j=0; j < column; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
	}
	void display() {
		System.out.println("The Matrix- :");
		for(int i=0; i < row; i++) {
			for(int j=0; j < column; j++) {
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}
	}
 
public static void main(String args[]) {
		Matrix obj = new Matrix();
		obj.create();
		obj.display();
	}
}