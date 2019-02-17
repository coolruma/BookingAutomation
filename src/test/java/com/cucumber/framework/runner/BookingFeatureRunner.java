/**
 * @author rahul.rathore
 *	
 *	14-Aug-2016
 */
package com.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile" },tags="@flight, @tour, @hotel", glue = {
		"classpath:com.cucumber.framework.stepdefinition"})
public class BookingFeatureRunner extends AbstractTestNGCucumberTests {
}
