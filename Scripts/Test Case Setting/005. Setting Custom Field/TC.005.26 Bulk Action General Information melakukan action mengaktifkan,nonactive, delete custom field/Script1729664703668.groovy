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

WebUI.setText(findTestObject('OBJ Menu Setting/Set Email'), 'user22@mailnesia.com')

WebUI.setText(findTestObject('OBJ Menu Setting/Set Password'), 'Moderator19@')

WebUI.delay(10)

WebUI.click(findTestObject('OBJ Menu Setting/Button Login'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/Modul Fixed Asset'))

WebUI.delay(7)

WebUI.click(findTestObject('OBJ Menu Setting/Menu Settings'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Sub Menu Custom Field'))

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Checkbox Bulk Action'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Bulk Action'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Activate Bulk Action'))

WebUI.delay(2)

'Non Aktif'
WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Activate Custom Field'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Checkbox Bulk Action'))

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Checkbox Bulk Action'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Bulk Action'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Activate Bulk Action'))

WebUI.delay(2)

'Active'
WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Activate Custom Field'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Changelog Custom Field'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.005.26 - Bulk Action General Information melakukan action mengaktifkan custom field.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Close change log'))

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Checkbox Bulk Action'))

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Checkbox Bulk Action'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Bulk Action'))

WebUI.delay(2)

'Inactive '
WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Activate Bulk Action'))

WebUI.delay(2)

'Inactive'
WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Activate Custom Field'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Changelog Custom Field'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.005.27 - Bulk Action General Information melakukan action nonactive custom field.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Close change log'))

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Checkbox Bulk Action'))

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Checkbox Bulk Action'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Bulk Action'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Activate Bulk Action'))

WebUI.delay(2)

'Active'
WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Activate Custom Field'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Create Custom Field'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Input Text Field Name'), 'Custom Field 2')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Select Data Type'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Field 1 Data Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Select Category'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Field 1 Category'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Select'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Submit Custom Field'))

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Search Custom Field'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Input Text Search Custom Field'), Keys.chord('Custom Field 2', 
        Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Checkbox Bulk Action'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Bulk Action'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Delete Bulk Action'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Delete Custom Field'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Changelog Custom Field - Search'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.005.28 - Bulk Action General Information melakukan action delete custom field.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.refresh()

