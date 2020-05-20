package interfaceConcept;

public class Developing implements BankingClient{

	public static void main(String[] args) {
		Developing d = new Developing();
		
		d.payCreditCard();
		d.transferBalance();
		d.checkingBalance();
		d.login();
		
		
	}
	@Override
	public void payCreditCard() {
		// TODO Auto-generated method stub
		System.out.println("Pay Credit Card implemented");
		
	}

	@Override
	public void transferBalance() {
		// TODO Auto-generated method stub
		System.out.println("Transfer Balance implemented");
	}

	@Override
	public void checkingBalance() {
		// TODO Auto-generated method stub
		System.out.println("Checking Balance implemented");
	}

	public void login() {
		System.out.println("Logged in");
	}
}
