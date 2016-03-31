public class Plan {
	private double excessminute_rate;
	private double includedMinutes;
	private double additional_rate;
	private double planrate;
	Gold gold;
	Silver silver;
	public Plan(User user){
		if(user.getType().equals("GOLD")){
			gold = new Gold();
			this.excessminute_rate = gold.getExcessminute_rate();
			this.includedMinutes = gold.getIncludedMinutes();
			this.additional_rate = gold.getAdditional_rate();
			this.planrate = gold.getPlanrate();
		}else if(user.getType().equals("SILVER")){
			silver = new Silver();
			this.excessminute_rate = silver.getExcessminute_rate();
			this.includedMinutes = silver.getIncludedMinutes();
			this.additional_rate = silver.getAdditional_rate();
			this.planrate = silver.getPlanrate();
		}
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
}	
