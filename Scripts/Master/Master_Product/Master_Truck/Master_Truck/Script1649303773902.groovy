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

WebUI.setText(findTestObject('Master/Master_Truck/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Truck/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Truck/a_Login'))

WebUI.focus(findTestObject('Master/Master_Truck/a_Master'))

WebUI.click(findTestObject('Master/Master_Truck/a_Master'))

WebUI.focus(findTestObject('Master/Master_Truck/a_Truck'))

WebUI.click(findTestObject('Master/Master_Truck/a_Truck'))

WebUI.click(findTestObject('Master/Master_Truck/button_Create New'))

WebUI.setText(findTestObject('Master/Master_Truck/input__truck_no'), '252525')

WebUI.click(findTestObject('Master/Master_Truck/input__truck_kir'))

WebUI.click(findTestObject('Master/Master_Truck/td_8'))

WebUI.click(findTestObject('Master/Master_Truck/span__select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Truck/input_Save_select2-search__field'), 'Trailer')

WebUI.sendKeys(findTestObject('Master/Master_Truck/input_Save_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Truck/label_Available'))

WebUI.setText(findTestObject('Master/Master_Truck/textarea_Remarks_remarks'), 'habis stock guys')

WebUI.setText(findTestObject('Master/Master_Truck/input__truck_pic'), '2323232')

WebUI.click(findTestObject('Master/Master_Truck/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Master/Master_Truck/button_Create New'))

WebUI.click(findTestObject('Master/Master_Truck/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Truck/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Truck/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Truck/button_Yes, close it'))

WebUI.click(findTestObject('Master/Master_Truck/button_Not Available_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_Truck/input__truck_no'), '1111')

WebUI.click(findTestObject('Master/Master_Truck/input__truck_kir'))

WebUI.click(findTestObject('Master/Master_Truck/td_10'))

WebUI.click(findTestObject('Master/Master_Truck/span_Trailer'))

WebUI.setText(findTestObject('Master/Master_Truck/input_Save_select2-search__field'), 'Tronton')

WebUI.sendKeys(findTestObject('Master/Master_Truck/input_Save_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Truck/label_Available'))

WebUI.click(findTestObject('Master/Master_Truck/div_Truck No  Periodical Inspection Validit_2bb095'))

WebUI.setText(findTestObject('Master/Master_Truck/input__truck_pic'), '44444')

WebUI.setText(findTestObject('Master/Master_Truck/textarea_Remarks_remarks'), 'siap kirim')

WebUI.click(findTestObject('Master/Master_Truck/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Truck/button_Not Available_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Truck/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Truck/button_Cancel_1 - Copy'))

WebUI.click(findTestObject('Master/Master_Truck/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Truck/button_Yes, close it - Copy'))

WebUI.click(findTestObject('Master/Master_Truck/button_Available_btn btn-action'))

//WebUI.click(findTestObject('Master/Master_Truck/button_Yes, delete it - Copy'))
//
//WebUI.click(findTestObject('Master/Master_Truck/button_Available_btn btn-action'))
//
//WebUI.click(findTestObject('Master/Master_Truck/button_Yes, delete it'))

//WebUI.click(findTestObject('Master/Master_Truck/button_OK'))

WebUI.closeBrowser()

