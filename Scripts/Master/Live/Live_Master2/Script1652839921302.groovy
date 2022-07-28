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

WebUI.navigateToUrl('https://app.oaktree.id/admin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_email_user'), '6a1c972882@catdogmail.live')

WebUI.setEncryptedText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_password'), 'PLGTm/4mhzBK/fiUUkrWmQ==')

WebUI.click(findTestObject('Master/Master_Agent/Page_Login Panel/a_Login'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Dashboard - Kelas Karyawan/a_Currency'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/a_Edit Currency'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/label_Euro'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_Save'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/a_No_btn btn-action mr-1 p-1'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_Yes'))

WebUI.setText(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/input'), 'IDR')

WebUI.delay(2)

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/a_No_btn btn-action mr-1 p-1'))

WebUI.click(findTestObject('Master/Master_Currency/Page_Master Currency - Kelas Karyawan/button_Yes_IDR'))

WebUI.delay(2)

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

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/button_Save'), 4)

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

WebUI.setText(findTestObject('Master/Master_Depo/Page_Master Depo - Kelas Karyawan/input'), '555')

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

WebUI.delay(4)

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

WebUI.delay(2)

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Not Available_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Driver/Page_Master Driver - Kelas Karyawan/button_OK'))

WebUI.focus(findTestObject('Master/Master_Item/Page_Dashboard - Kelas Karyawan/a_Item'))

WebUI.click(findTestObject('Master/Master_Item/Page_Dashboard - Kelas Karyawan/a_Item'))

WebUI.delay(3)

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

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'), 'Head Office')

WebUI.sendKeys(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Save'), 15)

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

WebUI.setText(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'), 'Head Office')

WebUI.sendKeys(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/input__select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Save'), 15)

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Non PPN_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_Yes, delete it'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Master/Master_Item/Page_Master Item - Kelas Karyawan/button_OK'), 8)

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

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_OK'), 3)

WebUI.click(findTestObject('Master/Master_Port/Page_Master Port - Kelas Karyawan/button_OK'))

WebUI.focus(findTestObject('Master/Master_Reason/Page_Dashboard - Kelas Karyawan/a_Reason'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master/Master_Reason/Page_Dashboard - Kelas Karyawan/a_Reason'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/textarea__reason'), 'tidak bisa create po')

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Save'), 15)

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_tidak bisa create po_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/textarea__reason'), 'tidak bisa Delete po yang belum di approve')

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Save'), 15)

WebUI.setText(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/input'), 'po')

WebUI.delay(3)

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_tidak bisa Delete po yang belum di a_ac5763'))

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_OK'), 4)

WebUI.click(findTestObject('Master/Master_Reason/Page_Master Reason - Kelas Karyawan/button_OK'))

WebUI.closeBrowser()

