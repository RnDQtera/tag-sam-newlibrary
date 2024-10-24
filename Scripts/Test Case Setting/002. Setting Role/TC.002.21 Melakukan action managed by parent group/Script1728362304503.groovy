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

WebUI.delay(3)

WebUI.navigateToUrl('https://console.tagsamurai.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/Set Email'), 'user23@mailnesia.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OBJ Menu Setting/Set Password'), '8+VvZnBZfpfG5HxfHfyGjg==')

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/Button Login'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/Modul Fixed Asset'))

WebUI.delay(5)

WebUI.click(findTestObject('OBJ Menu Setting/Menu Settings'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/Sub Menu Role'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/002 Setting Role/Tab Maintenance'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/002 Setting Role/Pointer Side Bar Group'))

WebUI.click(findTestObject('OBJ Menu Setting/002 Setting Role/Sub Group 1'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/002 Setting Role/Slider Parent Group'))

WebUI.click(findTestObject('OBJ Menu Setting/002 Setting Role/Slider Parent Group'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/002 Setting Role/Button Changelog Role'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.002.21 - Melakukan action managed by parent group.png', FailureHandling.STOP_ON_FAILURE)

