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

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/span_Log in with OTP (1)'))

WebUI.setText(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/input__ts-inputtext max-h-42px flex py-1 px_15dae7 (2)'), 
    'user10@mailnesia.com')

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/button_Request OTP (1)'))

WebUI.setText(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/input_Re-Send OTP_leading-none font-medium _39674b (2)'), 
    '9')

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/span_Verify and Log in (1)'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/i_Modules_text-78.82px text-primary-500 ico_505ec3 (2)'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/i_Addon_w-4 h-4 darktext-white text-black i_a3c790 (2)'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/i_Device_w-4 h-4 darktext-white text-black _224c0c (2)'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/span_Reported (1)'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/span_History (1)'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/i_History_mx-0 text-base icon ic-filter-lin_324d4a (2)'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/i_Select code_w-full h-full transition-tran_2359ae (2)'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/input_Finished Date_peer w-full h-full abso_7d8df6 (2)'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Tag/OBJ TC 43-44/span_Apply (1)'))

