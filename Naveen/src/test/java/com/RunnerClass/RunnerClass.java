package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\Ganesh\\eclipse-workspace\\Automation\\Naveen\\src\\test\\resources\\Feature\\login.feature",
glue = "com.Stepdefinition",
monochrome = true,
tags = "(@regularexpression)",
dryRun = false

)
public class RunnerClass {

}
