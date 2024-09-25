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

WebUI.navigateToUrl('https://dev-console-v2.tagsamurai.com/auth/login')

WebUI.setText(findTestObject('Object Repository/OBJ Report Log/TC.Log.001.020/input_ts-inputtext max-h-42px flex py-1 px-_f5a894'), 
    'john-doe@mailnesia.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OBJ Report Log/TC.Log.001.020/input_flex py-1 px-3 items-center space-x-1_d9fbdb'), 
    '8+VvZnBZfpfG5HxfHfyGjg==')

WebUI.click(findTestObject('Object Repository/OBJ Report Log/TC.Log.001.020/button_Log in'))

WebUI.click(findTestObject('00-04 Modul Fixed Asset'))

WebUI.click(findTestObject('Object Repository/OBJ Report Log/TC.Log.001.020/div_Report  Log'))

WebUI.click(findTestObject('Object Repository/OBJ Report Log/TC.Log.001.020/div_Report'))

WebUI.click(findTestObject('Object Repository/OBJ Report Log/TC.Log.001.020/button_Generate Report'))

WebUI.setText(findTestObject('Object Repository/OBJ Report Log/TC.Log.001.020/input_ts-inputtext flex py-1 px-3 items-cen_b7c0d3'), 
    'Report 7')

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/span_Select report type'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.020/Repairment Report'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.020/Select Content'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.020/Repairment Cost'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/div_Select listed by'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/li_Group'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/div_Select time interval'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/li_Last 7 days'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/div_Select Group'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/li_Kantor Pusat Jakarta'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/li_Kantor Regional Bali'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.020/li _jabar'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/div_Select Category'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/li_Furnitur dan Aksesori'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/li_Kendaraan'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/li_Hardware'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/div_Select Asset Name'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/li_Laptop'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.020/li_mejaKantor'))

WebUI.click(findTestObject('OBJ Report Log/TC.Log.001.19/li_Sofa Loby'))

