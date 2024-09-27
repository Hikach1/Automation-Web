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



public class AddNewProduct {

	@When("User click plus jual button")
	public void user_click_plus_jual_button() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Click Plus Jual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should be navigated to the add new product page")
	public void user_should_be_navigated_to_the_add_new_product_page() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Verify Content Add New Product Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input name product")
	public void user_input_name_product() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Nama Produk'), [('namaProduk') : 'bla_'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input price product")
	public void user_input_price_product() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Harga Produk'), [('hargaProduk') : '40000'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input category product")
	public void user_input_category_product() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Select Kategori Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input description product")
	public void user_input_description_product() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Deskripsi Produk'), [('deskripsiProduk') : 'bla_bla'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input photo product")
	public void user_input_photo_product() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Photo Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click terbitkan button")
	public void user_click_terbitkan_button() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Click Terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User successfully added product")
	public void user_successfully_added_product() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Verify Content After Publish Product Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User unsuccessfully added product because product price")
	public void user_unsuccessfully_added_product_because_product_price() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Verify Error'), [('expected') : 'Price can\'t be blank'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input alphanumeric description product")
	public void user_input_alphanumeric_description_product() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Deskripsi Produk'), [('deskripsiProduk') : 'blabla123'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input alphabet price product")
	public void user_input_alphabet_price_product() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Harga Produk'), [('hargaProduk') : 'abcd'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User get notification must login")
	public void user_get_notification_must_login() {
		WebUI.callTestCase(findTestCase('SecondHand/Login_/Verify Error Login'), [('expected') : 'You need to sign in or sign up before continuing.'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User unsuccessfully added product because product name")
	public void user_unsuccessfully_added_product_because_product_name() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Verify Error'), [('expected') : 'Name can\'t be blank'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User unsuccessfully added product because product category")
	public void user_unsuccessfully_added_product_because_product_category() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Verify Error'), [('expected') : 'Category must exist'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User unsuccessfully added product because product description")
	public void user_unsuccessfully_added_product_because_product_description() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Verify Error'), [('expected') : 'Description can\'t be blank'], FailureHandling.STOP_ON_FAILURE)
	}
}


