package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Orangehrm.feature",glue= {"stepdef"})
public class OrangehrmTestRunner {
  @Test
  public void f() {
  }
}
