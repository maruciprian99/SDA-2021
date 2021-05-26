package lab4prob3;
import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
	  public static boolean binarySearch(int[] sir, int nr) {
	        boolean var1 = false;
	        int position = -1;
	        int lowIndex = 0, highIndex = sir.length - 1;
	        while (lowIndex <= highIndex) {
	            int midIndex = (lowIndex + highIndex) / 2;
	            if (sir[midIndex] == nr) {
	                var1 = true;
	                position = midIndex;
	                break;
	            }
	            if (sir[midIndex] > nr)
	                highIndex = midIndex - 1;
	            if (sir[midIndex] < nr)
	                lowIndex = midIndex + 1;
	        }
	       
	        if (var1 == true) {
	            System.out.println("Numarul " + String.format("%s", nr) + " a fost gasit si are indexul: " + position);
	        } else {
	            System.out.println("Numarul " + String.format("%s", nr) + " nu a fost gasit");
	        }
	        return var1;
	    }

	    public static void main(String[] args) {
            int i;
	        int array[] = {0, 6, 8, 34, 22, 78, 10, 367, 151, 111};
	        Arrays.sort(array);
	        System.out.println("Sir ordine crescatoare: " + Arrays.toString(array));
           
	        
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Ce numere doriti sa cautati: ");
	        for(i=1;i<=8;i++) {
	        int number = scan.nextInt();
	        binarySearch(array, number);
	        }
	    }
}

