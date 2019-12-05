package es.us.isa.interparamdep.generator;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class ParamStringIntMapping {
  private String paramName;
  
  private Map<String, Integer> stringIntMapping;
  
  public ParamStringIntMapping(final String paramName) {
    this.paramName = paramName;
    HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
    this.stringIntMapping = _hashMap;
  }
  
  public ParamStringIntMapping(final String paramName, final Map<String, Integer> stringIntMapping) {
    this.paramName = paramName;
    this.stringIntMapping = stringIntMapping;
  }
  
  public String getParamName() {
    return this.paramName;
  }
  
  public void setParamName(final String paramName) {
    this.paramName = paramName;
  }
  
  public Map<String, Integer> getStringIntMapping() {
    return this.stringIntMapping;
  }
  
  public void setStringIntMapping(final Map<String, Integer> stringIntMapping) {
    this.stringIntMapping = stringIntMapping;
  }
}
