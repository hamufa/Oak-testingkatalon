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

WebUI.setText(findTestObject('Master/Master_Term/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Term/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Term/a_Login'))

WebUI.click(findTestObject('Master/Master_Term/a_Master'))

WebUI.click(findTestObject('Master/Master_Term/a_Master'))

WebUI.focus(findTestObject('Master/Master_Term/a_Term'))

WebUI.click(findTestObject('Master/Master_Term/a_Term'))

WebUI.click(findTestObject('Master/Master_Term/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Term/input__name'), '222')

WebUI.setText(findTestObject('Master/Master_Term/input__due_period'), '25')

WebUI.setText(findTestObject('Master/Master_Term/textarea_Notes_remarks'), '2555asd')

WebUI.click(findTestObject('Master/Master_Term/label_Default Payment Term'))

WebUI.click(findTestObject('Master/Master_Term/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Term/a_Create New'))

WebUI.click(findTestObject('Master/Master_Term/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Term/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Term/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Term/button_Yes, close it'))

WebUI.click(findTestObject('Master/Master_Term/button_Yes_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Term/html_Master Term - Kelas Karyawan.profile-p_a685a0'))

WebUI.setText(findTestObject('Master/Master_Term/input__name'), '3333')

WebUI.setText(findTestObject('Master/Master_Term/input__due_period2'), '33')

WebUI.click(findTestObject('Master/Master_Term/html_Master Term - Kelas Karyawan.profile-p_a685a0'))

WebUI.setText(findTestObject('Master/Master_Term/textarea_Notes_remarks'), 'asdasd')

WebUI.click(findTestObject('Master/Master_Term/label_Default Payment Term'))

WebUI.click(findTestObject('Master/Master_Term/button_Save'))

WebUI.setText(findTestObject('Master/Master_Term/input'), '3333')

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Term/button_No_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Term/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Term/button_No_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Term/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Term/button_OK'))

WebUI.closeBrowser()

