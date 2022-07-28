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

WebUI.setText(findTestObject('Object Repository/Mater_Currency_TETER/Page_Login Panel/input_Welcome to Oaktree_email_user'), 
    'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Mater_Currency_TETER/Page_Login Panel/input_Welcome to Oaktree_password'), 
    '3J1fgvnkvcU=')

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Login Panel/p_Enter your email and password to log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Mater_Currency_TETER/Page_Login Panel/input_Welcome to Oaktree_password'), 
    'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Login Panel/a_Login'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Dashboard - Kelas Karyawan/span_Currency'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/a_Edit Currency'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/label_Australia Dollar'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/label_Korea Won'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/button_Save'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/a_Edit Currency'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/label_Australia Dollar'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/label_Korea Won'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/label_Philippines Peso'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/label_Viet Nam Dong'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/button_Save'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/a_Edit Currency'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/label_Viet Nam Dong'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/label_Philippines Peso'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/label_Euro'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/button_Save'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/a_No_btn btn-action mr-1 p-1'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/button_Yes'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/button_OK'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/a_No_btn btn-action mr-1 p-1'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/button_Yes'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/button_OK'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/a_Edit Currency'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/button_Yes, close it'))

WebUI.setText(findTestObject('Object Repository/Mater_Currency_TETER/Page_Master Currency - Kelas Karyawan/input'), 'jpy')

WebUI.closeBrowser()

