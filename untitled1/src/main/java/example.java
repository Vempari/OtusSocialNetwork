public class example {

	public static void main(String args[]) {
		System.out.println("Hello! I can decode! Bye!");
	}

	public static void decode(char symbol) {
		switch (symbol) {
			case 'h':
				System.out.print("Hello");

			case 'i':
				System.out.print("I can decode!");
			case 'm':
				System.out.print("I can decode!");
			case 'k':
				System.out.print("I can decode!");
			case 'b':
				System.out.print("Bye!");
			default:
				System.out.print("I don’t know this symbols:(");


		}
	}
}