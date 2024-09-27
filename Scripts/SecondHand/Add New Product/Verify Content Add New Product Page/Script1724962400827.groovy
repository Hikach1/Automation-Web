import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.verifyTextPresent('Nama Produk', false)

WebUI.verifyTextPresent('Harga Produk', false)

WebUI.verifyTextPresent('Kategori', false)

WebUI.verifyTextPresent('Deskripsi', false)

WebUI.verifyElementPresent(findTestObject('secondhand-page/Add New Product/back_button'), 0)

WebUI.verifyElementPresent(findTestObject('secondhand-page/Add New Product/deskripsi_field'), 0)

WebUI.verifyElementPresent(findTestObject('secondhand-page/Add New Product/hargaProduk_field'), 0)

WebUI.verifyElementPresent(findTestObject('secondhand-page/Add New Product/kategoriProduk_selectform'), 0)

WebUI.verifyElementPresent(findTestObject('secondhand-page/Add New Product/namaProduk_field'), 0)

WebUI.verifyElementPresent(findTestObject('secondhand-page/Add New Product/preview_button'), 0)

WebUI.verifyElementPresent(findTestObject('secondhand-page/Add New Product/terbitkanBeforeAdd_button'), 0)

WebUI.verifyElementPresent(findTestObject('secondhand-page/Add New Product/uploadPhotoProduk_form'), 0)

