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

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Login OTP'))

WebUI.setText(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Set Username'), 'user10@mailnesia.com')

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Request OTP'))

WebUI.setText(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Input OTP'), '')

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Button Verify Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Modul Fixed Asset'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Menu Setting'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Sub Menu User'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/User ASDF Tag Samurai'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Button Detail'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Tab Transaction Role'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Filter/Button Filter Tab Transaction Role'))

WebUI.click(findTestObject('OBJ User Profile/Transaction Role/Filter/Button select group tab transaction role'))

WebUI.click(findTestObject('OBJ User Profile/Transaction Role/Filter/Checkbox select group transaction role'))

WebUI.click(findTestObject('OBJ User Profile/Transaction Role/Filter/Select group transaction role'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/Transaction Role/Filter/Button Apply Tab Transaction Role'))

WebUI.delay(5)

WebUI.takeScreenshot('Screenshot/016. User Profile/TC.002.04 - Filtering Melakukan filtering data menggunakan fitur filter Group.png', 
    FailureHandling.STOP_ON_FAILURE)

