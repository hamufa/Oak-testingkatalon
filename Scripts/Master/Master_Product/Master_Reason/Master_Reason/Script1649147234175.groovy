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

WebUI.setText(findTestObject('Master/Master_Reason/Page_Login Panel/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Reason/Page_Login Panel/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Reason/Page_Login Panel/a_Login'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.focus(findTestObject('Master/Master_Reason/Page_Dashboard - Kelas Karyawan/a_Reason'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master/Master_Reason/Page_Dashboard - Kelas Karyawan/a_Reason'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/textarea__reason'), 'tidak bisa create po')

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Yes, close it'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_tidak bisa create po_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/textarea__reason'), 'tidak bisa Delete po yang belum di approve')

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Save'))

WebUI.delay(4)

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_tidak bisa create po_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Yes, close it'))

WebUI.delay(4)

WebUI.setText(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/input'), 'po')

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_tidak bisa Delete po yang belum di a_ac5763'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_tidak bisa Delete po yang belum di a_ac5763'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/oke delete'))

WebUI.delay(2)

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_OK'))

WebUI.closeBrowser()

