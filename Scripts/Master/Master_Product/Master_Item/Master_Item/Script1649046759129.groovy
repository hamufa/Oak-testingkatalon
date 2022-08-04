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

WebUI.setText(findTestObject('Master/Master_Item/Page_Login Panel/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Item/Page_Login Panel/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Item/Page_Login Panel/a_Login'))

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Master/Master_Item/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.click(findTestObject('Master/Master_Item/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.focus(findTestObject('Master/Master_Item/Page_Dashboard - Kelas Karyawan/a_Item'))

WebUI.click(findTestObject('Master/Master_Item/Page_Dashboard - Kelas Karyawan/a_Item'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__item_name'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__item_name'), '2222')

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/span__select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input_Save_select2-search__field'), 'Non Inventory')

WebUI.sendKeys(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input_Save_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__item_number'), '2222')

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/textarea_Remarks_remarks'), '2222')

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/span__select2-selection__arrow_1'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input_Save_select2-search__field'), 'Refund')

WebUI.sendKeys(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input_Save_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'), 'Head Office')

WebUI.sendKeys(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Yes, close it'))

WebUI.delay(3)

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Non PPN_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__item_name'), '333')

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__item_number'), '3333')

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/textarea_Remarks_remarks'), '333')

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/span__select2-selection__arrow_1'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input_Save_select2-search__field'), 'Deposit')

WebUI.sendKeys(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input_Save_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/span_'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'), 'Head Office')

WebUI.sendKeys(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Save'))

WebUI.delay(8)

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Non PPN_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Yes, close it'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Non PPN_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Non PPN_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Yes, delete it'))

WebUI.delay(2)

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_OK'))

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input'), '33333')

WebUI.closeBrowser()

