package ex3;

public class Customer {
	private Adress adress;
	private PaymentMethod paymentMethod;
	private String lastName;
	private String firstName;
	private int age;
	
	public Customer(Adress adress,PaymentMethod pm,String lName,String fName,int age) {
		
		this.adress=adress;
		this.paymentMethod=pm;
		this.lastName=lName;
		this.firstName=fName;
		this.age=age;
		
	}
	
      public Adress getAdress() {
		return adress;
	}


	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}


	public String getLastName() {
		return lastName;
	}


	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

	public String getCompleteName() {
		return "Nume complet:"+firstName + " "+lastName+"\nVarsta:"+age+" "+"ani";
	}

}