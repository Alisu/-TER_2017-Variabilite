package FIM;
import java.util.Vector;
public class ECFD {

	private ConceptLattice lattice;
	
	private Vector<NodeLattice> mutex = new Vector<NodeLattice>();
	private Vector<NodeLattice> groupe = new Vector<NodeLattice>();
	
	private Vector<NodeLattice> groupeOr = new Vector<NodeLattice>();
	private Vector<NodeLattice> groupeXor = new Vector<NodeLattice>();
	
	public ECFD(){
		lattice = new ConceptLattice();
	}
	
	public ECFD(String FileName){
		lattice = new ConceptLattice(FileName);	
	}

	public Vector<NodeLattice> InfrequentMining(){
		Vector<NodeLattice> resultat = new Vector<NodeLattice>();
		int start=0;
		int fin=0;
		for(int i=0; i<lattice.getFeatures().size(); i++){

			if(i==0){ 							// 1er tour

				start=resultat.size();
				for(int g=0; g<lattice.getFeatures().size(); g++){
					Vector<Feature> temp = new Vector<Feature>();
					temp.add(lattice.getFeatures().elementAt(g));
					NodeLattice ajout  = new NodeLattice(temp, temp.size());
					int nl=0;
					while(nl<lattice.getLattice().size() && !EgalFeature(lattice.getLattice().elementAt(nl).getFeatures(),ajout.getFeatures())){
						nl++;
					}
					if(nl==lattice.getLattice().size()){
						mutex.add(ajout);
					}
					else{
						resultat.add(ajout);
					}
					fin=resultat.size();
				}
			}
			else{								// ensuite	
				for(int k=start; k<fin; k++){

					for(int j=lattice.getFeatures().indexOf(resultat.elementAt(k).getFeatures().lastElement())+1; j<lattice.getFeatures().size();j++){

						Vector<Feature> temp = new Vector<Feature>();
						temp=(Vector<Feature>) resultat.elementAt(k).getFeatures().clone(); 
						temp.add(lattice.getFeatures().elementAt(j));

						boolean test = true;
						for(NodeLattice testMutex : mutex){
							if(isSub(testMutex.getFeatures(),temp)){
								test=false;
								break;
							}
						}

						if(test){
							NodeLattice ajout  = new NodeLattice(temp, temp.size());
							int nl=0;
							while(nl<lattice.getLattice().size() && !EgalFeature(lattice.getLattice().elementAt(nl).getFeatures(),ajout.getFeatures())){
								nl++;
							}
							if(nl==lattice.getLattice().size()){
								mutex.add(ajout);
							}
							else{
								resultat.add(ajout);
							}
						}

					}
				}
				start=fin;
				fin=resultat.size();
			}
		}
		return mutex;
	}

	public void ConceptUnion(Vector<NodeLattice> base, NodeLattice node){  //Potentiellement inutile si on récupère les unions  au lieu des intersections à la création

		if(!node.isUni()){
			if(node.getSize()>1){
				for(Feature f : node.getFeatures()){
					Vector<Feature> temp = new Vector<Feature>();
					temp.add(f);
					for(NodeLattice test : base){
						if(temp.equals(test.getFeatures())){//test si la feature  appartient au node
							for(Concept c : test.getConcepts()){
								if(!node.getConcepts().contains(c)){ //test si le node ne possède pas déjà le concept
									node.getConcepts().add(c);
								}
							}
						}
					}
				}
			}
		}
	}

	public boolean isSub(Vector<Feature> a, Vector<Feature> b){
		boolean resultat=false;
		int cpt=0;
		for(Feature fa : a){
			for(Feature fb : b){
				if(fa.equals(fb)){
					cpt++;
					break;
				}
			}
			if(cpt==a.size()){
				resultat=true;
			}
		}
		return resultat;
	}
	
	public boolean EgalFeature(Vector<Feature> a, Vector<Feature> b){
		boolean resultat = false;
		if(a.size()==b.size() && isSub(a,b)){
			resultat = true;
		}
		return resultat;
	}
	
	public boolean Egaux(Vector<Concept> a, Vector<Concept> b){
		boolean resultat = false;
		if(a.size()==b.size()){
			int cpt=0;
			for(Concept fa : a){
				for(Concept fb : b){
					if(fa.equals(fb)){
						cpt++;
						break;
					}
				}
				if(cpt==a.size()){
					resultat=true;
				}
			}
		}
		return resultat;
	}
	
	public boolean doublonC(Vector<NodeLattice> v, NodeLattice n){
		boolean resultat =false;
		for(NodeLattice nl : v){
			if(Egaux(nl.getConcepts(),n.getConcepts())){
				resultat=true;
				break;
			}
		}
		return resultat;
	}
	
	public Vector<NodeLattice> GroupeMining(){
		//Gènere la base pour faire les unions
		Vector<NodeLattice> base = new Vector<NodeLattice>();
		Vector<NodeLattice> unionTest = new Vector<NodeLattice>();
		Vector<NodeLattice> peres = new Vector<NodeLattice>();

		for(NodeLattice nl : lattice.getLattice()){		
			if(nl.getSize()==1 && !doublonC(base,nl)){
				base.add(nl);
				unionTest.add(nl);
			}
		}
		//afficheLattice(unionTest);

		//Ajout des mutex ds la lattice
		for(NodeLattice m : mutex){
			lattice.getLattice().add(m);
		}

		//Group mining

		for(int i=0;i<lattice.getMax(); i++){
			Vector<NodeLattice> newBase = new Vector<NodeLattice>();
			for(NodeLattice node : base){
				for(NodeLattice nltest : lattice.getLattice()){
					
					boolean prune=false;  		
					for(NodeLattice papa : peres){//regarde si déjà le pere d'un groupe
						if(isSub(papa.getFeatures(), nltest.getFeatures())){
							prune=true;
							break;
						}
					}

					if(!prune){
						if(nltest.getSize()==i+2 && !isSub(node.getFeatures(),nltest.getFeatures())){ // si le surgroupe est bien de taille ++ et que le surgroupe ne contient pas le sousgroupe
							ConceptUnion(unionTest, nltest);
							if(Egaux(node.getConcepts(),nltest.getConcepts())){
								nltest.setPapa(node);
								peres.add(node);
								groupe.add(nltest);
								//newBase.add(nltest);

							}else{
								if(!doublonC(newBase, nltest)){
									newBase.add(nltest);
								}
							}
						}
					}
				}
			}
			//afficheLattice(newBase);
			base=newBase;
			//System.out.println("Nouveau tour");
		}
		return groupe;
	}
	
	public void GroupeDetermination(){
		for(NodeLattice nlGroupe : groupe){
			boolean xor= false;
			for(NodeLattice nlMutex : mutex){
				if(EgalFeature(nlGroupe.getFeatures(), nlMutex.getFeatures())){
					xor=true;
					break;
					//Enlever du groupe mutex aussi ?
				}
				else{
					xor=false;
				}
			}
			if(xor){
				groupeXor.add(nlGroupe);
			}
			else{
				groupeOr.add(nlGroupe);
			}
		}	
	}
	
	public void afficheLattice(Vector<NodeLattice> v){
		for(NodeLattice n : v){
			System.out.println(n);
		}
		System.out.println("");
	}
	
	public ConceptLattice getLattice() {
		return lattice;
	}

	public void setLattice(ConceptLattice lattice) {
		this.lattice = lattice;
	}

	public Vector<NodeLattice> getMutex() {
		return mutex;
	}

	public void setMutex(Vector<NodeLattice> mutex) {
		this.mutex = mutex;
	}

	public Vector<NodeLattice> getGroupe() {
		return groupe;
	}

	public void setGroupe(Vector<NodeLattice> groupe) {
		this.groupe = groupe;
	}

	public Vector<NodeLattice> getGroupeOr() {
		return groupeOr;
	}

	public void setGroupeOr(Vector<NodeLattice> groupeOr) {
		this.groupeOr = groupeOr;
	}

	public Vector<NodeLattice> getGroupeXor() {
		return groupeXor;
	}

	public void setGroupeXor(Vector<NodeLattice> groupeXor) {
		this.groupeXor = groupeXor;
	}
}
