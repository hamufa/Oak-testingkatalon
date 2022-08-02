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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dummy.oaktree.id/admin')

WebUI.setText(findTestObject('Master/Master_Branch/Page_Login Panel/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Branch/Page_Login Panel/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Branch/Page_Login Panel/a_Login'))

WebUI.focus(findTestObject('Master/Master_Branch/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.focus(findTestObject('Master/Master_Branch/Page_Dashboard - Kelas Karyawan/a_Branch'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Dashboard - Kelas Karyawan/a_Branch'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button edit'))

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div__col-md-12'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input__branchCode'), '321')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div_Address_col-md-12'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/textarea_Address_street'), '321')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div_Branch Code  Name  Accurate Cloud Based_b1b635'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_city'), '321')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div_Branch Code  Name  Accurate Cloud Based_b1b635'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_state'), '321')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div_Branch Code  Name  Accurate Cloud Based_b1b635'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_country'), '321')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div_Address_row'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input_Address_postCode'), '321')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/div__col-md-12_1'))

WebUI.setText(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/input__name'), '321')

WebUI.click(findTestObject('Master/Master_Branch/Page_Master - Kelas Karyawan/button_Save'))

WebUI.closeBrowser()

