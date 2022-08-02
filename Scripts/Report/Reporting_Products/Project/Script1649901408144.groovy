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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Report_Project/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Report_Project/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Report_Project/a_Login'))

WebUI.focus(findTestObject('Object Repository/Report_Project/a_Report'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Report'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Project'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_Custom'))

WebUI.click(findTestObject('Object Repository/Report_Project/input_Start Date_start_date'))

WebUI.click(findTestObject('Object Repository/Report_Project/th_April 2022'))

WebUI.click(findTestObject('Object Repository/Report_Project/th_2022'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_2021'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_Aug'))

WebUI.click(findTestObject('Object Repository/Report_Project/td_1'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_All_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'Export')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_All_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'Import')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_Import'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'Domestic')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_Domestic'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'All')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_Custom'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'Monthly')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_All'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'All')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_All'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'Import')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/span_Export'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_Import'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'Export')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.click(findTestObject('Report_Project/span_Export'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'Domestic')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_January'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'February')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report_Project/input_Year_chart_year'))

WebUI.click(findTestObject('Object Repository/Report_Project/li_2021'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_August'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_All'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'All')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_All'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'Import')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/span_Export'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_Import'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'Export')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.click(findTestObject('Report_Project/span_Export'))

WebUI.setText(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), 'Domestic')

WebUI.sendKeys(findTestObject('Object Repository/Report_Project/input_concat(id(, , select2-type_jobfile-re_92ed27'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/span_Domestic'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Project/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Project/a_Export to Excel'))

WebUI.closeBrowser()

