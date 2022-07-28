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

WebUI.focus(findTestObject('Master/Master_Vendor/Page_Dashboard - Kelas Karyawan/a_Vendor'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Dashboard - Kelas Karyawan/a_Vendor'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__name'), '2')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__email'), '2@gmail.com')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Select Options Branch'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__select2-search__field'), 'HEAD OFFICE')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__select2-search__field'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span__select2-selection select2-selection--single_1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Vendor_vendor_code_text'), 
    'Vendor')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Vendor_vendor_code_text'), 
    Keys.chord(Keys.ARROW_DOWN))

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

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/div_Term  Set Manualnet 14net 15net 21net 3_bb56d4'), 
    'net 14')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/div_Term  Set Manualnet 14net 15net 21net 3_bb56d4'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Payable Account_select2-selection sele_0c0346'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/payable_input'), 'bca')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/payable_input'), Keys.chord(Keys.ENTER))

WebUI.uploadFile(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Logo_fname (1)'), 'C:\\Users\\Owner\\Desktop\\vgl.jpg')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Business Classification_select2-select_502732'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Business Classification_Input'), 
    'Public Health')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Business Classification_Input'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Business Spesification_business_spesi_56a6f5'), 
    '2')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Agent_select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Agent_input'), 'Rian')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Agent_input'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

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

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_Add_Legality'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Name_legality_name2'), '66')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_legality_remarks2'), 
    '6')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_Add_Legality'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_Vendor_btn btn-success btn-sm'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_Cancel'))

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

WebUI.delay(8)

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/a_Active_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__name'), '777')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__email'), '777@gmail.com')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Select Options Branch'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__select2-search__field'), 'HEAD OFFICE')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input__select2-search__field'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/Edit_input_Vendor_vendor_code_text'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/Edit_input_Vendor_vendor_code_text'), 
    'VN0777')

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

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/div_Term  Set Manualnet 14net 15net 21net 3_bb56d4'), 
    'net 30')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/div_Term  Set Manualnet 14net 15net 21net 3_bb56d4'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Payable Account_select2-selection sele_0c0346'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/payable_input'), 'MANDIRI')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/payable_input'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Business Classification_select2-select_502732'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Business Classification_Input'), 
    'Gambling')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Business Classification_Input'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Business Spesification_business_spesi_56a6f5'), 
    '7')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Agent_select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Agent_input'), 'dimas')

WebUI.sendKeys(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/span_Agent_input'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

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

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/Edit_button_Add_Legality'))

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Name_legality_name2'), '66')

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/input_Remarks_legality_remarks2'), 
    '6666')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/Edit_button_Add_Legality'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_Vendor_btn btn-success btn-sm'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_Vendor_btn btn-success btn-sm'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Create Vendor - Kelas Karyawan/button_Yes, remove it'))

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

WebUI.delay(8)

WebUI.click(findTestObject('Master/Master_Vendor/Page_Update Vendor - Kelas Karyawan/label_Synchronize with accurate'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Save_Sync'))

WebUI.delay(45)

WebUI.click(findTestObject('Master/Master_Vendor/Page_Update Vendor - Kelas Karyawan/label_Synchronize with accurate'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/label_Skip data'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Save_Sync'))

WebUI.delay(60)

WebUI.click(findTestObject('Master/Master_Vendor/Page_Update Vendor - Kelas Karyawan/label_Synchronize with accurate'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Cancel_sync'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Following_Cancel_sync'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Cancel_sync'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Sync_Yes, close it'))

WebUI.delay(7)

WebUI.setText(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/input'), '77')

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/a_Suspended_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/a_Suspended_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Yes'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_OK'), 5)

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_OK'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/a_Active_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/a_Active_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_OK'))

WebUI.focus(findTestObject('Master/Master_Address/a_Address'))

WebUI.click(findTestObject('Master/Master_Address/a_Address'))

WebUI.click(findTestObject('Master/Master_Address/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Address/textarea__warehouse_address'), '232323')

WebUI.click(findTestObject('Master/Master_Address/button_Save'))

WebUI.delay(4)

WebUI.click(findTestObject('Master/Master_Address/a_Create New'))

WebUI.click(findTestObject('Master/Master_Address/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Address/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Address/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Address/button_Yes, close it'))

WebUI.click(findTestObject('Master/Master_Address/button_Action_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Address/textarea__warehouse_address'), 'ea ea ea')

WebUI.click(findTestObject('Master/Master_Address/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Address/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Address/button_Cancel_Edit'))

WebUI.click(findTestObject('Master/Master_Address/button_Cancel_1_Edit'))

WebUI.click(findTestObject('Master/Master_Address/button_Cancel_Edit'))

WebUI.click(findTestObject('Master/Master_Address/button_Yes, close it_Edit'))

WebUI.setText(findTestObject('Master/Master_Address/input'), 'ea ea')

WebUI.click(findTestObject('Master/Master_Address/button_ea ea ea_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Address/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Address/button_ea ea ea_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Address/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Address/button_OK'))

WebUI.focus(findTestObject('Master/Master_Authorized/a_Authorized'))

WebUI.click(findTestObject('Master/Master_Authorized/a_Authorized'))

WebUI.click(findTestObject('Master/Master_Authorized/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Name_name'), '2222')

WebUI.setText(findTestObject('Master/Master_Authorized/input_Position_position'), '2222')

WebUI.setText(findTestObject('Master/Master_Authorized/input_Company Name_company_name'), '2222')

WebUI.setText(findTestObject('Master/Master_Authorized/input_Address_company_address'), '2222')

WebUI.setText(findTestObject('Master/Master_Authorized/input_TelpFax_telp_fax'), '2222')

WebUI.click(findTestObject('Master/Master_Authorized/input_NPWP_npwp'))

WebUI.sendKeys(findTestObject('Master/Master_Authorized/input_NPWP_npwp'), Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, 
        Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_Authorized/input_NPWP_npwp'), Keys.chord(Keys.NUMPAD2, Keys.NUMPAD3, Keys.NUMPAD4, 
        Keys.NUMPAD5, Keys.NUMPAD6, Keys.NUMPAD7, Keys.NUMPAD8, Keys.NUMPAD9, Keys.NUMPAD8, Keys.NUMPAD7, Keys.NUMPAD6, 
        Keys.NUMPAD5, Keys.NUMPAD4, Keys.NUMPAD3, Keys.NUMPAD2, Keys.NUMPAD1, Keys.NUMPAD7, Keys.NUMPAD7, Keys.NUMPAD6))

WebUI.click(findTestObject('Master/Master_Authorized/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Authorized/a_Create New'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Yes, close it'))

WebUI.delay(4)

WebUI.click(findTestObject('Master/Master_Authorized/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Authorized/div_Edit AuthorizedNamePositionCompany Name_88cade'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Name_name'), '33333')

WebUI.click(findTestObject('Master/Master_Authorized/div_NamePositionCompany NameNPWPAddressTelpFax'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Position_position'), '3333')

WebUI.click(findTestObject('Master/Master_Authorized/div_Edit AuthorizedNamePositionCompany Name_88cade'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Company Name_company_name'), '3333')

WebUI.click(findTestObject('Master/Master_Authorized/div_Edit AuthorizedNamePositionCompany Name_88cade'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Address_company_address'), '3333')

WebUI.setText(findTestObject('Master/Master_Authorized/input_TelpFax_telp_fax'), '3')

WebUI.click(findTestObject('Master/Master_Authorized/div_Edit AuthorizedNamePositionCompany Name_88cade'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_TelpFax_telp_fax'), '3333')

WebUI.click(findTestObject('Master/Master_Authorized/input_NPWP_npwp'))

WebUI.sendKeys(findTestObject('Master/Master_Authorized/input_NPWP_npwp'), Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, 
        Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_Authorized/input_NPWP_npwp'), Keys.chord(Keys.NUMPAD6, Keys.NUMPAD4, Keys.NUMPAD2, 
        Keys.NUMPAD7, Keys.NUMPAD4, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD0, 
        Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD0, Keys.NUMPAD5, Keys.NUMPAD2, Keys.NUMPAD9))

WebUI.click(findTestObject('Master/Master_Authorized/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Authorized/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel_Edit'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel_1_Edit'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel_Edit'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Yes, close it_Edit'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Authorized/button_Yes, close it_Edit'), 8)

WebUI.setText(findTestObject('Master/Master_Authorized/input'), '3333')

WebUI.click(findTestObject('Master/Master_Authorized/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Authorized/button_OK'))

WebUI.focus(findTestObject('Master/Master_Assignment/a_Assignment'))

WebUI.click(findTestObject('Master/Master_Assignment/a_Assignment'))

WebUI.click(findTestObject('Master/Master_Assignment/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Assignment/input_Name_name'), '22222')

WebUI.setText(findTestObject('Master/Master_Assignment/input_Position_position'), '22222')

WebUI.setText(findTestObject('Master/Master_Assignment/input_Company Name_company'), '22222')

WebUI.setText(findTestObject('Master/Master_Assignment/textarea_Address_address'), '2222')

WebUI.click(findTestObject('Master/Master_Assignment/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Assignment/a_Create New'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Yes, close it'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Assignment/div_Edit AssignmentName  PositionCompany Na_1431a5'))

WebUI.setText(findTestObject('Master/Master_Assignment/input_Name_name'), '3333')

WebUI.click(findTestObject('Master/Master_Assignment/div_Name  PositionCompany NameAddress'))

WebUI.setText(findTestObject('Master/Master_Assignment/input_Position_position'), '3333')

WebUI.click(findTestObject('Master/Master_Assignment/div_Name  PositionCompany NameAddress'))

WebUI.setText(findTestObject('Master/Master_Assignment/input_Company Name_company'), '3333')

WebUI.setText(findTestObject('Master/Master_Assignment/textarea_Address_address'), '3333')

WebUI.click(findTestObject('Master/Master_Assignment/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Assignment/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Yes, close it'))

WebUI.setText(findTestObject('Master/Master_Assignment/input'), '3333')

WebUI.click(findTestObject('Master/Master_Assignment/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Assignment/button_OK'), 9)

WebUI.click(findTestObject('Master/Master_Assignment/button_OK'))

WebUI.focus(findTestObject('Master/Master_PPJK/a_PPJK'))

WebUI.click(findTestObject('Master/Master_PPJK/a_PPJK'))

WebUI.click(findTestObject('Master/Master_PPJK/a_Create New'))

WebUI.setText(findTestObject('Master/Master_PPJK/input__ppjk_name'), '2222')

WebUI.click(findTestObject('Master/Master_PPJK/input__npwp'))

WebUI.sendKeys(findTestObject('Master/Master_PPJK/input__npwp'), Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_PPJK/input__npwp'), Keys.chord(Keys.NUMPAD6, Keys.NUMPAD4, Keys.NUMPAD2, Keys.NUMPAD7, 
        Keys.NUMPAD4, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD0, Keys.NUMPAD2, 
        Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD0, Keys.NUMPAD5, Keys.NUMPAD2, Keys.NUMPAD9))

WebUI.setText(findTestObject('Master/Master_PPJK/input__leader_name'), '2222')

WebUI.setText(findTestObject('Master/Master_PPJK/textarea__address'), '2222')

WebUI.click(findTestObject('Master/Master_PPJK/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_PPJK/a_Create New'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Yes, close it'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Action_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_PPJK/input__ppjk_name'), '33333')

WebUI.click(findTestObject('Master/Master_PPJK/input__npwp'))

WebUI.sendKeys(findTestObject('Master/Master_PPJK/input__npwp'), Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_PPJK/input__npwp'), Keys.chord(Keys.NUMPAD7, Keys.NUMPAD6, Keys.NUMPAD4, Keys.NUMPAD6, 
        Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, Keys.NUMPAD0, Keys.NUMPAD7, Keys.NUMPAD3, Keys.NUMPAD2, 
        Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD6, Keys.NUMPAD2, Keys.NUMPAD2, Keys.NUMPAD2))

WebUI.setText(findTestObject('Master/Master_PPJK/input__leader_name'), '3333')

WebUI.click(findTestObject('Master/Master_PPJK/div_Edit PPJKName PPJK  NPWP  PPJK Lead  Ad_086bc1'))

WebUI.setText(findTestObject('Master/Master_PPJK/textarea__address'), '3333')

WebUI.click(findTestObject('Master/Master_PPJK/button_Save'))

WebUI.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master/Master_PPJK/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Edit_Yes, close it'))

WebUI.setText(findTestObject('Master/Master_PPJK/input'), '3333')

WebUI.click(findTestObject('Master/Master_PPJK/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_PPJK/button_OK'))

WebUI.focus(findTestObject('Master/Master_Tax/a_Master Tax'))

WebUI.click(findTestObject('Master/Master_Tax/a_Master Tax'))

WebUI.click(findTestObject('Master/Master_Tax/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Tax/input__percentage'), '20')

WebUI.setText(findTestObject('Master/Master_Tax/textarea_Description_description'), '33333')

WebUI.click(findTestObject('Master/Master_Tax/button_Save'))

WebUI.delay(4)

WebUI.click(findTestObject('Master/Master_Tax/a_Create New'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Tax/button_Yes, close it'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Tax/button_Yes, close it'), 9)

WebUI.click(findTestObject('Master/Master_Tax/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Tax/div_Edit PercentagePercentage  DescriptionI_dbf609'))

WebUI.setText(findTestObject('Master/Master_Tax/input__percentage'), '80')

WebUI.click(findTestObject('Master/Master_Tax/div_Edit PercentagePercentage  DescriptionI_dbf609'))

WebUI.setText(findTestObject('Master/Master_Tax/textarea_Description_description'), 'ayam ayam')

WebUI.click(findTestObject('Master/Master_Tax/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Tax/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Tax/button_Yes, close it'))

WebUI.delay(4)

WebUI.setText(findTestObject('Master/Master_Tax/input'), 'ayam')

WebUI.click(findTestObject('Master/Master_Tax/button_ayam ayam_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Tax/button_ayam ayam_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Tax/button_Yes, delete it'))

WebUI.delay(2)

WebUI.click(findTestObject('Master/Master_Tax/button_OK'))

WebUI.closeBrowser()

