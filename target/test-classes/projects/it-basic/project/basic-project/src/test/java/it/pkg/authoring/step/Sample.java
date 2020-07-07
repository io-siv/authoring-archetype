package it.pkg.authoring.step;

import it.pkg.authoring.page.Page;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.siv.support.service.Connection;
import io.siv.support.service.ConnectionFactory;

public class Sample {

	private Page page;

	@Before("@Sample")
	public void before() {
		Connection con = ConnectionFactory.instanceOf(Sample.class);
		page = new Page(con);
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
		// send keys
	}

	@Then("I submit")
	public void i_submit() {
		// submit the page
	}

	@Then("I should see title {string}")
	public void i_should_see_title(String title) {
		// Assert page title === title
	}
}