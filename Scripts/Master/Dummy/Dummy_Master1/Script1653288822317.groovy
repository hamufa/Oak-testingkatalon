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

WebUI.waitForElementClickable(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/a_Create New'), 5)

WebUI.delay(1)

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

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Action_btn btn-action mr-1'), 
    9)

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

WebUI.delay(2)

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input_Yes, close it_select2-search__field'), 
    '3333')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_OK'), 9)

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Dashboard - Kelas Karyawan/a_Airlines'))

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

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Save'), 
    8)

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Action_btn btn-action'), 
    8)

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_OK'))

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input'), '222')

WebUI.click(findTestObject('Master/Master_Branch/Page_Dashboard - Kelas Karyawan/a_Branch'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input__branchCode'), '5')

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/textarea_Address_street'), '3')

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_city'), '3')

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_state'), '3')

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_country'), '3')

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_postCode'), '3')

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input__name'), '5123')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Save'))

WebUI.delay(7, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Action_btn btn-action mr-1'))

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

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input'), '444')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_-_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_OK'), 4)

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_OK'))

WebUI.closeBrowser()

