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

WebUI.setText(findTestObject('0001 ID'), GlobalVariable.id)

WebUI.setText(findTestObject('0002 PASS'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0003 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0004 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.016 Reusable - Menu Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.018 Reusable - Menu Setting - Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.057 Sub Tab Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.058 Add New Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.059 Enter New Brand Name'), 'Olympic')

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.060 Select Category in Create Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.061 Select All Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.062 Save Select Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.063 Enter First Model Value'), Keys.chord('Model 1', 
        Keys.ENTER))

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.064 Enter Second Model Value'), Keys.chord('Model 2', 
        Keys.ENTER))

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.065 Enter Third Model Value'), Keys.chord('Model 3', 
        Keys.ENTER))

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.070 Submit Create Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.071 Seacrh data table brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.072 Text Field Data Table'), Keys.chord('Olympic', Keys.ENTER))

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.073 Single Action Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.076 Choose Edit Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.059 Enter New Brand Name'), Keys.chord(Keys.CONTROL, 
        'a', Keys.DELETE))

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.059 Enter New Brand Name'), 'Edited Brand')

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.070 Submit Create Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.020 Data ChangeLog'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.004.012 - Edit New Brand.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.048 Closed Change Log Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.071 Seacrh data table brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.072 Text Field Data Table'), Keys.chord('Edited Brand', 
        Keys.ENTER))

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.073 Single Action Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.074 Choose Delete Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.075 Confirm Delete Brand'), FailureHandling.STOP_ON_FAILURE)

