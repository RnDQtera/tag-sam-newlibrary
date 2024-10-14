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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://console.tagsamurai.com/')

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/input_ts-inputtext max-h-42px flex py-1 px-_f5a894'), 
    'user22@mailnesia.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/input_flex py-1 px-3 items-center space-x-1_d9fbdb'), 
    '8+VvZnBZfpfG5HxfHfyGjg==')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/button_Log in'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/div_module-shadow w-110px h-110px flex item_7c244a'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/div_Settings'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/div_Asset'))

WebUI.delay(6)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button plus asset'))

WebUI.delay(5)

WebUI.setText(findTestObject('OBJ Menu Setting/004 Setting Asset/Field asset name - create asset name'), 'Komputer')

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Dropdown measurement - create asset name'))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/List (1) Create asset name'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Dropdown tag type'))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/List (4) Create asset name'))

WebUI.setText(findTestObject('OBJ Menu Setting/004 Setting Asset/Field alias code'), 'KMPTR')

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button select category'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/List (3) Select category'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button select - select category'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button submit'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button search'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/004 Setting Asset/Field search'), Keys.chord('komputer', Keys.ENTER))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Checkbox asset - search'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button bulk action'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Bulk action - list (3) delete'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button delete - delete asset'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button change log - search'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.22 - Bulk action asset name delete.png', FailureHandling.STOP_ON_FAILURE)

