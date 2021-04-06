package ex3;

public class Ex3 {
	
		public static void main(String[] args) {
			Adress address=new Adress("Brasov","Saturn",41);
			PaymentMethod pm= new PaymentMethod("cash");
			Customer c = new Customer(address, pm, "Maru", "Ciprian", 22);
			
			System.out.println(c.getCompleteName());	
			System.out.println(c.getAdress().getFullAdress());		
			System.out.println(c.getPaymentMethod().getType());
				}
		}