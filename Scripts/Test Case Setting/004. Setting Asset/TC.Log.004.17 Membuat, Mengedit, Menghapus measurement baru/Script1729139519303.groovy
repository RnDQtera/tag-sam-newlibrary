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

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/button_Log in'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/div_module-shadow w-110px h-110px flex item_7c244a'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/div_Settings'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/div_Asset'))

WebUI.delay(6)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Menu meausurement'))

WebUI.delay(4)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button plus brand'))

WebUI.setText(findTestObject('OBJ Menu Setting/004 Setting Asset/Field create measurement'), 'kg')

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button save - edit brand'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button change log meauserement'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.17 - Membuat measurement baru.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button close change log - search'))

WebUI.delay(4)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button action measurement list (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Edit brand'))

WebUI.clearText(findTestObject('OBJ Menu Setting/004 Setting Asset/Field measurement'))

WebUI.setText(findTestObject('OBJ Menu Setting/004 Setting Asset/Field measurement'), 'mg')

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button save - edit brand'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button change log meauserement'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.18 - Melakukan edit pada measurement baru.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button close change log - search'))

WebUI.delay(4)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button action measurement list (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Delete meauserement'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button delete - delete asset'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button change log meauserement'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.19 - Menghapus measurement.png', FailureHandling.STOP_ON_FAILURE)

