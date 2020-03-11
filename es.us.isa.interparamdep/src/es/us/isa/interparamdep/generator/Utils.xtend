package es.us.isa.interparamdep.generator

import static es.us.isa.interparamdep.generator.ReservedWords.RESERVED_WORDS

class Utils {
	
	/**
	 * Remove and replace special characters from paramName
	 */
	def static String parseParamName(String paramName) {
		var String parsedParamName = paramName.replaceAll("^\\[|\\]$", "").replaceAll("[\\.\\-\\/\\:\\[\\]]", "_")
		if (RESERVED_WORDS.contains(parsedParamName))
			parsedParamName += "_R"
		return parsedParamName
	}
}