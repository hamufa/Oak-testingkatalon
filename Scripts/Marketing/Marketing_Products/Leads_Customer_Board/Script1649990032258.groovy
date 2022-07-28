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

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/a_Login'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/a_Marketing'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/a_Leads Customer'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/a_Board'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Marketing_LeadsOn_Board/select_All Marketing dwira  dika  kofyifilm_b3638f'), 
    '122', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Marketing_LeadsOn_Board/select_All Marketing dwira  dika  kofyifilm_b3638f'), 
    '123', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Marketing_LeadsOn_Board/select_All Marketing dwira  dika  kofyifilm_b3638f'), 
    'null', true)

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/i_Leads List_fa fa-plus'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Form Input Customer_form-control form_301ace'), 
    '232323')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Form Input Customer_form-control form_301ace_1'), 
    '232323@gmail.com')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Form Input Customer_form-control form_301ace_1_2'), 
    '232323')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Form Input Customer_form-control form_301ace_1_2_3'), 
    '232323')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Form Input Customer_form-control form_301ace_1_2_3_4'), 
    '232323')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Form Input Customer_form-control form_301ace_1_2_3_4_5'), 
    '232323')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/textarea_Form Input Customer_form-control f_58db0a'), 
    '232323')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/textarea_Form Input Customer_form-control f_58db0a_1'), 
    '232323')

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Form Input Customer_btn btn-create mr_1c69a7'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/i_Update On_far fa-calendar-alt'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/div_Loading'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Choose a Status_vs__search'), 'Leads')

WebUI.sendKeys(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Choose a Status_vs__search'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Notes_form-control form-control-sm'), 'ayam')

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Form Input Customer_btn btn-create mr_1c69a7'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/i_Update On 2022-04-15 094029_fas fa-edit'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Notes_form-control form-control-sm'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Notes_form-control form-control-sm'), '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/div_Company NameEmailPIC NameMobile PhonePI_df7b30'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Email_form-control form-control-sm'), '44444@gmail.com')

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/div_Form Edit Customer Company NameEmailPIC_608f1b'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_PIC Name_form-control form-control-sm'), '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/div_Company NameEmailPIC NameMobile PhonePI_df7b30'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Mobile Phone_form-control form-control-sm'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/div_Form Edit Customer Company NameEmailPIC_608f1b'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Form Input Customer_form-control form_301ace_1_2_3_4'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/div_Company NameEmailPIC NameMobile PhonePI_df7b30'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Office Phone_form-control form-control-sm'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/div_Form Edit Customer Company NameEmailPIC_608f1b'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/textarea_Address_form-control form-control-sm'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/div_Company NameEmailPIC NameMobile PhonePI_df7b30'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadsOn_Board/textarea_Form Input Customer_form-control f_58db0a_1'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/input_Form Input Customer_btn btn-create mr_1c69a7'))

WebUI.click(findTestObject('Marketing_LeadsOn_Board/i_Update_NOTEs_BUTTON'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/button_Cancel'))

WebUI.click(findTestObject('Marketing_LeadsOn_Board/i_Update_NOTEs_BUTTON'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadsOn_Board/button_Yes, delete it'))

WebUI.closeBrowser()

