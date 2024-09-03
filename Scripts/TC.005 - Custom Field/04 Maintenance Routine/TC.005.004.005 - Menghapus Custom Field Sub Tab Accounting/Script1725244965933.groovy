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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)
//
//WebUI.navigateToUrl(GlobalVariable.URL)
//
//WebUI.delay(5)
//
//WebUI.setText(findTestObject('0001 ID'), GlobalVariable.id)
//
//WebUI.setText(findTestObject('0002 PASS'), GlobalVariable.pass)
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('0003 Button Login'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('0004 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('001 Reusable Component/001.016 Reusable - Menu Settings'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('001 Reusable Component/001.020 Reusable - Menu Setting - Custom FIeld'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.032 Sub Tab Accounting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.001 Add Custom Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.002 Create Field Name'), 'Custom Field Text Area')

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.003 Choose Data Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.004 Select Data Type Text Area'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.016 Select Required Yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.018 Select Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.019 Serach Text Field Category'), 'Kendaraan')

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.020 Choose Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.021 Select Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.023 Submit Create Custom Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.024 Search General Information'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.025 Text Field Search General Information'), 'Custom Field Purchase')

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.026 Single Action General Information'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.028 Action Delete General Information'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.029 Confirm Delete Custom Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/005.Custom Field/TC.005.020 - Delete Custom Field Sub Tab Accounting.png', FailureHandling.STOP_ON_FAILURE)

