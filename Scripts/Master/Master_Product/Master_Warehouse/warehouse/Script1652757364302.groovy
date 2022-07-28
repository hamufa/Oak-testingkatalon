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

WebUI.navigateToUrl('https://app.oaktree.id/admin')

WebUI.setText(findTestObject('Object Repository/Master/Master_Warehouse/Page_Login Panel/input_Welcome to Oaktree_email_user'), 
    '6a1c972882@catdogmail.live')

WebUI.setEncryptedText(findTestObject('Object Repository/Master/Master_Warehouse/Page_Login Panel/input_Welcome to Oaktree_password'), 
    'PLGTm/4mhzBK/fiUUkrWmQ==')

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Login Panel/a_Login'))

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Dashboard - Rimba Ananta Vikasa Indonesia/a_Master'))

WebUI.focus(findTestObject('Object Repository/Master/Master_Warehouse/Page_Dashboard - Rimba Ananta Vikasa Indonesia/a_Master Warehouse'))

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Dashboard - Rimba Ananta Vikasa Indonesia/a_Master Warehouse'))

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/a_Create New'))

WebUI.setText(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/input__name'), 
    '777')

WebUI.setText(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/textarea_Address_address'), 
    '777')

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_Save'), 
    3)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/a_Create New'))

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_Yes, close it'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/div_Edit WarehouseName  AddressInsert Wareh_a1d159'))

WebUI.setText(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/input__name'), 
    '888')

WebUI.setText(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/textarea_Address_address'), 
    '888')

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_Save'), 
    4)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/input'), 
    '888')

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_Action_btn btn-action'))

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_Cancel_1'))

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_Action_btn btn-action'))

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_OK'), 
    3)

WebUI.click(findTestObject('Object Repository/Master/Master_Warehouse/Page_Master Warehouse - Rimba Ananta Vikasa_cf439f/button_OK'))

WebUI.closeBrowser()

