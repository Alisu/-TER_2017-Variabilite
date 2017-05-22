package FIM;

public class Feature {
	
	private String name;
	
	public Feature(){}
	
	public Feature(String n){
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
		return "Feature [name=" + name + "]";
	}
	
	
}
