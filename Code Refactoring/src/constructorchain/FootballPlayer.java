package constructorchain;

//Demonstrate the Creation Method replacement of Constructors

public class FootballPlayer {
	
	private double passerRating; // Specific to QBs
	private int rushingYards; // Specific to RBs & QBs
	private int receivingYards; // Specific to RBs & WRs 
	private int totalTackles; // Specific to DEF
	private int interceptions; // Specific to DEF
	private int fieldGoals; // Specific to Kickers
	private double avgPunt; // Specific to Punters
	private double avgKickoffReturn; // Specific to Special Teams
	private double avgPuntReturn; // Specific to Special Teams
	
	private FootballPlayer(double passerRating, int rushingYards,
			int receivingYards, int totalTackles, int interceptions,
			int fieldGoals, double avgPunt, double avgKickoffReturn,
			double avgPuntReturn){
		
		this.passerRating = passerRating;
		this.rushingYards = rushingYards;
		this.receivingYards = receivingYards;
		this.totalTackles = totalTackles;
		this.interceptions = interceptions;
		this.fieldGoals = fieldGoals;
		this.avgPunt = avgPunt;
		this.avgKickoffReturn = avgKickoffReturn;
		this.avgPuntReturn = avgPuntReturn;
		
	}
		
	public static FootballPlayer createQB(double passerRating, int rushingYards){
		
		return new FootballPlayer(passerRating, rushingYards, 0, 0, 0, 0, 0.0,
				0.0, 0.0); 
		
	}
	
	public static FootballPlayer createWR(int rushingYards, int receivingYards){
		
		return new FootballPlayer(0, rushingYards, receivingYards, 0, 0, 0, 0.0,
				0.0, 0.0); 
		
	}
	
	public static FootballPlayer createKicker(int fieldGoals, double avgPunt){
		
		return new FootballPlayer(0, 0, 0, 0, 0, 38, 37.8,
				0.0, 0.0); 
		
	}
	
	public int getRushingYards() {
		return rushingYards;
	}

	public int getReceivingYards() {
		return receivingYards;
	}

	public int getTotalTackles() {
		return totalTackles;
	}

	public int getInterceptions() {
		return interceptions;
	}

	public int getFieldGoals() {
		return fieldGoals;
	}

	public double getAvgPunt() {
		return avgPunt;
	}

	public double getAvgKickoffReturn() {
		return avgKickoffReturn;
	}

	public double getAvgPuntReturn() {
		return avgPuntReturn;
	}
	
	public double getPasserRating() {
		return passerRating; 
	}
	
	public static void main(String[] args){
		
		FootballPlayer aaronRodgers = FootballPlayer.createQB(108.0, 259);
		
		FootballPlayer calvinJohnson = FootballPlayer.createWR(11, 1964);
		
		FootballPlayer sebastianJanikowski = FootballPlayer.createKicker(31, 33.0);
		
		System.out.println("Aaron Rodgers Passer Rating: " + aaronRodgers.getPasserRating());
		
	}

}