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



class AddItemSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am On On Your Groceries")
	def ImOnYourGroceries() {
		Mobile.startApplication('C:\\Users\\murdo\\Downloads\\app-debug.apk', false)
	}

	@When("I Click Icon for Navigate to Add Item")
	def IClickFeatureforNavigatetoAddItem() {
		Mobile.tap(findTestObject('Add Item Feature button'), 0)
	}

	@And("I Add an Correct Data")
	def InputanCorrectData() {
		Mobile.tap(findTestObject('Name Field'), 0)

		Mobile.setText(findTestObject('Name Field'), 'Vegyy', 0)

		Mobile.tap(findTestObject('Quantity Field'), 0)

		Mobile.setText(findTestObject('Quantity Field'), '100', 0)

		Mobile.tap(findTestObject('Dropdown'), 0)

		Mobile.tap(findTestObject('Vegetables Categories'), 0)
	}

	@And("I click Add Item Button 1")
	def IClickAddButton1() {
		Mobile.tap(findTestObject('Add Item Button'), 0)
	}

	@Then("I verify Add Item With Correct Data")
	def IVerifyAddItemWithCorrectData() {
		Mobile.verifyElementExist(findTestObject('Your Groceries Logo'), 0)
		Mobile.closeApplication()
	}

	@And("I Add with Alphabet On Quantity")
	def IInputAlphabetOnQuantity() {
		Mobile.tap(findTestObject('Name Field'), 0)

		Mobile.setText(findTestObject('Name Field'), 'Vegyyy', 0)

		Mobile.tap(findTestObject('Quantity Field'), 0)

		Mobile.setText(findTestObject('Quantity Field'), 'Jiddan HAHAHAHAH', 0)

		Mobile.tap(findTestObject('Dropdown'), 0)

		Mobile.tap(findTestObject('Vegetables Categories'), 0)
	}

	@And("I click Add Item Button 2")
	def IClickAddItemButton2() {
		Mobile.tap(findTestObject('Add Item Button'), 0)
	}

	@Then("I verify Add Item with Alphabet On Quantity")
	def IVerifyAddItemWithAlphabetOnQuantity() {
		Mobile.verifyElementExist(findTestObject('Empty Quantity'), 0)
		Mobile.closeApplication()
	}

	@And("I Add with Empty Field")
	def IInputWithEmptyField() {
		Mobile.tap(findTestObject('Name Field'), 0)

		Mobile.setText(findTestObject('Name Field'), '', 0)

		Mobile.tap(findTestObject('Quantity Field'), 0)

		Mobile.setText(findTestObject('Quantity Field'), '', 0)

		Mobile.tap(findTestObject('Dropdown'), 0)

		Mobile.tap(findTestObject('Vegetables Categories'), 0)
	}

	@And("I click Add Item Button 3")
	def IClickAddItemButton3() {
		Mobile.tap(findTestObject('Add Item Button'), 0)
	}

	@Then("I verify Add Item with Empty Field")
	def IVerifyAddItemWithEmptyField() {
		Mobile.verifyElementExist(findTestObject('Empty Name'), 0)
		Mobile.verifyElementExist(findTestObject('Empty Quantity'), 0)
		Mobile.closeApplication()
	}

	@And("I Add with Empty Name Field")
	def IInputWithEmptyNameField() {
		Mobile.tap(findTestObject('Name Field'), 0)

		Mobile.setText(findTestObject('Name Field'), '', 0)

		Mobile.tap(findTestObject('Quantity Field'), 0)

		Mobile.setText(findTestObject('Quantity Field'), '100', 0)

		Mobile.tap(findTestObject('Dropdown'), 0)

		Mobile.tap(findTestObject('Vegetables Categories'), 0)
	}

	@And("I click Add Item Button 4")
	def IClickAddItemButton4() {
		Mobile.tap(findTestObject('Add Item Button'), 0)
	}

	@Then("I verify Add Item with Empty Name Field")
	def IVerifyAddItemWithEmptyNameField() {
		Mobile.verifyElementExist(findTestObject('Empty Name'), 0)
		Mobile.closeApplication()
	}

	@And("I Add with Empty Quantity Field")
	def IInputWithEmptyQuantityField() {
		Mobile.tap(findTestObject('Name Field'), 0)

		Mobile.setText(findTestObject('Name Field'), 'Vegyyy', 0)

		Mobile.tap(findTestObject('Quantity Field'), 0)

		Mobile.setText(findTestObject('Quantity Field'), '', 0)

		Mobile.tap(findTestObject('Dropdown'), 0)

		Mobile.tap(findTestObject('Vegetables Categories'), 0)
	}

	@And("I click Add Item Button 5")
	def IClickAddItemButton5() {
		Mobile.tap(findTestObject('Add Item Button'), 0)
	}

	@Then("I verify Add Item with Empty Quantity Field")
	def IVerifyAddItemWithEmptyQuantityField() {
		Mobile.verifyElementExist(findTestObject('Empty Quantity'), 0)
		Mobile.closeApplication()
	}

	@And("I Add with More than 50 Character on Name")
	def IInputMoreThan50CharacterOnNam() {
		Mobile.tap(findTestObject('Name Field'), 0)

		Mobile.setText(findTestObject('Name Field'), 'HAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHA', 0)

		Mobile.tap(findTestObject('Quantity Field'), 0)

		Mobile.setText(findTestObject('Quantity Field'), '40', 0)

		Mobile.tap(findTestObject('Dropdown'), 0)

		Mobile.tap(findTestObject('Vegetables Categories'), 0)
	}


	@Then("I verify Add Item with More than 50 Character on Name")
	def IVerifyAddItemWithMoreThan50CharacterOnName() {
		Mobile.closeApplication()
	}

	@And("I Add with Spesial Character on Quantity")
	def IInputWithSpesialCharaterOnQuantity() {
		Mobile.tap(findTestObject('Name Field'), 0)

		Mobile.setText(findTestObject('Name Field'), 'Vegyy', 0)

		Mobile.tap(findTestObject('Quantity Field'), 0)

		Mobile.setText(findTestObject('Quantity Field'), '!!!##$@', 0)

		Mobile.tap(findTestObject('Dropdown'), 0)

		Mobile.tap(findTestObject('Vegetables Categories'), 0)
	}

	@And("I click Add Item Button 7")
	def IClickAddItemButton7() {
		Mobile.tap(findTestObject('Add Item Button'), 0)
	}

	@Then("I verify Add Item with Spesial Character on Quantity")
	def IVerifyAddItemWithSpesialCharacterOnQuantity() {
		Mobile.verifyElementExist(findTestObject('Empty Quantity'), 0)
		Mobile.closeApplication()
	}

	@And("I Addss Empty Field")
	def InputEmptyField() {
		Mobile.tap(findTestObject('Name Field'), 0)

		Mobile.setText(findTestObject('Name Field'), '', 0)

		Mobile.tap(findTestObject('Quantity Field'), 0)

		Mobile.setText(findTestObject('Quantity Field'), '', 0)

		Mobile.tap(findTestObject('Dropdown'), 0)

		Mobile.tap(findTestObject('Vegetables Categories'), 0)
	}

	@And("I click Back Arrow Button")
	def IClickBackArrowButton() {
		Mobile.tap(findTestObject('Back Button'), 0)
	}

	@Then("I verify Back Arrow Button")
	def IVerifyBackArrowButton() {
		Mobile.verifyElementExist(findTestObject('Your Groceries Logo'), 0)
		Mobile.closeApplication()
	}
}