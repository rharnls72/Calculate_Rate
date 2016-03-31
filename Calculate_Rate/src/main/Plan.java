public class Plan {
	private double excessminute_rate;
	private double includedMinutes;
	private double additional_rate;
	private double planrate;
	Gold gold;
	Silver silver;
	public Plan(User user){
	}
	public double getExcessminute_rate() {
		return excessminute_rate; //추가시간에대한 요금
	}
	public double getIncludedMinutes() {
		return includedMinutes; //기본시간
	}
	public double getAdditional_rate() {
		return additional_rate;
	}
	public double getPlanrate() {
		return planrate;
	}
	
