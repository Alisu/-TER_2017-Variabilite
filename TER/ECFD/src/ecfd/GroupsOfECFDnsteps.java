package ecfd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

/**
 * 
 * From an RCFT file, this class computes
 * (XOR, parent) groups
 * (OR, parent) groups
 * greatest feature subsets mutually exclusive and not in an XOR group with a parent
 * ...
 *
 */

public class GroupsOfECFDnsteps
 {
	
	//FORMAL CONTEXT
	// Representation of the feature/characteristic list
	private ArrayList<String> CharacteristicList = new ArrayList<String>();
	// Representation of the configuration/entity list
	private ArrayList<String> EntityList = new ArrayList<String>();
	// Representation of the list (configuration, feature), duplicate of table in another format
	private ArrayList<Entry<String,String>> pairList = new ArrayList<>();
	// Representation of the binary table of the formal context
	private boolean[][] table;
	
	//INFORMATION ABOUT ECFD
	// list containing one representing feature per ECFD node (or AC-poset)
	private ArrayList<String> CharacteristicListEqClasses = new ArrayList<String>();

	// Set of xor groups (duplicated information from XORgroupsAndParents) (easier to manipulate)	
	private Set<Set<String>> XORgroups= new HashSet<Set<String>>();
	// table of xor group number of each size
	private int[] xorGroupsOfSize;  

	// Set of or groups (duplicated information from ORgroupsAndParents) (easier to manipulate)
	private Set<Set<String>> ORgroups= new HashSet<Set<String>>();
	// set of pairs (xor group of features, parent)	
	private Set<Entry<Set<String>,String>> XORgroupsAndParents 
						= new HashSet<Entry<Set<String>,String>>();
	// table of or group number of each size	
	private int[] orGroupsOfSize;  

	// set of pairs (or group of features, parent)
	private Set<Entry<Set<String>,String>> ORgroupsAndParents
						= new HashSet<Entry<Set<String>,String>>();
	// set of pairs of mutually exclusive features (not already included in an xor group)
	private Set<Set<String>> mutex= new HashSet<Set<String>>();
	// table of mutex number of each size
	private int[] mutexGroupsOfSize;  

	//information for stopping the computation at a given step
	private int nbSteps=2, stopAt=-1;
	
	public GroupsOfECFDnsteps(int nbSteps) {this.nbSteps=nbSteps;}

	public void createTableFromRCFT(String nomfichier) throws IOException {
		// the file has to contain single 'x' with NO SPACE between the pipes
		// in general, AVOID THE BLANK SPACE in the rcft file
		
		java.io.File fichier = new java.io.File(nomfichier);
		Scanner lecteur = new Scanner(fichier);
		
		// Reading of the file to extract the features (in third read string) 
		String ligne = lecteur.nextLine();
		//System.out.println("FC keyword "+ligne); 	
		ligne = lecteur.nextLine();
		//System.out.println("features "+ligne); 
		String[] decoupeLigne = ligne.split("\\|");
		for (int i=2; i<decoupeLigne.length; i++){
			//System.out.println("feature="+decoupeLigne[i]+"*");
			CharacteristicList.add(decoupeLigne[i]);
		}		
		System.out.println("features read in rcft file "+CharacteristicList);
				
		//Reading of the next lines 
		while (lecteur.hasNext())
		{	
			ligne = lecteur.nextLine();
			//System.out.println("ligne suivante"+ligne); 
			decoupeLigne = ligne.split("\\|");
			//decoupeLigne[0] is empty
			//decoupeLigne[1] is the configuration 
			EntityList.add(decoupeLigne[1]);
		}
		
		//System.out.println("entities read in rcft file "+EntityList);

		// creation of the binary table of the formal context
		table = new boolean[EntityList.size()][CharacteristicList.size()];
		
		// reading the file again
		lecteur.close();
		lecteur = new Scanner(fichier);
		ligne = lecteur.nextLine();
		//System.out.println("again FC keyword "+ligne); 	
		ligne = lecteur.nextLine();
		//System.out.println("again features "+ligne); 

		int numConfig=0;
		while (lecteur.hasNext())
		{		
			ligne = lecteur.nextLine();
			//System.out.println("ligne suivante"+ligne); 
			decoupeLigne = ligne.split("\\|");
			//decoupeLigne[0] is empty
			//decoupeLigne[1] is the configuration 
			for (int i=2; i<decoupeLigne.length; i++){
				//System.out.println("cross="+decoupeLigne[i]+"="+(decoupeLigne[i].equals("x")));
				table[numConfig][i-2] = decoupeLigne[i].equals("x");
				if (table[numConfig][i-2])
					pairList.add(
							new SimpleEntry<String,String>(EntityList.get(numConfig),CharacteristicList.get(i-2)));
			}
			numConfig++;
		}

		//displayTable();
		//System.out.println("pair list ="+pairList);					
		lecteur.close();
	}

	/**
	 * DisplayTable
	 * displays the binary table of the formal context
	 */
	public void displayTable(){
		for (int i=0; i< table.length; i++){
			for (int j=0; j< table[0].length; j++)
				System.out.print(table[i][j]+" ");
			System.out.println();
		}
	}
	
	/**
	 * configsOf 
	 * @param feature
	 * @return the configurations having that feature
	 * 
	 */
	public Set<String> configsOf(String feature){
		Set<String> configs = new TreeSet<String>();
		for (Entry<String,String> pair: pairList)
		{
			if (pair.getValue().equals(feature)) configs.add(pair.getKey());
		}
		return configs;
	}
	
	/**
	 * childfeature
	 * @param fc
	 * @param fp
	 * @return true iff fc is below fp in the ECFD or in the same node
	 * this is true when fp has same or more configurations than fc
	 * 
	 */
	public boolean childfeature(String fc, String fp){
		//fc has a set of configs included in the set of configs of fp
		Set<String> configsFc = configsOf(fc);
		Set<String> configsFp = configsOf(fp);
		return configsFp.containsAll(configsFc);
	}
	
	/**
	 * strictChildfeature
	 * @param fc
	 * @param fp
	 * @return true iff fc is below fp in the ECFD (and not in the same node)
	 * this is true when fp has strictly more configurations than fc
	 */
	public boolean strictChildfeature(String fc, String fp){
		//fc has a set of configs included in the set of configs of fp
		Set<String> configsFc = configsOf(fc);
		Set<String> configsFp = configsOf(fp);
		return (!configsFc.equals(configsFp) && configsFp.containsAll(configsFc));
	}
	
	/**
	 * mutex
	 * @param a set of features
	 * @return true if the intersection of their configuration sets is empty
	 * (no configuration has all these features)
	 */
	public boolean mutex(Set<String> features) {
		if (features.isEmpty()) return true;
		Iterator<String> it = features.iterator();
		Set<String> intersection = 	new HashSet<String>(configsOf(it.next()));
		while (it.hasNext())
			intersection.retainAll(configsOf(it.next()));
		//System.out.println(intersection);
		return intersection.isEmpty();
	}
	
	/**
	 * childrenOf
	 * @param a feature f
	 * @return the features that are in nodes below f in the ECFD
	 */
	
	public Set<String> childrenOf(String feature){
		Set<String> children = new HashSet<String>();
		Iterator<String> it = CharacteristicList.iterator();
		while (it.hasNext()){
			String current = it.next();
			if (!current.equals(feature) && strictChildfeature(current, feature))
				children.add(current);	
		}
		return children;
	}
	
	/**
	 * antichain
	 * @param features
	 * @return true iff all features are in nodes mutually incomparable
	 */
	public boolean antichain(Set<String> features){
		Iterator<String> it = features.iterator();
		while (it.hasNext()){
			String current = it.next();
			// check if the current element is child or parent of another element
			Iterator<String> it2 = features.iterator();		
			while (it2.hasNext()){
				String other = it2.next();
				if (!current.equals(other) && (childfeature(current, other) || childfeature(other, current)))
					return false;
			}
		}
		return true;
	}
	
	/**
	 * listSize2
	 * @return the set of pairs of features
	 */
	
	public Set<Set<String>> listSize2(){
		Set<Set<String>> childrenlist = new HashSet<Set<String>>();
		Iterator<String> it1 = CharacteristicListEqClasses.iterator();			
		while (it1.hasNext()){
			String current = it1.next();
			// check if the current element is child or parent of another element
			Iterator<String> it2 = CharacteristicListEqClasses.iterator();		
			while (it2.hasNext()){
				String other = it2.next();
				if (!current.equals(other)) {
					Set<String> pair = 
							new HashSet<String> ();
					pair.add(current); pair.add(other);
					if (! childrenlist.contains(pair))
						childrenlist.add(pair);	
				}
			}
		}
		return childrenlist;
	}	
	
	/**
	 * listSizeN
	 * @param list of sets of features of a certain size n-1
	 * @return the list of sets of features of size n obtained by completing the input sets
	 */
	
	public  Set<Set<String>> listSizeN(Set<Set<String>> list)
	{
		// list contains subsets of size n-1
		// completedList contains the list of subsets of size n
		// completed by 1 new children of feature
		Set<Set<String>> completedList = new HashSet<Set<String>>();
		for (Set<String> currentSet : list){
			Iterator<String> it1 = CharacteristicListEqClasses.iterator();			
			while (it1.hasNext()){
				String current = it1.next();
				Set<String> newSet = new HashSet<String>();
				newSet.addAll(currentSet);
				newSet.add(current);			
				if (!completedList.contains(newSet) && newSet.size()==currentSet.size()+1) 
					completedList.add(newSet);
			}
		}
		return completedList;
	}
	
	/**
	 * parentsOfTheGroup
	 * @param group of features
	 * @return a set of parents. Each parent is on a super-node of all the input features in the ECFD
	 */
	
	public Set<String> parentsOfTheGroup(Set<String> group){
		// the group is supposed not empty
		Set<String> parents = new HashSet<String>();
		for (String f: CharacteristicList){
			boolean parentofAll=true;
			Iterator<String> it = group.iterator();
			while (it.hasNext()){
				String current = it.next();
				if (!strictChildfeature(current, f))
					parentofAll=false;
			}
			if (parentofAll) parents.add(f);
		}
		return parents;
	}
	
	/**
	 * groupCoversConfigsOfParent
	 * @param group
	 * @param parent
	 * @return true iff the union of the sets of configurations of the features of the group
	 * is equal to the set of configurations of the parent
	 */
	public boolean groupConfigsEqualToConfigsOfParent(Set<String> group, String parent){
		Set<String> union = new HashSet<String>();
		Iterator<String> it = group.iterator();
		while (it.hasNext())
			union.addAll(configsOf(it.next()));
		return configsOf(parent).equals(union);
	}
	
	/**
	 * disjointConfigs
	 * @param group
	 * @return true iff for any pair of different features of the group, the configuration sets are disjoint
	 */
	public boolean disjointConfigs(Set<String> group){
		Iterator<String> it1 = group.iterator();
		while (it1.hasNext()){
			String current1 = it1.next();
			Iterator<String> it2 = group.iterator();
			while (it2.hasNext()){
				String current2 = it2.next();
				if (!current1.equals(current2)){
					Set<String> intersection = new HashSet<String>(configsOf(current1));
					intersection.retainAll(configsOf(current2));
					if (!intersection.isEmpty())
						return false;
				}
			}
		}			
		return true;
	}
	
	/**
	 * doesNotIncludeOrXor
	 * @param candidate
	 * @return true if the candidate does not include any OR or XOR group
	 */
	public  boolean doesNotIncludeOrXor(Set<String> candidate){
		for (Set<String> xor : XORgroups){	
			if (candidate.containsAll(xor))
				return false;
		}
		for (Set<String> or : ORgroups){	
			if (candidate.containsAll(or))
				return false;		
		}
		return true;
	}
	
	/**
	 * doesNotIncludeOrXorWithSameParent
	 * @param candidatep
	 * @return true if the candidate does not include any OR or XOR group which has the same parent than candidatep
	 */
	public  boolean doesNotIncludeOrXorWithSameParent(Entry<Set<String>,String> candidatep){
		for ( Entry<Set<String>,String> xorp : XORgroupsAndParents){	
			if (candidatep.getValue().equals(xorp.getValue()) && candidatep.getKey().containsAll(xorp.getKey()))
				return false;
		}
		for ( Entry<Set<String>,String> xorp : ORgroupsAndParents){	
			if (candidatep.getValue().equals(xorp.getValue()) && candidatep.getKey().containsAll(xorp.getKey()))
				return false;
		}
		return true;
	}

	/**
	 * doesNotIncludeOr
	 * @param candidate
	 * @return true if the candidate does not include any OR  group 
	 */
	public  boolean doesNotIncludeOr(Set<String> candidate){
	
		for (Set<String> or : ORgroups){	
			if (candidate.containsAll(or))
				return false;		
		}
		return true;
	}
	
	/**
	 * doesNotIncludeMutex
	 * @param candidate
	 * @return true if the candidate does not include a smallest mutex
	 */
	public  boolean doesNotIncludeMutex(Set<String> candidate){
		for (Set<String> mu : mutex){	
			if (candidate.containsAll(mu))
				return false;
		}
		return true;
	}
	
	/**
	 * doesNotIncludeXor
	 * @param candidate
	 * @return true if the candidate does not include any XOR group
	 */
	public  boolean doesNotIncludeXor(Set<String> candidate){
		for (Set<String> mu : XORgroups){	
			if (candidate.containsAll(mu))
				return false;
		}
		return true;
	}

	/**
	 * isNotIncludedInOrXor
	 * @param candidate
	 * @return true if the candidate is not included in any OR or XOR group
	 */
	public  boolean isNotIncludedInXor(Set<String> candidate){
		for (Set<String> xor : XORgroups){	
			if (xor.containsAll(candidate))
				return false;
		}
	/*	for (Set<String> or : ORgroups){	
			if (or.containsAll(candidate))
				return false;		
		}*/
		return true;
	}
	
	
	/**
	 * DealStep
	 * deals with one step (sets of features of a certain size n)
	 * @param step
	 */
	public  void DealStep(Set<Set<String>> step){
		for (Set<String> candidate : step){
			//System.out.println("candidate "+candidate);
			// we eliminate the groups containing comparable features in ECFD		
			if (antichain(candidate)){
				//System.out.println("antichain");
				// we select the possible parents of this group
				// among the parents of the group
				// keeping only one representative by ECFD node
				Set<String> candidateParents = new HashSet<String>();
				Set<String> intersection = new HashSet<String>(CharacteristicListEqClasses);
				intersection.retainAll(parentsOfTheGroup(candidate));	
				// for each parent
				for (String parent : intersection){
					//System.out.println("parent "+parent);
					if (groupConfigsEqualToConfigsOfParent(candidate,parent)){
						// There is a possible group if the parent configuration set is equal to the
						// union of the configuration sets of the features of the group 
						//System.out.println("covers");
						if (disjointConfigs(candidate)){
							// if this is disjoint, we have a partition, thus an XOR group
							//System.out.println("disjoint");
							// I think not useful to check if there is a smallest XOR group
							// because if we remove an element of the partition
							// the coverage of the parent configuration set cannot be verified
							// if (doesNotIncludeOrXor(candidate))
								XORgroups.add(candidate);
								//candidateParents.add(parent);
								SimpleEntry<Set<String>,String> se 
										= new SimpleEntry<Set<String>,String>(candidate,parent);
								XORgroupsAndParents.add(se);
								xorGroupsOfSize[candidate.size()]++;
						}
						else {
							// This is a possible OR group
							//System.out.println("not disjoint");
							// We have to check if this is a group extending a previously smallest discovered OR
							// should we check "for the same parent"?
							// check again does not contain xor
							//if (doesNotIncludeOrXor(candidate)){
							SimpleEntry<Set<String>,String> se 
							= new SimpleEntry<Set<String>,String>(candidate,parent);
							if (doesNotIncludeOrXorWithSameParent(se)){
								ORgroups.add(candidate);
								//candidateParents.add(parent);								
								ORgroupsAndParents.add(se);
								orGroupsOfSize[candidate.size()]++;
							}
						}
					}
				}
			}
		}
	}	
	
	/**
	 * ComputeMutexAllsizes
	 * check for each subset of features if this is a mutex
	 * 
	 */
	
	public void ComputeMutexAllSizes(){
		
		if (nbSteps==-1)
			stopAt=CharacteristicListEqClasses.size();
		else
			stopAt=nbSteps;
		Set<Set<String>> step = listSize2();
		//System.out.println(step);
		mutexOf(step);
		System.out.println("mutex step  1"+" "+mutex+"\nnb mutex = "+mutex.size());	
		int i=2;
		do{
			Set<Set<String>> newstep = listSizeN(step); 
			//System.out.println(newstep);
			step = newstep;
			mutexOf(step);
			System.out.println("mutex step "+i+" "+mutex+"\nnb mutex = "+mutex.size());	
			i++;
		}
		while (i<= stopAt);
	}
	//-------------------------------------------------------------------------------
	/**
	 * mutexOf
	 * @param step
	 * put in the mutex set a set of features if
	 * - this is an antichain
	 * - no configuration has all these features
	 * - it is of size 2 and does not include xor and is not included in an xor group
	 * - it is of size > 2 and no strict subset if a mutex, it does not include an xor, it is not included in an xor
	 * --- and does not include a smallest mutex
	 */
	public  void mutexOf(Set<Set<String>> step){
		for (Set<String> candidatemutex : step)
				if (antichain(candidatemutex) && mutex(candidatemutex)){
					// if a strict subset is not a mutex himself
					if    ((candidatemutex.size()>2 
							        && noStrictSubsetIsAMutex(candidatemutex)
							        && isNotIncludedInXor(candidatemutex)  
									&& doesNotIncludeMutex(candidatemutex)
									&& doesNotIncludeXor(candidatemutex)) ||
							((candidatemutex.size()==2) 
							        && (isNotIncludedInXor(candidatemutex)  
									//&& doesNotIncludeMutex(candidatemutex) - useless for size 2
									&& doesNotIncludeXor(candidatemutex))))
							{
								if (! mutex.contains(candidatemutex))
								{
									//System.out.println("trace"+candidatemutex.size());
									mutexGroupsOfSize[candidatemutex.size()]++;
								}
								//else System.out.println("mutex deja dans Mutex");
								mutex.add(candidatemutex);		
							}
				}				
			}
	
	public boolean noStrictSubsetIsAMutex(Set<String> candidatemutex){
		// candidatemutex.size()>2
		// build the strict subsets
		// we can return true once once subset is a mutex
		
		// list of subsets of size 2
		Set<Set<String>> step = subsetsOfSize2(candidatemutex);
		//System.out.println("step 2 subsets"+step+" size candidatemutex "+candidatemutex.size());
		for (Set<String> subset : step)
			if (mutex(subset)) return false;
			
		//list of other subsets until size candidatemutex.size()-1
		int i=2;
		//int j = sc.nextInt();
		while (i < candidatemutex.size()-1){
			Set<Set<String>> newstep = subsetsSizeN(step, candidatemutex); 
			//System.out.println("step "+(i+1)+" subsets"+newstep);
			step = newstep;
			for (Set<String> subset : step)
				if (mutex(subset)) return false;
			//j = sc.nextInt();
			i++;
		}
		
		return true;
	}
	
	public Set<Set<String>> subsetsOfSize2(Set<String> s){
		Set<Set<String>> childrenlist = new HashSet<Set<String>>();
		Iterator<String> it1 = s.iterator();			
		while (it1.hasNext()){
			String current = it1.next();
			// check if the current element is child or parent of another element
			Iterator<String> it2 = s.iterator();		
			while (it2.hasNext()){
				String other = it2.next();
				if (!current.equals(other)) {
					Set<String> pair = 
							new HashSet<String> ();
					pair.add(current); pair.add(other);
					if (! childrenlist.contains(pair))
						childrenlist.add(pair);	
				}
			}
		}
		return childrenlist;
	}	
	
	/**
	 * listSizeN
	 * @param s of sets of features of a certain size n-1
	 * @return the list of sets of features of size n obtained by completing the input sets
	 */
	
	public  Set<Set<String>> subsetsSizeN(Set<Set<String>> subset, Set<String> candidateMutex)
	{
		// list contains subsets of size n-1
		// completedList contains the list of subsets of size n
		// completed by 1 new children of feature
		Set<Set<String>> completedList = new HashSet<Set<String>>();
		for (Set<String> currentSet : subset){
			Iterator<String> it1 = candidateMutex.iterator();			
			while (it1.hasNext()){
				String current = it1.next();
				Set<String> newSet = new HashSet<String>();
				newSet.addAll(currentSet);
				newSet.add(current);			
				if (!completedList.contains(newSet) && newSet.size()==currentSet.size()+1) 
					completedList.add(newSet);
			}
		}
		return completedList;
	}
	
	//----------------------------------------------
	
	/**
	 * ComputeGroups
	 * iterates on the different steps (candidate group of size 2, 3, ..)
	 */
	public void ComputeGroups(){
		
		if (nbSteps==-1)
			stopAt=CharacteristicListEqClasses.size();
		else
			stopAt=nbSteps;

		//Scanner sc = new Scanner(System.in);
		Set<Set<String>> step = listSize2();
		System.out.println("equivalence class number ="+CharacteristicListEqClasses.size());
		xorGroupsOfSize = new int[CharacteristicListEqClasses.size()];
		orGroupsOfSize = new int[CharacteristicListEqClasses.size()];
		mutexGroupsOfSize = new int[CharacteristicListEqClasses.size()];
		System.out.println("--------step ="+1);
		DealStep(step);
		System.out.println("xor "+XORgroups.size());
		System.out.println("xor and parents "+XORgroupsAndParents);
		System.out.println("or "+ORgroups.size());	
		System.out.println("or and parents "+ORgroupsAndParents);			
		System.out.println("mutex "+mutex+"\nnb mutex = "+mutex.size());	
		/*System.out.println("\n----"+
				"\nLatex Step internal"+
				"\n----\n"+
				"step " + 1 +" &"+CharacteristicList.size()+"&"
				+EntityList.size()+"&"
				+XORgroups.size()+retourneTaillesDeGroupesFormatLatex(xorGroupsOfSize)+"&"
				+ORgroupsAndParents.size()+retourneTaillesDeGroupesFormatLatex(orGroupsOfSize)+"&"+
				+mutex.size()+retourneTaillesDeGroupesFormatLatex(mutexGroupsOfSize)+"& &" + 1 + "\\\\"+
				"\n----");
				*/
		int i=2;
		
		//int j = sc.nextInt();
		do{
			Set<Set<String>> newstep = listSizeN(step); 
			System.out.println("--------step ="+i);
			step = newstep;
			DealStep(step);
			System.out.println("xor "+XORgroups.size());
			System.out.println("xor and parents "+XORgroupsAndParents);
			System.out.println("or "+ORgroups.size());	
			System.out.println("or and parents "+ORgroupsAndParents);			
			System.out.println("mutex "+mutex+"\nnb mutex = "+mutex.size());	
			/*System.out.println("\n----"+
			"\nLatex Step internal"+
			"\n----\n"+
			"step " + i +" &"+CharacteristicList.size()+"&"
			+EntityList.size()+"&"
			+XORgroups.size()+retourneTaillesDeGroupesFormatLatex(xorGroupsOfSize)+"&"
			+ORgroupsAndParents.size()+retourneTaillesDeGroupesFormatLatex(orGroupsOfSize)+"&"+
			+mutex.size()+retourneTaillesDeGroupesFormatLatex(mutexGroupsOfSize)+"& &" + i + "\\\\"+
			"\n----");*/
			//j = sc.nextInt();
			i++;
		}
		while (i<= stopAt);
	}
	
	/**
	 * List of features containing only one representative per ECFD node
	 */
	public  void computeEqClasses(){
		for (String f: CharacteristicList){
			boolean exist = false;
			for (String e : CharacteristicListEqClasses)
				if (configsOf(f).equals(configsOf(e)))
					exist = true;
			if (!exist)
				CharacteristicListEqClasses.add(f);
		}		
	}
	
	/**
	 * chooseRcftAndComputeGroups
	 * main method for compute groups and mutex of an ECFD associated
	 * with the formal context contained in a RCFT file
	 * @throws IOException
	 */
	public void chooseRcftAndComputeGroups() throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("write the name of the directory (inside data)");
		String directoryName = sc.next();
		System.out.println("write the file name of the input rcft file - avoid spaces in the rcft file");
		String inputFileName = sc.next();

		createTableFromRCFT("data/"+directoryName+"/"+inputFileName);
		System.out.println("feature list="+CharacteristicList);
		System.out.println("configuration list="+EntityList);
		System.out.println("pair list="+pairList);
		//displayTable();
		computeEqClasses();
		//System.out.println(CharacteristicListEqClasses);
		ComputeGroups();
		//ComputeMutex();
		//System.out.println("compute mutex all sizes");
		ComputeMutexAllSizes();
		//System.out.println("xor "+XORgroups);
		System.out.println("xor and parents "+XORgroupsAndParents);
		System.out.println(Arrays.toString(xorGroupsOfSize));
		//System.out.println("or "+ORgroups);	
		System.out.println("or and parents "+ORgroupsAndParents);
		System.out.println(Arrays.toString(orGroupsOfSize));
		System.out.println("mutex "+mutex+"\nnb mutex = "+mutex.size());
		System.out.println(Arrays.toString(mutexGroupsOfSize));

		sc.close();
	}	
	
	public void computeGroupsFromRCFTFile(String inputFileName) throws IOException{
		createTableFromRCFT(inputFileName);
		//System.out.println("feature list="+CharacteristicList);
		//System.out.println("configuration list="+EntityList);
		//System.out.println("pair list="+pairList);
		//displayTable();
		computeEqClasses();
		//System.out.println(CharacteristicListEqClasses);
		ComputeGroups();
		//ComputeMutex();
		System.out.println("compute mutex all sizes");
		ComputeMutexAllSizes();
		//System.out.println("xor "+XORgroups);
		//System.out.println("or "+ORgroups);	
		//System.out.println("xor and parents "+XORgroupsAndParents);
		//System.out.println("or and parents "+ORgroupsAndParents);			
		//System.out.println("mutex "+mutex+"\nnb mutex = "+mutex.size());	
	}	

	public static String retourneTaillesDeGroupes(int[] tabTailles){
		String res="";
		for (int i=0; i<tabTailles.length; i++)
			if (tabTailles[i]!=0)
				res+=" #groupOfsize/"+i+":"+tabTailles[i]+",";
		return res;
	}
	public static String retourneTaillesDeGroupesFormatLatex(int[] tabTailles){
		String res=" ";
		for (int i=0; i<tabTailles.length; i++)
			if (tabTailles[i]!=0)			
				res+="("+i+":"+tabTailles[i]+")";
		return res;
	}
	
	public static String applyToRcftFromFile(String nomfichier, int i) throws IOException {
		// the file has to contain single 'x' with NO SPACE between the pipes
		// in general, AVOID THE BLANK SPACE in the rcft file
		
		java.io.File fichier = new java.io.File(nomfichier);
		Scanner lecteur = new Scanner(fichier);
		String res="";
		
		while (lecteur.hasNext())
		{	
			String ligne = lecteur.nextLine();
			String[] decoupeLigne = ligne.split(" ");
			System.out.println(decoupeLigne[0]+" "+decoupeLigne[1]);
			GroupsOfECFDnsteps g = new GroupsOfECFDnsteps(i);
			g.computeGroupsFromRCFTFile(decoupeLigne[1]);
			res += g.display(decoupeLigne[0]);
		}
		return res;
	}
	
	public String display(String rcftName){
		String ligne = "\nRESULTAT \n------\n" + rcftName + "\n" +
				"#equivalent features or #step "+this.stopAt+
				//"\nfeature list="+CharacteristicList +
				"\n#features "+ CharacteristicList.size() +
				//"\nconfiguration list="+EntityList +
				"\n#configurations "+ EntityList.size() +
				//"\nxor "+XORgroups+
				//"\n#xor "+XORgroups.size()+	
				"\n----"+
				"\nxor and parent "+XORgroupsAndParents.size()+" "+//XORgroupsAndParents+
				"\nxor groups of each size = ["+retourneTaillesDeGroupes(xorGroupsOfSize)+"]"+
				//"\nor "+ORgroups+
				//"\n#or "+ORgroups.size()+		
				"\n----"+
				"\nor and parent "+ORgroupsAndParents.size()+" "+//ORgroupsAndParents+	
				"\nor groups of each size = ["+retourneTaillesDeGroupes(orGroupsOfSize)+"]"+
				"\n----"+
				"\nmutex "+mutex.size()+" "+//mutex+	
				"\nmutex groups of each size = ["+retourneTaillesDeGroupes(mutexGroupsOfSize)+"]"+
				"\n----"+
				/*"\nLatex Final"+
				"\n----\n"+
				rcftName+" &"+CharacteristicList.size()+"&"
				+EntityList.size()+"&"
				+XORgroups.size()+retourneTaillesDeGroupesFormatLatex(xorGroupsOfSize)+"&"
				+ORgroupsAndParents.size()+retourneTaillesDeGroupesFormatLatex(orGroupsOfSize)+"&"+
				+mutex.size()+retourneTaillesDeGroupesFormatLatex(mutexGroupsOfSize)+"& \\\\"+
				"\n----"+*/
				"\n";
		return ligne;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of steps? (-1 for having all steps)");
		int nbEtapes = sc.nextInt();
		System.out.println("Name of the file containing the .rcft files?");		
		//exemple "./data/listOfrcftFiles.txt"
		String nomFichier = sc.next();
		System.out.println(applyToRcftFromFile(nomFichier,Integer.valueOf(nbEtapes)));
	}

}
