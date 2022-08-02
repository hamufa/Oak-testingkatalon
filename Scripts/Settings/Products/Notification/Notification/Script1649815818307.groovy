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

WebUI.setText(findTestObject('Object Repository/Setting_Notification/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Setting_Notification/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Setting_Notification/a_Login'))

WebUI.focus(findTestObject('Object Repository/Setting_Notification/a_Setting'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/a_Setting'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/a_Notification'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/a_Create New'))

WebUI.click(findTestObject('Setting_Notification/button cansel b'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Cancel_1'))

WebUI.click(findTestObject('Setting_Notification/button cansel b'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Yes, close it'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/a_Create New'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/span_Jobfile_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), 'Buying')

WebUI.sendKeys(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Setting_Notification/span_All Condition_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), 'Jobfile Type')

WebUI.sendKeys(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Setting_Notification/span_HEAD OFFICE_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), 'JAKARTA')

WebUI.sendKeys(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Setting_Notification/span_ActionWhen'))

WebUI.setText(findTestObject('Setting_Notification/input_create_Actionwhen'), 'Add item buying')

WebUI.sendKeys(findTestObject('Setting_Notification/input_create_Actionwhen'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Setting_Notification/span_Export_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), 'Domestic')

WebUI.sendKeys(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Setting_Notification/ul__select2-selection__rendered'))

WebUI.setText(findTestObject('Setting_Notification/input__select2-search__field'), 'dika')

WebUI.sendKeys(findTestObject('Setting_Notification/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Setting_Notification/button_Save'), 9)

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_dika,_btn btn-action mr-1'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/span_Jobfile_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), 'Jobfile')

WebUI.sendKeys(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Setting_Notification/span_All Condition_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), 'All Condition')

WebUI.sendKeys(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Setting_Notification/span_ActionWhen'))

WebUI.setText(findTestObject('Setting_Notification/input_create_Actionwhen'), 'Document Collected')

WebUI.sendKeys(findTestObject('Setting_Notification/input_create_Actionwhen'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Setting_Notification/span_HEAD OFFICE_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), 'BANDUNG')

WebUI.sendKeys(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Setting_Notification/label_Use Email Notification'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/label_Use Group Access'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/span_Administrator JKT_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), 'Administrator SBY')

WebUI.sendKeys(findTestObject('Object Repository/Setting_Notification/input_Yes, close it_select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Setting_Notification/button_Save'), 9)

WebUI.click(findTestObject('Object Repository/Setting_Notification/img_-_edit'))

WebUI.click(findTestObject('Setting_Notification/Pelengkap'))

WebUI.click(findTestObject('Setting_Notification/DIKA CANCEL LAGI'))

WebUI.click(findTestObject('Setting_Notification/Pelengkap'))

WebUI.click(findTestObject('Setting_Notification/Pelengkap - Copy'))

WebUI.click(findTestObject('Setting_Notification/DIKATERAKHIR'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Yes, delete it'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_OK'))

WebUI.closeBrowser()

