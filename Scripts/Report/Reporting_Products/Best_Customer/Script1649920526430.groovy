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

WebUI.setText(findTestObject('Report_Best_Customer/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Report_Best_Customer/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Report_Best_Customer/a_Login'))

WebUI.click(findTestObject('Report_Best_Customer/a_Report'))

WebUI.click(findTestObject('Report_Best_Customer/a_Best Customer'))

WebUI.click(findTestObject('Report_Best_Customer/div_HEAD OFFICE SURABAYA Logistic  No eleme_9dc08a'))

WebUI.setText(findTestObject('Report_Best_Customer/input_Branch_customer'), 'HEAD OFFICE')

WebUI.sendKeys(findTestObject('Report_Best_Customer/input_Branch_customer'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Report_Best_Customer/input_Branch_customer'), 'SURABAYA')

WebUI.sendKeys(findTestObject('Report_Best_Customer/input_Branch_customer'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Report_Best_Customer/span_Choose a Marketing'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Report_Best_Customer/input_Marketing_customer'), 'dimas')

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

WebUI.setText(findTestObject('Report_Best_Customer/input_Marketing_customer'), 'dwira')

WebUI.sendKeys(findTestObject('Report_Best_Customer/input_Marketing_customer'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Report_Best_Customer/input_Marketing_customer'), 'Kintan')

WebUI.sendKeys(findTestObject('Report_Best_Customer/input_Marketing_customer'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

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

WebUI.closeBrowser()

