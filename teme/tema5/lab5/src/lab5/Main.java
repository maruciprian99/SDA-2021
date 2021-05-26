package lab5;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {

	        StudentDetails student1 = new StudentDetails("Maru", "Ciprian", 9, 10);
	        StudentDetails student2 = new StudentDetails("Vralic", "Radu", 2, 9);
	        StudentDetails student3 = new StudentDetails("Alexandri", "Velea", 5, 10);
	        StudentDetails student4 = new StudentDetails("Cristian", "Popescu", 7, 3.5);
	        StudentDetails student5 = new StudentDetails("Ionesci", "George", 9, 9);
	        StudentDetails student6 = new StudentDetails("Alexandra", "Popa", 1, 6.5);
	        StudentDetails student7 = new StudentDetails("Theo", "Patratanu", 5, 5);
	        StudentDetails student8 = new StudentDetails("Rares", "Amar", 9, 10);
	        StudentDetails student9 = new StudentDetails("Raluca", "Olaru", 5.5, 6.5);
	        StudentDetails student10 = new StudentDetails("Stelian", "Tica", 6, 6);

	        // HashMap ( le afiseaza random)
	        HashMap<String, StudentDetails> studentList_HashMap = new HashMap<>();

	        studentList_HashMap.put("6", student1);
	        studentList_HashMap.put("22", student2);
	        studentList_HashMap.put("13", student3);
	        studentList_HashMap.put("34", student4);
	        studentList_HashMap.put("5", student5);
	        studentList_HashMap.put("1", student6);
	        studentList_HashMap.put("7", student7);
	        studentList_HashMap.put("8", student8);
	        studentList_HashMap.put("11", student9);
	        studentList_HashMap.put("10", student10);

	        // LinkedHashMap (metine ordinea pe care o inseram)
	        LinkedHashMap<String, StudentDetails> studentList_LinkedHashMap = new LinkedHashMap<>();

	        studentList_LinkedHashMap.put("6", student1);
	        studentList_LinkedHashMap.put("22", student2);
	        studentList_LinkedHashMap.put("13", student3);
	        studentList_LinkedHashMap.put("34", student4);
	        studentList_LinkedHashMap.put("5", student5);
	        studentList_LinkedHashMap.put("1", student6);
	        studentList_LinkedHashMap.put("7", student7);
	        studentList_LinkedHashMap.put("8", student8);
	        studentList_LinkedHashMap.put("11", student9);
	        studentList_LinkedHashMap.put("10", student10);

	        // inserare cnp pt cautare
	        Scanner scan = new Scanner(System.in);
	        String CNP = scan.nextLine();

	        //outputul pt hash
	        System.out.println(studentList_HashMap.get(CNP));

	        for (String key : studentList_HashMap.keySet()) {
	            System.out.println(key);
	        }

	        System.out.println();

	        //outup pentru linked
	        System.out.println(studentList_LinkedHashMap.get(CNP));

	        for (String key : studentList_LinkedHashMap.keySet()) {
	            System.out.println(key);
	        }

	        scan.close();

	    }
}
