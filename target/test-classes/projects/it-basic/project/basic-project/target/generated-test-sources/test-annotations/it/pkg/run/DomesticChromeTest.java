package it.pkg.run;

import org.junit.BeforeClass;
import it.pkg.run.DomesticRunners;


public class DomesticChromeTest extends DomesticRunners {

    @BeforeClass
    public static void before() {
        System.setProperty("studio.gizmo.acceptSslCerts", "true");
        System.setProperty("studio.gizmo.name", "DomesticChromeTest");
        System.setProperty("studio.gizmo.os", "");
        System.setProperty("studio.gizmo.osVersion", "");
        System.setProperty("studio.gizmo.browser", "Chrome");
        System.setProperty("studio.gizmo.browserName", "");
        System.setProperty("studio.gizmo.browserVersion", "");
        System.setProperty("studio.gizmo.device", "");
        System.setProperty("studio.gizmo.realMobile", "false");
        System.setProperty("studio.gizmo.appium", "");
        System.setProperty("studio.custom", "");

        System.out.println("[SIV] run with: DomesticChromeTest");
    }
}
