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

WebUI.navigateToUrl('https://console.tagsamurai.com/auth/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('OBJ Menu Setting/Set Email'), 'employee24@mailnesia.com')

WebUI.setEncryptedText(findTestObject('OBJ Menu Setting/Set Password'), '8+VvZnBZfpfG5HxfHfyGjg==')

WebUI.delay(15)

WebUI.click(findTestObject('OBJ Menu Setting/Button Login'))

WebUI.click(findTestObject('OBJ Menu Setting/Modul Fixed Asset'))

WebUI.delay(15)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Menu Settings'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Sub Menu Accounting'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Depreciation Group'))

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/007 Setting Accounting/Input Text Tangible Asset Group'), 
    'Inventaris Kantor Asset')

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/007 Setting Accounting/Input Number of Useful Life'))

WebUI.setText(findTestObject('OBJ Menu Setting/007 Setting Accounting/Input Number of Useful Life'), '5')

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/007 Setting Accounting/Button Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Changelog Depreciation Settings'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.007.01 - Membuat tangible asset group baru.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Close Change Log - Depreciation setting'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Single Action Deprecitaion Settings'))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Delete Depreciation Settings'))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Dialog Delete Depriciation Group'))

