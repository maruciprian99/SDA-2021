package ex3;

public class PaymentMethod {
	
	private String type;
	
	public PaymentMethod(String type) {
		this.type = type;
	}	
	public String getType() {
		return "Metoda de plata:"+type;
	}
}