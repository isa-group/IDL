/*
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class InterparameterDependenciesLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("es/us/isa/interparamdep/parser/antlr/internal/InternalInterparameterDependenciesLanguage.tokens");
	}
}
