package bdd.octane;

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)
@CucumberOptions(features = {"src/test/resources"},
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