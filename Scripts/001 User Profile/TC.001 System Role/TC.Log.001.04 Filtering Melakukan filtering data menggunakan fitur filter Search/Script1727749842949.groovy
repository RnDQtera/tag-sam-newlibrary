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

WebUI.setText(findTestObject('Object Repository/OBJ User Profile/001 System Role/006 User Log Login/Set Username'), 'user23@mailnesia.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OBJ User Profile/001 System Role/006 User Log Login/Set Password'), 
    '8+VvZnBZfpfG5HxfHfyGjg==')

WebUI.click(findTestObject('Object Repository/OBJ User Profile/001 System Role/006 User Log Login/Button Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/001 System Role/006 User Log Login/Modul Fixed Asset'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/001 System Role/Page_Fixed Asset - TAG SAMURAI/div_Settings'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/001 System Role/Page_Fixed Asset - TAG SAMURAI/div_User'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/001 System Role/Page_Fixed Asset - TAG SAMURAI/i_ASDF .ai V2_button-icon-6454c4253dd1017f28689572'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/001 System Role/Page_Fixed Asset - TAG SAMURAI/a_Detail'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/001 System Role/Tab Group Role'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ User Profile/001 System Role/Button Search Group Role'))

WebUI.sendKeys(findTestObject('OBJ User Profile/001 System Role/Searchbox Group Role'), 'purchase')

WebUI.sendKeys(findTestObject('OBJ User Profile/001 System Role/Searchbox Group Role'), Keys.chord(Keys.ENTER))

WebUI.delay(4)

WebUI.takeScreenshot('Screenshot/016. User Profile/TC.001.04 - Filtering Melakukan filtering data menggunakan fitur filter Search.png', 
    FailureHandling.STOP_ON_FAILURE)

