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

WebUI.navigateToUrl('https://console.tagsamurai.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/Set Email'), 'user23@mailnesia.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OBJ Menu Setting/Set Password'), '8+VvZnBZfpfG5HxfHfyGjg==')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/Button Login'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/Modul Fixed Asset'))

WebUI.delay(5)

WebUI.click(findTestObject('OBJ Menu Setting/Menu Settings'))

WebUI.click(findTestObject('OBJ Menu Setting/Sub Menu Group'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('OBJ Menu Setting/Input search group'), Keys.chord('Barcelona', Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/001 Setting Group/Action Group Search'))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/001 Setting Group/Action Delete Sub Group'))

WebUI.click(findTestObject('OBJ Menu Setting/001 Setting Group/Button Delete Sub Group'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.001.11 - Single action delete group yang memiliki asset.png', FailureHandling.STOP_ON_FAILURE)

