package Demo;

import java.util.Scanner;

public class starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); {
			
			System.out.println("enter the number of rows");
			int row = in.nextInt();
		
		
		for(int i = row; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*"+" ");
				
			}
			System.out.println();
			
		}

      }

    }
	
  }
