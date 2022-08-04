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

WebUI.setText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Agent/Page_Login Panel/a_Login'))

WebUI.focus(findTestObject('Master/Master_Agent/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.focus(findTestObject('Master/Master_Agent/Page_Dashboard - Kelas Karyawan/a_Agent'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Dashboard - Kelas Karyawan/a_Agent'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input_Yes, close it_select2-search__field'), 
    '3333')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Yes, delete it'))

WebUI.closeBrowser()

