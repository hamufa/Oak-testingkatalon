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

WebUI.setText(findTestObject('Object Repository/Setting_User/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Setting_User/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Setting_User/a_Login'))

WebUI.focus(findTestObject('Object Repository/Setting_User/a_Setting'))

WebUI.click(findTestObject('Object Repository/Setting_User/a_Setting'))

WebUI.focus(findTestObject('Object Repository/Setting_User/a_User'))

WebUI.click(findTestObject('Object Repository/Setting_User/a_User'))

WebUI.click(findTestObject('Object Repository/Setting_User/a_Create User'))

WebUI.uploadFile(findTestObject('Setting_User/input_Profile Picture_fname'), 'C:\\Users\\tanto\\git\\Oak-testingkatalon\\Upload file test\\candy.png')

WebUI.setText(findTestObject('Object Repository/Setting_User/input__name_user'), 'asssq')

WebUI.setText(findTestObject('Object Repository/Setting_User/input__email_user'), 'Wirata@gmail.com')

WebUI.setText(findTestObject('Object Repository/Setting_User/input__mobile_user'), 'fdsfsd')

WebUI.setText(findTestObject('Object Repository/Setting_User/input__employee_id'), 'asdsadsa')

WebUI.click(findTestObject('Object Repository/Setting_User/ul__select2-selection__rendered'))

WebUI.setText(findTestObject('Setting_User/input__select2-search__field'), 'Administrator JKT')

WebUI.sendKeys(findTestObject('Setting_User/input__select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Setting_User/Input_User_Accurate_Access'), 'Admin')

WebUI.sendKeys(findTestObject('Setting_User/Input_User_Accurate_Access'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Setting_User/input_Branch'), 'HEAD OFFICE')

WebUI.sendKeys(findTestObject('Setting_User/input_Branch'), Keys.chord(Keys.ENTER))

WebUI.focus(findTestObject('Object Repository/Setting_User/button_Save'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Setting_User/button_Active_btn btn-action mr-1'))

WebUI.uploadFile(findTestObject('Setting_User/input_Profile Picture_fname'), 'C:\\Users\\tanto\\git\\Oak-testingkatalon\\Upload file test\\ice-cream.png')

WebUI.click(findTestObject('Object Repository/Setting_User/div_Profile PictureName  Email  Mobile Phon_7b2fcb'))

WebUI.setText(findTestObject('Object Repository/Setting_User/input__name_user'), 'amiyai')

WebUI.click(findTestObject('Object Repository/Setting_User/div_Profile PictureName  Email  Mobile Phon_7b2fcb'))

WebUI.setText(findTestObject('Object Repository/Setting_User/input__mobile_user'), '21543254')

WebUI.click(findTestObject('Object Repository/Setting_User/div_.select2-container .select2-selection--_059811'))

WebUI.setText(findTestObject('Object Repository/Setting_User/input__employee_id'), 'nsS')

WebUI.click(findTestObject('Object Repository/Setting_User/ul_Administrator JKT'))

WebUI.setText(findTestObject('Object Repository/Setting_User/input__select2-search__field'), 'fdsfsd')

WebUI.sendKeys(findTestObject('Setting_User/input__select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Setting_User/Input_User_Accurate_Access'), 'COBA')

WebUI.sendKeys(findTestObject('Setting_User/Input_User_Accurate_Access'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Setting_User/input_Branch'), 'JAKARTA')

WebUI.sendKeys(findTestObject('Setting_User/input_Branch'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Setting_User/label_This user is salesman'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Setting_User/button_Save'), 8)

WebUI.click(findTestObject('Object Repository/Setting_User/a_Create User'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Yes, close it'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Setting_User/button_Active_btn btn-action mr-1'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Cancel'))

WebUI.click(findTestObject('Setting_User/button_Yes, close it_Edit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Setting_User/input_Search'), 'amiyai')

WebUI.click(findTestObject('Object Repository/Setting_User/button_Active_btn btn-action'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Active_btn btn-action'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Yes, suspend it'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_OK'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Suspended_btn btn-action'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Suspended_btn btn-action'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Setting_User/button_OK'), 9)

WebUI.click(findTestObject('Object Repository/Setting_User/button_OK'))

WebUI.delay(4)

WebUI.closeBrowser()

