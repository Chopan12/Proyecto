import java.util.ArrayList;
public class Congreso {
	private ArrayList<Charla> charlas = new ArrayList<Charla>();
	
	public Congreso() {
		this.charlas=new ArrayList<Charla>();
	}
	public Congreso(Charla charla) {
		charlas.add(charla);
	}
	
}
