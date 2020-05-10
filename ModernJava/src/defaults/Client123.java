package defaults;

public class Client123 implements Interface1, Interface2, Interface3{
	
	@Override
	public void methodB() {
		System.err.println("Overriden methodB() from : " + Client123.class);
	}

	public static void main(String[] args) {
		
		Client123 client123 = new Client123();
		
		client123.methodA();
		client123.methodB();
		client123.methodC();
	}

}
