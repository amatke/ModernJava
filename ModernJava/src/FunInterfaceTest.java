
@FunctionalInterface
interface MyFunctionalInterface {

	void m1();
					// @FunctionalInterface moze da ima samo jednu abstract metodu
	//void m12(); //Invalid '@FunctionalInterface' annotation; MyFunctionalInterface is not a functional interface

	
	default void  m2() {
		System.out.println("default method implementation m2");
	}
	
	default void  m3() {
		System.out.println("default method implementation m3");
	}
}



public class FunInterfaceTest  {

	public static void main(String[] args) {
		
		MyFunctionalInterface mfi = () -> System.out.println("Lambda implementacije m1");
		mfi.m1();
		
		mfi.m2();
		mfi.m3();
			
	}
}
