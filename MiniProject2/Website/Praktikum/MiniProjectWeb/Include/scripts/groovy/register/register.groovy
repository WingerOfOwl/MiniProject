package register
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



class register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am On AltaShop As A Guest")
	def IamOnAltaShopAsAGuest() {
		WebUI.openBrowser('https://alta-shop.vercel.app/')
		
		WebUI.maximizeWindow()
		
	}

	@When("I Click Login Button On AltaShop")
	def IClickLoginButtonOnRegister() {
		WebUI.click(findTestObject('Register/Login Button'))
	}

	@And("I Click Register Link")
	def IClickRegisterLink() {
		WebUI.click(findTestObject('Register/Register Link'))
	}
	
	@And("I Input Correct Name")
	def InputCorrectName() {
		WebUI.setText(findTestObject('Register/Nama Lengkap Field'), 'Atung1')
	}
	
	@And("I Input Correct Email")
	def IinputCorrectEmail() {
		WebUI.setText(findTestObject('Register/Email Field'), 'atung1@gmail.com')
	}
	
	@And("I Input Correct Password")
	def IinputCorrectPassword() {
		WebUI.setText(findTestObject('Register/Password Field'), 'sama')
		WebUI.click(findTestObject('Register/Register Button'))
	}
	
	@Then("I Have to Register")
	def IHaveToRegister() {
		
		
		WebUI.verifyElementPresent(findTestObject('Register/Verify Login'), 0)
		
		WebUI.closeBrowser()
	}
		
		@And("I Input Wrong some (.*)")
		def InputWrongName(String Name) {
			WebUI.setText(findTestObject('Register/Nama Lengkap Field'), Name)
		}
		
		@And("I Input Wrong an (.*)")
		def InputWrongEmailOnRegister(String Email1) {
			WebUI.setText(findTestObject('Register/Email Field'), Email1)
		}
		
		@And("I Input Wrong a (.*) On Register")
		def InputWrongPasswordOnRegister(String password1) {
			WebUI.setText(findTestObject('Register/Password Field'), password1)
			WebUI.click(findTestObject('Register/Register Button'))
		}
		
		@Then("Page Show Alert")
		def ICannotRegister() {
			
			
			WebUI.verifyElementPresent(findTestObject('Register/Alert Empty'), 0)
			
			WebUI.closeBrowser()
		
	}
	
	@And("I click AltaShop Icon On Register")
	def IClickAltaShopIcon() {
		WebUI.click(findTestObject('Register/altashop Icon'))
	}
	
	@Then("I Back To Main Menu")
	def IBackToMainMenu() {
		WebUI.verifyElementPresent(findTestObject('Register/Verify Main Menu'), 0)
		
		WebUI.closeBrowser()
		
		
	
}

@And("I click Cart Icon On Register")
def IClickCartIconFromRegister() {
WebUI.click(findTestObject('Register/Cart Icon'))
}

@Then("I am On Cart Page")
def IamOnCartPageFromRegister() {
	
	WebUI.verifyElementPresent(findTestObject('Register/Verify Cart'), 0)
	
	WebUI.closeBrowser()
	


}
}

