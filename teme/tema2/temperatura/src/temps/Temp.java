package temps;

public class Temp {

	public static void main(String[] args) {
		
		
		double arr[] = {36.5 , 36.3 , 36.9 , 37.1 , 38.5};
		int n=arr.length;
		System.out.print("Temperaturi anormale:");
		for(int i=0;i<n;i++)
		{
			if(arr[i]>37)
				 System.out.print( "("+arr[i] +"," +i + ")" + " ; ");
		}
		System.out.println();
		System.out.print("Temperaturi normale: ");
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]<37)
				 System.out.print( "("+arr[i] +"," +i + ")" + " ; ");
		}
	}
}