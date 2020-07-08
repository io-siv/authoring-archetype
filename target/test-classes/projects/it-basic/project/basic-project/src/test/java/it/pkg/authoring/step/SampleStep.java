package it.pkg.authoring.step;

import it.pkg.authoring.page.SamplePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.siv.support.service.Connection;
import io.siv.support.service.ConnectionFactory;
import io.siv.support.util.Waiter;

import org.openqa.selenium.Keys;

public class SampleStep {

	private SamplePage page;

	@Before("@Sample")
	public void before() {
		Connection con = ConnectionFactory.instanceOf(SampleStep.class);
		page = new SamplePage(con);
	}

	@After("@Sample")
	public void after() {
		page.close();
	}

	@Given("I am on Google search {string}")
	public void i_am_on_google_search(String url) {
		page.load(url);
	}

	@When("I type query as {string}")
	public void i_type_query_as(String query) {
		page.search.sendKeys(query, Keys.ENTER);
	}

	@Then("I should see title {string}")
	public void i_should_see_title(String expected) {
		Waiter.waitForPageTitle(page.driver(), expected);
	}
}