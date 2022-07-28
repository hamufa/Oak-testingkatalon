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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dummy.oaktree.id/admin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Marketing_DashBoard/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Marketing_DashBoard/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/a_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/a_Marketing'))

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/input_Dashboard_date'))

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/span_2021'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Marketing_DashBoard/select_All Marketing dwira  dika  kofyifilm_b3638f'), 
    '122', true)

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/input_Dashboard_date'))

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/span_2022'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Marketing_DashBoard/select_All Marketing dwira  dika  kofyifilm_b3638f'), 
    'null', true)

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/input_Dashboard_date'))

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/span_2020'))

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/span_Info Inputed_fc-icon fc-icon-chevron-left'))

WebUI.focus(findTestObject('Object Repository/Marketing_DashBoard/div_329a dwira'))

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/div_329a dwira'))

WebUI.focus(findTestObject('Object Repository/Marketing_DashBoard/strong_Go to Oaktree'))

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/strong_Go to Oaktree'))

WebUI.closeWindowUrl('https://app.oaktree.id/admin')

WebUI.switchToWindowUrl('https://crm-dev.rimbahouse.com/')

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/button_Close Me'))

WebUI.click(findTestObject('Object Repository/Marketing_DashBoard/button_today'))

WebUI.closeBrowser()

