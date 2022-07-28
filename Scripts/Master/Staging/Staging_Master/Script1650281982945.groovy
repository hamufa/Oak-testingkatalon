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

WebUI.click(findTestObject('Master/Master_Agent/Page_Dashboard - Kelas Karyawan/a_Agent'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Yes, close it'))

WebUI.waitForElementClickable(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/a_Create New'), 5)

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_name'), '22222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_phone'), '222222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input_Fax_agent_fax'), '222222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_email'), '222222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_pic'), '2222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/textarea__agent_address'), '22222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/textarea_Remarks_remarks'), '2222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_email'), '222222@gmail.com')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/span_Indonesia_select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/Input_Text_Country'), 'Ireland')

WebUI.sendKeys(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/Input_Text_Country'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Save'), 5)

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/div_Edit AgentName  Country  AfghanistanAlb_fa7174'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_name'), '3333')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/div__col-md-12'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_phone'), '333')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/div_Name  Country  AfghanistanAlbaniaAlgeri_b1a7e2'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input_Fax_agent_fax'), '3333')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/div_Edit AgentName  Country  AfghanistanAlb_fa7174'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_email'), '3333@gmail.com')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/div_Name  Country  AfghanistanAlbaniaAlgeri_b1a7e2'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_pic'), '3333333')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/div_Address'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/textarea__agent_address'), '33333')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/textarea_Remarks_remarks'), '44444')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/span_Ireland_select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/Input_Text_Country'), 'Jamaica')

WebUI.sendKeys(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/Input_Text_Country'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Save'), 8)

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Yes, close it'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input_Yes, close it_select2-search__field'), 
    '3333')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Dashboard - Kelas Karyawan/a_Airlines'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Yes, close it'))

WebUI.waitForElementNotVisible(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Yes, close it'), 
    8)

WebUI.waitForElementVisible(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/a_Create New'), 
    8)

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input__name'), '666')

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input__flight_no'), '666')

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/textarea_Description_desc'), 
    '666')

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Save'), 
    8)

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input__name'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/div_Edit AirlineName  DescriptionFlight No _2b7890'))

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input__name'), '777')

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/div_Description'))

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/textarea_Description_desc'), 
    '77')

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input__flight_no'), '777')

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/i__fa fa-plus'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/i__fa fa-plus'))

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input__flight_no2'), '999')

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/i__fa fa-minus'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/i__fa fa-minus'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Yes, remove it'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Save'), 
    5)

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel_Edit'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel_1_EDIT'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel_Edit'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Edit_Yes, close it'))

WebUI.waitForElementNotVisible(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Yes, close it'), 
    8)

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_OK'))

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input'), '222')

WebUI.click(findTestObject('Master/Master_Branch/Page_Dashboard - Kelas Karyawan/a_Branch'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Cancel_1'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Cancel'), 5)

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Yes, close it'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input__branchCode'), '3')

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/textarea_Address_street'), '3')

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_city'), '3')

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_state'), '3')

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_country'), '3')

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_postCode'), '3')

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input__name'), '3')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Save'), 8)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Cancel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Yes, close it_Edit'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Action_btn btn-action mr-1'), 
    8)

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div__col-md-12'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input__branchCode'), '4')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div_Address_col-md-12'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/textarea_Address_street'), '4')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div_Branch Code  Name  Accurate Cloud Based_b1b635'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_city'), '4')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div_Branch Code  Name  Accurate Cloud Based_b1b635'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_state'), '4')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div_Branch Code  Name  Accurate Cloud Based_b1b635'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_country'), '4')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div_Address_row'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_postCode'), '4')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div__col-md-12_1'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input__name'), '444')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Save'), 10)

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/a_Sync'))

WebUI.delay(1)

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/label_Skip data'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Sync'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Sync'), 15)

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/a_Sync'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/label_Update data'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Sync'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Sync'), 0)

WebUI.waitForElementVisible(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input'), 15)

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input'), '444')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_-_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_-_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Yes, delete it'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Yes, delete it'), 
    8)

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_OK'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Dashboard - Kelas Karyawan/a_Currency'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/a_Edit Currency'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_Yes, close it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/a_Edit Currency'), 
    15)

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/a_Edit Currency'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/label_Euro'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_Save'))

WebUI.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/a_No_btn btn-action mr-1 p-1'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/a_No_btn btn-action mr-1 p-1'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_Yes'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_OK'))

WebUI.setText(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/input'), 'IDR')

WebUI.sendKeys(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/a_No_btn btn-action mr-1 p-1'), 
    15)

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/a_No_btn btn-action mr-1 p-1'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/a_No_btn btn-action mr-1 p-1'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_Yes'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_OK'), 8)

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_OK'))

WebUI.focus(findTestObject('Master/Master_Depo/Page_Dashboard - Kelas Karyawan/a_Depo'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Dashboard - Kelas Karyawan/a_Depo'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Create New'))

WebUI.setText(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_name'), '777')

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_npwp', [('variable') : '']), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_npwp', [('variable') : '']), 
    Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_npwp', [('variable') : '']), 
    Keys.chord(Keys.NUMPAD4, Keys.NUMPAD2, Keys.NUMPAD1, Keys.NUMPAD4, Keys.NUMPAD4, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, 
        Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD0, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD2, Keys.NUMPAD0, 
        Keys.NUMPAD3, Keys.NUMPAD4, Keys.NUMPAD8))

WebUI.setText(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/textarea__depo_address'), '77777')

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Save'), 0)

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_name'))

WebUI.setText(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_name'), '555555')

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_npwp'))

WebUI.sendKeys(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_npwp', [('variable') : '']), 
    Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_npwp', [('variable') : '']), 
    Keys.chord(Keys.NUMPAD6, Keys.NUMPAD4, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD4, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, 
        Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD0, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD0, 
        Keys.NUMPAD5, Keys.NUMPAD2, Keys.NUMPAD9))

WebUI.setText(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/textarea__depo_address'), '55555')

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Save'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Yes, close it'))

WebUI.setText(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input'), '555')

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_OK'))

WebUI.click(findTestObject('Master/Master_Driver/Page_Dashboard - Kelas Karyawan/a_Driver'))

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Create New'))

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/input__name'), '333')

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/input__mobile'), '333')

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/textarea__address'), '333')

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/input__driver_license_no'), '333')

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/input__driver_license_exp'), '04-05-2022')

WebUI.sendKeys(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/input__driver_license_exp'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/input__ktp_no'), '333')

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/textarea_Remarks_remarks'), '33')

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Save'), 15)

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Create New'))

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Yes, close it'))

WebUI.delay(8)

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Available_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/input__driver_license_exp'), '07-07-2023')

WebUI.sendKeys(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/input__driver_license_exp'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/div_Edit DriverName  Phone  Address  Driver_bcfedc'))

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/input__name'), '444')

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/div_Name  Phone  Address  Driver License  D_c48113'))

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/input__mobile'), '4444')

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/div_Edit DriverName  Phone  Address  Driver_bcfedc'))

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/textarea__address'), '444')

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/div_Edit DriverName  Phone  Address  Driver_bcfedc'))

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/input__driver_license_no'), '444')

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/div_Edit DriverName  Phone  Address  Driver_bcfedc'))

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/input__ktp_no'), '444')

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/div_Edit DriverName  Phone  Address  Driver_bcfedc'))

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/textarea_Remarks_remarks'), '444')

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/label_This driver is available'))

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Save'), 15)

WebUI.setText(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/input'), '444')

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Not Available_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Not Available_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_OK'))

WebUI.focus(findTestObject('Master/Master_Item/Page_Dashboard - Kelas Karyawan/a_Item'))

WebUI.click(findTestObject('Master/Master_Item/Page_Dashboard - Kelas Karyawan/a_Item'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__item_name'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__item_name'), '2222')

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/span__select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input_Save_select2-search__field'), 'Non Inventory')

WebUI.sendKeys(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input_Save_select2-search__field'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/span__select2-selection__arrow_1'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input_Save_select2-search__field'), 'Refund')

WebUI.sendKeys(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input_Save_select2-search__field'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__item_number'), '2222')

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/textarea_Remarks_remarks'), '2222')

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'), 'Jakarta')

WebUI.sendKeys(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Save'), 15)

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Yes, close it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Non PPN_btn btn-action mr-1'), 
    15)

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Non PPN_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__item_name'), '333')

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__item_number'), '3333')

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/textarea_Remarks_remarks'), '333')

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/span__select2-selection__arrow_1'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input_Save_select2-search__field'), 'Deposit')

WebUI.sendKeys(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input_Save_select2-search__field'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/span_'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'), 'Jakarta')

WebUI.sendKeys(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Save'), 15)

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Non PPN_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Yes, close it'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Yes, close it'), 
    5)

WebUI.waitForElementVisible(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Non PPN_btn btn-action'), 
    8)

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Non PPN_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Non PPN_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_OK'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input'), '33333')

WebUI.click(findTestObject('Master/Master_Port/Page_Dashboard - Kelas Karyawan/a_Port'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input__name_port'), '2222')

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/textarea_Description_desc_port'), '2222')

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/span_INDONESIA_select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input_Text_Country'), 'Martinique')

WebUI.sendKeys(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input_Text_Country'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Save'), 15)

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Yes, close it'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Yes, close it'), 
    15)

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_MARTINIQUE_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Yes, close it'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_MARTINIQUE_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input__name_port'), '3333')

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/textarea_Description_desc_port'), '3333')

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/span_MARTINIQUE_select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input_Text_Country'), 'Denmark')

WebUI.sendKeys(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input_Text_Country'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Save'), 15)

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input_Save_select2-search__field'), '333')

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_DENMARK_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_DENMARK_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_OK'))

WebUI.focus(findTestObject('Master/Master_Reason/Page_Dashboard - Kelas Karyawan/a_Reason'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master/Master_Reason/Page_Dashboard - Kelas Karyawan/a_Reason'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/textarea__reason'), 'tidak bisa create po')

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Save'), 15)

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Yes, close it'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Yes, close it'), 
    15)

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_tidak bisa create po_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Yes, close it'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Yes, close it'), 
    15)

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_tidak bisa create po_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/textarea__reason'), 'tidak bisa Delete po yang belum di approve')

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Save'), 15)

WebUI.setText(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/input'), 'po')

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_tidak bisa Delete po yang belum di a_ac5763'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_tidak bisa Delete po yang belum di a_ac5763'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_OK'))

