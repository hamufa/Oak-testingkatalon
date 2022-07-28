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

WebUI.setText(findTestObject('Report_Logistic/input_Close_select2_Surabaya'), 'Surabaya')

WebUI.sendKeys(findTestObject('Report_Logistic/input_Close_select2_Surabaya'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_Accounting'))

WebUI.setText(findTestObject('Report_Logistic/input_Close_select2_Logistic_Live'), 'Logistic')

WebUI.sendKeys(findTestObject('Object Repository/Report_Logistic/input_Close_select2-search__field'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_Logistic/span_Custom_select2-selection__arrow'))

WebUI.setText(findTestObject('Report_Logistic/input_Close_select2_Monthly'), 'Monthly')

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

WebUI.setText(findTestObject('Report_Logistic/input_Close_select2-search__field_3rd'), 'Logistic')

WebUI.sendKeys(findTestObject('Report_Logistic/input_Close_select2-search__field_3rd'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

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

WebUI.click(findTestObject('Settings_Statement_Of_Account/a_Statement Of Account'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/span_Select Agent'))

WebUI.setText(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), 'agen1')

WebUI.sendKeys(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Settings_Statement_Of_Account/span_Custom'))

WebUI.setText(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), 'Custom')

WebUI.sendKeys(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Settings_Statement_Of_Account/input_Start Date_start_date'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/th_'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/td_1'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/button_Preview'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/a_Filter'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/button_Preview'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/a_Export to Pdf'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/span_Custom'))

WebUI.setText(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), 'Monthly')

WebUI.sendKeys(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Settings_Statement_Of_Account/input_Year_chart_year'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/li_2021'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/span_January'))

WebUI.setText(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), 'December')

WebUI.sendKeys(findTestObject('Settings_Statement_Of_Account/input_Please wait a moment, your data is be_4ee5db'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Settings_Statement_Of_Account/button_Preview'))

WebUI.click(findTestObject('Settings_Statement_Of_Account/a_Filter'))

WebUI.click(findTestObject('Report_Best_Customer/a_Best Customer'))

WebUI.click(findTestObject('Report_Best_Customer/div_HEAD OFFICE SURABAYA Logistic  No eleme_9dc08a'))

WebUI.setText(findTestObject('Report_Best_Customer/input_Branch_customer'), 'HEAD OFFICE')

WebUI.sendKeys(findTestObject('Report_Best_Customer/input_Branch_customer'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Report_Best_Customer/span_Choose a Marketing'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Report_Best_Customer/input_Marketing_customer'), 'dwira')

WebUI.sendKeys(findTestObject('Report_Best_Customer/input_Marketing_customer'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Report_Best_Customer/input_Start Date_date'))

WebUI.click(findTestObject('Report_Best_Customer/a_2022'))

WebUI.click(findTestObject('Report_Best_Customer/span_2021'))

WebUI.click(findTestObject('Report_Best_Customer/span_Aug'))

WebUI.click(findTestObject('Report_Best_Customer/td_1'))

WebUI.click(findTestObject('Report_Best_Customer/input_End Date_date'))

WebUI.click(findTestObject('Report_Best_Customer/td_14'))

WebUI.selectOptionByValue(findTestObject('Report_Best_Customer/select_1551020'), '20', true)

WebUI.click(findTestObject('Report_Best_Customer/button_Filter'))

WebUI.click(findTestObject('Report_Best_Customer/a_Filter Data'))

WebUI.click(findTestObject('Report_Best_Customer/span_Choose a Marketing'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Report_Best_Customer/select_AllActiveSuspend'), 'active', true)

WebUI.click(findTestObject('Report_Best_Customer/button_Filter'))

WebUI.click(findTestObject('Report_Best_Customer/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Report_Best_Customer/select_AllActiveSuspend'), 'suspend', true)

WebUI.click(findTestObject('Report_Best_Customer/button_Filter'))

WebUI.click(findTestObject('Report_Best_Customer/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Report_Best_Customer/select_AllActiveSuspend'), 'All', true)

WebUI.selectOptionByValue(findTestObject('Report_Best_Customer/select_CustomMonthlyYearly'), 'monthlyData1', true)

WebUI.selectOptionByValue(findTestObject('Report_Best_Customer/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), '02', 
    true)

WebUI.click(findTestObject('Report_Best_Customer/input_Year_date'))

WebUI.click(findTestObject('Report_Best_Customer/span_2022'))

WebUI.click(findTestObject('Report_Best_Customer/button_Filter'))

WebUI.click(findTestObject('Report_Best_Customer/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Report_Best_Customer/select_AllActiveSuspend'), 'suspend', true)

WebUI.click(findTestObject('Report_Best_Customer/div_Year            4 2022 2020  2029 2022-_04de59'))

WebUI.selectOptionByValue(findTestObject('Report_Best_Customer/select_AllActiveSuspend'), 'All', true)

WebUI.selectOptionByValue(findTestObject('Report_Best_Customer/select_CustomMonthlyYearly'), 'yearlyData1', true)

WebUI.click(findTestObject('Report_Best_Customer/input_Year_date'))

WebUI.click(findTestObject('Report_Best_Customer/span_2021'))

WebUI.click(findTestObject('Report_Best_Customer/button_Filter'))

WebUI.click(findTestObject('Report_Best_Customer/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Report_Best_Customer/select_1551020'), '10', true)

WebUI.click(findTestObject('Report_Best_Customer/button_Filter'))

WebUI.click(findTestObject('Report_Best_Customer/a_Filter Data'))

WebUI.click(findTestObject('Report_Best_Customer/button_Filter'))

WebUI.click(findTestObject('Report_Best_Customer/a_Export PDF'))

WebUI.focus(findTestObject('Report_ReportTopOnTIme_Delay/a_Top OnTimeDelay_Staging'))

WebUI.click(findTestObject('Report_ReportTopOnTIme_Delay/a_Top OnTimeDelay_Staging'))

WebUI.click(findTestObject('Report_ReportTopOnTIme_Delay/div_Customer_multiselect__select'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Customer_customer'), 'PT. MAKMUR1')

WebUI.sendKeys(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Customer_customer'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Customer_customer'), 'Jukan')

WebUI.sendKeys(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Customer_customer'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/div_Marketing_multiselect__select'))

WebUI.setText(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Marketing_customer'), 'wira')

WebUI.sendKeys(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Marketing_customer'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Marketing_customer'), 'Leo')

WebUI.sendKeys(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Marketing_customer'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/button_Preview'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/select_AllExportImportDomestic'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/select_AllExportImportDomestic'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/i_Preview_fa fa-edit mr-2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/select_AllExportImportDomestic'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/select_AllPaidUnpaid'), 'paid', 
    true)

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/select_AllPaidUnpaid'), 'unpaid', 
    true)

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/select_CustomMonthlyYearly'), 'monthlyData', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '06', true)

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Year_date'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/span_2021'))

WebUI.selectOptionByValue(findTestObject('Report_ReportTopOnTIme_Delay/select_unpaidToAll'), 'All', true)

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/a_Filter Data'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/a_Export Excel'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Dashboard - Rimba Ananta Vikasa Indonesia/a_Report'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Dashboard - Rimba Ananta Vikasa Indonesia/a_List Transaction'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/input_Start Date_date'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_2022'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/span_2020'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/span_Jan'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/td_1'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/input_End Date_date'))

WebUI.click(findTestObject('Report_ListTransaction/Page_Report List Transaction -/a_2022_EndDate'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/span_2022'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/span_May'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/td_31'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Export Excel'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllExportImportDomestic'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllExportImportDomestic'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllExportImportDomestic'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllExportImportDomestic'), 
    'All', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllSellingBuyingOther CostJournalLogistic'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllSellingBuyingOther CostJournalLogistic'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllSellingBuyingOther CostJournalLogistic'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllSellingBuyingOther CostJournalLogistic'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllSellingBuyingOther CostJournalLogistic'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_CustomMonthlyYearly'), 
    'monthlyData', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '05', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/input_Year_date'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/span_2022'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllSellingBuyingOther CostJournalLogistic'), 
    'All', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllExportImportDomestic'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllExportImportDomestic'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllExportImportDomestic'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllExportImportDomestic'), 
    'All', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Export Excel'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllSellingBuyingOther CostJournalLogistic'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/input_Year_date'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllSellingBuyingOther CostJournalLogistic'), 
    'All', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllExportImportDomestic'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllExportImportDomestic'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllExportImportDomestic'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllExportImportDomestic'), 
    'All', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllSellingBuyingOther CostJournalLogistic'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllSellingBuyingOther CostJournalLogistic'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllSellingBuyingOther CostJournalLogistic'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllSellingBuyingOther CostJournalLogistic'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_AllSellingBuyingOther CostJournalLogistic'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Filter Data'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/a_Export Excel'))

WebUI.closeBrowser()

