package it.pkg.authoring.page;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.siv.support.service.Connection;

public class SamplePage {
	
	private Connection con;
	
	@FindBy(name="q")
    public WebElement search;

    @FindBy(name="btnK")
    public WebElement searchButton;
    
    public SamplePage(Connection con) {
    	this.con = con;
    	PageFactory.initElements(con.driver(), this);
    }
    
    public WebDriver driver() {
    	return con.driver();
    }
    
    public void load(String url) {
    	con.driver().get(url);
    }
    
    public void close() {
    	con.disconnect();
    }
}