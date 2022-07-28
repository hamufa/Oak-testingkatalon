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

WebUI.setText(findTestObject('Master/Master_Customer/Page_Login Panel/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Customer/Page_Login Panel/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Customer/Page_Login Panel/a_Login'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Dashboard - Kelas Karyawan/a_Customer'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__name'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__email'), '2@gmail.com')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Branch'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Branch'), 'HEAD OFFICE')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Branch'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Cust_Code'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Text_Cust_Code'), 'cusrt')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Text_Cust_Code'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__phone_number'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Mobile Phone_mobile'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Faximile_faximile'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Website_website'), '2')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Country'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Span_Country'), 'Albania')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Span_Country'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Ìnput_Province'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__city'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Post Code_postcode'), '7')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/SPAN_TERM'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_Term'), 'net 14')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_Term'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Warehouse_select2-selection select2-se_029897'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_warehouse'), 'Jakarta')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_warehouse'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Receivable Account_select2-selection s_072cfe'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Receivable_Account'), 'bca')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Receivable_Account'), Keys.chord(
        Keys.ENTER))

WebUI.uploadFile(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_logo'), 'C:\\Users\\Owner\\Desktop\\vgl.jpg')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Business Classification_select2-select_502732'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_bis_clas'), 'Financial Services')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_bis_clas'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Business Spesification_business_spesi_56a6f5'), 
    '2')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Agent_select2-selection select2-select_a2657d'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Ìnput_Text_Agent'), 'Rian')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Ìnput_Text_Agent'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/textarea__address'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_billing_Address'), '2')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_pic_name'), 'Wira')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Email_pic_email'), '22@gmail.com')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Position_pic_position'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Division_pic_division'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Phone Number_pic_mobile'), '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Business Contact Number_pic_phone'), 
    '2')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Remarks_pic_remarks'), '2')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/button_Add'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_pic_name2'), 'yy')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Email_pic_email2'), '33@gmail.com')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Position_pic_position2'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Division_pic_division2'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Phone Number_pic_mobile2'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Remarks_legality_remarks2'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Business Contact Number_pic_phone2'), 
    '3')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_legality_name'), '4')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Remarks_legality_remarks'), '4')

WebUI.uploadFile(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/button_Legality'), 'C:\\Users\\Owner\\Desktop\\vgl.jpg')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/button_Add_Legality'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_legality_name2'), '5')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_legality_remarks2'), '5')

WebUI.uploadFile(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/button_Legality2'), 'C:\\Users\\Owner\\Desktop\\vgl.jpg')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__shipment_city'), '6')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__shipment_province'), '6')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Post Code_shipment_postcode'), '6')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/textarea__shipment_address'), '666 jalannnn')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Country_Create'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), 'Algeria')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Country_Tax'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), 'Andorra')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), Keys.chord(Keys.ENTER))

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

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/input__tax_postcode'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_tax_type_Tax'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__tax_type_Tax'), 'Bukan Pemungut PPN')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__tax_type_Tax'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__nik'), '88888888')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Previous'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Submit'))

WebUI.delay(10)

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Active_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__name'), '`3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__email'), '3@gmail.com')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Branch'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Branch'), 'HEAD OFFICE')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Branch'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__phone_number'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Mobile Phone_mobile'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Faximile_faximile'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Website_website'), '3')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Country'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Span_Country'), 'Benin')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Span_Country'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Ìnput_Province'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__city'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Post Code_postcode'), '9')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/SPAN_TERM'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_Term'), 'net 30')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_Term'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Warehouse_select2-selection select2-se_029897'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_warehouse'), 'ea ea ea')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_warehouse'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Receivable Account_select2-selection s_072cfe'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Receivable_Account'), 'mandiri')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Text_Receivable_Account'), Keys.chord(
        Keys.ENTER))

WebUI.uploadFile(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_logo'), 'C:\\Users\\Owner\\Desktop\\vgl.jpg')

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/button_Logo'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/span_Close'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Business Classification_select2-select_502732'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_bis_clas'), 'Real Estate')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_span_bis_clas'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Business Spesification_business_spesi_56a6f5'), 
    '3')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_Agent_select2-selection select2-select_a2657d'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Ìnput_Text_Agent'), 'dimas')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Ìnput_Text_Agent'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/textarea__address'), '3')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_billing_Address'), '3')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_pic_name'), 'Tolong')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Email_pic_email'), '44@gmail.com')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Position_pic_position'), '4')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Division_pic_division'), '4')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Phone Number_pic_mobile'), '4')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Business Contact Number_pic_phone'), 
    '4')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Remarks_pic_remarks'), '4')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_pic_name2'), 'Saya')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Email_pic_email2'), '55@gmail.com')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Position_pic_position2'), '5')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Division_pic_division2'), '5')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Phone Number_pic_mobile2'), '5')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Remarks_legality_remarks2'), '5')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Business Contact Number_pic_phone2'), 
    '5')

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_legality_name'), '88')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Remarks_legality_remarks'), '88')

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/button_DL_Legal'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Name_legality_name2'), '99')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_legality_remarks2'), '99')

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/button_DL_Legal2'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/button_Add'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/Delete_Button_legal'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/Delete_Button_legal'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/button_Yes, remove it'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__shipment_city'), '7')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__shipment_province'), '7')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input_Post Code_shipment_postcode'), '7')

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/textarea__shipment_address'), '8888')

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/span_country_Create2'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), 'China')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/label_Same as Billing Address'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/label_Same as Billing Address'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Span_Country_Tax'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), 'Afghanistan')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/Input_Shipment_Country'), Keys.chord(Keys.ENTER))

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

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/input_document_Code2'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/span_tax_type_Tax'))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__tax_type_Tax'), 'Pajak Di Deemed')

WebUI.sendKeys(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__tax_type_Tax'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/input__nik'), '212312321')

WebUI.click(findTestObject('Master/Master_Customer/Page_Update Customer - Kelas Karyawan/label_Same as Billing Address_Tax'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Previous'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Next'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Create Customer - Kelas Karyawan/a_Submit'))

WebUI.delay(10)

WebUI.setText(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/input'), 'Cricket')

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Active_btn btn-action mr-1_1'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Active_btn btn-action mr-1_1'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Yes'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Sync'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/label_Update data'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Yes, close it'))

WebUI.delay(8)

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Sync'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Sync'))

WebUI.delay(45)

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Sync'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/label_Skip data'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Yes, close it'))

WebUI.delay(8)

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Sync'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/label_Skip data'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Sync'))

WebUI.delay(45)

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Active_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/a_Active_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Customer/Page_Master Customer - Kelas Karyawan/button_OK'))

WebUI.closeBrowser()

