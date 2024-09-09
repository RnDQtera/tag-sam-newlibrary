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
//WebUI.setText(findTestObject('00-01 ID'), GlobalVariable.id)
//
//WebUI.setText(findTestObject('00-02 PASS'), GlobalVariable.pass)
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-04 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('001 Reusable Component/001.016 Reusable - Menu Settings'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('001 Reusable Component/001.022 Reusable - Menu Setting - Menu Accounting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.001 Add Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.002 Enter Tengible Asset Group'), 'Group Asset 1')

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.003 Enter Number of Userful life'), '5')

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.005 Submit Create Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.001 Add Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.002 Enter Tengible Asset Group'), 'Group Asset 2')

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.003 Enter Number of Userful life'), '5')

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.005 Submit Create Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.006 Button Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.007 Text Field Search Data Table'), 'Group Asset')

WebUI.sendKeys(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.007 Text Field Search Data Table'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.034 Check for Bulk Depreciation Settings'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.035 Select Option Bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.036 Choose Delete Depreciation Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.038 Cancel Delete Bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.035 Select Option Bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.036 Choose Delete Depreciation Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.037 Confirm Delete Bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/007.Accounting Setting/TC.007.008 - Bulk Delete Depreciation Setting.png', FailureHandling.STOP_ON_FAILURE)

