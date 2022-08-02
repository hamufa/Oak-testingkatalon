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

WebUI.navigateToUrl('https://app.oaktree.id/admin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Report_ListTransaction/Page_Login Panel/input_Welcome to Oaktree_email_user'), 
    '6a1c972882@catdogmail.live')

WebUI.setEncryptedText(findTestObject('Object Repository/Report_ListTransaction/Page_Login Panel/input_Welcome to Oaktree_password'), 
    'PLGTm/4mhzBK/fiUUkrWmQ==')

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Login Panel/a_Login'))

WebUI.focus(findTestObject('Object Repository/Report_ListTransaction/Page_Dashboard - Rimba Ananta Vikasa Indonesia/a_Report'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Dashboard - Rimba Ananta Vikasa Indonesia/a_Report'))

WebUI.focus(findTestObject('Object Repository/Report_ListTransaction/Page_Dashboard - Rimba Ananta Vikasa Indonesia/a_List Transaction'))

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

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/select_CustomMonthlyYearly'),
	'monthlyData', true)

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/input_Year_date'))

WebUI.click(findTestObject('Object Repository/Report_ListTransaction/Page_Report List Transaction -/span_2021'))

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

