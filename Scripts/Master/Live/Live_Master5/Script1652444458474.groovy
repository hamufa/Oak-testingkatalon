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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_email_user'), '6a1c972882@catdogmail.live')

WebUI.setEncryptedText(findTestObject('Master/Master_Agent/Page_Login Panel/input_Welcome to Oaktree_password'), 'PLGTm/4mhzBK/fiUUkrWmQ==')

WebUI.click(findTestObject('Master/Master_Agent/Page_Login Panel/a_Login'))

WebUI.click(findTestObject('Master/Master_Agent/Page_Dashboard - Kelas Karyawan/a_Master'))

WebUI.focus(findTestObject('Master/Master_Authorized/a_Authorized'))

WebUI.click(findTestObject('Master/Master_Authorized/a_Authorized'))

WebUI.click(findTestObject('Master/Master_Authorized/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Name_name'), '2222')

WebUI.setText(findTestObject('Master/Master_Authorized/input_Position_position'), '2222')

WebUI.setText(findTestObject('Master/Master_Authorized/input_Company Name_company_name'), '2222')

WebUI.setText(findTestObject('Master/Master_Authorized/input_Address_company_address'), '2222')

WebUI.setText(findTestObject('Master/Master_Authorized/input_TelpFax_telp_fax'), '2222')

WebUI.click(findTestObject('Master/Master_Authorized/input_NPWP_npwp'))

WebUI.sendKeys(findTestObject('Master/Master_Authorized/input_NPWP_npwp'), Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, 
        Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_Authorized/input_NPWP_npwp'), Keys.chord(Keys.NUMPAD2, Keys.NUMPAD3, Keys.NUMPAD4, 
        Keys.NUMPAD5, Keys.NUMPAD6, Keys.NUMPAD7, Keys.NUMPAD8, Keys.NUMPAD9, Keys.NUMPAD8, Keys.NUMPAD7, Keys.NUMPAD6, 
        Keys.NUMPAD5, Keys.NUMPAD4, Keys.NUMPAD3, Keys.NUMPAD2, Keys.NUMPAD1, Keys.NUMPAD7, Keys.NUMPAD7, Keys.NUMPAD6))

WebUI.click(findTestObject('Master/Master_Authorized/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Authorized/a_Create New'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Yes, close it'))

WebUI.delay(4)

WebUI.click(findTestObject('Master/Master_Authorized/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Authorized/div_Edit AuthorizedNamePositionCompany Name_88cade'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Name_name'), '33333')

WebUI.click(findTestObject('Master/Master_Authorized/div_NamePositionCompany NameNPWPAddressTelpFax'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Position_position'), '3333')

WebUI.click(findTestObject('Master/Master_Authorized/div_Edit AuthorizedNamePositionCompany Name_88cade'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Company Name_company_name'), '3333')

WebUI.click(findTestObject('Master/Master_Authorized/div_Edit AuthorizedNamePositionCompany Name_88cade'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_Address_company_address'), '3333')

WebUI.setText(findTestObject('Master/Master_Authorized/input_TelpFax_telp_fax'), '3')

WebUI.click(findTestObject('Master/Master_Authorized/div_Edit AuthorizedNamePositionCompany Name_88cade'))

WebUI.setText(findTestObject('Master/Master_Authorized/input_TelpFax_telp_fax'), '3333')

WebUI.click(findTestObject('Master/Master_Authorized/input_NPWP_npwp'))

WebUI.sendKeys(findTestObject('Master/Master_Authorized/input_NPWP_npwp'), Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, 
        Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_Authorized/input_NPWP_npwp'), Keys.chord(Keys.NUMPAD6, Keys.NUMPAD4, Keys.NUMPAD2, 
        Keys.NUMPAD7, Keys.NUMPAD4, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD0, 
        Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD0, Keys.NUMPAD5, Keys.NUMPAD2, Keys.NUMPAD9))

WebUI.click(findTestObject('Master/Master_Authorized/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Authorized/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel_1_Edit'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Yes, close it_Edit'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Authorized/button_Yes, close it_Edit'), 5)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master/Master_Authorized/input'), '3333')

WebUI.click(findTestObject('Master/Master_Authorized/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Cancel_Delete'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Authorized/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Authorized/button_OK'), 5)

WebUI.click(findTestObject('Master/Master_Authorized/button_OK'))

WebUI.focus(findTestObject('Master/Master_Assignment/a_Assignment'))

WebUI.click(findTestObject('Master/Master_Assignment/a_Assignment'))

WebUI.click(findTestObject('Master/Master_Assignment/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Assignment/input_Name_name'), '22222')

WebUI.setText(findTestObject('Master/Master_Assignment/input_Position_position'), '22222')

WebUI.setText(findTestObject('Master/Master_Assignment/input_Company Name_company'), '22222')

WebUI.setText(findTestObject('Master/Master_Assignment/textarea_Address_address'), '2222')

WebUI.click(findTestObject('Master/Master_Assignment/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Assignment/a_Create New'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Yes, close it'))

WebUI.delay(4)

WebUI.click(findTestObject('Master/Master_Assignment/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Assignment/div_Edit AssignmentName  PositionCompany Na_1431a5'))

WebUI.setText(findTestObject('Master/Master_Assignment/input_Name_name'), '3333')

WebUI.click(findTestObject('Master/Master_Assignment/div_Name  PositionCompany NameAddress'))

WebUI.setText(findTestObject('Master/Master_Assignment/input_Position_position'), '3333')

WebUI.click(findTestObject('Master/Master_Assignment/div_Name  PositionCompany NameAddress'))

WebUI.setText(findTestObject('Master/Master_Assignment/input_Company Name_company'), '3333')

WebUI.setText(findTestObject('Master/Master_Assignment/textarea_Address_address'), '3333')

WebUI.click(findTestObject('Master/Master_Assignment/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Assignment/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Yes, close it'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Assignment/button_Yes, close it'), 5)

WebUI.setText(findTestObject('Master/Master_Assignment/input'), '3333')

WebUI.click(findTestObject('Master/Master_Assignment/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Assignment/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Assignment/button_OK'), 7)

WebUI.click(findTestObject('Master/Master_Assignment/button_OK'))

WebUI.focus(findTestObject('Master/Master_PPJK/a_PPJK'))

WebUI.click(findTestObject('Master/Master_PPJK/a_PPJK'))

WebUI.click(findTestObject('Master/Master_PPJK/a_Create New'))

WebUI.setText(findTestObject('Master/Master_PPJK/input__ppjk_name'), '2222')

WebUI.click(findTestObject('Master/Master_PPJK/input__npwp'))

WebUI.sendKeys(findTestObject('Master/Master_PPJK/input__npwp'), Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_PPJK/input__npwp'), Keys.chord(Keys.NUMPAD6, Keys.NUMPAD4, Keys.NUMPAD2, Keys.NUMPAD7, 
        Keys.NUMPAD4, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, Keys.NUMPAD2, Keys.NUMPAD7, Keys.NUMPAD0, Keys.NUMPAD2, 
        Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD0, Keys.NUMPAD5, Keys.NUMPAD2, Keys.NUMPAD9))

WebUI.setText(findTestObject('Master/Master_PPJK/input__leader_name'), '2222')

WebUI.setText(findTestObject('Master/Master_PPJK/textarea__address'), '2222')

WebUI.click(findTestObject('Master/Master_PPJK/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_PPJK/a_Create New'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Yes, close it_Live_PPJK'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_PPJK/button_Yes, close it_Live_PPJK'), 5)

WebUI.delay(2)

WebUI.click(findTestObject('Master/Master_PPJK/button_Action_btn btn-action mr-1'))

WebUI.setText(findTestObject('Master/Master_PPJK/input__ppjk_name'), '33333')

WebUI.click(findTestObject('Master/Master_PPJK/input__npwp'))

WebUI.sendKeys(findTestObject('Master/Master_PPJK/input__npwp'), Keys.chord(Keys.CONTROL, Keys.LEFT, Keys.LEFT, Keys.LEFT))

WebUI.sendKeys(findTestObject('Master/Master_PPJK/input__npwp'), Keys.chord(Keys.NUMPAD7, Keys.NUMPAD6, Keys.NUMPAD4, Keys.NUMPAD6, 
        Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD8, Keys.NUMPAD3, Keys.NUMPAD0, Keys.NUMPAD7, Keys.NUMPAD3, Keys.NUMPAD2, 
        Keys.NUMPAD7, Keys.NUMPAD9, Keys.NUMPAD6, Keys.NUMPAD6, Keys.NUMPAD2, Keys.NUMPAD2, Keys.NUMPAD2))

WebUI.setText(findTestObject('Master/Master_PPJK/input__leader_name'), '3333')

WebUI.click(findTestObject('Master/Master_PPJK/div_Edit PPJKName PPJK  NPWP  PPJK Lead  Ad_086bc1'))

WebUI.setText(findTestObject('Master/Master_PPJK/textarea__address'), '3333')

WebUI.click(findTestObject('Master/Master_PPJK/button_Save'))

WebUI.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master/Master_PPJK/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Vendor/Page_Master Vendor - Kelas Karyawan/button_Edit_Yes, close it'))

WebUI.setText(findTestObject('Master/Master_PPJK/input'), '3333')

WebUI.click(findTestObject('Master/Master_PPJK/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Action_btn btn-action'))

WebUI.click(findTestObject('Master/Master_PPJK/button_Yes, delete it'))

WebUI.click(findTestObject('Master/Master_PPJK/button_OK'))

WebUI.focus(findTestObject('Master/Master_Tax/a_Master Tax'))

WebUI.click(findTestObject('Master/Master_Tax/a_Master Tax'))

WebUI.click(findTestObject('Master/Master_Tax/a_Create New'))

WebUI.setText(findTestObject('Master/Master_Tax/input__percentage'), '30')

WebUI.setText(findTestObject('Master/Master_Tax/textarea_Description_description'), '33333')

WebUI.click(findTestObject('Master/Master_Tax/button_Save'))

WebUI.delay(4)

WebUI.click(findTestObject('Master/Master_Tax/a_Create New'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Tax/button_Yes, close it'))

WebUI.waitForElementNotVisible(findTestObject('Master/Master_Tax/button_Yes, close it'), 9)

WebUI.click(findTestObject('Master/Master_Tax/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Tax/div_Edit PercentagePercentage  DescriptionI_dbf609'))

WebUI.setText(findTestObject('Master/Master_Tax/input__percentage'), '80')

WebUI.click(findTestObject('Master/Master_Tax/div_Edit PercentagePercentage  DescriptionI_dbf609'))

WebUI.setText(findTestObject('Master/Master_Tax/textarea_Description_description'), 'ayam ayam')

WebUI.click(findTestObject('Master/Master_Tax/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Master/Master_Tax/button_Action_btn btn-action mr-1'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel'))

WebUI.click(findTestObject('Master/Master_Tax/button_Yes, close it'))

WebUI.delay(4)

WebUI.setText(findTestObject('Master/Master_Tax/input'), 'ayam')

WebUI.click(findTestObject('Master/Master_Tax/button_ayam ayam_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Tax/button_Cancel_1'))

WebUI.click(findTestObject('Master/Master_Tax/button_ayam ayam_btn btn-action'))

WebUI.click(findTestObject('Master/Master_Tax/button_Yes, delete it'))

WebUI.waitForElementVisible(findTestObject('Master/Master_Tax/button_OK'), 4)

WebUI.click(findTestObject('Master/Master_Tax/button_OK'))

WebUI.delay(4)

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

