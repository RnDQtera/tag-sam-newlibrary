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

WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(5)

WebUI.setText(findTestObject('00-01 ID'), GlobalVariable.id)

WebUI.setText(findTestObject('00-02 PASS'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-04 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.016 Reusable - Menu Settings'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.018 Reusable - Menu Setting - Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.001 Button Add Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.002 Create Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.002 Create Asset Name'), 'Office Desks Models')

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.003 Choose Measurement'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.004 Search Data Measurement'), 'Unit')

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.005 Choose Data UoM'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.006 Choose Data AddOn'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.007 Select Addon Audit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.008 Select Addon Maintennace Routine'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.009 Select Addon Repair Ticekting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.010 Select Addon Tracking'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.006 Choose Data AddOn'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.011 Select Category for Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.012 Search Category'), 'Furnitur dan Aksesori')

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.013 Select Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.014 Submit Choose Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.015 Submit Create Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.095 Search Data Table Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.096 Text Field Data Asset Name'), 'Office Desks Models')

WebUI.sendKeys(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.096 Text Field Data Asset Name'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.091 Check Bulk Action Data Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.092 Action Bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.097 Delete Bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.098 Confirm Delete Bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.004.020-Bulk Asset name Delete.png', FailureHandling.STOP_ON_FAILURE)

