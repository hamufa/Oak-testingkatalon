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

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Report_Logistic/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Report_Logistic/a_Login'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/a_Report'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/a_Logistic'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_All'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'All')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Branch_select2-search__field'), 'HEAD OFFICE')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Branch_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_Logistic'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Accounting')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_Custom_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Custom')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/input_Start Date_start_date'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/th_'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/td_1'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/input_End Date_end_date'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/td_14'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_All'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Export')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/ul_HEAD OFFICE'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Surabaya')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_Accounting'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Logistic')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_Custom_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Monthly')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_January'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'February')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/input_Year_chart_year'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/li_2022'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_Export'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Import')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/ul_HEAD OFFICESURABAYA'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Logistic')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_Logistic'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Accounting')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_Import'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Domestic')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/ul_HEAD OFFICESURABAYA'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Jakarta')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_Accounting'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Logistic')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_Custom_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Custom')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/input_Start Date_start_date'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/th_March 2022'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/th_2022'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_2021'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_Aug'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/td_6'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/input_End Date_end_date'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/td_13'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_Logistic'))

WebUI.setText(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), 'Accounting')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Logistic/a_Filter'))

WebUI.closeBrowser()

