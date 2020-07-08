package ${package}.run;

import io.siv.support.annotation.Gizmo;

/**
 * Invoked using $mvn verify -P remote.
 * <p>
 * Executes in parallel using BrowserStack, a Local server, and an environment
 * as defined by @Gizmo.
 * <p>
 * For each @Gizmo, a new class is created and configured as defined.
 * During the verify phase, each of these classes will run as a fork where the
 * normal Cucumber tests will execute through BrowserStack
 */
@Gizmo(device = "Samsung Galaxy S8", osVersion = "7.0", realMobile = true)
@Gizmo(os = "Windows", osVersion = "10", browser = "IE", browserVersion = "11.0", seleniumVersion = "3.5.2")
public abstract class RemoteRunners extends CucumberConfig {}