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

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/Page_Report Ontime - Kelas Karyawan/div_Preview Filter DataExport Excel'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/Page_Report Ontime - Kelas Karyawan/svg_Start Date_mx-calendar-icon'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/Page_Report Ontime - Kelas Karyawan/td_1'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/Page_Report Ontime - Kelas Karyawan/input_End Date_date'))

WebUI.click(findTestObject('Object Repository/Report_ReportTopOnTIme_Delay/Page_Report Ontime - Kelas Karyawan/td_29'))

