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

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Master/Master Auto Number/input_Welcome to Oaktree_password'), 
    'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/a_Login'))

WebUI.maximizeWindow()

WebUI.focus(findTestObject('Master/Master Auto Number/a_Master'))

WebUI.click(findTestObject('Master/Master Auto Number/a_Master'))

WebUI.focus(findTestObject('Master/Master Auto Number/a_Auto Number'))

WebUI.click(findTestObject('Master/Master Auto Number/a_Auto Number'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/th_Name'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/th_Type'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/th_Module'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/th_Example of Components'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/button_Create New'))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/input__name'), 'Numbering Transaction')

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/span_Job Order'))

WebUI.setText(findTestObject('Master/Master Auto Number/Input tipe job'), 'Job Order')

WebUI.sendKeys(findTestObject('Master/Master Auto Number/Input tipe job'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/span_Flexmod_select2-selection select2-sele_949578'))

WebUI.setText(findTestObject('Master/Master Auto Number/Input flexmod'), 'TMS')

WebUI.sendKeys(findTestObject('Master/Master Auto Number/Input flexmod'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/span__select2-selection select2-selection--single'))

WebUI.setText(findTestObject('Master/Master Auto Number/Job order module'), 'Job Order Loading')

WebUI.sendKeys(findTestObject('Master/Master Auto Number/Job order module'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/span__select2-selection select2-selection--single_1'))

WebUI.setText(findTestObject('Master/Master Auto Number/Type approved'), 'Approved')

WebUI.sendKeys(findTestObject('Master/Master Auto Number/Type approved'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Master/Master Auto Number/input__sequence_digit'), '1234554321')

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/span__select2-selection select2-selection--_ae237d'))

WebUI.setText(findTestObject('Master/Master Auto Number/input branch'), 'JAKARTA')

WebUI.sendKeys(findTestObject('Master/Master Auto Number/input branch'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Master/Master Auto Number/select_Not ResetDailyMonthlyYearly'), 
    'monthly', true)

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/span__select2-selection select2-selection--single'))

WebUI.setText(findTestObject('Master/Master Auto Number/Rekening id'), 'Cash in Bank')

WebUI.sendKeys(findTestObject('Master/Master Auto Number/Rekening id'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/label_Internal Autonumber'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/span__select2-selection select2-selection--single_1_2'))

WebUI.setText(findTestObject('Master/Master Auto Number/numbering time'), 'se')

WebUI.sendKeys(findTestObject('Master/Master Auto Number/numbering time'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master Auto Number/i_Month_fa fa-plus - Copy'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/span__select2-selection select2-selection--single_1_2'))

WebUI.setText(findTestObject('Master/Master Auto Number/numbering time'), 'Month')

WebUI.sendKeys(findTestObject('Master/Master Auto Number/numbering time'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/i_Month_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/span__select2-selection select2-selection--single_1_2'))

WebUI.setText(findTestObject('Master/Master Auto Number/numbering time'), 'day')

WebUI.sendKeys(findTestObject('Master/Master Auto Number/numbering time'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Master Auto Number/i_Month_fa fa-plus'))

WebUI.click(findTestObject('Master/Master Auto Number/button_Save'))

