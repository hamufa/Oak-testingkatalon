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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_Login Panel/input_Welcome to Oaktree_email_user'), 
    'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_Login Panel/input_Welcome to Oaktree_password'), 
    'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.modifyObjectProperty(findTestObject(null), Keys.chord(Keys.F11), '', '', false)

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_Login Panel/a_Login'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_Dashboard - Kelas Karyawan/a_List Sparepart'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_List Sprepart'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    'List Sprepart')

WebUI.sendKeys(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_List Sprepart_btn btn-sm btn-success'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_List Sprepart_btn btn-sm btn-success'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_Choose'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    'wira')

WebUI.sendKeys(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Invoice_invoice_no'), 
    'VN0-01232')

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_net 45'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    'net 15')

WebUI.sendKeys(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_MYR'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    'IDR')

WebUI.sendKeys(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Date (yyyymmdd)_cost_date'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/td_1'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_Choose_1'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    '10')

WebUI.sendKeys(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_Choose_1_2'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    'Faktur')

WebUI.sendKeys(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_Choose_1_2_3'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    'Tidak dapat dikreditkan - buka')

WebUI.sendKeys(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Inclusive Tax_inclusive_tax_cost'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_AA - aaa'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    'AA')

WebUI.sendKeys(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_Choose_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    'WR 001')

WebUI.sendKeys(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Qty_qty_cost'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Price_pricecost'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Remarks_remarks_cost'), 
    '5')

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Truck_inclusive_tax_cost'))

WebUI.click(findTestObject('Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_Choose_1_2_3_Truck'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    'B 9985 UIX')

WebUI.sendKeys(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Add Item'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Add Item'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Yes'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_B 9985 UIX_btn btn-action mr-1'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Qty_qty_cost_edit'), 
    '56')

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/div_Item45345 - 435388888 - 8888AA - aaaITE_f5e001'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Price_pricecost_edit'), 
    '6')

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_WR 001'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    'warehouse')

WebUI.sendKeys(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Truck_inclusive_tax_cost_edit'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Save'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Save'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Yes'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_B 9985 UIX_btn btn-action mr-1'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Yes, close it'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Save'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Yes'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_OK'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_OK'), 
    5)

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Rp. 1,680.00_btn btn-action mr-1'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Yes, close it'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    'PIJKT')

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/tr_1PI.JKT202222302022-06-0115610.00Rp. 1,680.00'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Cancel_select2-search__field'), 
    'PI.JKT/202222/30')

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Rp. 1,680.00_btn btn-action mr-1'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_01 - Tidak dapat dikreditkan - Bukan P_1debd4'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_Faktur Pajak'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_Choose_1_2_3_4_5'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Qty_qty_cost'), 
    '8')

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/span_Choose_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Price_pricecost'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/input_Remarks_remarks_cost'), 
    '8')

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Save'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Yes'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_OK'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/img_Rp. 1,680.00_edit'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Yes, close it'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Rp. 1,680.00_btn btn-action ml-1'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Yes, just do it'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_OK'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/img_Rp. 1,680.00_edit_1'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Rp. 1,680.00_btn btn-action'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/button_OK'))

WebUI.click(findTestObject('Object Repository/Jobfile/Jobfile-List_sparepart/Page_List Sparepart - Kelas Karyawan/div_Data Out'))

WebUI.closeBrowser()

