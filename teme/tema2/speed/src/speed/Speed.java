package speed;

import java.util.Scanner;


public class Speed {
	
	    public static void main (String[]args) {
	        Scanner x = new Scanner(System.in);
	       
	        
	        System.out.println("Alegeti:oras/zona-rezidentiala/drum-expres/autostrada");
	        String var = x.next();
	        System.out.println("Varianta 1 if else:" +speed1(var));
	        System.out.println("Varianta 2 switch:" +speed2(var));
	        System.out.println("Varianta 3 if:" +speed3(var));
	    }

	    public static int speed1(String opt) {
	        if (opt.equalsIgnoreCase("oras")) {
	            return 50;
	        }
	        else{
	        	if (opt.equalsIgnoreCase("zona-rezidentiala")) {        	
	            return 30;
	        	}
	        else {
	        	if (opt.equalsIgnoreCase("drum-expres")) {
	            return 100;}
	        else { 
	        	if (opt.equalsIgnoreCase("autostrada")) {
	            return 130;}
	        else 
	        {return 0; 
	    }}}}	    
	    }        
	        public static int speed2(String opt) {
	    
	    	switch(opt) {
	        case "oras":
	            return 50;
	        case "zona-rezidentiala":
	            return 30;
	        case "drum-expres":
	            return 100;
	        case "autostrada":
	            return 130 ;
	        }
	        return 0;
	    }
	    public static int speed3(String opt) {
	        if(opt.equalsIgnoreCase("oras")) {
	            return 50 ;}
	        if(opt.equalsIgnoreCase("zona-rezidentiala")) {
	            return 30 ;}
	        if(opt.equalsIgnoreCase("drum-expres")) {
	            return 100 ;}
	        if(opt.equalsIgnoreCase("autostrada")) {
	            return 130 ;}


	        return 0;
	    }

	}
	
	
	