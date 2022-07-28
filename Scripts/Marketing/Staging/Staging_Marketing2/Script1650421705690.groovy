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

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Welcome to Oaktree_email_user'), '8077186fef@catdogmail.live')

WebUI.setEncryptedText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Welcome to Oaktree_password'), 'PLGTm/4mhzBK/fiUUkrWmQ==')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/a_Login'))

WebUI.click(findTestObject('Marketing_LeadsOn_Board/a_Marketing2'))

WebUI.click(findTestObject('Marketing_LeadsOn_Board/a_Leads Customer2'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/a_List'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/button_Create New'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Form Input Customer_form-control form_301ace'), 
    '232323')

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
    '44444')

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Email_form-control form-control-sm'), '44444@gmail.com')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Form edit customer Company NameEmailPIC_fcbc7d'))

WebUI.setText(findTestObject('Marketing_LeadCust_List/input_PIC Position'), '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Company NameEmailPIC NameMobile PhonePI_df7b30'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Mobile Phone_form-control form-control-sm'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Form edit customer Company NameEmailPIC_fcbc7d'))

WebUI.setText(findTestObject('Marketing_LeadCust_List/input_PIC Position'), '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Company NameEmailPIC NameMobile PhonePI_df7b30'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Office Phone_form-control form-control-sm'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Form edit customer Company NameEmailPIC_fcbc7d'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/textarea_Address_form-control form-control-sm'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Company NameEmailPIC NameMobile PhonePI_df7b30'))

WebUI.setText(findTestObject('Marketing_LeadCust_List/input_Remarks_Edit'), '44444')

WebUI.click(findTestObject('Marketing_LeadCust_List/Save'))

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/div_Search'))

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Search _form-control form-control-sm _fca982'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/i_Leads_fas fa-eye'))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Search _form-control form-control-sm _fca982'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/i_Leads_far fa-calendar-alt'))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Marketing_LeadCust_List/input_Search _form-control form-control-sm _fca982'), 
    '44444')

WebUI.click(findTestObject('Object Repository/Marketing_LeadCust_List/i_Leads_mdi mdi-delete'))

WebUI.click(findTestObject('Marketing_LeadCust_List/button_Yes, delete it_Edit'))

WebUI.click(findTestObject('Marketing_Quotation/a_Marketing2'))

WebUI.click(findTestObject('Marketing_Quotation/a_Quotation2'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/a_Create New'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/svg_Input Date_mx-calendar-icon'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/td_1'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/div_Loading'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Customer_vs__search'), 'test')

WebUI.sendKeys(findTestObject('Object Repository/Marketing_Quotation/input_Customer_vs__search'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Subject_form-control form-control-sm'), '22222')

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Attn_form-control form-control-sm'), '22222')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/div_Port Of Delivery_vs__selected-options'))

WebUI.setText(findTestObject('Marketing_Quotation/input_POD'), 'sadadas')

WebUI.sendKeys(findTestObject('Marketing_Quotation/input_POD'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/div_Port of Loading_vs__selected-options'))

WebUI.setText(findTestObject('Marketing_Quotation/input_POL'), '888888888')

WebUI.sendKeys(findTestObject('Marketing_Quotation/input_POL'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/div_Loading_1'))

WebUI.setText(findTestObject('Marketing_Quotation/input_Term'), 'net 15')

WebUI.sendKeys(findTestObject('Marketing_Quotation/input_Term'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input__form-control form-control-sm'), '22222')

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND'), '1040', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Marketing_Quotation/select_IDR  JPY  GBP  MYR'), '0', true)

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Price_form-control form-control-sm'), '200000')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/input_Loading..._includeTax'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Remark_form-control form-control-sm'), '22222a')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/a_Remark_btn btn-create btn-sm'))

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND2'), '1040', true)

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_IDR JPY GBP MYR_2'), '3', true)

WebUI.setText(findTestObject('Marketing_Quotation/input_Price_form-control form-control-sm_2'), '10000')

WebUI.setText(findTestObject('Marketing_Quotation/input_Remark_form-control form-control-sm_2'), '33333b')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remark_fas fa-plus'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remark_fas fa-trash'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/a_New Type'))

WebUI.setText(findTestObject('Marketing_Quotation/input__form-control form-control-sm2'), '33333')

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND3'), '1040', true)

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_IDR JPY GBP MYR3'), '3', true)

WebUI.setText(findTestObject('Marketing_Quotation/input_Price_form-control form-control-sm3'), '2323')

WebUI.setText(findTestObject('Marketing_Quotation/input_Remark_form-control form-control-sm_3'), '2323')

WebUI.click(findTestObject('Marketing_Quotation/a_Remark_btn btn-create btn-sm2'))

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND4'), '1040', true)

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_IDR JPY GBP MYR4'), '0', true)

WebUI.setText(findTestObject('Marketing_Quotation/input_Price_form-control form-control-sm_4'), '44444')

WebUI.setText(findTestObject('Marketing_Quotation/input_Remark_form-control form-control-sm_4'), '44444')

WebUI.click(findTestObject('Marketing_Quotation/a_New Type2'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Delete_fas fa-trash'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Remarks_form-control form-control-sm'), '666666')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remarks_fas fa-plus'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remarks_fas fa-trash'))

WebUI.click(findTestObject('Marketing_Quotation/button_Save'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Search _form-control form-control-sm mb-2'), '22222')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_PAPUA_fas fa-download'))

WebUI.delay(4)

WebUI.closeWindowUrl('https://crm-oak.rimbahouse.com/quotation/#')

WebUI.switchToWindowUrl('https://crm-oak.rimbahouse.com/quotation/')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Search _form-control form-control-sm mb-2'), '22222')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_PAPUA_mdi mdi-square-edit-outline'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/form_General InformationDate Quotation     _0a4981'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/input_Date Quotation_date'))

WebUI.click(findTestObject('Marketing_Quotation/td_15 edit'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Customer_vs__search'), 'test')

WebUI.sendKeys(findTestObject('Object Repository/Marketing_Quotation/input_Customer_vs__search'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Subject_form-control form-control-sm'), '33333')

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Attn_form-control form-control-sm'), '33333')

WebUI.setText(findTestObject('Marketing_Quotation/input_POD'), '888888888')

WebUI.sendKeys(findTestObject('Marketing_Quotation/input_POD'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Marketing_Quotation/input_POL'), 'sadadas')

WebUI.sendKeys(findTestObject('Marketing_Quotation/input_POL'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Marketing_Quotation/input_Term'), 'C.O.D')

WebUI.sendKeys(findTestObject('Marketing_Quotation/input_Term'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/input_Loading..._includeTax'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input__form-control form-control-sm'), '44444')

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND'), '1040', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Marketing_Quotation/select_IDR  JPY  GBP  MYR'), '3', true)

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Price_form-control form-control-sm'), '333333')

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Remark_form-control form-control-sm'), '33333b')

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND2'), '1040', true)

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_IDR JPY GBP MYR_2'), '2', true)

WebUI.setText(findTestObject('Marketing_Quotation/input_Price_form-control form-control-sm_2'), '3333333')

WebUI.setText(findTestObject('Marketing_Quotation/input_Remark_form-control form-control-sm_2'), '44444aa')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remark_fas fa-plus'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remark_fas fa-trash'))

WebUI.setText(findTestObject('Marketing_Quotation/input__form-control form-control-sm2'), '33333')

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND3'), '1040', true)

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_IDR JPY GBP MYR3'), '0', true)

WebUI.setText(findTestObject('Marketing_Quotation/input_Price_form-control form-control-sm3'), '33333')

WebUI.setText(findTestObject('Marketing_Quotation/input_Remark_form-control form-control-sm_3'), '8888')

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND4'), '1040', true)

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_IDR JPY GBP MYR4'), '0', true)

WebUI.setText(findTestObject('Marketing_Quotation/input_Price_form-control form-control-sm_4'), '5555')

WebUI.setText(findTestObject('Marketing_Quotation/input_Remark_form-control form-control-sm_4'), '5555')

WebUI.click(findTestObject('Marketing_Quotation/a_New Type2'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Delete_fas fa-trash'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Remarks_form-control form-control-sm'), '5555')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remarks_fas fa-plus'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remarks_fas fa-trash'))

WebUI.click(findTestObject('Marketing_Quotation/button_Save'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_PAPUA_mdi mdi-square-edit-outline'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/button_Cancel'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Search _form-control form-control-sm mb-2'), '3333')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_PAPUA_fas fa-download'))

WebUI.closeWindowUrl('https://crm-oak.rimbahouse.com/quotation/#')

WebUI.switchToWindowUrl('https://crm-oak.rimbahouse.com/quotation/')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_PAPUA_mdi mdi-delete'))

WebUI.delay(2)

WebUI.click(findTestObject('Marketing_Quotation/button_Cancel_Delete'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_PAPUA_mdi mdi-delete'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/button_Yes, delete it'))

WebUI.closeBrowser()

