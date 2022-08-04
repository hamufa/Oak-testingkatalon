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

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Login Panel/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Final_Master_AirLine/Page_Login Panel/input_Welcome to Oaktree_password'), 
    'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Login Panel/a_Login'))

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.focus(findTestObject('Master/Final_Master_AirLine/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.focus(findTestObject('Master/Final_Master_AirLine/Page_Dashboard - Kelas Karyawan/a_Airlines'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Dashboard - Kelas Karyawan/a_Airlines'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/Yes close'))

WebUI.delay(8)

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input__name'), '666')

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input__flight_no'), '666')

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/textarea_Description_desc'), 
    '666')

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input__name'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/div_Edit AirlineName  DescriptionFlight No _2b7890'))

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input__name'), '777')

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/div_Description'))

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/textarea_Description_desc'), 
    '77')

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input__flight_no'), '777')

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/i__fa fa-plus'))

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input__flight_no'), '999')

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/i__fa fa-minus'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/i__fa fa-minus'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/ya remove'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Save'))

WebUI.setText(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input'), '999')

WebUI.sendKeys(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/close this'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_Yes, delete it'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Final_Master_AirLine/Page_Master Airline - Kelas Karyawan/button_OK'))

WebUI.delay(5)

WebUI.closeBrowser()

