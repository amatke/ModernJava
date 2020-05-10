package defaults;

public interface Interface4 {

	default void methodA() {
		System.out.println("methodA() from " + Interface4.class);
	}
}
