package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",snippets=SnippetType.CAMELCASE,glue="org.stepdefinition",dryRun=false,
plugin= {"pretty","src\\test\\resources\\Reports"})

public class Vmmapsrunner {

}
