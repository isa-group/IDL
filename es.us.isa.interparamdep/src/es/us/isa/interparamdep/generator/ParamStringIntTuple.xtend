package es.us.isa.interparamdep.generator

/**
 * This class is to store [parameter name - string value - int value] tuples.
 * This is necessary for string parameters: MiniZinc is not able to process strings,
 * therefore they must be converted to int values.
 */
class ParamStringIntTuple {
	var String name
	var String stringValue
	var Integer intValue
	
	new(String name, String stringValue, Integer intValue) {
		this.name = name
		this.stringValue = stringValue
		this.intValue = intValue
	}
	
	def String getName() {
		return name
	}
	
	def void setName(String name) {
		this.name = name
	}
	
	def String getStringValue() {
		return stringValue
	}
	
	def void setStringValue(String name) {
		this.stringValue = stringValue
	}
	
	def Integer getIntValue() {
		return intValue
	}
	
	def void setIntValue(Integer intValue) {
		this.intValue = intValue
	}
}