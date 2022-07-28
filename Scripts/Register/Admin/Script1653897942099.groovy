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

WebUI.navigateToUrl('https://bean.rimbahouse.com/admin/companies')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_OK'))

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_email_input-83'), 'leo@szetoaccurate.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_password_input-86'), 'JltEQgaE0YE=')

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_Login'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_Company'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/a_Add'))

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Company Name_input-206'), 'ayam7')

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Phone Number_input-209'), '77')

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_Email'))

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Email_input-215'), 'oschhojiaqwjcm@scpulse.com')

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_PIC Email_input-218'), 'oschhojiaqwjcm@scpulse.com')

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_PIC Name_input-221'), '77')

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Fax_input-224'), '7')

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_PIC Phonenumber_input-227'), '7')

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Kota_input-230'), '7')

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Provinsi_input-233'), '7')

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Negara_input-236'), '7')

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_NPWP_input-239'), '7')

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_Company Address'))

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/textarea_Company Address_input-242'), 
    '7')

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_Save'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_OK'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_Order'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/a_Add_1'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Select Company_input-415'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Select Company_input-415'), 'ayam7')

WebUI.focus(findTestObject('Register_Admin/Page_Administrator/Order_SelectionForm_Title'))

WebUI.click(findTestObject('Register_Admin/Page_Administrator/Order_SelectionForm_Title'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/textarea_Remarks_input-7-4'), '7')

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Select Product_input-434'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_Order Rimba'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Select User Package_input-439'))

WebUI.setText(findTestObject('Register_Admin/Page_Administrator/input_User_Storage_Package'), 'JANGAN APUS')

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_JANGAN APUS'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Select Storage Package_input-450'))

WebUI.setText(findTestObject('Register_Admin/Page_Administrator/input_Order_Storage_Package'), 'TEST')

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_TEST'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Select Extra Charge_input-461'))

WebUI.setText(findTestObject('Register_Admin/Page_Administrator/input_Order_EXTRA_Package'), 'Coba')

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_COBA'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_OK'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/i_RMB-OAK2205.0036_v-icon notranslate mdi m_4d1ef8'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/i_RMB-OAK2205.0036_v-icon notranslate mdi m_f222b5'))

WebUI.uploadFile(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_Choose File_v-file-input__text'), 
    'C:\\Users\\RIMBAVIKASA\\Pictures\\Saved Pictures\\Rimba.png')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_Upload'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_oke'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_User'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/a_Add_1_2'))

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Select Company_input-245'), 'ayam7')

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_ayam7'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_Administrator'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/i_HEAD OFFICE_v-icon notranslate mdi mdi-ch_86c998'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/div_Select Branch_v-select__selections'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/i_ayam7_v-icon notranslate mdi mdi-checkbox_8a1843'))

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Employee ID_input-260'), '7')

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Email_input-263'), 'oschhojiaqwjcm@scpulse.com')

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Name_input-266'), 'ayam7')

WebUI.setText(findTestObject('Object Repository/Register_Admin/Page_Administrator/input_Phone Number_input-269'), '7')

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_Save'))

WebUI.click(findTestObject('Object Repository/Register_Admin/Page_Administrator/button_OK'))

