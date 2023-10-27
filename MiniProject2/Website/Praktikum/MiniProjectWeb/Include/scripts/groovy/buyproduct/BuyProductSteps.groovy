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



class BuyProductSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am On AltaShop After Login")
	def IAmOnAltaShopAfterLogin() {
		WebUI.callTestCase(findTestCase('Login/LoginWithCorrectData'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I Click Buy Button Product with Rp.0")
	def IClickBuyButtonWithRp0() {
		WebUI.click(findTestObject('Buy Product/RP.0 Product 1'))
	}

	@And("I Click Cart Icon for Buy Product with Rp.0")
	def ClickCartIconWithRp0() {
		WebUI.click(findTestObject('Buy Product/Cart Icon'))
	}

	@And("I Click Bayar Button 1")
	def ClickBayarButton1() {
		WebUI.click(findTestObject('Buy Product/Bayar Button'))
	}

	@Then("I verify Buy Product with Rp.0")
	def VerifyBuyProductWithRP0() {
		WebUI.verifyElementPresent(findTestObject('Buy Product/Verify Transaction'), 0)
		WebUI.closeBrowser()
	}

	@When("I Click Buy Button Product with 5 Different thing")
	def IClickBuyButtonWith5Differentthing() {
		WebUI.click(findTestObject('Buy Product/Buy Button'))

		WebUI.click(findTestObject('Buy Product/Buy Button 2'))

		WebUI.click(findTestObject('Buy Product/Buy Button 3'))

		WebUI.click(findTestObject('Buy Product/Buy Button 4'))

		WebUI.click(findTestObject('Buy Product/Buy Button 5'))
	}

	@And("I Click Cart Icon for Buy Product with 5 Different thing")
	def ClickCartIconWith5Differentthing() {
		WebUI.click(findTestObject('Buy Product/Cart Icon'))
	}

	@And("I Click Bayar Button 2")
	def ClickBayarButton2() {
		WebUI.click(findTestObject('Buy Product/Bayar Button'))
	}

	@Then("I verify Buy Product with 5 Different thing")
	def VerifyBuyProductWith5Differentthing() {
		WebUI.verifyElementPresent(findTestObject('Buy Product/Verify Transaction'), 0)
		WebUI.closeBrowser()
	}



	@When("I Click Buy Button Product with 3 Different Rp.0")
	def IClickBuyButtonWith3DifferentRp0() {
		WebUI.click(findTestObject('Buy Product/RP.0 Product 1'))

		WebUI.click(findTestObject('Buy Product/Rp.0 Product 2'))

		WebUI.click(findTestObject('Buy Product/Rp.0 Product 3'))
	}

	@And("I Click Cart Icon for Buy Product with 3 Different Rp.0")
	def ClickCartIconWith3DifferentRp0() {
		WebUI.click(findTestObject('Buy Product/Cart Icon'))
	}

	@And("I Click Bayar Button 3")
	def ClickBayarButton3() {
		WebUI.click(findTestObject('Buy Product/Bayar Button'))
	}

	@Then("I verify Buy Product with 3 Different Rp.0")
	def VerifyBuyProductWith3DifferentRp0() {
		WebUI.verifyElementPresent(findTestObject('Buy Product/Verify Transaction'), 0)

		WebUI.closeBrowser()
	}


	@When("I Click Buy Button Product with 10 Quantity")
	def IClickBuyButtonWith10Quantity() {
		WebUI.click(findTestObject('Buy Product/Buy Button'))
	}

	@And("I Click Cart Icon for Buy Product with 10 Quantity")
	def ClickCartIconWith10Quantity() {
		WebUI.click(findTestObject('Buy Product/Cart Icon'))

		WebUI.click(findTestObject('Buy Product/plus Button'))

		WebUI.click(findTestObject('Buy Product/plus Button'))

		WebUI.click(findTestObject('Buy Product/plus Button'))

		WebUI.click(findTestObject('Buy Product/plus Button'))

		WebUI.click(findTestObject('Buy Product/plus Button'))

		WebUI.click(findTestObject('Buy Product/plus Button'))

		WebUI.click(findTestObject('Buy Product/plus Button'))

		WebUI.click(findTestObject('Buy Product/plus Button'))

		WebUI.click(findTestObject('Buy Product/plus Button'))
	}

	@And("I Click Bayar Button 4")
	def ClickBayarButton4() {
		WebUI.click(findTestObject('Buy Product/Bayar Button'))
	}

	@Then("I verify Buy Product with 10 Quantity")
	def VerifyBuyProductWith10Quantity() {
		WebUI.verifyElementPresent(findTestObject('Buy Product/Verify Transaction'), 0)

		WebUI.closeBrowser()
	}

	@When("I Click Buy Button Product with Correct Condition")
	def IClickBuyButtonWithCorrectCondition() {
		WebUI.click(findTestObject('Buy Product/Buy Button'))
	}

	@And("I Click Cart Icon for Buy Product with Correct Condition")
	def ClickCartIconWithCorrectCondition() {
		WebUI.click(findTestObject('Buy Product/Cart Icon'))
	}

	@And("I Click Bayar Button 5")
	def ClickBayarButton5() {
		WebUI.click(findTestObject('Buy Product/Bayar Button'))
	}

	@Then("I verify Buy Product with Correct Condition")
	def VerifyBuyProductWithCorrectCondition() {
		WebUI.verifyElementPresent(findTestObject('Buy Product/Verify Transaction'), 0)

		WebUI.closeBrowser()
	}
}