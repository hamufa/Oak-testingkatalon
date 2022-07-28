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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Agent/Page_Login Panel/a_Login'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Dashboard - Kelas Karyawan/a_Customer'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__name'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__email'), '2@gmail.com')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Branch'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Branch_Staging'), 
    'Head Office')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Branch_Staging'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Cust_Code'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Text_Cust_Code_Staging'), 
    'cusrt')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Text_Cust_Code_Staging'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__phone_number'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Mobile Phone_mobile'), 
    '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Faximile_faximile'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Website_website'), '2')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Country'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Span_Country'), 'Albania')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Span_Country'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Ìnput_Province'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__city'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Post Code_postcode'), '7')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/SPAN_TERM'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_Term_Staging'), 'net 15')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_Term_Staging'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Warehouse_select2-selection select2-se_029897'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_warehouse_Staging'), 
    'tesss')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_warehouse_Staging'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Receivable Account_select2-selection s_072cfe'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Receivable_Account_Staging'), 
    'cash on hand - tere')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Receivable_Account_Staging'), 
    Keys.chord(Keys.ENTER))

WebUI.uploadFile(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_logo'), 'C:\\Users\\RIMBAVIKASA\\Pictures\\Saved Pictures\\Rimba.png')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Business Classification_select2-select_502732'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_bis_clas'), 'Financial Services')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_bis_clas'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Business Spesification_business_spesi_56a6f5'), 
    '2')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Agent_select2-selection select2-select_a2657d'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Ìnput_Text_Agent_Staging'), 'dimas')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Ìnput_Text_Agent_Staging'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/textarea__address'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_billing_Address'), '2')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_pic_name'), 'Wira')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Email_pic_email'), '22@gmail.com')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Position_pic_position'), 
    '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Division_pic_division'), 
    '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Phone Number_pic_mobile'), 
    '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Business Contact Number_pic_phone'), 
    '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Remarks_pic_remarks'), 
    '2')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/button_Add'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_pic_name2'), 'yy')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Email_pic_email2'), '33@gmail.com')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Position_pic_position2'), 
    '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Division_pic_division2'), 
    '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Phone Number_pic_mobile2'), 
    '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Remarks_legality_remarks2'), 
    '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Business Contact Number_pic_phone2'), 
    '3')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_legality_name'), '4')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Remarks_legality_remarks'), 
    '4')

WebUI.uploadFile(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/button_Legality'), 'C:\\Users\\RIMBAVIKASA\\Pictures\\Saved Pictures\\Rimba.png')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/button_Add_Legality'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_legality_name2'), 
    '5')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_legality_remarks2'), 
    '5')

WebUI.uploadFile(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/button_Legality2'), 'C:\\Users\\RIMBAVIKASA\\Pictures\\Saved Pictures\\Rimba.png')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__shipment_city'), '6')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__shipment_province'), '6')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Post Code_shipment_postcode'), 
    '6')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/textarea__shipment_address'), 
    '666 jalannnn')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Country_Create'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), 'Algeria')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Country_Tax'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), 'Andorra')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_province_Tax'), '333')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_address_Tax'), '333')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__city_tax'), '333')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__postcode_Tax'), '3333')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__npwp'))

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__npwp'), Keys.chord(Keys.CONTROL, 
        Keys.LEFT, Keys.LEFT, Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__npwp'), Keys.chord(Keys.NUMPAD6, 
        Keys.NUMPAD4, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD4, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, Keys.NUMPAD2, 
        Keys.NUMPAD7, Keys.NUMPAD0, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD0, Keys.NUMPAD5, 
        Keys.NUMPAD2, Keys.NUMPAD9))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_document_code'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/input__tax_postcode'), 'Faktur Pajak')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/input__tax_postcode'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_tax_type_Tax'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__tax_type_Tax'), 'Bukan Pemungut PPN')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__tax_type_Tax'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__nik'), '88888888')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Previous'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Submit'))

WebUI.delay(10)

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Active_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__name'), '`3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__email'), '3@gmail.com')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Branch'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Branch_Staging'), 
    'Head Office')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Branch_Staging'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__phone_number'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Mobile Phone_mobile'), 
    '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Faximile_faximile'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Website_website'), '3')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Country'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Span_Country'), 'Benin')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Span_Country'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Ìnput_Province'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__city'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Post Code_postcode'), '9')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/SPAN_TERM'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_Term_Staging'), 'C.O.D')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_Term_Staging'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Warehouse_select2-selection select2-se_029897'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_warehouse_Staging'), 
    'ea ea')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_warehouse_Staging'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Receivable Account_select2-selection s_072cfe'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Receivable_Account_Staging'), 
    'mandiri')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Receivable_Account_Staging'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.uploadFile(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_logo'), 'C:\\Users\\RIMBAVIKASA\\Pictures\\Saved Pictures\\Rimba.png')

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/button_Logo'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/span_Close'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Business Classification_select2-select_502732'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_bis_clas'), 'Real Estate')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_bis_clas'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Business Spesification_business_spesi_56a6f5'), 
    '3')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Agent_select2-selection select2-select_a2657d'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Ìnput_Text_Agent_Staging'), 'agent')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Ìnput_Text_Agent_Staging'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/textarea__address'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_billing_Address'), '3')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_pic_name'), 'Tolong')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Email_pic_email'), '44@gmail.com')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Position_pic_position'), 
    '4')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Division_pic_division'), 
    '4')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Phone Number_pic_mobile'), 
    '4')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Business Contact Number_pic_phone'), 
    '4')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Remarks_pic_remarks'), 
    '4')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_pic_name2'), 'Saya')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Email_pic_email2'), '55@gmail.com')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Position_pic_position2'), 
    '5')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Division_pic_division2'), 
    '5')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Phone Number_pic_mobile2'), 
    '5')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Remarks_legality_remarks2'), 
    '5')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Business Contact Number_pic_phone2'), 
    '5')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_legality_name'), '88')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Remarks_legality_remarks'), 
    '88')

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/button_DL_Legal'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_legality_name2'), 
    '99')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_legality_remarks2'), 
    '99')

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/button_DL_Legal2'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/button_Add'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/Delete_Button_legal'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/Delete_Button_legal'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/button_Yes, remove it'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__shipment_city'), '7')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__shipment_province'), '7')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Post Code_shipment_postcode'), 
    '7')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/textarea__shipment_address'), 
    '8888')

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/span_country_Create2'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), 'China')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/label_Same as Billing Address'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/label_Same as Billing Address'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Country_Tax'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), 'Afghanistan')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_province_Tax'), '4444')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_address_Tax'), '4444')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__city_tax'), '444')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__postcode_Tax'), '4444')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__npwp'))

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__npwp'), Keys.chord(Keys.CONTROL, 
        Keys.LEFT, Keys.LEFT, Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__npwp'), Keys.chord(Keys.NUMPAD1, 
        Keys.NUMPAD2, Keys.NUMPAD2, Keys.NUMPAD9, Keys.NUMPAD4, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, Keys.NUMPAD8, 
        Keys.NUMPAD7, Keys.NUMPAD0, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD7, Keys.NUMPAD2, Keys.NUMPAD5, 
        Keys.NUMPAD6, Keys.NUMPAD8))

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/span_document_code2'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/input_document_Code2'), 'Dokumen Yang Dipersamakan')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/input_document_Code2'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_tax_type_Tax'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__tax_type_Tax'), 'Pajak Di Deemed')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__tax_type_Tax'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__nik'), '212312321')

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/label_Same as Billing Address_Tax'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Previous'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Submit'))

WebUI.delay(10)

WebUI.setText(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/input_Staging'), 'Cricket')

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Active_btn btn-action mr-1_1'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Yes'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_OK'), 3)

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Active_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_OK'), 3)

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_OK'))

WebUI.focus(findTestObject('Master/Master_Shipping/a_Shipping'))

WebUI.click(findTestObject('Master/Master_Shipping/a_Shipping'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Create New'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__name'), '2222')

WebUI.setText(findTestObject('Master/Master_Shipping/input__phone'), '2222')

WebUI.setText(findTestObject('Master/Master_Shipping/input__pic_name'), '2222')

WebUI.setText(findTestObject('Master/Master_Shipping/input__pic_phone'), '22222')

WebUI.setText(findTestObject('Master/Master_Shipping/textarea__address'), '22222')

WebUI.click(findTestObject('Master/Master_Shipping/span_Custom_Select a Code Shipping'))

WebUI.setText(findTestObject('Master/Master_Shipping/input_Custom_shippingcode_Live'), 'shipsby')

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_name'), '222')

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_shipping_id1'), '22222')

WebUI.setText(findTestObject('Master/Master_Shipping/input_note_Vessel1'), '22222')

WebUI.click(findTestObject('Master/Master_Shipping/button_Note_btn btn-success btn-sm'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_name_1_Live'), '333')

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_shipping_id3_Live'), '333')

WebUI.setText(findTestObject('Master/Master_Shipping/input_Note_vessel_note2_Live'), '333')

WebUI.click(findTestObject('Master/Master_Shipping/button_Note_btn btn-success btn-sm'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Note_btn-minus'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Yes, remove it'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Shipping/button_Save'), 15)

WebUI.delay(3)

WebUI.click(findTestObject('Master/Master_Shipping/button_shipsby20220406.0232_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Shipping/input__name'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__name'), '33333')

WebUI.click(findTestObject('Master/Master_Shipping/div_Name  Phone Number  PIC Name  PIC Phone_0843a2'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__phone'), '33333')

WebUI.doubleClick(findTestObject('Master/Master_Shipping/div_Name  Phone Number  PIC Name  PIC Phone_0843a2'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__pic_name'), '333333')

WebUI.click(findTestObject('Master/Master_Shipping/div_Name  Phone Number  PIC Name  PIC Phone_0843a2'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__pic_phone'), '333333')

WebUI.click(findTestObject('Master/Master_Shipping/div_Name  Phone Number  PIC Name  PIC Phone_0843a2'))

WebUI.setText(findTestObject('Master/Master_Shipping/textarea__address'), '33333')

WebUI.click(findTestObject('Master/Master_Shipping/input_shippingcode_Staging_Edit'))

WebUI.setText(findTestObject('Master/Master_Shipping/input_shippingcode_Staging_Edit'), 'shipsby/20220404/9322')

WebUI.click(findTestObject('Master/Master_Shipping/input__vessel_name_1_2_EditLive'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_name_1_2_EditLive'), '3333')

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_shipping_id6_EditLive'), '33333')

WebUI.setText(findTestObject('Master/Master_Shipping/input_Note_vessel_note1_EditLive'), '33333')

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_name_1_2_3_EditLive'), '4444')

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_shipping_id7_EditLive'), '123123123')

WebUI.setText(findTestObject('Master/Master_Shipping/input_Note_vessel_note_EditLive'), '44444')

WebUI.click(findTestObject('Master/Master_Shipping/button_Save'))

WebUI.delay(8)

WebUI.setText(findTestObject('Master/Master_Shipping/input'), '3333')

WebUI.click(findTestObject('Master/Master_Shipping/button_shipsby202204049322_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Shipping/button_OK'), 8)

WebUI.click(findTestObject('Master/Master_Shipping/button_OK'))

WebUI.focus(findTestObject('Master/Master_Term/a_Term'))

WebUI.click(findTestObject('Master/Master_Term/a_Term'))

WebUI.click(findTestObject('Master/Master_Term/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Term/input__name'), '222')

WebUI.setText(findTestObject('Master/Master_Term/input__due_period'), '25')

WebUI.setText(findTestObject('Master/Master_Term/textarea_Notes_remarks'), '2555asd')

WebUI.click(findTestObject('Master/Master_Term/label_Default Payment Term'))

WebUI.click(findTestObject('Master/Master_Term/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Term/button_Yes_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Term/html_Master Term - Kelas Karyawan.profile-p_a685a0'))

WebUI.setText(findTestObject('Master/Master_Term/input__name'), '3333')

WebUI.setText(findTestObject('Master/Master_Term/input__due_period2'), '33')

WebUI.click(findTestObject('Master/Master_Term/html_Master Term - Kelas Karyawan.profile-p_a685a0'))

WebUI.setText(findTestObject('Master/Master_Term/textarea_Notes_remarks'), 'asdasd')

WebUI.click(findTestObject('Master/Master_Term/label_Default Payment Term'))

WebUI.click(findTestObject('Master/Master_Term/button_Save'))

WebUI.setText(findTestObject('Master/Master_Term/input'), '3333')

WebUI.delay(3)

WebUI.click(findTestObject('Master/Master_Term/button_No_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Term/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Term/button_OK'), 8)

WebUI.click(findTestObject('Master/Master_Term/button_OK'))

WebUI.focus(findTestObject('Master/Master_Truck/a_Truck'))

WebUI.click(findTestObject('Master/Master_Truck/a_Truck'))

WebUI.click(findTestObject('Master/Master_Truck/button_Create New'))

WebUI.setText(findTestObject('Master/Master_Truck/input__truck_no'), '252525')

WebUI.click(findTestObject('Master/Master_Truck/input__truck_kir'))

WebUI.click(findTestObject('Master/Master_Truck/td_8'))

WebUI.click(findTestObject('Master/Master_Truck/span__select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Truck/input_Save_select2-search__field'), 'Trailer')

WebUI.sendKeys(findTestObject('Master/Master_Truck/input_Save_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Truck/label_Available'))

WebUI.setText(findTestObject('Master/Master_Truck/textarea_Remarks_remarks'), 'habis stock guys')

WebUI.setText(findTestObject('Master/Master_Truck/input__truck_pic'), '2323232')

WebUI.click(findTestObject('Master/Master_Truck/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Master/Master_Truck/button_Not Available_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Truck/input__truck_no'), '1111')

WebUI.click(findTestObject('Master/Master_Truck/input__truck_kir'))

WebUI.click(findTestObject('Master/Master_Truck/td_10'))

WebUI.click(findTestObject('Master/Master_Truck/span_Trailer'))

WebUI.setText(findTestObject('Master/Master_Truck/input_Save_select2-search__field'), 'Tronton')

WebUI.sendKeys(findTestObject('Master/Master_Truck/input_Save_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Truck/label_Available'))

WebUI.click(findTestObject('Master/Master_Truck/div_Truck No  Periodical Inspection Validit_2bb095'))

WebUI.setText(findTestObject('Master/Master_Truck/input__truck_pic'), '44444')

WebUI.setText(findTestObject('Master/Master_Truck/textarea_Remarks_remarks'), 'siap kirim')

WebUI.click(findTestObject('Master/Master_Truck/button_Save'))

WebUI.delay(5)

WebUI.setText(findTestObject('Master/Master_Truck/input_SEARCH'), '1111')

WebUI.click(findTestObject('Master/Master_Truck/button_Available_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Truck/button_Edit_Yes, close it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Truck/button_OK'), 1)

WebUI.click(findTestObject('Master/Master_Truck/button_OK'))

WebUI.delay(3)

WebUI.focus(findTestObject('Master/Master_Address/a_Address'))

WebUI.click(findTestObject('Master/Master_Address/a_Address'))

WebUI.click(findTestObject('Master/Master_Address/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Address/textarea__warehouse_name'), 'Mi')

WebUI.setText(findTestObject('Master/Master_Address/textarea__warehouse_address'), '232323')

WebUI.click(findTestObject('Master/Master_Address/button_Save'))

WebUI.delay(4)

WebUI.click(findTestObject('Master/Master_Address/button_Action_btn btn-action mr-1_Live'))

WebUI.setText(findTestObject('Master/Master_Address/textarea__warehouse_name'), 'aw')

WebUI.setText(findTestObject('Master/Master_Address/textarea__warehouse_address'), 'ea ea ea')

WebUI.click(findTestObject('Master/Master_Address/button_Save'))

WebUI.delay(5)

WebUI.setText(findTestObject('Master/Master_Address/input'), 'ea ea')

WebUI.click(findTestObject('Master/Master_Address/button_ea ea ea_btn btn-action_Live'))

WebUI.click(findTestObject('Master/Master_Address/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Address/button_OK'), 1)

WebUI.click(findTestObject('Master/Master_Address/button_OK'))

WebUI.closeBrowser()

