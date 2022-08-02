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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/a_Login'))

WebUI.focus(findTestObject('Marketing_LeadCust_List/a_Marketing'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/a_Marketing'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/a_Leads Customer'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/a_List'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/button_Create New'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Form Input Customer_form-control form_301ace'), 
    'Konohamaru')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Form Input Customer_form-control form_301ace_1'), 
    '232323@gmail.com')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Form Input Customer_form-control form_301ace_1_2'), 
    '232323')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Form Input Customer_form-control form_301ace_1_2_3'), 
    '232323')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Form Input Customer_form-control form_301ace_1_2_3_4'), 
    '232323')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Form Input Customer_form-control form_301ace_1_2_3_4_5'), 
    '232323')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/textarea_Form Input Customer_form-control f_58db0a'), 
    '232323')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/textarea_Form Input Customer_form-control f_58db0a_1'), 
    '232323')

WebUI.click(findTestObject('Marketing_LeadCust_List/Save'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Search'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Search _form-control form-control-sm _fca982'), 
    '232323')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/a_Leads_action-icon text-white mr-1 btn btn-sm'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Form edit customer Company NameEmailPIC_fcbc7d'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Company Name_form-control form-control-sm'), 
    'Konohamaru')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Email_form-control form-control-sm'), '44444@gmail.com')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Form edit customer Company NameEmailPIC_fcbc7d'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_PIC Name_form-control form-control-sm'), '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Company NameEmailPIC NameMobile PhonePI_df7b30'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Mobile Phone_form-control form-control-sm'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Form edit customer Company NameEmailPIC_fcbc7d'))

WebUI.setText(findTestObject('Marketing_LeadCust_List/Pic position'), '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Company NameEmailPIC NameMobile PhonePI_df7b30'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Office Phone_form-control form-control-sm'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Form edit customer Company NameEmailPIC_fcbc7d'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/textarea_Address_form-control form-control-sm'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Company NameEmailPIC NameMobile PhonePI_df7b30'))

WebUI.setText(findTestObject('Marketing_LeadCust_List/Remark'), '44444')

WebUI.click(findTestObject('Marketing_LeadCust_List/Save update'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Search'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Search _form-control form-control-sm _fca982'), 
    'Konohamaru')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/i_Leads_fas fa-eye'))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Search _form-control form-control-sm _fca982'), 
    'Konohamaru')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/i_Leads_far fa-calendar-alt'))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Search _form-control form-control-sm _fca982'), 
    'Konohamaru')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/button_Create New'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/i_Leads_mdi mdi-delete'))

WebUI.click(findTestObject('Marketing_LeadCust_List/button_Cancel_Delete'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/i_Leads_mdi mdi-delete'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/button_Yes, delete it'))

WebUI.closeBrowser()

