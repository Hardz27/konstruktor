public class Club extends SerieA{

	public int assetUang;

	public Club(String team, int assetUang){
		super(team);
		this.assetUang = assetUang;
	}
	public Club(String team){
		super(team);
	}
	public void showAsset(){
		System.out.println("Asset tersisa = " + assetUang);
	}
}