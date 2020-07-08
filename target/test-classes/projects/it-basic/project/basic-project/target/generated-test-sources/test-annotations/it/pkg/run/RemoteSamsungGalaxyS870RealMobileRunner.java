package it.pkg.run;

import org.junit.BeforeClass;
import it.pkg.run.RemoteRunners;


public class RemoteSamsungGalaxyS870RealMobileRunner extends RemoteRunners {

    @BeforeClass
    public static void before() {
        System.setProperty("studio.gizmo.acceptSslCerts", "true");
        System.setProperty("studio.gizmo.name", "RemoteSamsungGalaxyS870RealMobileRunner");
        System.setProperty("studio.gizmo.os", "");
        System.setProperty("studio.gizmo.osVersion", "7.0");
        System.setProperty("studio.gizmo.browser", "");
        System.setProperty("studio.gizmo.browserName", "");
        System.setProperty("studio.gizmo.browserVersion", "");
        System.setProperty("studio.gizmo.device", "Samsung Galaxy S8");
        System.setProperty("studio.gizmo.realMobile", "true");
        System.setProperty("studio.gizmo.appium", "");
        System.setProperty("studio.custom", "");

        System.out.println("[SIV] run with: RemoteSamsungGalaxyS870RealMobileRunner");
    }
}
