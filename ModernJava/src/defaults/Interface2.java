package defaults;

public interface Interface2 extends Interface1{

	default void methodB() {
		System.out.println("methodB() from " + Interface2.class);
	}
	
	
	default void methodA() {
		System.err.println("methodA() from : " + Interface2.class);
	}
}
