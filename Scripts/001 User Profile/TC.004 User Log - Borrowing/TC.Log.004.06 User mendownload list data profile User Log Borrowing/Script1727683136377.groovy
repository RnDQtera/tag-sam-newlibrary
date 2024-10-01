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

WebUI.navigateToUrl('https://dev-fixedasset-v2.tagsamurai.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OBJ User Profile/002 Transaction Role/Login OTP'))

WebUI.setText(findTestObject('Object Repository/OBJ User Profile/002 Transaction Role/Set Username'), 'user23@mailnesia.com')

WebUI.click(findTestObject('Object Repository/OBJ User Profile/002 Transaction Role/Request OTP'))

WebUI.setText(findTestObject('Object Repository/OBJ User Profile/002 Transaction Role/Input OTP'), '')

WebUI.click(findTestObject('Object Repository/OBJ User Profile/002 Transaction Role/Button Verify Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/002 Transaction Role/Modul Fixed Asset'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/002 Transaction Role/Menu Setting'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/002 Transaction Role/Sub Menu User'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/002 Transaction Role/User ASDF Tag Samurai'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/002 Transaction Role/Button Detail'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ User Profile/004 User Log Borrowing/Tab User Log'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ User Profile/004 User Log Borrowing/Button Download Borrowing'))

WebUI.delay(5)

WebUI.takeScreenshot('Screenshot/016. User Profile/TC.004.06 - User mendownload list data profile user log borrowing.png', 
    FailureHandling.STOP_ON_FAILURE)

