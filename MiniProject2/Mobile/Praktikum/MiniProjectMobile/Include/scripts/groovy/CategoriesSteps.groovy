import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class CategoriesSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am On On Your Groceries 2")
	def ImOnYourGroceries2() {
		Mobile.startApplication('C:\\Users\\murdo\\Downloads\\app-debug.apk', false)
	}

	@When("I Click Icon for Navigate to Add Item 2")
	def IClickFeatureforNavigatetoAddItem2() {
		Mobile.tap(findTestObject('Add Item Feature button'), 0)
	}

	@And("I Input (.*)")
	def IInputCategory(String category) {
		Mobile.tap(findTestObject('Name Field'), 0)

		Mobile.setText(findTestObject('Name Field'), 'Vegyy', 0)

		Mobile.tap(findTestObject('Quantity Field'), 0)

		Mobile.setText(findTestObject('Quantity Field'), '100', 0)

		Mobile.tap(findTestObject('Dropdown'), 0)

		Mobile.tap(findTestObject(category), 0)
	}

	@And("I Click Add Item Button 8")
	def IClickAddItemButton8() {
		Mobile.tap(findTestObject('Add Item Button'), 0)
	}

	@Then("I Add Item Verify Vegatables Category")
	def IAddItemVerify() {
		Mobile.verifyElementExist(findTestObject('Your Groceries Logo'), 0)
		Mobile.closeApplication()
	}
}