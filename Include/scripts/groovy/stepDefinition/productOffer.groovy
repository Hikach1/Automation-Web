package stepDefinition
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

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows




public class productOffer {

	@When("User has successfully login")
	public void user_has_successfully_login() {
		WebUI.callTestCase(findTestCase('Step Definition/Login/User Login - Success_1'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input search product")
	public void user_input_search_product() {
		WebUI.callTestCase(findTestCase('SecondHand/Product Offer/Input Product Search Bar'), [('namaProdukSearch') : 'Sapi_1'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click product")
	public void user_click_product() {
		WebUI.callTestCase(findTestCase('SecondHand/Product Offer/Click Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should be navigated to the product page")
	public void user_should_be_navigated_to_the_product_page() {
		WebUI.callTestCase(findTestCase('SecondHand/Product Offer/Verify Content Cart Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click negotiate button")
	public void user_click_negotiate_button() {
		WebUI.callTestCase(findTestCase('SecondHand/Product Offer/Click Nego'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should be navigated to the product popup page")
	public void user_should_be_navigated_to_the_product_popup_page() {
		WebUI.callTestCase(findTestCase('SecondHand/Product Offer/Verify Content Cart Popup Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should be navigated to the login page")
	public void user_should_be_navigated_to_the_login_page() {
		WebUI.callTestCase(findTestCase('SecondHand/Login_/Verify Content Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input negotiate price")
	public void user_input_negotiate_price() {
		WebUI.callTestCase(findTestCase('SecondHand/Product Offer/Input Harga Tawar'), [('hargaTawar') : '10000'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click send button")
	public void user_click_send_button() {
		WebUI.callTestCase(findTestCase('SecondHand/Product Offer/Click Kirim'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input negotiate zero price")
	public void user_input_negotiate_zero_price() {
		WebUI.callTestCase(findTestCase('SecondHand/Product Offer/Input Harga Tawar'), [('hargaTawar') : '0'], FailureHandling.STOP_ON_FAILURE)
	}
}