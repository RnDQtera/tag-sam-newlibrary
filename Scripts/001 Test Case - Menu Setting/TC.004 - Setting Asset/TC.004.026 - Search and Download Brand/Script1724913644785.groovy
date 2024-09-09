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

WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.016 Reusable - Menu Settings'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.018 Reusable - Menu Setting - Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.057 Sub Tab Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.124 Search Data Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.125 Text Field Data Brand'), Keys.chord('Fabelio', Keys.ENTER))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.004.037 - Search Name Brand.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.126 Download Data Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.004.038 - Download Brand.png', FailureHandling.STOP_ON_FAILURE)

