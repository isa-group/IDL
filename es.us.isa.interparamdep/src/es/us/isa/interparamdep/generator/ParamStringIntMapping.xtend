package es.us.isa.interparamdep.generator

import java.util.Map
import java.util.HashMap

class ParamStringIntMapping {
	var String paramName
	var Map<String, Integer> stringIntMapping
	
	new(String paramName) {
		this.paramName = paramName
		this.stringIntMapping = new HashMap<String, Integer>()
	}
	
	new(String paramName, Map<String, Integer> stringIntMapping) {
		this.paramName = paramName
		this.stringIntMapping = stringIntMapping
	}
	
	def String getParamName() {
		return paramName
	}
	
	def void setParamName(String paramName) {
		this.paramName = paramName
	}
	
	def Map<String, Integer> getStringIntMapping() {
		return stringIntMapping
	}
	
	def void setStringIntMapping(Map<String, Integer> stringIntMapping) {
		this.stringIntMapping = stringIntMapping
	}
}