package lab1;
import java.util.Scanner;

public class Tema1 {
	


	    public static void main(String[] args) {

	        int n,nr1,nr2,suma,diferenta,min=0,max=0,distanta;
	        float media;
	        System.out.println("Introduceti cele 2 numere");
	        Scanner sc=new Scanner(System.in);
	        nr1=sc.nextInt();
	        nr2=sc.nextInt();

	        suma=nr1+nr2;
	        System.out.println("Suma dintre cele 2 numere este: "+suma);

	        diferenta=nr1-nr2;
	        System.out.println("Diferenta dintre cele 2 numere este: " +diferenta);

	        media=(float)(nr1+nr2)/2;
	        System.out.println("Media celor 2 numere este: "+media);

	         {
	             if(nr1>nr2) {
	                 max=nr1;
	                 min=nr2;
	                 distanta=nr1-nr2;
	                 }

	                 else {
	                     max=nr2;
	                     min=nr1;
	                     distanta=nr2-nr1;
	             }


	             }

	         System.out.println("Maximul dintre cele 2 numere este: "+max);
	         System.out.println("Minimul dintre cele 2 numere este: "+min);
	         System.out.println("Distanta dintre cele 2 numere este: "+distanta);
	         }



	}


