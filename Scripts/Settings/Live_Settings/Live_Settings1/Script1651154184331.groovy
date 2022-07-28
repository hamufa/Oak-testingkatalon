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

WebUI.navigateToUrl(' https://app.oaktree.id/admin/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Settings_Accurate_Access/input_Welcome to Oaktree_email_user'), '6a1c972882@catdogmail.live')

WebUI.setEncryptedText(findTestObject('Settings_Accurate_Access/input_Welcome to Oaktree_password'), 'PLGTm/4mhzBK/fiUUkrWmQ==')

WebUI.click(findTestObject('Settings_Accurate_Access/a_Login'))

WebUI.delay(3)

WebUI.focus(findTestObject('Settings_Accurate_Access/a_Setting'))

WebUI.click(findTestObject('Settings_Accurate_Access/a_Setting'))

WebUI.click(findTestObject('Settings_Accurate_Access/span_Accurate Access'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Create New'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Cancel'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Cancel_1_Create'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Cancel'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Yes, close it'))

WebUI.waitForElementNotVisible(findTestObject('Settings_Accurate_Access/button_Yes, close it'), 4)

WebUI.click(findTestObject('Settings_Accurate_Access/button_Create New'))

WebUI.acceptAlert()

WebUI.acceptAlert()

WebUI.setText(findTestObject('Settings_Accurate_Access/input__name'), '22222')

WebUI.click(findTestObject('Settings_Accurate_Access/span_Permission'))

WebUI.sendKeys(findTestObject('Settings_Accurate_Access/Input_Text_Permission'), 'Selling Save')

WebUI.sendKeys(findTestObject('Settings_Accurate_Access/span_Permission'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Settings_Accurate_Access/Input_Text_Permission'), 'Selling Delete')

WebUI.sendKeys(findTestObject('Settings_Accurate_Access/span_Permission'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Settings_Accurate_Access/textarea_Description_description'), '222')

WebUI.click(findTestObject('Settings_Accurate_Access/span__select2-selection__arrow'))

WebUI.setText(findTestObject('Settings_Accurate_Access/input_Text_Country'), 'Head Office')

WebUI.sendKeys(findTestObject('Settings_Accurate_Access/input_Text_Country'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Settings_Accurate_Access/button_Save'), 8)

WebUI.click(findTestObject('Settings_Accurate_Access/button_Edit'))

WebUI.setText(findTestObject('Settings_Accurate_Access/input__name'), '3333')

WebUI.click(findTestObject('Settings_Accurate_Access/span_HeadOffice'))

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

WebUI.click(findTestObject('Settings_Accurate_Access/button_Yes, close it_Edit'))

WebUI.setText(findTestObject('Settings_Accurate_Access/input_Text_Search'), '3333')

WebUI.click(findTestObject('Settings_Accurate_Access/button_Delete'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Cancel_1_Edit'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Delete'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_Yes, delete it'))

WebUI.click(findTestObject('Settings_Accurate_Access/button_OK'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Group Access'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Create New'))

WebUI.setText(findTestObject('Object Repository/Setting_Group_Access/input__name'), '2222222')

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/span__select2-selection select2-selection--single'))

WebUI.setText(findTestObject('Object Repository/Setting_Group_Access/input_Save_select2-search__field'), 'Logistic')

WebUI.sendKeys(findTestObject('Object Repository/Setting_Group_Access/input_Save_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Setting_Group_Access/textarea_Description_desc'), '222222')

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Marketing'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Dashboard_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Contact Management_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Quotation_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Refund_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Contact Management Schedule_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_CRM Admin_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Operation'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Dashboard_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Contact Management_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Copy_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Refund_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Contact Management Schedule_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_CRM Admin_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Buying_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Other Cost_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Journal_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Selling_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Logistic_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Document_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Bill of Lading_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Shipment Instruction_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Transaction Copy_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Journal Voucher_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Journal Voucher_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Other Payment_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Other Payment_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Activity Log_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Update Status_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile AWB_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Master'))

WebUI.focus(findTestObject('Setting_Group_Access/label_Master_Agent'))

WebUI.click(findTestObject('Setting_Group_Access/label_Master_Agent'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Autonumber_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Branch_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Customer_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Customer_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Depo_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Driver_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Journal_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Port_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Term_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Term_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Truck_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Bill of Lading_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Truck_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Truck_checkbox-label_1_2'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Vendor_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Address_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Airline_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Reason_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Ppjk_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Assignment Recipient_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Authorized_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Percentage_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Percentage_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Percentage_checkbox-label_1_2'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Percentage_checkbox-label_1_2_3'))

WebUI.click(findTestObject('Setting_Group_Access/a_Report_Live'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Copy_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Refund_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Contact Management Schedule_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_CRM Admin_checkbox-label'))

WebUI.click(findTestObject('Setting_Group_Access/label_Report_BestCustomer'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Journal_checkbox-label'))

WebUI.click(findTestObject('Setting_Group_Access/a_Setting_Live'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Copy_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Group Access_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Group Access_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_User_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Depo_checkbox-label'))

WebUI.focus(findTestObject('Setting_Group_Access/label_Setting_Company'))

WebUI.click(findTestObject('Setting_Group_Access/label_Setting_Company'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Journal_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Notification Header_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Group Access_checkbox-label_1_2'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Group Access_checkbox-label_1_2_3'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Refund_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Internal'))

WebUI.focus(findTestObject('Object Repository/Setting_Group_Access/label_Dashboard_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Dashboard_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Accurate Connection_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Copy_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Refund_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Contact Management Schedule_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_CRM Admin_checkbox-label'))

WebUI.click(findTestObject('Setting_Group_Access/label_Master_Agent'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_Save'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Logistic_btn btn-action mr-1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Notification Header_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Leads Customer_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Journal_checkbox-label'))

WebUI.focus(findTestObject('Object Repository/Setting_Group_Access/label_Dashboard_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Dashboard_checkbox-label'))

WebUI.click(findTestObject('Setting_Group_Access/label_Master_Agent'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_CRM Admin_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Contact Management Schedule_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Refund_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Quotation_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Copy_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Branch_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Quotation_checkbox-label_1_2'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Contact Management_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Operation'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Contact Management_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Accurate Connection_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Autonumber_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Dashboard_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Copy_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Refund_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Contact Management Schedule_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_CRM Admin_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Buying_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Depo_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Other Cost_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Other Cost_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Journal_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Journal_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Selling_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Logistic_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Term_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Document_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Bill of Lading_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Truck_checkbox-label_1_2'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Shipment Instruction_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Shipment Instruction_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Transaction Copy_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Journal Voucher_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Journal Voucher_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Airline_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Journal Voucher_checkbox-label_1_2'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Other Payment_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Other Payment_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Other Payment_checkbox-label_1_2'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Reason_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Other Payment_checkbox-label_1_2_3'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Activity Log_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Update Status_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Percentage_checkbox-label_1_2'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile AWB_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Percentage_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Vendor Invoice_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_Save'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Create New'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_Cancel (1)'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_Cancel (1)'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_Yes, close it'))

WebUI.setText(findTestObject('Object Repository/Setting_Group_Access/input'), '2222')

WebUI.click(findTestObject('Setting_Group_Access/Button_Delete'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_Cancel'))

WebUI.click(findTestObject('Setting_Group_Access/Button_Delete'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_Yes, delete it'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_OK'))

WebUI.closeBrowser()

