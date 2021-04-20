package shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IllegalArgumentException {
		List<Shape> shape = new ArrayList<>();
	
		Scanner x = new Scanner(System.in);
		System.out.println("Introduceti a sau m:");
		String y = x.nextLine();
		
        switch (y) {
        case "a":
        	try {
    			shape.add(new Circle("#1111", 3, 3));
    		} catch (IllegalArgumentException e) {
    			System.out.println(e.getMessage());
    		}
    		try {
    			shape.add(new Square("#1111", 7, 7));
    		} catch (IllegalArgumentException e) {
    			System.out.println(e.getMessage());
    		}
    		try {
    			shape.add(new Rectangle("#1111", 2, 3, 8));
    		} catch (IllegalArgumentException e) {
    			System.out.println(e.getMessage());
    		}
            for (Shape s : shape) {
                System.out.println("Details :" + s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,");
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
                    System.out.println("Details :" + s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"+s.getHexFillCollor());
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
                   System.out.println("Details :" + s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"+s.getHexFillCollor());
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
                     System.out.println("Details :" + s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"+s.getHexFillCollor());
                     s.draw();
                     System.out.println();
                 }
                break;
            }
            }
        }

	}
}
	
	
	
	


