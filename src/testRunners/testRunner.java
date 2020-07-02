package bdd.octane;

import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import com.hpe.alm.octane.OctaneCucumber;

@RunWith(OctaneCucumber.class)
@CucumberOptions(features = {"src/main/resources/features"},
    plugin = {"pretty",
        "json:RunResult/cucumber.json",
        "junit:RunResult/cucumber.xml",
        "junit:RunResult/cucumber.html"
    },
    glue = {"bdd.octane"})
public class TestRunner {
    @Test
    public void test(){}

}