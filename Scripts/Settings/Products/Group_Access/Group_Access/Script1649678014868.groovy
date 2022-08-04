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

WebUI.setText(findTestObject('Object Repository/Setting_Group_Access/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Setting_Group_Access/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Login'))

WebUI.focus(findTestObject('Setting_Group_Access/a_Setting'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Setting'))

WebUI.focus(findTestObject('Object Repository/Setting_Group_Access/a_Group Access'))

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

WebUI.click(findTestObject('Setting_Group_Access/Master agent please'))

WebUI.click(findTestObject('Setting_Group_Access/label_Master_Agent'))

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

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Report'))

//WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Copy_checkbox-label'))
WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Refund_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Contact Management Schedule_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_CRM Admin_checkbox-label'))

WebUI.click(findTestObject('Setting_Group_Access/label_Report_BestCustomer'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Journal_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Setting (1)'))

WebUI.focus(findTestObject('Object Repository/Setting_Group_Access/label_Accurate Connection_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Accurate Connection_checkbox-label'))

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

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile AWB_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile AWB_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Percentage_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Percentage_checkbox-label_1_2'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Vendor Invoice_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Payment Receipt_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Payment Receipt_checkbox-label_1'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Payment Receipt_checkbox-label_1_2'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/label_Jobfile Summary_checkbox-label'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_Save'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/a_Create New'))

WebUI.scrollToPosition(250, 300)

WebUI.mouseOver(findTestObject('Setting_Group_Access/cansel sabar'))

WebUI.click(findTestObject('Setting_Group_Access/cansel sabar'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_Cancel_1'))

WebUI.click(findTestObject('Setting_Group_Access/cansel sabar'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_Yes, close it'))

WebUI.setText(findTestObject('Object Repository/Setting_Group_Access/input'), '2222')

WebUI.click(findTestObject('Setting_Group_Access/Button_Delete'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_Cancel'))

WebUI.click(findTestObject('Setting_Group_Access/Button_Delete'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_Yes, delete it'))

WebUI.click(findTestObject('Object Repository/Setting_Group_Access/button_OK'))

WebUI.delay(4)

WebUI.closeBrowser()

