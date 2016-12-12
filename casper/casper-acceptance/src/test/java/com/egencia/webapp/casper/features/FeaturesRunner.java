package com.egencia.webapp.casper.features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"com.egencia.webapp.casper", "cucumber.runtime.java.spring.hooks"},
                 features = "src/test/resources/features",
                 format = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"})
public class FeaturesRunner {}
