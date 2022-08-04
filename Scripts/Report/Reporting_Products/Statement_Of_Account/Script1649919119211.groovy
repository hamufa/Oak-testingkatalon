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

WebUI.setText(findTestObject('Settings_Statement_Of_Account/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Settings_Statement_Of_Account/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Settings_Statement_Of_Account/a_Login'))

WebUI.maximizeWindow()

WebUI.maximizeWindow()

WebUI.focus(findTestObject('Settings_Statement_Of_Account/a_Report'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/a_Report'))

WebUI.focus(findTestObject('Settings_Statement_Of_Account/a_Statement Of Account'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/a_Statement Of Account'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/span_Select Agent'))

WebUI.setText(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), 'dimas')

WebUI.sendKeys(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Settings_Statement_Of_Account/span_Custom'))

WebUI.setText(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), 'Custom')

WebUI.sendKeys(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Settings_Statement_Of_Account/input_Start Date_start_date'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/th_'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/td_1'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/button_Preview'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/a_Filter'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/button_Preview'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/a_Export to Pdf'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Settings_Statement_Of_Account/span_Custom'))

WebUI.setText(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), 'Monthly')

WebUI.sendKeys(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Settings_Statement_Of_Account/input_Year_chart_year'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/li_2021'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/span_January'))

WebUI.setText(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), 'December')

WebUI.sendKeys(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Settings_Statement_Of_Account/button_Preview'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/a_Filter'))

WebUI.delay(4)

WebUI.closeBrowser()

