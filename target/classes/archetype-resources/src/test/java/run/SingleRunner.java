package ${package}.run;

/**
 * Invoked using $mvn verify -P single
 * <p>
 * Executes a single non-forked environment and preconfigured to use Chrome.
 * Browser choice can be changed via the pom file.
 * <p>
 * Execution of this profile requires drivers added to
 * src/main/resources/drivers. Drivers are browser version based and operating
 * system dependent. Logically then, switching to Safari on a non OS
 * X machine will fail. In addition, Safari's driver is baked into Selenium.
 */
public class SingleRunner extends CucumberConfig {
}