package Solution1;

public class Chicken extends Bird {
	
	boolean swim() { return false; }
	boolean fly() { return false ; }

		boolean sing() {
			if(this.gender == "F")
				System.out.println("Cluck Cluck");
			else if (this.gender == "M")
				System.out.println("Cock-a-doodle-doo");
			return true;


}}
