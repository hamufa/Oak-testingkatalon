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

WebUI.setText(findTestObject('Object Repository/General_Setting/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/General_Setting/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/General_Setting/a_Login'))

WebUI.focus(findTestObject('General_Setting/a_Setting'))

WebUI.click(findTestObject('General_Setting/a_Setting'))

WebUI.click(findTestObject('Object Repository/General_Setting/a_General Setting'))

WebUI.click(findTestObject('Object Repository/General_Setting/span_Upload'))

WebUI.click(findTestObject('Object Repository/General_Setting/button_Cancel'))

WebUI.click(findTestObject('Object Repository/General_Setting/button_Upload'))

WebUI.uploadFile(findTestObject('General_Setting/input_Input Company Logo_logo'), 'C:\\Users\\tanto\\git\\Oak-testingkatalon\\Upload file test\\rsz_1rsz_alpha_rimba_logo.png')

WebUI.click(findTestObject('Object Repository/General_Setting/button_save'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.back()

WebUI.focus(findTestObject('General_Setting/label_Disable_Jobfile'))

WebUI.click(findTestObject('General_Setting/label_Disable_Jobfile'))

WebUI.click(findTestObject('General_Setting/label_Enable_Jobfile'))

WebUI.click(findTestObject('General_Setting/label_Disable_Detail_Jobfile'))

WebUI.click(findTestObject('General_Setting/label_Enable_Detail_Jobfile'))

WebUI.closeBrowser()

