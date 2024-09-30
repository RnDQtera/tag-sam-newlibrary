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

WebUI.setText(findTestObject('Object Repository/OBJ User Profile/User Log Login/Set Username'), 'user23@mailnesia.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OBJ User Profile/User Log Login/Set Password'), '8+VvZnBZfpfG5HxfHfyGjg==')

WebUI.click(findTestObject('OBJ User Profile/User Log Login/Button Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/User Log Login/Modul Fixed Asset'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/User Log Login/Menu Settings'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/User Log Login/Sub Menu User'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/User Log Login/Select User'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/User Log Login/Action Detail'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/User Log Login/Tab User Log'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/User Log Login/Sub Tab Login'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ User Profile/User Log Login/Filter/Button Filter User Log Login'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/User Log Login/Filter/Button Select Date User Log Login'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/User Log Login/Filter/Select Date User Log Login'))

WebUI.click(findTestObject('Object Repository/OBJ User Profile/User Log Login/Filter/Button Apply Filter User Log Login'))

WebUI.delay(4)

WebUI.takeScreenshot('Screenshot/016. User Profile/TC.006.01 - Filtering Melakukan filtering data menggunakan fitur filter Date.png', 
    FailureHandling.STOP_ON_FAILURE)

