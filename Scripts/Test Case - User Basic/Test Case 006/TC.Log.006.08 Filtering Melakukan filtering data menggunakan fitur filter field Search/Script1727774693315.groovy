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

WebUI.setText(findTestObject('Object Repository/User Basic - My Asset Task Assignment/OBJ 006 History My Asset/Page_TAG SAMURAI/Input Email'), 
    'johnabruzzi@mailnesia.com')

WebUI.setEncryptedText(findTestObject('Object Repository/User Basic - My Asset Task Assignment/OBJ 006 History My Asset/Page_TAG SAMURAI/Input Password'), 
    '8+VvZnBZfpfG5HxfHfyGjg==')

WebUI.click(findTestObject('Object Repository/User Basic - My Asset Task Assignment/OBJ 006 History My Asset/Page_TAG SAMURAI/Button Login_'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/User Basic - My Asset Task Assignment/OBJ 006 History My Asset/Page_TAG SAMURAI/div_Modules_module-shadow w-110px h-110px f_1c4ea5'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/User Basic - My Asset Task Assignment/OBJ 006 History My Asset/Page_Fixed Asset - TAG SAMURAI/Button History My Asset'))

WebUI.delay(2)

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/OBJ 006 History My Asset/Button Search History My Asset'))

WebUI.sendKeys(findTestObject('User Basic - My Asset Task Assignment/OBJ 006 History My Asset/Searchbox History my Asset'), 
    'Meja')

WebUI.sendKeys(findTestObject('User Basic - My Asset Task Assignment/OBJ 006 History My Asset/Searchbox History my Asset'), 
    Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('Screenshot/016. User Profile/TC.006.08 - Filtering Melakukan filtering data menggunakan fitur filter field Search.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

