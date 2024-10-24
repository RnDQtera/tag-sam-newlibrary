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

WebUI.navigateToUrl('https://console.tagsamurai.com/auth/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('OBJ Menu Setting/Set Email'), 'employee24@mailnesia.com')

WebUI.setEncryptedText(findTestObject('OBJ Menu Setting/Set Password'), '8+VvZnBZfpfG5HxfHfyGjg==')

WebUI.delay(10)

WebUI.click(findTestObject('OBJ Menu Setting/Button Login'))

WebUI.click(findTestObject('OBJ Menu Setting/Modul Fixed Asset'))

WebUI.delay(6)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Menu Settings'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Sub Menu Accounting'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Tab Account Code List'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Changelog Account Code'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Changelog Filter Account Code'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Action Changelog Choose Date Account Code'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Item Changelog Date Account Code'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Changelog Apply Filter Account Code'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.007.26 - Filtering (Changelog Account code list) User melakukan filter sesuai dengan Date.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Clear Field - Account code'))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Action Changelog Choose Action Account Code'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Item Changelog Action Account Code'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Changelog Apply Filter Account Code'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.007.27 - Filtering (Changelog Account code list) User melakukan filter sesuai dengan Action.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Clear Field - Account code'))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Action Changelog Choose Field Account Code'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Item Changelog Field Account Code'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Changelog Apply Filter Account Code'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.007.28 - Filtering (Changelog Account code list) User melakukan filter sesuai dengan Field.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Clear Field - Account code'))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Action Changelog Choose Modified By Account Code'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Item Changelog Modified By Account Code'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Action Changelog Choose Modified By Account Code'))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Changelog Apply Filter Account Code'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.007.29 - Filtering (Changelog Account code list) User melakukan filter sesuai dengan Modified By.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Clear Field - Account code'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Changelog Apply Filter Account Code'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Changelog Filter Account Code'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Changelog Search Account Code'))

WebUI.setText(findTestObject('OBJ Menu Setting/007 Setting Accounting/Input Text Changelog Search Account Code'), 'Aset Testing')

WebUI.sendKeys(findTestObject('OBJ Menu Setting/007 Setting Accounting/Input Text Changelog Search Account Code'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.007.30 - Filtering (Changelog Account code list) User melakukan filter sesuai dengan keyword yag dicari.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Arrow Changelog Search'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Changelog Download Account Code'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.007.31 - (Changelog Account code list) User mendownload list Changelog Account code list.png', 
    FailureHandling.STOP_ON_FAILURE)

