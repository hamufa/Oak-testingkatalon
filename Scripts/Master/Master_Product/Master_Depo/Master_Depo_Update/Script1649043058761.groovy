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

WebUI.setText(findTestObject('Master/Master_Depo/Page_Login Panel/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Depo/Page_Login Panel/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Depo/Page_Login Panel/a_Login'))

WebUI.focus(findTestObject('Master/Master_Depo/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.focus(findTestObject('Master/Master_Depo/Page_Dashboard - Kelas Karyawan/a_Depo'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Dashboard - Kelas Karyawan/a_Depo'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_name'))

WebUI.setText(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_name'), '555555')

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_npwp'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_npwp', [('variable') : '']), 
    Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input__depo_npwp', [('variable') : '']), 
    Keys.chord(Keys.NUMPAD6, Keys.NUMPAD4, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD4, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, 
        Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD0, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD0, 
        Keys.NUMPAD5, Keys.NUMPAD2, Keys.NUMPAD9))

WebUI.setText(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/textarea__depo_address'), '55555')

WebUI.click(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Save'))

WebUI.closeBrowser()

