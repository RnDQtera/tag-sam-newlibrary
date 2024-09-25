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

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/button_Log in with OTP'))

WebUI.setText(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/input__ts-inputtext max-h-42px flex py-1 px_15dae7'), 
    'user10@mailnesia.com')

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/button_Request OTP'))

WebUI.setText(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/input_Re-Send OTP_leading-none font-medium _39674b'), 
    '3')

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/button_Verify and Log in'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/button_Modules_module-shadow w-110px h-110p_8ab1f7'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/div_Device'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/div_TAG'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/div_Reported'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/a_History'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/button_'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/div_Select TAG'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/input_RFID_peer w-full h-full absolute top-_e6b753'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 47/button_Apply'))

WebUI.takeScreenshot('Screenshot/014. Tag/TC.014.047 - Melakukan filtering data dengan fitur field Reported Tag.png', FailureHandling.STOP_ON_FAILURE)

