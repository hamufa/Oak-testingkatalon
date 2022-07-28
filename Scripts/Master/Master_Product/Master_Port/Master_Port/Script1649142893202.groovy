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

WebUI.setText(findTestObject('Master/Master_Port/Page_Login Panel/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Port/Page_Login Panel/input_Welcome to Oaktree_password'), 
    'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Port/Page_Login Panel/a_Login'))

WebUI.click(findTestObject('Master/Master_Port/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.click(findTestObject('Master/Master_Port/Page_Dashboard - Kelas Karyawan/a_Port'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input__name_port'), '2222')

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/textarea_Description_desc_port'), 
    '2222')

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/span_INDONESIA_select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input_Save_select2-search__field'), 
    'Martinique')

WebUI.sendKeys(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input_Save_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Save'))

WebUI.delay(4)

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Yes, close it'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_MARTINIQUE_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input__name_port'), '3333')

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/textarea_Description_desc_port'), 
    '3333')

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/span_MARTINIQUE_select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input_Save_select2-search__field'), 
    'Denmark')

WebUI.sendKeys(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input_Save_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_MARTINIQUE_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Yes, close it'))

WebUI.setText(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/input_Save_select2-search__field'), 
    '333')

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_DENMARK_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_DENMARK_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_OK'))

WebUI.closeBrowser()

