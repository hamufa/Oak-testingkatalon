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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dummy.oaktree.id/admin/admin')

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/input_Welcome to Oaktree_email_user'), 
    'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/input_Welcome to Oaktree_password'), 
    'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/a_Login'))

WebUI.maximizeWindow()

WebUI.focus(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/a_Master'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/a_Master'))

WebUI.focus(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/a_Auto Number'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/a_Auto Number'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/th_Name'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/th_Type'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/th_Module'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/th_Example of Components'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Create New'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/input__name'), 'Numbering Transaction')

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/span_Job Order'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/Input tipe job'), 'Job Order')

WebUI.sendKeys(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/Input tipe job'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/span_Flexmod_select2-selection select2-sele_949578'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/Input flexmod'), 'TMS')

WebUI.sendKeys(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/Input flexmod'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/span__select2-selection select2-selection--single'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/Job order module'), 'Job Order Loading')

WebUI.sendKeys(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/Job order module'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/span__select2-selection select2-selection--single_1'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/Type approved'), 'Approved')

WebUI.sendKeys(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/Type approved'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/input__sequence_digit'), '5')

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/span__select2-selection select2-selection--_ae237d'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/input branch'), 'JAKARTA')

WebUI.sendKeys(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/input branch'), Keys.chord(
        Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/select_Not ResetDailyMonthlyYearly'), 
    'monthly', true)

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/span rek id'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/Rekening id'), 'Cash in Bank')

WebUI.sendKeys(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/Rekening id'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/label_Internal Autonumber'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/span__select2-selection select2-selection--single_1_2'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/numbering time'), 'Month')

WebUI.sendKeys(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/numbering time'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/i_Month_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/span__select2-selection select2-selection--single_1_2'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/numbering time'), 'sequence')

WebUI.sendKeys(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/numbering time'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/i_Month_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/span__select2-selection select2-selection--single_1_2'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/numbering time'), 'day')

WebUI.sendKeys(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/numbering time'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/i_Month_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Save'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/input'), 'Numbering Transaction')

WebUI.sendKeys(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Job Order Loading_btn btn-action mr-1'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/img_Action_edit'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/input_Current Counter_input_sequence'), 
    '5')

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Save (1)'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Yes, close it'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/span_'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/img_Action_edit'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/span__select2-selection select2-selection--single (1)'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/input'), 'sequence')

WebUI.sendKeys(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/i_This field is required_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/ul_JAKARTA'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/input'), 'SURABAYA')

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Save (1)'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Yes, close it'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/img_Job Order Loading_edit'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/img_Job Order Loading_edit'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_Yes, delete it'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/Autonumber Bagian 2/button_OK'))

WebUI.delay(3)

WebUI.closeBrowser()

