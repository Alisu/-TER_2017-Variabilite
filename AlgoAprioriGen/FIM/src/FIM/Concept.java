package FIM;

public class Concept {
	private String name;
	
	public Concept(){}
	
	public Concept(String n){
		name=n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name=n;
	}

	@Override
	public String toString() {
		return "Concept [name=" + name + "]";
	}
}
