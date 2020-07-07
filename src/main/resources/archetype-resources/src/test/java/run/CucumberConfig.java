package ${package}.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true,
		plugin = { "pretty" },
		glue = "${package}.authoring.step",
		features = "src/test/resources/features")
public abstract class CucumberConfig {}