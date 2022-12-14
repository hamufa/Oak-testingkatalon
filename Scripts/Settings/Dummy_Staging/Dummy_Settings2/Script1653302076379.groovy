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

WebUI.setText(findTestObject('Settings_Accurate_Access/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Settings_Accurate_Access/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Settings_Accurate_Access/a_Login'))

WebUI.focus(findTestObject('Settings_Accurate_Access/a_Setting'))

WebUI.click(findTestObject('Settings_Accurate_Access/a_Setting'))

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/a_Default Party'))

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_Add Party'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Setting_DefaultParty/select_Selling                             _355303'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/span_From Branch_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Setting_DefaultParty/input_concat(id(, , select2-branch_party-re_69fbb8'), 
    'Head Office')

WebUI.sendKeys(findTestObject('Object Repository/Setting_DefaultParty/input_concat(id(, , select2-branch_party-re_69fbb8'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Setting_DefaultParty/span_CopyBranch'))

WebUI.setText(findTestObject('Setting_DefaultParty/input_concat(id(, , select2-branch_party-re_69fbb8'), 'Head Office')

WebUI.sendKeys(findTestObject('Setting_DefaultParty/input_concat(id(, , select2-branch_party-re_69fbb8'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Setting_DefaultParty/span_Party'))

WebUI.setText(findTestObject('Setting_DefaultParty/input_Party'), 'Advantis Freight')

WebUI.sendKeys(findTestObject('Setting_DefaultParty/input_concat(id(, , select2-branch_party-re_69fbb8'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_Save'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_Add Party'))

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_Yes, close it'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Setting_DefaultParty/button_Yes, close it'), 8)

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_ADVANTIS FREIGHT (PVT) LIMITED_btn b_86a10a'))

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_ADVANTIS FREIGHT (PVT) LIMITED_btn b_86a10a'))

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Setting_DefaultParty/button_OK'), 8)

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_OK'))

WebUI.click(findTestObject('Object Repository/General_Setting/a_General Setting'))

WebUI.click(findTestObject('Object Repository/General_Setting/span_Upload'))

WebUI.click(findTestObject('Object Repository/General_Setting/button_Cancel'))

WebUI.click(findTestObject('Object Repository/General_Setting/button_Upload'))

WebUI.uploadFile(findTestObject('General_Setting/input_Input Company Logo_logo'), 'C:\\Users\\RIMBAVIKASA\\Pictures\\Saved Pictures\\Rimba.png')

WebUI.click(findTestObject('Object Repository/General_Setting/button_save'))

WebUI.focus(findTestObject('General_Setting/label_Disable_Jobfile'))

WebUI.click(findTestObject('General_Setting/label_Disable_Jobfile'))

WebUI.click(findTestObject('General_Setting/label_Enable_Jobfile'))

WebUI.click(findTestObject('General_Setting/label_Disable_Detail_Jobfile'))

WebUI.click(findTestObject('General_Setting/label_Enable_Detail_Jobfile'))

WebUI.click(findTestObject('General_Setting/label_disable_Contact'))

WebUI.click(findTestObject('General_Setting/label_Enable_Contact'))

WebUI.closeBrowser()

