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

WebUI.setText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Agent/Page_Login Panel/a_Login'))

WebUI.delay(12)

WebUI.focus(findTestObject('Master/Master_Agent/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.focus(findTestObject('Master/Master_Agent/Page_Dashboard - Kelas Karyawan/a_Agent'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Dashboard - Kelas Karyawan/a_Agent'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/Yes close'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_name'), '22222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_phone'), '222222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input_Fax_agent_fax'), '222222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_email'), '222222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_pic'), '2222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/textarea__agent_address'), '22222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/textarea_Remarks_remarks'), '2222')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_email'), '222222@gmail.com')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/span_Indonesia_select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input country'), 'Ireland')

WebUI.sendKeys(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input country'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Save'))

WebUI.delay(5)

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input_Yes, close it_select2-search__field'), 
    '222')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button edit baru'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/div_Edit AgentName  Country  AfghanistanAlb_fa7174'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_name'), '3333')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/div__col-md-12'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_phone'), '333')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/div_Name  Country  AfghanistanAlbaniaAlgeri_b1a7e2'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input_Fax_agent_fax'), '3333')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/div_Edit AgentName  Country  AfghanistanAlb_fa7174'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_email'), '3333@gmail.com')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/div_Name  Country  AfghanistanAlbaniaAlgeri_b1a7e2'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input__agent_pic'), '3333333')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/div_Address'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/textarea__agent_address'), '33333')

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/textarea_Remarks_remarks'), '44444')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/span_Ireland_select2-selection__arrow'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/Input_Text_Country'), 'Jamaica')

WebUI.sendKeys(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/Input_Text_Country'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Save'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input_Yes, close it_select2-search__field'), 
    '3333')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Yes, close it'))

WebUI.setText(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/input_Yes, close it_select2-search__field'), 
    '3333')

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Master Agent - Kelas Karyawan/button_OK'))

WebUI.closeBrowser()

