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

WebUI.navigateToUrl('https://dev-fixedasset-v2.tagsamurai.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OBJ Modul License/button_Log in with OTP'))

WebUI.setText(findTestObject('Object Repository/OBJ Modul License/input__ts-inputtext max-h-42px flex py-1 px_15dae7'), 
    'user10@mailnesia.com')

WebUI.click(findTestObject('Object Repository/OBJ Modul License/button_Request OTP'))

WebUI.setText(findTestObject('Object Repository/OBJ Modul License/input_Re-Send OTP_leading-none font-medium _39674b'), 
    '')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/OBJ Modul License/button_Verify and Log in'))

WebUI.click(findTestObject('Object Repository/OBJ Modul License/i_Modules_text-78.82px text-primary-500 ico_505ec3'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OBJ Modul License/div_License'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Modul License/Asset Tab/Tab Asset'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Modul License/Asset Tab/Show child group data'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Modul License/Asset Tab/Action detail child group'))

WebUI.click(findTestObject('OBJ Modul License/Asset Tab/Button asset detail'))

WebUI.takeScreenshot('Screenshot/015. License/TC.003.23 - User melakukan action asset detail.png', FailureHandling.STOP_ON_FAILURE)

