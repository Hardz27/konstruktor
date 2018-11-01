public class Main{
	public static void main(String[] args) {
		Club J = new Club("Juventus",1000000);
		J.getTeam();
		J.showAsset();

		System.out.println();

		Club RM = new Club("Real Madrid");
		RM.getTeam();
		RM.showAsset();
	}
}