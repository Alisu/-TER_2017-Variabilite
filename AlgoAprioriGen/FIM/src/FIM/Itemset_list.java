package FIM;
import java.util.ArrayList;

public class Itemset_list {
	private ArrayList<ArrayList<Boolean>> matrice = new ArrayList<ArrayList<Boolean>>();
	private ArrayList<String>  features = new ArrayList<String>();
	private ArrayList<Concept>  concepts = new ArrayList<Concept>();

	public ArrayList<String> getFeatures() {
		return features;
	}

	public void setFeatures(ArrayList<String> features) {
		this.features = features;
	}

	public Itemset_list(){}

	public ArrayList<ArrayList<Boolean>> getMatrice() {
		return matrice;
	}

	public void setMatrice(ArrayList<ArrayList<Boolean>> matrice) {
		this.matrice = matrice;
	}

	public boolean isFrequent(String item, int minsup){
		int indice = features.indexOf(item);
		if(indice == -1){return false;}

		int cpt = 0;

		for(Boolean b : matrice.get(indice)){
			cpt += (b ? 1 : 0);
		}

		return cpt >= minsup;
	}

	public boolean frequentCombination(String item1, String item2, int minsup){
		int cpt = 0;

		int indice1 = features.indexOf(item1);
		int indice2 = features.indexOf(item2);
		if(indice1 == - 1 || indice2 == -1){return false;}

		ArrayList<Boolean> b = new ArrayList<Boolean>();
		//System.out.println(item1 + " " + item2);
		for(int i = 0; i < matrice.get(0).size(); i++){
			cpt += (matrice.get(indice1).get(i) == (matrice.get(indice2).get(i) == true) ? 1 : 0);
			b.add((matrice.get(indice1).get(i) == (matrice.get(indice2).get(i) == true) ? true : false));
		}

		if(cpt >= minsup){
			features.add(item1+item2);
			matrice.add(b);	
		}

		return cpt >= minsup;
	}

	public ArrayList<String> apriority(final ArrayList<String> base, int minsup, ArrayList<String> resultat, int niveau){ //génération des candidats
		int taille = resultat.size();

		for(int i = 0; i < resultat.size(); i++){
			String[] resultatLVL = resultat.get(i).split("");
			if(resultatLVL.length == niveau){
				String lastItem = resultatLVL[resultatLVL.length-1];
				for(int j = base.indexOf(lastItem)+1; j < base.size(); j++){
					if(frequentCombination(resultat.get(i), base.get(j), minsup)){
						resultat.add(resultat.get(i) +  base.get(j));
					}
					else{
						System.out.println("Mutex: "+resultat.get(i)+base.get(j)+" trouvé");
					}
				}
			}
		}

		return (taille == resultat.size() ? resultat : apriority(base, minsup, resultat, niveau+1));
	}

	public ArrayList<String> apriority(int minsup){
		Itemset_list apriority = new Itemset_list();       //itemlist
		ArrayList<String> base = new ArrayList<String>();  //base = les candidats simples ex: a b c
		ArrayList<String> resultat = new ArrayList<String>(); //base + combinaison
		for(int i = 0; i < features.size(); i++){  
			if(isFrequent(features.get(i), minsup)){ //si fréquent
				apriority.features.add(features.get(i)); //ajout dans itemset *à modifier*
				resultat.add(features.get(i)); //ajout dans le resultat *à modifier*
				base.add(features.get(i)); //ajout dans la base *à ne pas modifier*
			}
		}

		for(int i = 0; i < matrice.size(); i++){
			apriority.matrice.add(new ArrayList<Boolean>());
			for(int j = 0; j < matrice.get(i).size(); j++){
				apriority.matrice.get(i).add(matrice.get(i).get(j));
			}
		}

		return apriority.apriority(base, minsup, resultat, 1);
	}

	public ArrayList<String> maximaux(int minsup){
		ArrayList<String> frequents = apriority(minsup);
		ArrayList<String> maximaux = new ArrayList<String>();

		for(int i = 0; i < frequents.size(); i++){
			boolean contained = false;
			for(int j = i+1; j < frequents.size(); j++){
				if(frequents.get(i).length() < frequents.get(j).length()){
					String tab[] = frequents.get(i).split("");
					for(String s : tab){
						contained |= frequents.get(j).contains(s);
						//System.out.println(" on travaille avec " + frequents.get(i) + ". " + s + " est contenu dans " + frequents.get(j) + " ? " + contained);
					}
				}
			}
			if(!contained){
				maximaux.add(frequents.get(i));
			}
		}

		return maximaux;
	}

	public ArrayList<String> clos(int minsup){
		ArrayList<String> frequents = apriority(minsup);
		ArrayList<String> clos = new ArrayList<String>();

		for(int i = 0; i < frequents.size(); i++){
			boolean lowerFreq = false;
			for(int j = i+1; j < frequents.size(); j++){
				if(frequents.get(i).length() < frequents.get(j).length()){
					String tab[] = frequents.get(i).split("");
					for(String s : tab){
						matrice.get(j).indexOf(s);


						lowerFreq |= frequents.get(j).contains(s);
						//System.out.println(" on travaille avec " + frequents.get(i) + ". " + s + " est contenu dans " + frequents.get(j) + " ? " + contained);
					}
				}
			}
			if(!lowerFreq){
				clos.add(frequents.get(i));
			}
		}

		return clos;
	}

}
