package it.pkg.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true,
		plugin = { "pretty" },
		glue = "it.pkg.authoring.step",
		features = "src/test/resources/features")
public abstract class CucumberConfig {}