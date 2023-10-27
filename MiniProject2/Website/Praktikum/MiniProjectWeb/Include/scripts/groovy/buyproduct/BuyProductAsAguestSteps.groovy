package buyproduct
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



class BuyProductAsAguestSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am On AltaShop before Login")
	def IAmOnAltaShopBeforeLogin() {
		WebUI.openBrowser('https://alta-shop.vercel.app/')

WebUI.maximizeWindow()
	}

	@When("I Click Buy Button Product As a Guest")
	def IClickBuyButtonAsAGuest() {
		WebUI.click(findTestObject('Buy Product/Buy Button'))
	}

	@And("I Click Cart Icon for Buy Product As a Guest")
	def ClickCartIconAsAGuest() {
		WebUI.click(findTestObject('Buy Product/Cart Icon'))

	}

	@And("I Click Bayar Button 6")
	def ClickBayarAsAGuest() {
		WebUI.click(findTestObject('Buy Product/Bayar Button'))
	}

	@Then("I verify Buy Product As a Guest")
	def VerifyBuyProductAsAGuest() {
		WebUI.verifyElementPresent(findTestObject('Register/Verify Login'), 0)

WebUI.closeBrowser()
	}
}