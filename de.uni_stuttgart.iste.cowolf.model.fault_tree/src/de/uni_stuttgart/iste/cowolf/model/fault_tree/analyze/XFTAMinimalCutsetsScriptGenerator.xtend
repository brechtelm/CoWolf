package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze

import java.util.Map
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree

class XFTAMinimalCutsetsScriptGenerator implements XFTAGenerator {

	override CharSequence doGenerateXFTAFile(FaultTree root, Map<String, Object> parameters) {
		return '''«xFTAMinimalCutsetsScriptTemplate(root, parameters)»'''
	}

	def xFTAMinimalCutsetsScriptTemplate(FaultTree r, Map<String, Object> parameters) '''
		<?xml version="1.0"?>
		<!DOCTYPE xfta>
		<xfta>
		  <load>
		    <model input="«parameters.get("pathToInputXFTAFile")»" />
		  </load>
		  <build>
		    <minimal-cutsets top-event="«r.hazard.id»" handle="MCS" />
		  </build>
		  <set>
		    <option name="print-minimal-cutset-rank" value="on" />
		    <option name="print-minimal-cutset-order" value="off" />
		    <option name="print-minimal-cutset-probability" value="on" />
		    <option name="print-minimal-cutset-contribution" value="on" />
		  </set>
		  <print>
		    <minimal-cutsets top-event="«r.hazard.id»" handle="MCS" output="«parameters.get("pathToOutputXFTAFile")»" mode="write" />
		  </print>
		</xfta>
	'''
}
