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

WebUI.setText(findTestObject('Master/Master_PPJK/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_PPJK/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_PPJK/a_Login'))

WebUI.maximizeWindow()

WebUI.focus(findTestObject('Master/Master_PPJK/a_Master'))

WebUI.click(findTestObject('Master/Master_PPJK/a_Master'))

WebUI.focus(findTestObject('Master/Master_PPJK/a_PPJK'))

WebUI.click(findTestObject('Master/Master_PPJK/a_PPJK'))

WebUI.click(findTestObject('Master/Master_PPJK/a_Create New'))

WebUI.setText(findTestObject('Master/Master_PPJK/input__ppjk_name'), '2222')

WebUI.click(findTestObject('Master/Master_PPJK/input__npwp'))

WebUI.sendKeys(findTestObject('Master/Master_PPJK/input__npwp'), Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_PPJK/input__npwp'), Keys.chord(Keys.NUMPAD6, Keys.NUMPAD4, Keys.NUMPAD2, Keys.NUMPAD7, 
        Keys.NUMPAD4, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD0, Keys.NUMPAD2, 
        Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD0, Keys.NUMPAD5, Keys.NUMPAD2, Keys.NUMPAD9))

WebUI.setText(findTestObject('Master/Master_PPJK/input__leader_name'), '2222')

WebUI.setText(findTestObject('Master/Master_PPJK/textarea__address'), '2222')

WebUI.click(findTestObject('Master/Master_PPJK/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_PPJK/a_Create New'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Yes, close it'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_PPJK/div_Name PPJK  NPWP  PPJK Lead  Address  In_30563f'))

WebUI.setText(findTestObject('Master/Master_PPJK/input__ppjk_name'), '33333')

WebUI.click(findTestObject('Master/Master_PPJK/input__npwp'))

WebUI.sendKeys(findTestObject('Master/Master_PPJK/input__npwp'), Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_PPJK/input__npwp'), Keys.chord(Keys.NUMPAD7, Keys.NUMPAD6, Keys.NUMPAD4, Keys.NUMPAD6, 
        Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, Keys.NUMPAD0, Keys.NUMPAD7, Keys.NUMPAD3, Keys.NUMPAD2, 
        Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD6, Keys.NUMPAD2, Keys.NUMPAD2, Keys.NUMPAD2))

WebUI.setText(findTestObject('Master/Master_PPJK/input__leader_name'), '3333')

WebUI.click(findTestObject('Master/Master_PPJK/div_Edit PPJKName PPJK  NPWP  PPJK Lead  Ad_086bc1'))

WebUI.setText(findTestObject('Master/Master_PPJK/textarea__address'), '3333')

WebUI.click(findTestObject('Master/Master_PPJK/button_Save'))

WebUI.delay(6, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master/Master_PPJK/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Yes, close it'))

WebUI.setText(findTestObject('Master/Master_PPJK/input'), '3333')

WebUI.click(findTestObject('Master/Master_PPJK/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Yes, delete it'))

WebUI.delay(1)

WebUI.click(findTestObject('Master/Master_PPJK/button_OK'))

WebUI.closeBrowser()

