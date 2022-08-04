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

WebUI.setText(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Welcome to Oaktree_password'), 
    'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/a_Login'))

WebUI.maximizeWindow()

WebUI.focus(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/a_Report'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/a_Report'))

WebUI.focus(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/a_Top OnTimeDelay'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/a_Top OnTimeDelay'))

WebUI.click(findTestObject('Report_ReportTopOnTIme_Delay/div_Customer_multiselect__select'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Customer_customer'), 'PT UYE')

WebUI.sendKeys(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Customer_customer'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Customer_customer'), 'yuaman')

WebUI.sendKeys(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Customer_customer'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Customer_customer'), 'PT. 46657')

WebUI.sendKeys(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Customer_customer'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/div_Marketing_multiselect__select'))

WebUI.setText(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Marketing_customer'), 'sidik')

WebUI.sendKeys(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Marketing_customer'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Marketing_customer'), 'dwira')

WebUI.sendKeys(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Marketing_customer'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/div_Kintan dwira'))

WebUI.setText(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Marketing_customer'), 'kofyifilme')

WebUI.sendKeys(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Marketing_customer'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/select_CustomMonthlyYearly'), 'customData', 
    true)

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/input_Year_date'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/span_2022'))

WebUI.click(findTestObject('Report_ReportTopOnTIme_Delay/input_Year_date - Copy'))

WebUI.click(findTestObject('Report_ReportTopOnTIme_Delay/span_2022 - Copy'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/a_Filter Data'))

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

WebUI.delay(4)

WebUI.closeBrowser()

