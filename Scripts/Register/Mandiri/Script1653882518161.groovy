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

WebUI.navigateToUrl('https://oak.rimbahouse.com/admin')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Login Panel/a_Sign Up_1'))

WebUI.setText(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/input_Company data_pic_name'), 
    'TESTING7')

WebUI.setText(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/input_Company data_company_name'), 
    '7')

WebUI.setText(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/input_Company data_pic_phone'), 
    '7')

WebUI.setText(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/input_Company data_phone_company'), 
    '7')

WebUI.setText(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/textarea_Company data_address_company'), 
    '7')

WebUI.setText(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/input_Account_username_user'), 
    'dkztkzdvb@scpulse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/input_Account_password_user'), 
    'AKt5yWKWJDg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/input_Account_password_user_confirm'), 
    'AKt5yWKWJDg=')

WebUI.click(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/label_Creating an account means youre agree_2544fb'))

WebUI.click(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/a_Next'))

WebUI.delay(15)

WebUI.navigateToUrl('https://oak.rimbahouse.com/admin/verified_akun/t2sakv/false')

WebUI.click(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/button_Oke'))

WebUI.click(findTestObject('Register_Mandiri_Oaktree/Page_Admin Panel/label_User_Package'))

WebUI.click(findTestObject('Register_Mandiri_Oaktree/Page_Admin Panel/label_Package'))

WebUI.click(findTestObject('Register_Mandiri_Oaktree/Page_Admin Panel/button_Cancel_Package'))

WebUI.click(findTestObject('Register_Mandiri_Oaktree/Page_Admin Panel/label_Package'))

WebUI.setText(findTestObject('Register_Mandiri_Oaktree/Page_Admin Panel/input_Search_Package'), 'Add')

WebUI.click(findTestObject('Register_Mandiri_Oaktree/Page_Admin Panel/label_ClickAddON'))

WebUI.click(findTestObject('Register_Mandiri_Oaktree/Page_Admin Panel/button_Save_addON'))

WebUI.click(findTestObject('Register_Mandiri_Oaktree/Page_Admin Panel/label_Custom User'))

WebUI.click(findTestObject('Register_Mandiri_Oaktree/Page_Admin Panel/label_Custom User'))

WebUI.click(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/a_Previous'))

WebUI.click(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/a_Next'))

WebUI.click(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/a_Next'))

WebUI.click(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/label_Monthly'))

WebUI.click(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/a_Submit'))

WebUI.click(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/a_Submit'))

WebUI.click(findTestObject('Object Repository/Register_Mandiri_Oaktree/Page_Admin Panel/button_Yes'))

WebUI.click(findTestObject('Register_Mandiri_Oaktree/Page_Admin Panel/button_Oke_Finish'))

WebUI.delay(4)

WebUI.navigateToUrl('https://bean.rimbahouse.com/admin/companies')

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_OK'))

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_email_input-83'), 'leo@szetoaccurate.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_password_input-86'), 'JltEQgaE0YE=')

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_Login'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/i_RMB-OAK2205.0036_v-icon notranslate mdi m_4d1ef8'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/i_RMB-OAK2205.0036_v-icon notranslate mdi m_f222b5'))

WebUI.uploadFile(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_Choose File_v-file-input__text'), 
    'C:\\Users\\RIMBAVIKASA\\Pictures\\Saved Pictures\\Rimba.png')

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_Upload'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_oke'))

WebUI.closeBrowser()

