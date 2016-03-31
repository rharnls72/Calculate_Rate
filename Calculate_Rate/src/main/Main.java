public class Main {
	public static void main(String[] args){
		TotalRate totalrate;
		System.err.print("Type : ");
		Scanner input = new Scanner(System.in);
		String type = input.nextLine();
		System.err.print("Line : ");
		int line = input.nextInt();
		System.err.print("Minutes : ");
		double minutes = input.nextDouble();
			
		User user1 = new User(type, line, minutes);
		totalrate = new TotalRate(user1);
		System.err.println(totalrate.getTotalrate());
	}		
}
