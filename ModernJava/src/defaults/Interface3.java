package defaults;

public interface Interface3 extends Interface2{

	default void methodC() {
		System.out.println("methodC() from " + Interface3.class);
	}
}
