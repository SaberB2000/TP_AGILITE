package org.example;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/client.feature"},
        glue = {"com.examples"}
)
public class RunCucumberTest {
}
