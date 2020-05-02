package Solution3;

public abstract class Animal {
	String gender;
	
	Animal() {
		this.gender = null;
	}


	void walk() {

		System.out.println("I am walking");
	}

	String getGender() {
		if( this.gender != null )
			return this.gender;
		else
			return null;
	}
		
	void setGender(String gender) {
		if (gender == "F") 
			this.gender = "F" ;
		else if( gender == "M")
			this.gender = "M";
		else
			this.gender = null;
		
	}


	protected abstract void sing();
}




