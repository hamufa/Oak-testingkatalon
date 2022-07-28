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

WebUI.setText(findTestObject('Settings_Accurate_Access/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Settings_Accurate_Access/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Settings_Accurate_Access/a_Login'))

WebUI.click(findTestObject('Settings_Accurate_Access/a_Setting'))

WebUI.click(findTestObject('Settings_Accurate_Access/span_Accurate Access'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Create New'))

WebUI.setText(findTestObject('Settings_Accurate_Access/input__name'), '22222')

WebUI.click(findTestObject('Settings_Accurate_Access/span_Permission'))

WebUI.sendKeys(findTestObject('Settings_Accurate_Access/Input_Text_Permission'), 'Selling Save')

WebUI.sendKeys(findTestObject('Settings_Accurate_Access/span_Permission'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Settings_Accurate_Access/Input_Text_Permission'), 'Selling Delete')

WebUI.sendKeys(findTestObject('Settings_Accurate_Access/span_Permission'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Settings_Accurate_Access/textarea_Description_description'), '222')

WebUI.click(findTestObject('Settings_Accurate_Access/span__select2-selection__arrow'))

WebUI.setText(findTestObject('Settings_Accurate_Access/input_Text_Country'), 'Jakarta')

WebUI.sendKeys(findTestObject('Settings_Accurate_Access/input_Text_Country'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Settings_Accurate_Access/button_Save'), 8)

WebUI.click(findTestObject('Settings_Accurate_Access/button_Create New'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Cancel'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Cancel_1_Edit'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Cancel'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Yes, close it'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Edit'))

WebUI.setText(findTestObject('Settings_Accurate_Access/input__name'), '3333')

WebUI.click(findTestObject('Settings_Accurate_Access/span_JAKARTA'))

WebUI.setText(findTestObject('Settings_Accurate_Access/input_Text_Country'), 'Surabaya')

WebUI.sendKeys(findTestObject('Settings_Accurate_Access/input_Text_Country'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Settings_Accurate_Access/span_Permission'))

WebUI.click(findTestObject('Settings_Accurate_Access/span_Permission_Delete'))

WebUI.sendKeys(findTestObject('Settings_Accurate_Access/Input_Text_Permission'), 'Selling View')

WebUI.sendKeys(findTestObject('Settings_Accurate_Access/span_Permission'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Settings_Accurate_Access/textarea_Description_description'), '3333')

WebUI.click(findTestObject('Settings_Accurate_Access/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Settings_Accurate_Access/button_Save'), 8)

WebUI.click(findTestObject('Settings_Accurate_Access/button_Edit'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Cancel'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Cancel_1_Edit'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Cancel'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Yes, close it'))

WebUI.setText(findTestObject('Settings_Accurate_Access/input_Text_Search'), '3333')

WebUI.click(findTestObject('Settings_Accurate_Access/button_Delete'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Cancel_1_Edit'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Delete'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Yes, delete it'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_OK'))

WebUI.closeBrowser()

