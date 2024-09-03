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
WebUI.click(findTestObject('001 Reusable Component/001.021 Reusable - Menu Setting - Asset Transactional Policy'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.009 Filter Asset Transactional Policy - Transactionable'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.019 Data Filter Asset Transactional Policy - Self Service'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.011 Filter Asset Transactional Policy - Text Field Name'), 
    'no')

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.012 Check Data Result Filter Section Name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.021 Apply Data Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.001 Single Action Tab Transactional'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.002 Mark As Self Service'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.008 Cancel Mark As Self Service'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.001 Single Action Tab Transactional'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.002 Mark As Self Service'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.007 Confirm Mark As Self Service'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/006.Asset Transactional Policy/TC.006.002 - Remove from Self Service.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.006 - Setting Asset Transactional Policy/OBJ.006.006 Change Log Sub Tab Transactionable'), 
    FailureHandling.STOP_ON_FAILURE)

