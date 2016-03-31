package Calculate_Rate;
public class Main {
	private Main() {
		
	}
	public static void main(String[] args){
		TotalRate totalrate;
		logger.log("Type : ");
		Scanner input = new Scanner(System.in);
		String type = input.nextLine();
		logger.log("Line : ");
		int line = input.nextInt();
		logger.log("Minutes : ");
		double minutes = input.nextDouble();
			
		User user1 = new User(type, line, minutes);
		totalrate = new TotalRate(user1);
		logger.log(totalrate.getTotalrate());
	}		
}
