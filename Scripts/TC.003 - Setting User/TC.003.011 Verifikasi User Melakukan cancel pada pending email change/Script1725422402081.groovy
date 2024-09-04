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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('0001 ID'), GlobalVariable.id)

WebUI.setText(findTestObject('0002 PASS'), GlobalVariable.pass)

WebUI.click(findTestObject('0003 Button Login'))

WebUI.click(findTestObject('0004 Modul Fixed Asset'))

WebUI.click(findTestObject('OBJ.001 - Setting Group/0042 Menu Setting'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.001 Menu Setting User'))

WebUI.delay(5)

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.045 Button Action 2 (Fajar)'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.048 Button Edit (2) Fajar - Copy'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.057 Button Cancel Email change - Copy'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.058 Button Continue Email change - Copy'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.050 Button Save Edit User (2) (fajar) - Copy'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.051 Button Continue Edit User - Copy'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.014 Button Change Log'))

WebUI.delay(5)

WebUI.takeScreenshot('Screenshot/TC.003.011- Verifikasi User melakukan cancel pada pending email .png', FailureHandling.STOP_ON_FAILURE)

