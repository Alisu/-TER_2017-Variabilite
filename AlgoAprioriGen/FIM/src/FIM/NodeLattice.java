package FIM;

import java.util.Vector;

public class NodeLattice {
 
	private Vector<Feature> features = new Vector<Feature>();;
	private Vector<Concept> concepts = new Vector<Concept>();
	private int size;
	private boolean uni;
	private NodeLattice papa;
	
	public NodeLattice(){
		size=0;
		setUni(false);
	}
	
	public NodeLattice(Vector<Feature> features, int s){
		this.features = features;
		size=s;
		setUni(false);
	}
	
	public NodeLattice(Vector<Feature> features, Concept concept, int s){
		this.features = features;
		setConcept(concept);
		size=s;
		setUni(false);
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
	
	public void setConcept(Concept c){
		concepts.add(c);
	}
	
	public Boolean ContainsFeature(Feature f){
		return features.contains(f);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "NodeLattice [features=" + features + ", concepts=" + concepts
				+ ", size=" + size + "]";
	}

	public boolean isUni() {
		return uni;
	}

	public void setUni(boolean uni) {
		this.uni = uni;
	}

	public NodeLattice getPapa() {
		return papa;
	}

	public void setPapa(NodeLattice papa) {
		this.papa = papa;
	}
}
