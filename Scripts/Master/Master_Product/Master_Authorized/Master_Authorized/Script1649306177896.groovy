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

WebUI.setText(findTestObject('Master/Master_Authorized/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Authorized/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Authorized/a_Login'))

WebUI.maximizeWindow()

WebUI.focus(findTestObject('Master/Master_Authorized/a_Master'))

WebUI.click(findTestObject('Master/Master_Authorized/a_Master'))

WebUI.focus(findTestObject('Master/Master_Authorized/a_Authorized'))

WebUI.click(findTestObject('Master/Master_Authorized/a_Authorized'))

WebUI.click(findTestObject('Master/Master_Authorized/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Name_name'), '2222')

WebUI.setText(findTestObject('Master/Master_Authorized/input_Position_position'), '2222')

WebUI.setText(findTestObject('Master/Master_Authorized/input_Company Name_company_name'), '2222')

WebUI.setText(findTestObject('Master/Master_Authorized/input_Address_company_address'), '2222')

WebUI.setText(findTestObject('Master/Master_Authorized/input_TelpFax_telp_fax'), '2222')

WebUI.click(findTestObject('Master/Master_Authorized/input_NPWP_npwp'))

WebUI.sendKeys(findTestObject('Master/Master_Authorized/input_NPWP_npwp'), Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, 
        Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_Authorized/input_NPWP_npwp'), Keys.chord(Keys.NUMPAD6, Keys.NUMPAD4, Keys.NUMPAD2, 
        Keys.NUMPAD7, Keys.NUMPAD4, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD0, 
        Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD0, Keys.NUMPAD5, Keys.NUMPAD2, Keys.NUMPAD9))

WebUI.click(findTestObject('Master/Master_Authorized/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Authorized/a_Create New'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Yes, close it'))

WebUI.delay(4)

WebUI.click(findTestObject('Master/Master_Authorized/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Authorized/div_Edit AuthorizedNamePositionCompany Name_88cade'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Name_name'), '33333')

WebUI.click(findTestObject('Master/Master_Authorized/div_NamePositionCompany NameNPWPAddressTelpFax'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Position_position'), '3333')

WebUI.click(findTestObject('Master/Master_Authorized/div_Edit AuthorizedNamePositionCompany Name_88cade'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Company Name_company_name'), '3333')

WebUI.click(findTestObject('Master/Master_Authorized/div_Edit AuthorizedNamePositionCompany Name_88cade'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Address_company_address'), '3333')

WebUI.setText(findTestObject('Master/Master_Authorized/input_TelpFax_telp_fax'), '3')

WebUI.click(findTestObject('Master/Master_Authorized/div_Edit AuthorizedNamePositionCompany Name_88cade'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_TelpFax_telp_fax'), '3333')

WebUI.click(findTestObject('Master/Master_Authorized/input_NPWP_npwp'))

WebUI.sendKeys(findTestObject('Master/Master_Authorized/input_NPWP_npwp'), Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, 
        Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_Authorized/input_NPWP_npwp'), Keys.chord(Keys.NUMPAD6, Keys.NUMPAD4, Keys.NUMPAD2, 
        Keys.NUMPAD7, Keys.NUMPAD4, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD0, 
        Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD0, Keys.NUMPAD5, Keys.NUMPAD2, Keys.NUMPAD9))

WebUI.click(findTestObject('Master/Master_Authorized/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Authorized/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel_1 - Copy'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Yes, close it - Copy'))

WebUI.setText(findTestObject('Master/Master_Authorized/input'), '3333')

WebUI.click(findTestObject('Master/Master_Authorized/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel_1 - Copy (1)'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Yes, close it - Copy (1)'))

WebUI.delay(4)

WebUI.closeBrowser()

