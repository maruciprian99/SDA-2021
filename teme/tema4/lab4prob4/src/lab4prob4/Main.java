package lab4prob4;

import java.util.*;
import java.io.*;

public class Main {
	public static class hexa {
		private int id;
		private String hexa;
		
		public hexa(int id , String hexa) {
			this.id = id;
			this.hexa = hexa;
		}
		public int getID() {
			return id;
		}
		public String getHexa() {
			return hexa;
		}
	}
	public static void main(String[] args) throws IllegalArgumentException {

		Scanner x = new Scanner(System.in);
		ArrayList<String> hexa = new ArrayList<String>();
		List<hexa> a = new ArrayList<hexa>();
		
		List<Shape> shape = new ArrayList<>();
		

		System.out.print("Manual(m) or automat(a) : ");
		String y = x.nextLine();
		switch (y) {
		case "a":
			try {
				shape.add(new Circle("#cc3FFF", 5, 5));	
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			try {
				shape.add(new Square("#FFcc5d", 5, 5));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			try {
				shape.add(new Rectangle("#FFcc5d", 5, 5, 10));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			for (Shape s : shape) {
				System.out.println("Details :" + s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
						+ s.getHexFillColor());
				s.draw();
				System.out.println();
			}
			break;
		case "m":
			System.out.println("Rectangle(r) | Circle(c) | Square(s)");
	           
            String z = x.nextLine();
            switch (z) {
            case "r":
            {
                System.out.println("FillColor:");
                String q = x.next();
            	System.out.println("Introduceti BorderWidth:");
            	int BorderWidth= x.nextInt();
            	System.out.println("Introduceti height:");
            	int height =x.nextInt();
                System.out.println("Introduceti width:");
                int width =x.nextInt();
                shape.add(new Rectangle(q,BorderWidth,height,width));
                for (Shape s : shape) {
                    System.out.println("Details :" + s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"+s.getHexFillColor());
                    s.draw();
                    System.out.println();
                }break;
            }
               
          case "c":
          {
               System.out.println("FillColor:");
               String w=x.next();
               System.out.println("Introduceti BorderWidth:");
               int BorderWidth=x.nextInt();
               System.out.println("Introduceti raza:");
               int radius=x.nextInt();
               shape.add(new Circle(w,BorderWidth,radius));
               for (Shape s : shape) {
                   System.out.println("Details :" + s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"+s.getHexFillColor());
                   s.draw();
                   System.out.println();
                  
               }break;
          }
        
            case "s":
            {
            	 System.out.println("FillColor:");
                 String e=x.next();
                 System.out.println("Introduceti BorderWidth:");
                 int BorderWidth=x.nextInt();
                 System.out.println("Introduceti dimensiunea:");
                 int size=x.nextInt();
                 shape.add(new Square(e,BorderWidth,size));
                 for (Shape s : shape) {
                     System.out.println("Details :" + s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"+s.getHexFillColor());
                     s.draw();
                     System.out.println();
                 }
                break;

			}
		}
		}
	
		List<String> colors = new ArrayList<>();
        for(Shape s: shape) {
            colors.add(s.getHexFillColor());
        }
        System.out.println("List - colors: " + colors);

        Set<String> mySet = new HashSet<String>(colors);
        for(String s: mySet){
            System.out.println("Culoarea "+ s + " este intalnita de: " + Collections.frequency(colors,s)+ " ori");
        }
		
	}
	
}
