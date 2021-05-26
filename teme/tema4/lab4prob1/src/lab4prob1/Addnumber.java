package lab4prob1;
import java.util.*;
import java.io.*;

public class Addnumber {

	public static void main(String[] args) {
		
	
		 int n, pos, x;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Introduceti numarul de elemente pe care le vreti in sir:");
	        n = s.nextInt();
	        int a[] = new int[n+1];
	        System.out.println("Introduceti elementele din sir:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        System.out.print("Introduceti pozitia pe care doriti sa adaugati elementul:");
	        pos = s.nextInt();
	        System.out.print("Introduceti elemntul pe care doriti sa il adaugati:");
	        x = s.nextInt();
	        for(int i = (n-1); i >= (pos-1); i--)
	        {
	            a[i+1] = a[i];
	        }
	        a[pos-1] = x;
	        System.out.print("Sir dupa introducerea elementului:");
	        for(int i = 0; i < n; i++)
	        {
	            System.out.print(a[i]+",");
	        }
	        System.out.print(a[n]);

}
}
