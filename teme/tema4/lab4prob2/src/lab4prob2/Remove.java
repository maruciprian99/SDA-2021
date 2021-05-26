package lab4prob2;
import java.util.Arrays;
import java.util.Scanner;

public class Remove {

	   public static void main(String[] args) {
	       

	        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        try (Scanner scan = new Scanner(System.in)) {
				int position = -1;
				System.out.println("Introduceti un numar intre 0-9 pe care doriti sa il stergeti: ");
				while (position < 0 || position > 9) {
				    while(!scan.hasNextInt()) {
				        scan.next();
				    }
				    System.out.println("Sir: ");
				    position = scan.nextInt();
				}

				int n = array.length-1;
				for (int i = position; i < n; i++) {
				    array[i] = array[i+1];
				}

				array[n] = 0;
			}
	        System.out.println(Arrays.toString(array));

	    }
}
