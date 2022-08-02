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

WebUI.setText(findTestObject('Master/Master_Shipping/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Shipping/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Shipping/a_Login'))

WebUI.focus(findTestObject('Master/Master_Shipping/a_Master'))

WebUI.click(findTestObject('Master/Master_Shipping/a_Master'))

WebUI.focus(findTestObject('Master/Master_Shipping/a_Shipping'))

WebUI.click(findTestObject('Master/Master_Shipping/a_Shipping'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Create New'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__name'), '2222')

WebUI.setText(findTestObject('Master/Master_Shipping/input__phone'), '2222')

WebUI.setText(findTestObject('Master/Master_Shipping/input__pic_name'), '2222')

WebUI.setText(findTestObject('Master/Master_Shipping/input__pic_phone'), '22222')

WebUI.setText(findTestObject('Master/Master_Shipping/textarea__address'), '22222')

WebUI.click(findTestObject('Master/Master_Shipping/span_Select a Code Shipping'))

WebUI.click(findTestObject('Master/Master_Shipping/input_concat(id(, , select2-shipping_code-p_7094c6'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master/Master_Shipping/input_concat(id(, , select2-shipping_code-p_7094c6'), 'shipsby')

WebUI.sendKeys(findTestObject('Master/Master_Shipping/input_concat(id(, , select2-shipping_code-p_7094c6'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_name'), '222')

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_shipping_id1'), '22222')

WebUI.setText(findTestObject('Master/Master_Shipping/new input'), '22222')

WebUI.click(findTestObject('Master/Master_Shipping/button_Note_btn btn-success btn-sm'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_name_1'), '333')

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_shipping_id3'), '333')

WebUI.setText(findTestObject('Master/Master_Shipping/input_Note_vessel_note2'), '333')

WebUI.click(findTestObject('Master/Master_Shipping/button_Note_btn btn-success btn-sm'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Note_btn-minus'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Note_btn-minus'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Yes, remove it'))

WebUI.focus(findTestObject('Master/Master_Shipping/button_Save'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Save'))

WebUI.delay(7)

WebUI.click(findTestObject('Master/Master_Shipping/button_Create New'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Shipping/okeh close'))

WebUI.click(findTestObject('Master/Master_Shipping/button_shipsby20220406.0232_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Shipping/input__name'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__name'), '33333')

WebUI.click(findTestObject('Master/Master_Shipping/div_Name  Phone Number  PIC Name  PIC Phone_0843a2'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__phone'), '33333')

WebUI.doubleClick(findTestObject('Master/Master_Shipping/div_Name  Phone Number  PIC Name  PIC Phone_0843a2'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__pic_name'), '333333')

WebUI.click(findTestObject('Master/Master_Shipping/div_Name  Phone Number  PIC Name  PIC Phone_0843a2'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__pic_phone'), '333333')

WebUI.click(findTestObject('Master/Master_Shipping/div_Name  Phone Number  PIC Name  PIC Phone_0843a2'))

WebUI.setText(findTestObject('Master/Master_Shipping/textarea__address'), '33333')

WebUI.click(findTestObject('Master/Master_Shipping/input_Shipping Code_shipping_code_text_edit'))

WebUI.setText(findTestObject('Master/Master_Shipping/input_Shipping Code_shipping_code_text_edit'), 'shipsby/20220404/9322')

WebUI.click(findTestObject('Master/Master_Shipping/input__vessel_name_1_2'))

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_name_1_2'), '3333')

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_shipping_id6'), '33333')

WebUI.setText(findTestObject('Master/Master_Shipping/input_Note_vessel_note1'), '33333')

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_name_1_2_3'), '4444')

WebUI.setText(findTestObject('Master/Master_Shipping/input__vessel_shipping_id7'), '123123123')

WebUI.setText(findTestObject('Master/Master_Shipping/input_Note_vessel_note'), '44444')

WebUI.click(findTestObject('Master/Master_Shipping/button_Save'))

WebUI.delay(8)

WebUI.setText(findTestObject('Master/Master_Shipping/input'), '3333')

WebUI.click(findTestObject('Master/Master_Shipping/button_shipsby202204049322_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Shipping/button_shipsby202204049322_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Shipping/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Shipping/button_OK'))

WebUI.closeBrowser()

