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

WebUI.setText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_email_user'), '8077186fef@catdogmail.live')

WebUI.setEncryptedText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_password'), 'PLGTm/4mhzBK/fiUUkrWmQ==')

WebUI.click(findTestObject('Master/Master_Agent/Page_Login Panel/a_Login'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.focus(findTestObject('Master/Master_Vendor/Page_Dashboard - Kelas Karyawan/a_Vendor'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Dashboard - Kelas Karyawan/a_Vendor'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__name'), '2')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__email'), '2@gmail.com')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Select Options Branch'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__select2-search__field_Staging'), 
    'Cabang Utama')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__select2-search__field_Staging'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_Select_Vendor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__text_SelectVendor'), 'Vendor')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__text_SelectVendor'), Keys.chord(
        Keys.ARROW_DOWN))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__phone'), '2')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Mobile Phone_mobile'), '2')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Faximile_faximile'), '2')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Website_website'), '2')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span__select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__select2-search__field'), 'Albania')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__select2-search__field'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__province'), '2')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__city'), '2')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Post Code_postcode'), '7')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/b'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/div_Term_Staging'), 'net 15')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/div_Term_Staging'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Payable Account_select2-selection sele_0c0346'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/payable_input_Staging'), 'cash on hand - tere')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/payable_input_Staging'), Keys.chord(
        Keys.ENTER))

WebUI.uploadFile(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Logo_fname (1)'), 'C:\\Users\\RIMBAVIKASA\\Pictures\\Saved Pictures\\Rimba.png')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Business Classification_select2-select_502732'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Business Classification_Input'), 
    'Public Health')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Business Classification_Input'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Business Spesification_business_spesi_56a6f5'), 
    '2')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Agent_select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Agent_input_Staging'), '333')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Agent_input_Staging'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/textarea__address'), '2')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/textarea_Note Vendor_remarks'), '2')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Name_pic_name'), '3')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Email_pic_email'), '3')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Position_pic_position'), '3')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Email_pic_email'), '3@gmail.com')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_pic_remarks'), '3')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Phone No_pic_mobile'), '3')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Division_pic_division'), '3')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Business Phone No_pic_phone'), 
    '3')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_ Add'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Name_pic_name2'), '4')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Email_pic_email2'), '4@gmail.com')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Position_pic_position2'), '4')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Division_pic_division2'), '4')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_pic_remarks2'), '4')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Phone No_pic_mobile2'), '4')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Business Phone No_pic_phone2'), 
    '4')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Name_legality_name'), '5')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_legality_remarks'), 
    '5')

WebUI.uploadFile(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Logo_fname_legal_1'), 'C:\\Users\\RIMBAVIKASA\\Pictures\\Saved Pictures\\Rimba.png')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_Add_Legality'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Name_legality_name2'), '66')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_legality_remarks2'), 
    '6')

WebUI.uploadFile(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Logo_fname_legal_2'), 'C:\\Users\\RIMBAVIKASA\\Pictures\\Saved Pictures\\Rimba.png')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_Add_Legality'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_Vendor_btn btn-success btn-sm'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_Yes, remove it'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/a_Next'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/label_Same as Billing Address'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__npwp'))

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__npwp'), Keys.chord(Keys.CONTROL, 
        Keys.LEFT, Keys.LEFT, Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__npwp'), Keys.chord(Keys.NUMPAD6, 
        Keys.NUMPAD4, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD4, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, Keys.NUMPAD2, 
        Keys.NUMPAD7, Keys.NUMPAD0, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD0, Keys.NUMPAD5, 
        Keys.NUMPAD2, Keys.NUMPAD9))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Digunggung'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_text_documentCode'), 'Faktur Pajak')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_text_documentCode'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span__tax'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_text_tax'), 'Perolehan Dalam Negeri - DPP Nilai Lain')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_text_tax'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/a_Previous'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/a_Next'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/a_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/a_Active_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__name'), '777')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__email'), '777@gmail.com')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Select Options Branch'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__select2-search__field_Staging'), 
    'Cabang Utama')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__select2-search__field_Staging'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/Edit_input_Vendor_vendor_code_text'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/Edit_input_Vendor_vendor_code_text'), 
    'KK222')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__phone'), '7')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Mobile Phone_mobile'), '7')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Faximile_faximile'), '77')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Website_website'), '777')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span__select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__select2-search__field'), 'Belgium')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__select2-search__field'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__province'), '777')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__city'), '7777')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Post Code_postcode'), '7777')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/b'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/div_Term_Staging'), 'C.O.D')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/div_Term_Staging'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Payable Account_select2-selection sele_0c0346'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/payable_input_Staging'), 'Item 20%')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/payable_input_Staging'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_ View_Logo'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/Close_ViewLogo'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Business Classification_select2-select_502732'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Business Classification_Input'), 
    'Gambling')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Business Classification_Input'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Business Spesification_business_spesi_56a6f5'), 
    '7')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Agent_select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Agent_input_Staging'), 'dimas')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Agent_input_Staging'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/textarea__address'), '7')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/textarea_Note Vendor_remarks'), '7')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Name_pic_name'), '8')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Email_pic_email'), '8')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Position_pic_position'), '8')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Email_pic_email'), '88@gmail.com')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_pic_remarks'), '8')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Phone No_pic_mobile'), '88')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Division_pic_division'), '8')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Business Phone No_pic_phone'), 
    '8')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_ Add'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Name_pic_name2'), '9')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Email_pic_email2'), '99@gmail.com')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Position_pic_position2'), '99')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Division_pic_division2'), '9')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_pic_remarks2'), '9')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Phone No_pic_mobile2'), '9')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Business Phone No_pic_phone2'), 
    '9')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Name_pic_name3'), '10')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Email_pic_email3'), '10')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Position_pic_position3'), '10')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Email_pic_email3'), '10@gmail.com')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_pic_remarks3'), '10')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Phone No_pic_mobile3'), '10')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Division_pic_division3'), '10')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Business Phone No_pic_phone3'), 
    '10')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/a_Next'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Name_legality_name'), '666666')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_legality_remarks'), 
    '666')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_ DL_Logo'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Name_legality_name2'), '66')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_legality_remarks2'), 
    '6666')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/a_Next'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__npwp'))

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__npwp'), Keys.chord(Keys.CONTROL, 
        Keys.LEFT, Keys.LEFT, Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__npwp'), Keys.chord(Keys.NUMPAD2, 
        Keys.NUMPAD3, Keys.NUMPAD4, Keys.NUMPAD5, Keys.NUMPAD6, Keys.NUMPAD7, Keys.NUMPAD8, Keys.NUMPAD9, Keys.NUMPAD8, 
        Keys.NUMPAD7, Keys.NUMPAD6, Keys.NUMPAD5, Keys.NUMPAD4, Keys.NUMPAD3, Keys.NUMPAD2, Keys.NUMPAD1, Keys.NUMPAD7, 
        Keys.NUMPAD7, Keys.NUMPAD6))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Digunggung'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_text_documentCode'), 'PIB Dan ssp')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_text_documentCode'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span__tax'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_text_tax'), 'Import BKP')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_text_tax'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/a_Previous'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/a_Next'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/a_Submit'))

WebUI.delay(6)

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/input'), '777')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/a_Suspended_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Yes'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_OK'), 3)

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_OK'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/a_Active_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_OK'), 5)

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_OK'))

WebUI.delay(2)

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

