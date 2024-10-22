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

WebUI.delay(8)

WebUI.click(findTestObject('OBJ Menu Setting/Menu Settings'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Sub Menu Custom Field'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Tab Purchase'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Create Custom Field'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Input Text Field Name'), 'Custom Field 2 Purchase')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Select Data Type'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Field 1 Data Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Select Category'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Field 1 Category'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Select'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Submit Custom Field'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Changelog Custom Field'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.005.06 - Purchase membuat custom field terbaru.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Close change log'))

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Search Custom Field'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Input Text Search Custom Field'), Keys.chord('Custom Field 2 Purchase', 
        Keys.ENTER))

'Non Aktif'
WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Slider 1 Active Custom Field Single action'))

WebUI.delay(2)

'Aktif'
WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Slider 1 Active Custom Field Single action'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Changelog Custom Field - Search'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.005.07 - Purchase mengaktifkan custom field.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Close change log'))

'Non Aktif'
WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Slider 1 Active Custom Field Single action'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Changelog Custom Field - Search'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.005.08 - Purchase menonaktifkan custom field.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Close change log'))

'Aktif'
WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Slider 1 Active Custom Field Single action'))

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Single action'))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Edit List 1'))

WebUI.delay(2)

WebUI.clearText(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Input Text Field Name'))

WebUI.setText(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Input Text Field Name'), 'Edit Custom Field 2 Purchase')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/005. Setting Custom Field/Button Select Data Type'))

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Field 2 Data Type'))

WebUI.setText(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Input Value'), 'Value A')

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Save Edit Custom Field'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Changelog Custom Field - Search'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.005.09 - Purchase mengedit custom field.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Close change log'))

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Single action'))

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Delete List 1'))

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Delete Custom Field - Search'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/005. Setting Custom Field/Button Changelog Custom Field - Search'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.005.10 - Purchase menghapus custom field.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.refresh()

