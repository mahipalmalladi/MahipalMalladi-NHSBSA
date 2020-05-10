package com.nhs.project;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.nhs.project.stepdefinitions"},
        tags = {"@EndToEnd"},
        plugin = {"pretty", "json:target/Destination/cucumber.json", "html:target/Destination"}
)

public class TestRunner extends AbstractTestNGCucumberTests
{
}

