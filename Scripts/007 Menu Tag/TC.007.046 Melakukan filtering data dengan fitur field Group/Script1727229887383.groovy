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

WebUI.click(findTestObject('OBJ Menu Tag/OBJ TC 45/button_Log in with OTP'))

WebUI.setText(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 46/input__ts-inputtext max-h-42px flex py-1 px_15dae7'), 
    'user10@mailnesia.com')

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 46/button_Request OTP'))

WebUI.setText(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 46/input_Re-Send OTP_leading-none font-medium _39674b'), 
    '6')

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 46/button_Verify and Log in'))

WebUI.click(findTestObject('OBJ Menu Tag/OBJ TC 45/button_Modules_module-shadow w-110px h-110p_8ab1f7'))

WebUI.click(findTestObject('OBJ Menu Tag/OBJ TC 45/div_Device'))

WebUI.click(findTestObject('OBJ Menu Tag/OBJ TC 45/div_TAG'))

WebUI.click(findTestObject('OBJ Menu Tag/OBJ TC 45/div_Reported'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 46/span_History'))

WebUI.click(findTestObject('OBJ Menu Tag/OBJ TC 43-44/i_History_mx-0 text-base icon ic-filter-lin_324d4a'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 46/div_Select group'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 46/input_Finished Date_peer w-full h-full abso_7d8df6'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 46/button_Apply'))

WebUI.takeScreenshot('Screenshot/014. Tag/TC.014.046 - Melakukan filtering data dengan fitur field Group.png', FailureHandling.STOP_ON_FAILURE)

