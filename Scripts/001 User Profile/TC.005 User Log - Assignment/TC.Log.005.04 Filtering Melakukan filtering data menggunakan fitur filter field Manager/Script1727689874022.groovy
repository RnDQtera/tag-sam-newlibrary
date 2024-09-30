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

WebUI.setText(findTestObject('00-01 ID'), 'user23@mailnesia.com')

WebUI.setText(findTestObject('00-02 PASS'), 'Moderator12@')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('OBJ User Profile/User Log Login/Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Menu Setting'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Sub Menu User'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/User ASDF Tag Samurai'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Button Detail'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ User Profile/User Log Borrowing/Tab User Log'))

WebUI.click(findTestObject('OBJ User Profile/User Log Assignment/Tab User Log Assignment'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ User Profile/User Log Assignment/Button Filter User Log Assignment'))

WebUI.click(findTestObject('OBJ User Profile/User Log Assignment/Button Select Manager User Log Assign'))

WebUI.click(findTestObject('OBJ User Profile/User Log Assignment/Select Manager User Log Assign'))

WebUI.click(findTestObject('OBJ User Profile/User Log Assignment/Button Select Manager User Log Assign'))

WebUI.click(findTestObject('OBJ User Profile/User Log Assignment/Button Apply User Log Assign'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/016. User Profile/TC.005.04 - Filtering Melakukan filtering data menggunakan fitur field Manager.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

