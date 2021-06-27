package methodextraction;

public class FootballPlayer {

	private String name = "";
	private double[] fourtyYardDashTimes = null;
	
	public FootballPlayer(String name, double[] fourtyYardDashTimes) {
		super();
		this.name = name;
		this.fourtyYardDashTimes = fourtyYardDashTimes;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double[] get40YardDashTimes() {
		return fourtyYardDashTimes;
	}
	public void setFourtyYardDashTimes(double[] fourtyYardDashTimes) {
		this.fourtyYardDashTimes = fourtyYardDashTimes;
	}
	
	
}
