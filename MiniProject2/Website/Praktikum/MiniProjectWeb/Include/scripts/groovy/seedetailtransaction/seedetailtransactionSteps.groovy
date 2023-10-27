package seedetailtransaction
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



class seedetailtransactionSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am On AltaShop for Verify See Detail Transaction")
	def IamOnAltaShopforDetailTransaction() {
		WebUI.callTestCase(findTestCase('Login/LoginWithCorrectData'), [:], FailureHandling.STOP_ON_FAILURE)
		
	}

	@When("I Click Transaction Button")
	def IClickTransactioButton() {
		WebUI.click(findTestObject('See Detail Transaction/Account Icon'))
		
		WebUI.click(findTestObject('See Detail Transaction/Transaction Button'))
		
	}

	@Then("I verify Transaction Page")
	def IVerifyTransactionPage() {
		WebUI.verifyElementPresent(findTestObject('See Detail Transaction/Verify Transaction'), 0)
		
	}
	
	@And("I Click Row Filter for 5 Rows")
	def IClick5RowsDropdown() {
		WebUI.click(findTestObject('See Detail Transaction/Select Dropdown button'))
		
		WebUI.click(findTestObject('See Detail Transaction/5 Rows'))
		
	}
	
	@Then("I Verify the rows for 5 Rows")
	def IVerify5Rows() {
		WebUI.verifyElementPresent(findTestObject('See Detail Transaction/Verify Transaction'), 0)
		
	}
	
	@And("I Click Row Filter for 10 Rows")
	def IClick10RowsDropdown() {
		WebUI.click(findTestObject('See Detail Transaction/Select Dropdown button'))
		
		WebUI.click(findTestObject('See Detail Transaction/10 Rows'))
	}
	
	@Then("I Verify the rows for 10 Rows")
	def IVerify10Rows() {
		WebUI.verifyElementPresent(findTestObject('See Detail Transaction/Verify Transaction'), 0)
		
		WebUI.closeBrowser()
	}
	
	@And("I Click Row Filter for 15 Rows")
	def IClick15RowsDropdown() {
		WebUI.click(findTestObject('See Detail Transaction/Select Dropdown button'))
		
		WebUI.click(findTestObject('See Detail Transaction/15 Rows'))
		
	}
	
	@Then("I Verify the rows for 15 Rows")
	def IVerify15Rows() {
		WebUI.verifyElementPresent(findTestObject('See Detail Transaction/Verify Transaction'), 0)
		
		WebUI.closeBrowser()
		
	}
	
	@And("I Click Row Filter for All Rows")
	def IClickALLRowsDropdown() {
		WebUI.click(findTestObject('See Detail Transaction/Select Dropdown button'))
		
		WebUI.click(findTestObject('See Detail Transaction/All Rows'))
		
	}
	
	@Then("I Verify the rows for All Rows")
	def IVerifyALLRows() {
		WebUI.verifyElementPresent(findTestObject('See Detail Transaction/Verify Transaction'), 0)
		
		WebUI.closeBrowser()
		
	}
	
}