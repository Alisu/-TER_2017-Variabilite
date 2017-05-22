import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {

	private ArrayList<String> features;
	private ArrayList<String> concepts;
	private ArrayList<ArrayList<Boolean>> matrix;
	
	public Parser(){
		features = new ArrayList<String>();
		concepts = new ArrayList<String>();
		matrix = new ArrayList<ArrayList<Boolean>>();
	}
	
	public ArrayList<String> getFeatures(){
		return features;
	}

	public void setFeatures(ArrayList<String> features) {
		this.features = features;
	}
	
	public void addFeature(String feature){
		features.add(feature);
	}
	
	public ArrayList<String> getConcepts() {
		return concepts;
	}

	public void setConcepts(ArrayList<String> concepts) {
		this.concepts = concepts;
	}
	
	public void addConcept(String concept){
		concepts.add(concept);
	}
	
	public ArrayList<ArrayList<Boolean>> getMatrix() {
		return matrix;
	}

	public void setMatrix(ArrayList<ArrayList<Boolean>> matrix) {
		this.matrix = matrix;
	}

	public String toString(){
		
		String s = new String();
		s+="|";
		for(int i=0; i<features.size() ; i++){
			s += features.get(i)+"|";
		}
		s+="\n";
		for(int j=0; j<matrix.size();j++){
			s+="|"+ concepts.get(j) + "|";
			for(int i=0 ; i < matrix.get(0).size(); i++){
				if(matrix.get(j).get(i))
					s+="x|";
				else
					s+="|";
			}
			s+='\n';
		}
		return s;
	}
	
	
	public void parseRCFTtoContext(String fileName) throws IOException {
		
		java.io.File file = new java.io.File(fileName);
		Scanner scan = new Scanner(file);
		
		//Reading and adding features to the list
		String line = scan.nextLine();
		line = scan.nextLine();
		String[] lineSplitted = line.split("\\|");
		
		for (int i=2; i<lineSplitted.length; i++){
			//System.out.println("feature="+lineSplitted[i]+"*");
			features.add(lineSplitted[i]);
		}		
				
		//Reading the first element of each next line to add the concept to the list
		while (scan.hasNext())
		{	
			line = scan.nextLine();
			lineSplitted = line.split("\\|");
			concepts.add(lineSplitted[1]);
		}
		
		// reading the file again to fill the Boolean matrix
		scan.close();

		ArrayList<Boolean> blist;
		
		scan = new Scanner(file);
		//Skiping the first two lines (Context name + features)
		line = scan.nextLine();
		line = scan.nextLine();
		String s;
		while (scan.hasNext())
		{	
			s = new String();
			blist = new ArrayList<Boolean>();
			line = scan.nextLine();
			lineSplitted = line.split("\\|");
			s="|";
			for(int j=0 ; j<lineSplitted.length;j++){
				s+=lineSplitted[j]+"|";
			}
			System.out.println(lineSplitted.length);
			System.out.println(s);
			for (int i=0; i<features.size(); i++){
				if(lineSplitted.length<=i+2){
					blist.add(false);
				}
				else{
					blist.add(lineSplitted[i+2].equals("x"));
				}
			}	
			/*String s1 = "|";
			for(int i=0 ; i < blist.size() ; i++){
				s1+=blist.get(i)+"|";
			}
			System.out.println(s1);*/
			matrix.add(blist);
		}
		scan.close();			
	}
	
	
}
