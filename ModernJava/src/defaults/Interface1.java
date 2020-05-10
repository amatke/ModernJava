package defaults;

public interface Interface1 {

	default void methodA() {
		System.out.println("methodA() from " + Interface1.class);
	}
}
