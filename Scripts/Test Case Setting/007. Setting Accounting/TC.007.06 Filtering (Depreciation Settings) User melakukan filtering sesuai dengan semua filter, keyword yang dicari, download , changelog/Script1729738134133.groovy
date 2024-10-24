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

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Depreciation Group'))

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/007 Setting Accounting/Input Text Tangible Asset Group'), 
    'Inventaris Kantor Asset 1')

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/007 Setting Accounting/Input Number of Useful Life'))

WebUI.setText(findTestObject('OBJ Menu Setting/007 Setting Accounting/Input Number of Useful Life'), '5')

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/007 Setting Accounting/Button Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Depreciation Group'))

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/007 Setting Accounting/Input Text Tangible Asset Group'), 
    'Inventaris Kantor Asset 2')

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/007 Setting Accounting/Input Number of Useful Life'))

WebUI.setText(findTestObject('OBJ Menu Setting/007 Setting Accounting/Input Number of Useful Life'), '10')

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/007 Setting Accounting/Button Submit'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Filter Depreciation Settings'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Action Choose Useful Life'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Item Useful Life list (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Apply Filter Accounting'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.007.06 - Filtering (Depreciation Settings) User melakukan filter sesuai dengan Useful Life.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Remove Filter Useful Life'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Action Choose Straight Line Depreciation Rate'))

WebUI.delay(2)

WebUI.setText(findTestObject('OBJ Menu Setting/007 Setting Accounting/Input Text Filter Straight-Line'), '10')

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Item Straight Line Depreciation Rate'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Apply Filter Accounting'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.007.07 - Filtering (Depreciation Settings) User melakukan filter sesuai dengan Straight Line Depreciation Rate.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Remove Filter Straight Line'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Action Choose Double Declining Depreciation Rate'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Item Double Declining Depreciation Rate'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Apply Filter Accounting'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.007.08 - Filtering (Depreciation Settings) User melakukan filter sesuai dengan Double Declining Depreciation Rate.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Remove Filter Double Declining'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Apply Filter Accounting'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Filter Depreciation Settings'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Search Depreciation Settings'))

WebUI.setText(findTestObject('OBJ Menu Setting/007 Setting Accounting/Input Text Search Depreciation Settings'), 'Inventaris Kantor Asset 2')

WebUI.sendKeys(findTestObject('OBJ Menu Setting/007 Setting Accounting/Input Text Search Depreciation Settings'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.007.09 - Filtering (Depreciation Settings) User melakukan filter sesuai dengan keyword yang dicari.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.refresh()

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Download Depreciation Settings'))

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.007.10 - (Depreciation Settings) User mendownload list Depreciation Settings.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Changelog Depreciation Settings'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.007.11 - (Depreciation Settings) User melihat perubahan yang terjadi pada Depreciation Settings.png', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.refresh()

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Checkbox Bulk Action Depreciation Settings'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Bulk Action Dropdown Depreciation Settings'))

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Delete Bulk Action Depreciation Settings'))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/007 Setting Accounting/Button Delete Dialog Bulk Action Depreciation Group'))

