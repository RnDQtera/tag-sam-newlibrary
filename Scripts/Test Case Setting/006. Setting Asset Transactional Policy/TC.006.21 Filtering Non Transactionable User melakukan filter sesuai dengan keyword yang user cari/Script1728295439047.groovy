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

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/Button Login'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/Modul Fixed Asset'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/Menu Settings'))

WebUI.click(findTestObject('OBJ Menu Setting/Sub Menu Asset Transactional Policy'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/006 Asset Transactional Policy/006.02 Tab Non Transactionable/Tab Non Transactionable'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/006 Asset Transactional Policy/Button Search ATP'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/006 Asset Transactional Policy/Searchbox ATP'), 'ikea')

WebUI.sendKeys(findTestObject('OBJ Menu Setting/006 Asset Transactional Policy/Searchbox ATP'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.006.21 - Filtering Non Transaction User melakukan filter sesuai dengan keyword yang user cari.png', 
    FailureHandling.STOP_ON_FAILURE)

