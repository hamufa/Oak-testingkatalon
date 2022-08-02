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

WebUI.navigateToUrl('https://dummy.oaktree.id/admin/admin')

WebUI.setText(findTestObject('Object Repository/Report Logistic Repo/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Report Logistic Repo/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_Login'))

WebUI.maximizeWindow()

WebUI.focus(findTestObject('Object Repository/Report Logistic Repo/a_Report'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_Report'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_Logistic'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_All'))

WebUI.setText(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), 'ALL')

WebUI.sendKeys(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Report Logistic Repo/input_Branch_select2-search__field'), 'HEAD OFFICE')

WebUI.sendKeys(findTestObject('Object Repository/Report Logistic Repo/input_Branch_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_Logistic'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_Logistic'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_Custom'))

WebUI.setText(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), 'Custom')

WebUI.sendKeys(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/input_Start Date_start_date'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/th_July 2022'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_Jul'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/td_1'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/input_End Date_end_date'))

WebUI.click(findTestObject('Report Logistic Repo/Nextttt'))

WebUI.click(findTestObject('Report Logistic Repo/td_1 - Copy'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_JKT-F2110.0402-O'))

WebUI.verifyElementText(findTestObject('Object Repository/Report Logistic Repo/h4_JKT-F2110.0402-O'), 'JKT-F/22/10.0129')

WebUI.focus(findTestObject('Object Repository/Report Logistic Repo/button_Close'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/button_Close'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_PT PUIM'))

WebUI.verifyElementText(findTestObject('Object Repository/Report Logistic Repo/p_Customer Detail'), 'Customer Detail')

WebUI.focus(findTestObject('Report Logistic Repo/button_Close - Copy'))

WebUI.click(findTestObject('Report Logistic Repo/button_Close - Copy'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_All'))

WebUI.setText(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), 'Import')

WebUI.sendKeys(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Report Logistic Repo/input_Branch_select2-search__field'), 'SURABAYA')

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_Logistic'))

WebUI.setText(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), 'Accounting')

WebUI.sendKeys(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_Custom'))

WebUI.setText(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), 'Monthly')

WebUI.sendKeys(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_January'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/input_Year_chart_year'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/li_2021'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_Filter'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Report Logistic Repo/td_No data available in table'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_Import'))

WebUI.setText(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), 'All')

WebUI.sendKeys(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_Accounting'))

WebUI.setText(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), 'Logistic')

WebUI.sendKeys(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_September'))

WebUI.setText(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), 'November')

WebUI.sendKeys(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_Monthly'))

WebUI.setText(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), 'Custom')

WebUI.sendKeys(findTestObject('Object Repository/Report Logistic Repo/input_Close_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/input_Start Date_start_date'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/th_'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/td_1'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/input_End Date_end_date'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/th__1'))

WebUI.click(findTestObject('Report Logistic Repo/th__1 - Copy'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/td_1'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_2'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_Previous'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_Next'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_Export to Excel'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/span_All_1'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_Filter'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/th_No Plat'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/th_Jobfie'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/th_Customer'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/th_Selling Date'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/button_Preview'))

WebUI.click(findTestObject('Object Repository/Report Logistic Repo/a_Export to Excel'))

WebUI.closeBrowser()

