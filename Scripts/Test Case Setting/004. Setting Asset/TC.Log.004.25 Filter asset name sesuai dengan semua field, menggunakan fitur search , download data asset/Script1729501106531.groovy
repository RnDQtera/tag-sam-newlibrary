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

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/input_flex py-1 px-3 items-center space-x-1_d9fbdb'), 
    'Moderator19@')

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/button_Log in'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/div_module-shadow w-110px h-110px flex item_7c244a'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/div_Settings'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/004 Setting Asset/div_Asset'))

WebUI.delay(6)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button filter - asset name'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Dropdown field asset name'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/List (1) dropdown field'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button apply - asset name'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.25 - Filter sesuai dengan asset name.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Dropdown field measurement'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button remove field asset name'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/List (1) dropdown field'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button apply - asset name'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.26 - Filter sesuai dengan asset measurement.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button remove field measurement'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Dropdown field aliascode'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/List (1) dropdown field'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button apply - asset name'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.27 - Filter sesuai dengan aliascode.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button remove field alias code'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Dropdown field brand'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/List (1) dropdown field'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Dropdown field brand'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button apply - asset name'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.28 - Filter sesuai dengan brand.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button remove field brand'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Dropdown field model type'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/List (1) dropdown field'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button apply - asset name'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.29 - Filter sesuai dengan model type.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button remove field model type'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Dropdown field depreciation group'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/List (1) dropdown field'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button apply - asset name'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.30 - Filter sesuai dengan depreciation group.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button remove field depreciation group'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Dropdown field account name'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/List (1) dropdown field'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button apply - asset name'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.31 - Filter sesuai dengan account name.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button remove field account name'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Dropdown field account code'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/List (1) dropdown field'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Dropdown field account code'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button apply - asset name'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.32 - Filter sesuai dengan account code.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button remove field account code'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Dropdown field last modified'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/4 oktober 2024'))

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button apply - asset name'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.33 - Filter sesuai dengan last modified.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button search'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/004 Setting Asset/Field search'), Keys.chord('laptop', Keys.ENTER))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.34 - Filter sesuai dengan fitur search.png', FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/004 Setting Asset/Button download asset'))

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.004.35 - User mendownload list asset.png', FailureHandling.STOP_ON_FAILURE)

