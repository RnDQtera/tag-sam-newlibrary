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

WebUI.setText(findTestObject('OBJ User Profile/001 System Role/Input Email'), 'user23@mailnesia.com')

WebUI.setEncryptedText(findTestObject('OBJ User Profile/001 System Role/Input Password'), '8+VvZnBZfpfG5HxfHfyGjg==')

WebUI.click(findTestObject('OBJ User Profile/006 User Log Login/Button Login'))

WebUI.delay(5)

WebUI.click(findTestObject('OBJ User Profile/006 User Log Login/Modul Fixed Asset'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ User Profile/007 Profile/Icon Profile'))

WebUI.click(findTestObject('OBJ User Profile/007 Profile/Button Profile'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ User Profile/001 System Role/Button Filter System Role'))

WebUI.click(findTestObject('OBJ User Profile/001 System Role/Button Group System Role'))

WebUI.click(findTestObject('OBJ User Profile/001 System Role/Checkbox Select Group System Role'))

WebUI.click(findTestObject('OBJ User Profile/001 System Role/Button Select Group System Role'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ User Profile/001 System Role/Button Apply System Role'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/016. User Profile/TC.001.03 - Filtering Melakukan filtering data menggunakan fitur filter Group.png', 
    FailureHandling.STOP_ON_FAILURE)

