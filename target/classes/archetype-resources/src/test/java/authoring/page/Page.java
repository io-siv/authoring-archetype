package ${package}.authoring.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.siv.support.service.Connection;
import io.siv.support.util.Waiter;

/**
 * Convenience class that can be sub-classed. The primary benefit is its
 * handling of sub-class fields using @FindBy.
 */
public class Page {

	private final Connection con;

	public Page(Connection con) {
		this.con = con;
		PageFactory.initElements(con.driver(), this);
	}

	/**
	 * The WebDriver this class is using.
	 * 
	 * @return
	 */
	public WebDriver driver() {
		return con.driver();
	}

	/**
	 * Will try to maximize the browser as long as we are not a device
	 * @return
	 */
	public Page maximaize() {
		if (!isDevice()) con.driver().manage().window().maximize();
		return this;
	}

	/**
	 * Convenience method to load the web page. i.e. A shortcut for
	 * con.driver().get(url);
	 * 
	 * @param url
	 */
	public Page load(String url) {
		con.driver().get(url);
		return this;
	}

	/**
	 * Convenience method to load the home page.
	 */
	public Page loadHome() {
		String url = con.getCapability("studio.test.home");
		load(url);
		return this;
	}
	
//	public void report(String scenario, String status) {
//		con.report(scenario, status);
//	}

	/**
	 * Convenience method to disconnect. Warning, if your step definition class uses
	 * multiple pages with the same connection, then it is recommended to keep a
	 * Connection object as a field of that step class and use that to disconnect
	 * rather than calling me.
	 */
	public void close() {
		con.disconnect();
	}

	/**
	 * Manually get WebElement
	 * 
	 * @param by
	 * @return WebElement
	 */
	public WebElement findElement(By by) {
		return con.driver().findElement(by);
	}

	/**
	 * Manually get WebElements
	 * 
	 * @param by
	 * @return WebElement
	 */
	public List<WebElement> findElements(By by) {
		return con.driver().findElements(by);
	}

	/**
	 * Convenience method to get the browser name associated with the Target run
	 * file.
	 * 
	 * @return the browser name.
	 */
	public String getBrowserName() {
		return con.getCapability("browser");
	}

	/**
	 * @return whether or not this web driver is using Chrome
	 */
	public boolean isChrome() {
		return "Chrome".contentEquals(getBrowserName());
	}
	
	/**
	 * @return whether or not this web driver is using Chrome
	 */
	public boolean isSafari() {
		return "Safari".contentEquals(getBrowserName());
	}
	
	public boolean isDevice() {
		String device = con.getCapability("device");
		return null != device && con.getCapability("device").length() > 0;
	}

	/**
	 * Adds an expected visibility wait condition to the element.
	 * 
	 * @param element
	 */
	public void waitForElementVisibility(WebElement element) {
		Waiter.waitForElementVisibility(con.driver(), element);
	}

	/**
	 * Adds an expected click-ability wait condition to the element.
	 * 
	 * @param element
	 */
	public void waitForElementClickable(WebElement element) {
		Waiter.waitForElementClickable(con.driver(), element);
	}

	/**
	 * Adds an expected title wait condition.
	 * 
	 * @param title
	 */
	public void waitForPageTitle(String title) {
		Waiter.waitForPageTitle(con.driver(), title);
	}

	/**
	 * Surrounds by with try catch of NoSuchElementException. 
	 * Prints a simple message if not found
	 * 
	 * @param by search query
	 * @return The web element or null
	 */
	public WebElement tryBy(By by) {
		WebElement we = null;

		try {
			we = findElement(by);
		} catch (NoSuchElementException e) {
			System.out.println("No element found with by: " + by);
		}

		return we;
	}

	/**
	 * Adds an expected text present wait condition to the element.
	 * 
	 * @param element
	 * @param text
	 */
	public void waitForTextToBePresentInElement(WebElement element, String text) {
		Waiter.waitFoTextToBePresentInElement(con.driver(), element, text);
	}
}
