package com.swaglabs.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/test/resources/features",
                glue = "com/swaglabs",
                tags = "@",
                dryRun = false
        )

public class TestRunner extends AbstractTestNGCucumberTests {
}
