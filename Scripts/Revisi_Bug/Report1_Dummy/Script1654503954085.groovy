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

WebUI.setText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Report_Project/a_Login'))

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
        Keys.ARROW_DOWN, Keys.ENTER))

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

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Lifting'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/ul_Sales_select2-selection__rendered'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/input_Start Date_start_date'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/th_April 2022'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/th_2022'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_2021'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Aug'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/td_10'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/input_End Date_end_date'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/td_14'))

WebUI.setText(findTestObject('Report_Lifting/input_Loading_select2-search__field_Staging'), 'jakarta')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Loading_select2-search__field_Staging'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Delivery_select2-selection select2-sel_67a74d'))

WebUI.setText(findTestObject('Report_Lifting/input_Delivery_select2-search__field_Staging'), 'INDONESIA')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Delivery_select2-search__field_Staging'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.setText(findTestObject('Report_Lifting/input_Delivery_select2-search__field_Staging'), 'Jakarta')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Delivery_select2-search__field_Staging'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Export to Excel'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_Lifting/select_AllExportImportDomestic'), '1', true)

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_Lifting/select_AllExportImportDomestic'), '2', true)

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_Lifting/select_AllExportImportDomestic'), '3', true)

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Custom'))

WebUI.setText(findTestObject('Report_Lifting/input__select2-search__field'), 'Monthly')

WebUI.sendKeys(findTestObject('Report_Lifting/input__select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_Lifting/select_AllExportImportDomestic'), '0', true)

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/ul_Sales_select2-selection__rendered'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/input_Year_chart_year'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/li_2021'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_January_select2-selection__arrow'))

WebUI.setText(findTestObject('Report_Lifting/input__select2-search__field'), 'September')

WebUI.sendKeys(findTestObject('Report_Lifting/input__select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Loading_select2-selection select2-sele_e18474'))

WebUI.setText(findTestObject('Report_Lifting/input_Loading_select2-search__field'), 'Papua')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Loading_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Delivery_select2-selection select2-sel_67a74d'))

WebUI.setText(findTestObject('Report_Lifting/input_Delivery_select2-search__field'), 'Jakarta')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Delivery_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Monthly'))

WebUI.setText(findTestObject('Report_Lifting/input__select2-search__field'), 'Yearly')

WebUI.sendKeys(findTestObject('Report_Lifting/input__select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/ul_Sales_select2-selection__rendered'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Export to Excel'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_Lifting/select_AllExportImportDomestic'), '1', true)

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_Lifting/select_AllExportImportDomestic'), '2', true)

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_Lifting/select_AllExportImportDomestic'), '3', true)

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Loading_select2-selection select2-sele_e18474_1'))

WebUI.setText(findTestObject('Report_Lifting/input_Loading_select2-search__field_Staging'), 'Papua')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Loading_select2-search__field_Staging'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Delivery_select2-selection select2-sel_67a74d_1'))

WebUI.setText(findTestObject('Report_Lifting/input_Delivery_select2-search__field_Staging'), 'Papua')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Delivery_select2-search__field_Staging'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.setText(findTestObject('Report_Lifting/input_Delivery_select2-search__field_Staging'), 'Jakarta')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Delivery_select2-search__field_Staging'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Export to Excel'))

