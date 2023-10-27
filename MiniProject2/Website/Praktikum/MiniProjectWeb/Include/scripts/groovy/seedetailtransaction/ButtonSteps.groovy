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



class ButtonSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am On AltaShop for Verify See Detail Transaction 2")
	def IamOnAltaShopforDetailTransaction() {
		WebUI.callTestCase(findTestCase('Buy Product/BuyProductWith5DifferentProduct'), [:], FailureHandling.STOP_ON_FAILURE)

	}

	@When("I Click Transaction Button 2")
	def IClickTransactioButton() {
		WebUI.click(findTestObject('See Detail Transaction/Account Icon'))
		
		WebUI.click(findTestObject('See Detail Transaction/Transaction Button'))
		
	}
	
	@And("I Click Filter Product Button")
	def IClickProductButton() {
		
		WebUI.click(findTestObject('See Detail Transaction/Filter Product'))
		
	}
	
	@Then("I Verify the rows for Product")
	def IVerifyProductButton() {
		WebUI.verifyElementPresent(findTestObject('See Detail Transaction/Verify Transaction'), 0)
		
		WebUI.closeBrowser()
		
		
	}
	
	@And("I Click Filter Harga Button")
	def IClickHargaButton() {
		
		WebUI.click(findTestObject('See Detail Transaction/Filter Harga'))
		
	}
	
	@Then("I Verify the rows for Harga")
	def IVerifyHargaButton() {
		WebUI.verifyElementPresent(findTestObject('See Detail Transaction/Verify Transaction'), 0)
		
		WebUI.closeBrowser()
		
		
	}
	
	@And("I Click Filter Banyaknya Button")
	def IClickBanyaknyaButton() {
		
		WebUI.click(findTestObject('See Detail Transaction/Filter Banyaknya'))
		
	}
	
	@Then("I Verify the rows for Banyaknya")
	def IVerifyBanyaknyaButton() {
		WebUI.verifyElementPresent(findTestObject('See Detail Transaction/Verify Transaction'), 0)
		
		WebUI.closeBrowser()
		
	}
	
	@And("I Click Filter SubTotal Button")
	def IClickSubtotalButton() {
		
		WebUI.click(findTestObject('See Detail Transaction/Filter Sub-Total'))
		
	}
	
	@Then("I Verify the rows for Subtotal")
	def IVerifySubtotalButton() {
		WebUI.verifyElementPresent(findTestObject('See Detail Transaction/Verify Transaction'), 0)
		
		WebUI.closeBrowser()
		
	}
	
	@And("I Click Previous Button")
	def IClickPreviousButton() {
		WebUI.click(findTestObject('See Detail Transaction/button next'))
		
		WebUI.click(findTestObject('See Detail Transaction/Button Previous'))
		
	}
	
	@Then("I Verify Previous Button")
	def IVerifyPreviousButton() {
		WebUI.verifyElementPresent(findTestObject('See Detail Transaction/Verify Transaction'), 0)
		
		WebUI.closeBrowser()
		
		
	}
	
	@And("I Click Next Button")
	def IClickNextButton() {
		WebUI.click(findTestObject('See Detail Transaction/button next'))
	}
	
	@Then("I Verify Change Next Row")
	def IVerifyNextButton() {
		WebUI.verifyElementPresent(findTestObject('See Detail Transaction/Verify Transaction'), 0)
		
		WebUI.closeBrowser()
		
	}
}
