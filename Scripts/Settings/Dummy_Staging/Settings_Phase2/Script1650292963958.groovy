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

WebUI.focus(findTestObject('Setting_Group_Access/a_Setting'))

WebUI.click(findTestObject('Settings_Accurate_Access/a_Setting'))

WebUI.click(findTestObject('Object Repository/Setting_User/a_User'))

WebUI.click(findTestObject('Object Repository/Setting_User/a_Create User'))

WebUI.uploadFile(findTestObject('Setting_User/input_Profile Picture_fname'), 'C:\\Users\\Owner\\Desktop\\vgl.jpg')

WebUI.setText(findTestObject('Object Repository/Setting_User/input__name_user'), '333')

WebUI.setText(findTestObject('Object Repository/Setting_User/input__email_user'), 'wooohassso@gmail.com')

WebUI.setText(findTestObject('Object Repository/Setting_User/input__mobile_user'), '333')

WebUI.setText(findTestObject('Object Repository/Setting_User/input__employee_id'), '333')

WebUI.click(findTestObject('Object Repository/Setting_User/ul__select2-selection__rendered'))

WebUI.setText(findTestObject('Setting_User/input__select2-search__field'), 'Administrator JKT')

WebUI.sendKeys(findTestObject('Setting_User/input__select2-search__field'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Setting_User/Input_User_Accurate_Access'), 'Admin3')

WebUI.sendKeys(findTestObject('Setting_User/Input_User_Accurate_Access'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Setting_User/input_Branch'), 'HEAD OFFICE')

WebUI.sendKeys(findTestObject('Setting_User/input_Branch'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Setting_User/button_Save'), 8)

WebUI.click(findTestObject('Object Repository/Setting_User/button_Active_btn btn-action mr-1'))

WebUI.uploadFile(findTestObject('Setting_User/input_Profile Picture_fname'), 'C:\\Users\\Owner\\Desktop\\vgl.jpg')

WebUI.click(findTestObject('Object Repository/Setting_User/div_Profile PictureName  Email  Mobile Phon_7b2fcb'))

WebUI.setText(findTestObject('Object Repository/Setting_User/input__name_user'), '22222')

WebUI.click(findTestObject('Object Repository/Setting_User/div_Profile PictureName  Email  Mobile Phon_7b2fcb'))

WebUI.setText(findTestObject('Object Repository/Setting_User/input__mobile_user'), '22222')

WebUI.click(findTestObject('Object Repository/Setting_User/div_.select2-container .select2-selection--_059811'))

WebUI.setText(findTestObject('Object Repository/Setting_User/input__employee_id'), '22222')

WebUI.click(findTestObject('Object Repository/Setting_User/ul_Administrator JKT'))

WebUI.setText(findTestObject('Object Repository/Setting_User/input__select2-search__field'), 'Administrator')

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

WebUI.click(findTestObject('Setting_User/button_Cancel_Edit'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Setting_User/button_Cancel'))

WebUI.click(findTestObject('Setting_User/button_Yes, close it_Edit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Setting_User/input_Search'), '22222')

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

WebUI.click(findTestObject('Object Repository/Setting_Notification/a_Notification'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/a_Create New'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Cancel'))

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

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_dika,_btn btn-action mr-1'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Yes, close it'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/img_-_edit'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_-_btn btn-action'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_Yes, delete it'))

WebUI.click(findTestObject('Object Repository/Setting_Notification/button_OK'))

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/a_Default Party'))

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_Add Party'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Setting_DefaultParty/select_Selling                             _355303'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/span_From Branch_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Setting_DefaultParty/input_concat(id(, , select2-branch_party-re_69fbb8'), 
    'MALANG')

WebUI.sendKeys(findTestObject('Object Repository/Setting_DefaultParty/input_concat(id(, , select2-branch_party-re_69fbb8'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Setting_DefaultParty/span_CopyBranch'))

WebUI.setText(findTestObject('Setting_DefaultParty/input_concat(id(, , select2-branch_party-re_69fbb8'), 'SURABAYA')

WebUI.sendKeys(findTestObject('Setting_DefaultParty/input_concat(id(, , select2-branch_party-re_69fbb8'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Setting_DefaultParty/span_Party'))

WebUI.setText(findTestObject('Object Repository/Setting_DefaultParty/input_concat(id(, , select2-branch_party-re_69fbb8'), 
    'ADVANTIS FREIGHT (PVT) LIMITED')

WebUI.sendKeys(findTestObject('Object Repository/Setting_DefaultParty/input_concat(id(, , select2-branch_party-re_69fbb8'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Setting_DefaultParty/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Setting_DefaultParty/button_Save'), 8)

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

WebUI.uploadFile(findTestObject('General_Setting/input_Input Company Logo_logo'), 'C:\\Users\\Owner\\Desktop\\vgl.jpg')

WebUI.click(findTestObject('Object Repository/General_Setting/button_save'))

WebUI.focus(findTestObject('General_Setting/label_Disable_Jobfile'))

WebUI.click(findTestObject('General_Setting/label_Disable_Jobfile'))

WebUI.click(findTestObject('General_Setting/label_Enable_Jobfile'))

WebUI.click(findTestObject('General_Setting/label_Disable_Detail_Jobfile'))

WebUI.click(findTestObject('General_Setting/label_Enable_Detail_Jobfile'))

WebUI.closeBrowser()

