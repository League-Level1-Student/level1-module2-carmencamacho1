
public class Minion {
	String name;
	int eyes;
	String color;
	String master;
	Minion ( String name, int eyes, String color, String master){
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	public String getName () {
		return this.name;
	}
	public int getEyes() {
		return this.eyes;
	}
	public String getColor() {
		return this.color;
	}
	public String getMaster() {
		return this.master;
	}
	public void setName (String bob) {
		this.name = bob;
	}
	public void setEyes (int rick) {
		this.eyes = rick;
	}
	public void setColor (String matt) {
		this.color = matt;
	}
	public void setMaster (String dave) {
		this.master = dave;
	}
	
	
}
