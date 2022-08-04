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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dummy.oaktree.id/admin')

WebUI.setText(findTestObject('Object Repository/Report_Daily/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Report_Daily/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Report_Daily/a_Login'))

WebUI.maximizeWindow()

WebUI.focus(findTestObject('Object Repository/Report_Daily/a_Report'))

WebUI.click(findTestObject('Object Repository/Report_Daily/a_Report'))

WebUI.focus(findTestObject('Object Repository/Report_Daily/a_Daily'))

WebUI.click(findTestObject('Object Repository/Report_Daily/a_Daily'))

WebUI.click(findTestObject('Object Repository/Report_Daily/input_Date_end_date'))

WebUI.click(findTestObject('Object Repository/Report_Daily/td_14'))

WebUI.click(findTestObject('Object Repository/Report_Daily/a_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_Daily/select_AllExportImportDomestic'), '1', true)

WebUI.click(findTestObject('Object Repository/Report_Daily/input_Date_end_date'))

WebUI.click(findTestObject('Object Repository/Report_Daily/td_12'))

WebUI.click(findTestObject('Object Repository/Report_Daily/a_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_Daily/select_AllExportImportDomestic'), '2', true)

WebUI.click(findTestObject('Object Repository/Report_Daily/input_Date_end_date'))

WebUI.click(findTestObject('Object Repository/Report_Daily/td_11'))

WebUI.click(findTestObject('Object Repository/Report_Daily/a_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_Daily/select_AllExportImportDomestic'), '3', true)

WebUI.click(findTestObject('Object Repository/Report_Daily/input_Date_end_date'))

WebUI.click(findTestObject('Object Repository/Report_Daily/th_'))

WebUI.click(findTestObject('Object Repository/Report_Daily/td_17'))

WebUI.click(findTestObject('Object Repository/Report_Daily/a_Filter'))

WebUI.delay(3)

WebUI.closeBrowser()

