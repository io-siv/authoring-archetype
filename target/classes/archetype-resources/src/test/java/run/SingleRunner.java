package ${package}.run;

/**
 * Invoked using $mvn verify -P single
 * <p>
 * Executes a single non-forked environment and preconfigured to use Chrome.
 * Browser choice can be changed via the pom file.
 */
public class SingleRunner extends CucumberConfig {}