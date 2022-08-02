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

WebUI.setText(findTestObject('Master/Master_Tax/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Tax/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Tax/a_Login'))

WebUI.focus(findTestObject('Master/Master_Tax/a_Master'))

WebUI.click(findTestObject('Master/Master_Tax/a_Master'))

WebUI.focus(findTestObject('Master/Master_Tax/a_Master Tax'))

WebUI.click(findTestObject('Master/Master_Tax/a_Master Tax'))

WebUI.click(findTestObject('Master/Master_Tax/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Tax/input__percentage'), '20')

WebUI.setText(findTestObject('Master/Master_Tax/textarea_Description_description'), '33333')

WebUI.click(findTestObject('Master/Master_Tax/button_Save'))

WebUI.delay(4)

WebUI.click(findTestObject('Master/Master_Tax/a_Create New'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Tax/button_Yes, close it'))

WebUI.delay(4)

WebUI.click(findTestObject('Master/Master_Tax/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Tax/div_Edit PercentagePercentage  DescriptionI_dbf609'))

WebUI.setText(findTestObject('Master/Master_Tax/input__percentage'), '80')

WebUI.click(findTestObject('Master/Master_Tax/div_Edit PercentagePercentage  DescriptionI_dbf609'))

WebUI.setText(findTestObject('Master/Master_Tax/textarea_Description_description'), 'ayam ayam')

WebUI.click(findTestObject('Master/Master_Tax/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Tax/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Tax/button_Yes, close it'))

WebUI.delay(4)

WebUI.setText(findTestObject('Master/Master_Tax/input'), 'ayam')

WebUI.click(findTestObject('Master/Master_Tax/button_ayam ayam_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Tax/button_ayam ayam_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Tax/button_Yes, delete it'))

WebUI.delay(2)

WebUI.click(findTestObject('Master/Master_Tax/button_OK'))

WebUI.closeBrowser()

