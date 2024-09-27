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


public class Profile {


	@Given("User open browser")
	public void user_open_browser() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl("https://secondhand.binaracademy.org/")
	}

	@Then ("User close browser")
	public void user_close_browser() {
		WebUI.closeBrowser()
	}

	@When("User has successfully logged in")
	public void user_has_successfully_logged_in() {
		WebUI.callTestCase(findTestCase('Step Definition/Login/User Login - Success_'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click the profile icon")
	public void user_click_the_profile_icon() {
		WebUI.callTestCase(findTestCase('SecondHand/Homepage_/Click Icon Profile'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click on the account name")
	public void user_click_on_the_account_name() {
		WebUI.callTestCase(findTestCase('SecondHand/Homepage_/Click Icon Profile Popup'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should be navigated to the Account Information page")
	public void user_should_be_navigated_to_the_Account_Information_page() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Verify Content Profile Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input name")
	public void user_input_name() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Input Nama'), [('nama') : "BEE"], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select city")
	public void user_select_city() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Select Kota'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input address")
	public void user_input_address() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Input Alamat'), [('alamat') : "Jalan Jakarta"], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input number handphone")
	public void user_input_number_handphone() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Input No Handphone'), [('noHp') : "08123456789"], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click simpan button")
	public void user_click_simpan_button() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Click Simpan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User can complete account profile")
	public void user_can_complete_account_profile() {
		WebUI.callTestCase(findTestCase('SecondHand/Homepage_/Verify Content Homepage After Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User leaves name field blank")
	public void user_leaves_name_field_blank() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Delete Nama'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User cant complete account profile")
	public void user_cant_complete_account_profile() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Verify Content Profile Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input photo profile")
	public void user_input_photo_profile() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Input Photo Profile'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User empty address")
	public void user_empty_address() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Delete Alamat'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User empty number handphone")
	public void user_empty_number_handphone() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Delete No Handphone'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User unselect city")
	public void user_unselect_city() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Unselect Kota'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User change photo profile")
	public void user_change_photo_profile() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Change Photo Profile'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}