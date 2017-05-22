package FIM;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class ConceptLattice {

	private Vector<Feature>  features;
	private Vector<Concept>  concepts;
	private Vector<Vector<Boolean>> matrice;
	private Vector<NodeLattice> lattice;
	private int max;
	
	public ConceptLattice(){ //test par défaut
		
		matrice = new Vector<Vector<Boolean>>();
		
		Vector<Boolean> c1 = new Vector<Boolean>();
		c1.add(true);
		c1.add(false);
		c1.add(true);
		c1.add(true);
		
		Vector<Boolean> c2 = new Vector<Boolean>();
		c2.add(false);
		c2.add(true);
		c2.add(true);
		c2.add(true);
		
		Vector<Boolean> c3 = new Vector<Boolean>();
		c3.add(true);
		c3.add(false);
		c3.add(false);
		c3.add(true);
		
		matrice.add(c1);
		matrice.add(c2);
		matrice.add(c3);
		
		features= new Vector<Feature>();
		
		Feature a = new Feature("A");
		Feature b = new Feature("B");
		Feature c = new Feature("C");
		Feature p = new Feature("P");
		features.add(a);
		features.add(b);
		features.add(c);
		features.add(p);
		
		concepts = new Vector<Concept>();
		
		Concept c11 = new Concept("C1");
		Concept c21 = new Concept("C2");
		Concept c31 = new Concept("C3");
		concepts.add(c11);
		concepts.add(c21);
		concepts.add(c31);
		
		lattice=LatticeBuilder();
		
	}
	
	public ConceptLattice(String fileName){// build a lattice from a RCFT file
		matrice = new Vector<Vector<Boolean>>();
		features= new Vector<Feature>();
		concepts = new Vector<Concept>();
		try {
			parseRCFTtoContext(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lattice=LatticeBuilder();	
	}
	
	public Vector<NodeLattice> LatticeBuilder(){ //build la lattice
		lattice = new Vector<NodeLattice>();
		for(int j=0; j<matrice.size(); j++){

			Concept conceptTemp = concepts.elementAt(j); // récupère le concept
			Vector<Feature> testEga = new Vector<Feature>();

			for(int i=0; i<matrice.elementAt(j).size(); i++){

				if(matrice.elementAt(j).elementAt(i)){
					Feature featureTemp = features.elementAt(i);	//recupère les features
					testEga.add(featureTemp);
				}
			}
			max=testEga.size();
			//génère les candidats 
			Vector<Vector<Feature>> candidats = GenererCandidat(testEga);
		
			//Créer les candidats s'il n'existe pas déjà
			for(Vector<Feature> candidat : candidats){
				boolean creer=true;
				for(NodeLattice node : lattice){
					if(candidat.equals(node.getFeatures())){
						node.setConcept(concepts.elementAt(j));
						creer=false;
						break;
					}
					else{
						creer=true;
					}
				}
				if(creer){
				NodeLattice ajout  = new NodeLattice(candidat, concepts.elementAt(j),candidat.size());
				lattice.add(ajout);
				}
			}
		}
		return lattice;		
	}

	public Vector<Vector<Feature>> GenererCandidat(Vector<Feature> f){
		Vector<Vector<Feature>> resultat = new Vector<Vector<Feature>>();
		int start=0;
		int fin=0;
		for(int i=0; i<f.size(); i++){
			
			if(i==0){ 							// 1er tour
				start=resultat.size();
				for(int g=0; g<f.size(); g++){
					Vector<Feature> temp = new Vector<Feature>();
					temp.add(f.elementAt(g));
					resultat.add(temp);
				}
				fin=resultat.size();
			}
			else{								// ensuite	
				for(int k=start; k<fin; k++){
					
					for(int j=f.indexOf(resultat.elementAt(k).lastElement())+1; j<f.size();j++){
						
						Vector<Feature> temp = new Vector<Feature>();
						temp=(Vector<Feature>) resultat.elementAt(k).clone(); 
						temp.add(f.elementAt(j));
						resultat.add(temp);	
					}
				}
				start=fin;
				fin=resultat.size();
			}
		}
		return resultat;
	}

	public Vector<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(Vector<Feature> features) {
		this.features = features;
	}
	public Vector<Concept> getConcepts() {
		return concepts;
	}
	public void setConcepts(Vector<Concept> concepts) {
		this.concepts = concepts;
	}
	public Vector<Vector<Boolean>> getMatrice() {
		return matrice;
	}
	public void setMatrice(Vector<Vector<Boolean>> matrice) {
		this.matrice = matrice;
	}
	public Vector<NodeLattice> getLattice() {
		return lattice;
	}
	public void setLattice(Vector<NodeLattice> lattice) {
		this.lattice = lattice;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
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
			Feature f= new Feature(lineSplitted[i]);
			features.add(f);
		}		
				
		//Reading the first element of each next line to add the concept to the list
		while (scan.hasNext())
		{	
			line = scan.nextLine();
			lineSplitted = line.split("\\|");
			Concept c = new Concept(lineSplitted[1]);
			concepts.add(c);
		}
		
		// reading the file again to fill the Boolean matrix
		scan.close();

		Vector<Boolean> blist;
		
		scan = new Scanner(file);
		//Skiping the first two lines (Context name + features)
		line = scan.nextLine();
		line = scan.nextLine();
		String s;
		while (scan.hasNext())
		{	
			s = new String();
			blist = new Vector<Boolean>();
			line = scan.nextLine();
			lineSplitted = line.split("\\|");
			s="|";
			for(int j=0 ; j<lineSplitted.length;j++){
				s+=lineSplitted[j]+"|";
			}
			//System.out.println(lineSplitted.length);
			//System.out.println(s);
			for (int i=0; i<features.size(); i++){
				if(lineSplitted.length<=i+2){
					blist.add(false);
				}
				else{
					blist.add(lineSplitted[i+2].equals("x"));
				}
			}	
			matrice.add(blist);
		}
		scan.close();			
	}

}

