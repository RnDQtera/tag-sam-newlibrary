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
WebUI.click(findTestObject('001 Reusable Component/001.021 Reusable - Menu Setting - Asset Transactional Policy'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.024 Check Data Asset Transactionable'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.025 Select Menu bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.026 Mark As Self Service Bulk Action'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.007 Confirm Mark As Self Service'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/006.Asset Transactional Policy/TC.006.006 - Bulk Action Mark as self service Asset.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.006 Change Log Sub Tab Transactionable'), 
    FailureHandling.STOP_ON_FAILURE)

