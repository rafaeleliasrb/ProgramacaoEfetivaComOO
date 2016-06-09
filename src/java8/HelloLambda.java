package java8;

public class HelloLambda {

	public interface HelloType {
		public void sayHello(String name);
	}
	
	public static void main(String[] args) {
		HelloType english = (text) -> {
			System.out.println("Hello, " + text);
		};
		
		HelloType portuguese = (text) -> {
			System.out.println("Olá, " + text);
		};
		
		HelloLambda lambda = new HelloLambda();
		lambda.greeting(portuguese, "Ceju");
		lambda.greeting(english, "Ax");
		lambda.greeting(new HelloType() {
			@Override
			public void sayHello(String name) {
				System.out.println("Hi, " + name);
			}
		}, "Phafael");
	}
	
	public void greeting(HelloType helloType, String name) {
		helloType.sayHello(name);
	}
}
