package it.pkg.run;

import io.siv.support.annotation.Gizmo;

/**
 * Invoked using $mvn verify -P remote.
 * <p>
 * Executes in parallel using BrowserStack, a Local server, and an environment
 * as defined by @Target.
 * <p>
 * During the build, io-siv.support will process @RunTemplate. For each @Target,
 * a new class is created and configured for that environment. During the verify
 * phase, each of these classes will run on a fork where the normal Cucumber
 * tests will execute.
 */
@Gizmo(browser = "Chrome")
@Gizmo(browser = "Firefox")
@Gizmo(browser = "Safari")
public abstract class RemoteRunners extends CucumberConfig {}