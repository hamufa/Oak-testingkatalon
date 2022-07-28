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

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Welcome to Oaktree_email_user'), 'Cricket@rimbahouse.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Marketing_Quotation/input_Welcome to Oaktree_password'), 'rEXBpEkj5ITeVrsAMSY1Rw==')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/a_Login'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/a_Marketing'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/a_Quotation'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/a_Create New'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/svg_Input Date_mx-calendar-icon'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/td_1'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/div_Loading'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Customer_vs__search'), 'PT. 46657')

WebUI.sendKeys(findTestObject('Object Repository/Marketing_Quotation/input_Customer_vs__search'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Subject_form-control form-control-sm'), '22222')

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Attn_form-control form-control-sm'), '22222')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/div_Port Of Delivery_vs__selected-options'))

WebUI.setText(findTestObject('Marketing_Quotation/input_POD'), 'PAPUA')

WebUI.sendKeys(findTestObject('Marketing_Quotation/input_POD'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/div_Port of Loading_vs__selected-options'))

WebUI.setText(findTestObject('Marketing_Quotation/input_POL'), 'JAKARTA')

WebUI.sendKeys(findTestObject('Marketing_Quotation/input_POL'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/div_Loading_1'))

WebUI.setText(findTestObject('Marketing_Quotation/input_Term'), 'NET 30')

WebUI.sendKeys(findTestObject('Marketing_Quotation/input_Term'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/input_Loading..._includeTax'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input__form-control form-control-sm'), '22222')

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND'), '470', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Marketing_Quotation/select_IDR  JPY  GBP  MYR'), '0', true)

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Price_form-control form-control-sm'), '200000')

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Remark_form-control form-control-sm'), '22222a')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/a_Remark_btn btn-create btn-sm'))

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND2'), '543', true)

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_IDR JPY GBP MYR_2'), '3', true)

WebUI.setText(findTestObject('Marketing_Quotation/input_Price_form-control form-control-sm_2'), '10000')

WebUI.setText(findTestObject('Marketing_Quotation/input_Remark_form-control form-control-sm_2'), '33333b')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remark_fas fa-plus'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remark_fas fa-trash'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/a_New Type'))

WebUI.setText(findTestObject('Marketing_Quotation/input__form-control form-control-sm2'), '33333')

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND3'), '561', true)

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_IDR JPY GBP MYR3'), '6', true)

WebUI.setText(findTestObject('Marketing_Quotation/input_Price_form-control form-control-sm3'), '2323')

WebUI.setText(findTestObject('Marketing_Quotation/input_Remark_form-control form-control-sm_3'), '2323')

WebUI.click(findTestObject('Marketing_Quotation/a_Remark_btn btn-create btn-sm2'))

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND4'), '544', true)

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_IDR JPY GBP MYR4'), '9', true)

WebUI.setText(findTestObject('Marketing_Quotation/input_Price_form-control form-control-sm_4'), '44444')

WebUI.setText(findTestObject('Marketing_Quotation/input_Remark_form-control form-control-sm_4'), '44444')

WebUI.click(findTestObject('Marketing_Quotation/a_New Type2'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Delete_fas fa-trash'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Remarks_form-control form-control-sm'), '666666')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remarks_fas fa-plus'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remarks_fas fa-trash'))

WebUI.click(findTestObject('Marketing_Quotation/button_Save'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/a_Create New'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/button_Cancel'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Search _form-control form-control-sm mb-2'), '22222')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_PAPUA_fas fa-download'))

WebUI.delay(4)

WebUI.closeWindowUrl('https://crm-dev.rimbahouse.com/quotation/#')

WebUI.switchToWindowUrl('https://crm-dev.rimbahouse.com/quotation/')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Search _form-control form-control-sm mb-2'), '22222')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_PAPUA_mdi mdi-square-edit-outline'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/form_General InformationDate Quotation     _0a4981'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/input_Date Quotation_date'))

WebUI.click(findTestObject('Marketing_Quotation/td_15 edit'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Customer_vs__search'), 'Yugana')

WebUI.sendKeys(findTestObject('Object Repository/Marketing_Quotation/input_Customer_vs__search'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Subject_form-control form-control-sm'), '33333')

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Attn_form-control form-control-sm'), '33333')

WebUI.setText(findTestObject('Marketing_Quotation/input_POD'), 'Jakarta')

WebUI.sendKeys(findTestObject('Marketing_Quotation/input_POD'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Marketing_Quotation/input_POL'), '77')

WebUI.sendKeys(findTestObject('Marketing_Quotation/input_POL'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Marketing_Quotation/input_Term'), 'Net 14')

WebUI.sendKeys(findTestObject('Marketing_Quotation/input_Term'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/input_Loading..._includeTax'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input__form-control form-control-sm'), '44444')

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND'), '544', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Marketing_Quotation/select_IDR  JPY  GBP  MYR'), '3', true)

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Price_form-control form-control-sm'), '333333')

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Remark_form-control form-control-sm'), '33333b')

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND2'), '475', true)

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_IDR JPY GBP MYR_2'), '9', true)

WebUI.setText(findTestObject('Marketing_Quotation/input_Price_form-control form-control-sm_2'), '3333333')

WebUI.setText(findTestObject('Marketing_Quotation/input_Remark_form-control form-control-sm_2'), '44444aa')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remark_fas fa-plus'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remark_fas fa-trash'))

WebUI.setText(findTestObject('Marketing_Quotation/input__form-control form-control-sm2'), '33333')

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND3'), '471', true)

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_IDR JPY GBP MYR3'), '0', true)

WebUI.setText(findTestObject('Marketing_Quotation/input_Price_form-control form-control-sm3'), '33333')

WebUI.setText(findTestObject('Marketing_Quotation/input_Remark_form-control form-control-sm_3'), '8888')

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_CASH ON HAND4'), '475', true)

WebUI.selectOptionByValue(findTestObject('Marketing_Quotation/select_IDR JPY GBP MYR4'), '0', true)

WebUI.setText(findTestObject('Marketing_Quotation/input_Price_form-control form-control-sm_4'), '5555')

WebUI.setText(findTestObject('Marketing_Quotation/input_Remark_form-control form-control-sm_4'), '5555')

WebUI.click(findTestObject('Marketing_Quotation/a_New Type2'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Delete_fas fa-trash'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Remarks_form-control form-control-sm'), '5555')

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remarks_fas fa-plus'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_Remarks_fas fa-trash'))

WebUI.click(findTestObject('Marketing_Quotation/button_Save'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_PAPUA_mdi mdi-square-edit-outline'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/button_Cancel'))

WebUI.setText(findTestObject('Object Repository/Marketing_Quotation/input_Search _form-control form-control-sm mb-2'), '3333')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_PAPUA_fas fa-download'))

WebUI.closeWindowUrl('https://crm-dev.rimbahouse.com/quotation/#')

WebUI.switchToWindowUrl('https://crm-dev.rimbahouse.com/quotation/')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_PAPUA_mdi mdi-delete'))

WebUI.click(findTestObject('Marketing_Quotation/button_Cancel_Delete'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/i_PAPUA_mdi mdi-delete'))

WebUI.click(findTestObject('Object Repository/Marketing_Quotation/button_Yes, delete it'))

WebUI.closeBrowser()

