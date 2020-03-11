package es.us.isa.interparamdep.generator;

import es.us.isa.interparamdep.generator.ReservedWords;

@SuppressWarnings("all")
public class Utils {
  /**
   * Remove and replace special characters from paramName
   */
  public static String parseParamName(final String paramName) {
    String parsedParamName = paramName.replaceAll("^\\[|\\]$", "").replaceAll("[\\.\\-\\/\\:\\[\\]]", "_");
    boolean _contains = ReservedWords.RESERVED_WORDS.contains(parsedParamName);
    if (_contains) {
      String _parsedParamName = parsedParamName;
      parsedParamName = (_parsedParamName + "_R");
    }
    return parsedParamName;
  }
}
