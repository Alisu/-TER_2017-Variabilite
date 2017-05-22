/*
 * generated by Xtext 2.10.0
 */
package org.xtext.ter_metamodel.ecfdl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.ter_metamodel.ecfdl.ecfd.Box
import org.xtext.ter_metamodel.ecfdl.ecfd.Ecfd
import org.xtext.ter_metamodel.ecfdl.ecfd.Element

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ECFDLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		val ecfdList= resource.allContents.toIterable.filter(typeof(Ecfd)) //pour générer plusieurs ECFD
		
		for (ecfd : ecfdList){
		
		fsa.generateFile(ecfd.name +'.gv', 
			'''
digraph ''' + ecfd.name + '''{
ratio = "auto";
label=''' + ecfd.name + ''';
'''+
ecfd.buildbox + 
ecfd.buildRelation + 
ecfd.buildMutex+ 
'''}'''
			)
		}
	}
		
	def getFeatures(Box b) 
	'''"«FOR f : b.feature»«f.name» «ENDFOR»"'''
	
	def printBox (Box b)
	'''[«IF b.root»root=true,«ENDIF»shape=box, regular=1, style=filled, fillcolor=white];
	'''
	
	def buildbox(Ecfd e)
	'''
	«FOR b : e.boxes.filter(Box) »
	«b.getFeatures»«b.printBox»
	«ENDFOR»
	'''
	
	def Box getBox(Element element){
	return element.box}
	
	
	//Changer les couleurs !
	
	def buildRelation(Ecfd e)
	'''
	«FOR b : e.boxes.filter(Box)»
		«FOR relation : b.childBox »
		subgraph «relation.name» {
			«b.getFeatures» -> «relation.getFeatures»  [color=blue, dir=back];
			}
		«ENDFOR»
		«FOR groupRelation : b.childGroup»
		subgraph «groupRelation.name» {
			«groupRelation.name» [style=filled,«IF groupRelation.exclusif»label="XOR"«ELSE»label="OR"«ENDIF», height=.1,width=.1];
			«b.getFeatures» -> «groupRelation.name» [dir=back, color=black];
			«FOR child : groupRelation.box»
				«groupRelation.name» -> «child.getFeatures» [dir = none, color=black];
			«ENDFOR»
			}
		«ENDFOR»
	«ENDFOR»
	'''
	
	def buildMutex (Ecfd e)
	'''
	«FOR m : e.mutex»
	subgraph «m.name»{
		«m.name» [style=filled, label="MX", height=0, width=0];
		«FOR bm : m.box »
			«bm.getFeatures» -> «m.name»  [dir=none color=red];
		«ENDFOR»
		}
	«ENDFOR»
	'''
}
