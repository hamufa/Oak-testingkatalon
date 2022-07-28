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

WebUI.navigateToUrl('https://dummy.oaktree.id')

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Login Panel/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Master/Master_Branch2/Page_Login Panel/input_Welcome to Oaktree_password'), 
    'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Master/Master_Branch2/Page_Login Panel/a_Login'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Dashboard - Kelas Karyawan/a_Branch'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/a_Create New'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Yes, close it'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input__branchCode'), '4')

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input__name'), 'Wira')

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/textarea_Address_street'), 'Jln A')

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input_Address_city'), 'Jakarta')

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input_Address_state'), 'Jakarta Pusat')

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input_Address_country'), 'Indonesia')

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input_Address_postCode'), '7')

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Save'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_OK'))

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input__name'), 'Rio')

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Save'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Jln A Jakarta Jakarta Pusat In.....__d33e11'))

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input__branchCode'), '6')

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/textarea_Address_street'), 'Jln B')

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input_Address_city'), 'Tangerang')

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input_Address_state'), 'Ciledug')

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input_Address_country'), 'India')

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input_Address_postCode'), '5')

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input__name'), 'miaw loh')

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Save'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/a_Sync'))

WebUI.clickImage(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Yes, close it'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/a_Sync'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Sync'))

WebUI.delay(15)

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/a_Sync'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/label_Skip data'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Yes, close it'))

WebUI.delay(7)

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/a_Sync'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Sync'))

WebUI.delay(7)

WebUI.setText(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/input'), 'Ria')

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Jln Abc serpong Tangerang Indo.....__de8472'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Jln Abc serpong Tangerang Indo.....__de8472'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_Branch2/Page_Master - Kelas Karyawan/button_OK'))

WebUI.closeBrowser()

