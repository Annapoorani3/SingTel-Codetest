package Solution1;

public abstract class Animal {

String gender;
	
	Animal() {
		this.gender = null;
	}


	Animal(String gender){
		
		if (gender == "F") 
			this.gender = "F" ;
		else if( gender == "M")
			this.gender = "M";
		else
			this.gender = null;
	
}
	
	



	String getGender() {
		if( this.gender != null )
			return this.gender;
		else
			return null;
}
	
	abstract boolean walk();
	abstract boolean swim();
	abstract boolean sing();
	abstract boolean fly();





}
