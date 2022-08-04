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

WebUI.setText(findTestObject('Object Repository/Report_Lifting/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Report_Lifting/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Login'))

WebUI.focus(findTestObject('Object Repository/Report_Lifting/a_Report'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Report'))

WebUI.focus(findTestObject('Object Repository/Report_Lifting/a_Lifting'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Lifting'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/ul_Sales_select2-selection__rendered'))

WebUI.setText(findTestObject('Object Repository/Report_Lifting/input_Sales_select2-search__field'), 'dwira')

WebUI.sendKeys(findTestObject('Object Repository/Report_Lifting/input_Sales_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/input_Start Date_start_date'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/th_April 2022'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/th_2022'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_2021'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Aug'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/td_10'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/input_End Date_end_date'))

WebUI.click(findTestObject('Report_Lifting/Pilih bulan'))

WebUI.click(findTestObject('Report_Lifting/mundur'))

WebUI.click(findTestObject('Report_Lifting/Bulan September'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/td_14'))

WebUI.setText(findTestObject('Report_Lifting/input_Loading_select2-search__field'), 'papua - india')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Loading_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Delivery_select2-selection select2-sel_67a74d'))

WebUI.setText(findTestObject('Report_Lifting/input_Delivery_select2-search__field'), 'JAKARTA - ICELAND')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Delivery_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

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

WebUI.setText(findTestObject('Object Repository/Report_Lifting/input_Sales_select2-search__field'), 'dwira')

WebUI.sendKeys(findTestObject('Object Repository/Report_Lifting/input_Sales_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/input_Year_chart_year'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/li_2021'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_January_select2-selection__arrow'))

WebUI.setText(findTestObject('Report_Lifting/input__select2-search__field'), 'September')

WebUI.sendKeys(findTestObject('Report_Lifting/input__select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Loading_select2-selection select2-sele_e18474'))

WebUI.setText(findTestObject('Report_Lifting/input_Loading_select2-search__field'), 'papua - india')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Loading_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Delivery_select2-selection select2-sel_67a74d'))

WebUI.setText(findTestObject('Report_Lifting/input_Delivery_select2-search__field'), 'JAKARTA - ICELAND')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Delivery_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Export to Excel'))

WebUI.delay(5)

//WebUI.click(findTestObject('Report_Lifting/span_Loading'))
WebUI.click(findTestObject('Object Repository/Report_Lifting/span_'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Monthly'))

WebUI.setText(findTestObject('Report_Lifting/input__select2-search__field'), 'Yearly')

WebUI.sendKeys(findTestObject('Report_Lifting/input__select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/ul_Sales_select2-selection__rendered'))

WebUI.setText(findTestObject('Object Repository/Report_Lifting/input_Sales_select2-search__field'), 'dwira')

WebUI.sendKeys(findTestObject('Object Repository/Report_Lifting/input_Sales_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
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

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Loading_select2-selection select2-sele_e18474_1'))

WebUI.setText(findTestObject('Report_Lifting/input_Loading_select2-search__field'), 'PAPUA - INDIA')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Loading_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/span_Delivery_select2-selection select2-sel_67a74d_1'))

WebUI.setText(findTestObject('Report_Lifting/input_Delivery_select2-search__field'), 'PAPUA - INDIA')

WebUI.sendKeys(findTestObject('Report_Lifting/input_Delivery_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_Lifting/a_Export to Excel'))

WebUI.delay(4)

WebUI.closeBrowser()

