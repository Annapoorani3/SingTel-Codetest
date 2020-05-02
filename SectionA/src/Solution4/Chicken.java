package Solution4;

public class Chicken extends Bird {
	
	public Chicken() {
		this.gender = null;
		// TODO Auto-generated constructor stub
	}
	
	

	protected void sing() {
		if (this.gender == "F")
			System.out.println("Cluck Cluck");
		else if( this.gender == "M")
			System.out.println("Cock-a-doodle-doo");


}


}
