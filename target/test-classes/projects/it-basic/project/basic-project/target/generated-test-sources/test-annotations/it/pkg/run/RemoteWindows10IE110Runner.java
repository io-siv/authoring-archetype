package it.pkg.run;

import org.junit.BeforeClass;
import it.pkg.run.RemoteRunners;


public class RemoteWindows10IE110Runner extends RemoteRunners {

    @BeforeClass
    public static void before() {
        System.setProperty("studio.gizmo.acceptSslCerts", "true");
        System.setProperty("studio.gizmo.name", "RemoteWindows10IE110Runner");
        System.setProperty("studio.gizmo.os", "Windows");
        System.setProperty("studio.gizmo.osVersion", "10");
        System.setProperty("studio.gizmo.browser", "IE");
        System.setProperty("studio.gizmo.browserName", "");
        System.setProperty("studio.gizmo.browserVersion", "11.0");
        System.setProperty("studio.gizmo.device", "");
        System.setProperty("studio.gizmo.realMobile", "false");
        System.setProperty("studio.gizmo.appium", "");
        System.setProperty("studio.custom", "");

        System.out.println("[SIV] run with: RemoteWindows10IE110Runner");
    }
}
