package lambdas;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		
		// Legacy Java (until Java7 7)
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("1. Inside runnable - Legacy Java");
			}
		};
		new Thread(runnable).start();
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("2. Inside runnable - Legacy Java");
			}
		}).start();
		
		
		
		// Lambda Java 8
		Runnable runnableLambda = () -> { System.out.println("3. Inside runnableLambda - Java 8"); };
		new Thread(runnableLambda).start();
		
		
		new Thread(() -> {System.out.println("4. Inside runnableLambda - java 8");}).start();
		
	}
}
