package ${package}.run;

import io.siv.support.annotation.Gizmo;

/**
 * Invoked using $mvn verify -P domestic.
 * <p>
 * Executes in parallel on your machine using each environment as defined
 * by @Gizmo.
 * <p>
 * For each @Gizmo, a new class is created and configured for that environment.
 * During the verify phase, each of these classes will run as a fork where the
 * normal Cucumber tests will execute.
 * <p>
 * Execution of this profile requires drivers added to
 * src/main/resources/drivers. Drivers are browser version based and operating
 * system dependent. Logically then, Configuring Safari as a Target on a non OS
 * X machine will fail. In addition, Safari's driver is baked into Selenium.
 */
@Gizmo(browser = "Chrome")
@Gizmo(browser = "Firefox")
@Gizmo(browser = "Safari")
public abstract class DomesticRunners extends CucumberConfig {}