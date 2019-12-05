package es.us.isa.interparamdep.generator;

/**
 * This class is to store [parameter name - string value - int value] tuples.
 * This is necessary for string parameters: MiniZinc is not able to process strings,
 * therefore they must be converted to int values.
 */
@SuppressWarnings("all")
public class ParamStringIntTuple {
  private String name;
  
  private String stringValue;
  
  private Integer intValue;
  
  public ParamStringIntTuple(final String name, final String stringValue, final Integer intValue) {
    this.name = name;
    this.stringValue = stringValue;
    this.intValue = intValue;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public String getStringValue() {
    return this.stringValue;
  }
  
  public void setStringValue(final String name) {
    this.stringValue = this.stringValue;
  }
  
  public Integer getIntValue() {
    return this.intValue;
  }
  
  public void setIntValue(final Integer intValue) {
    this.intValue = intValue;
  }
}
