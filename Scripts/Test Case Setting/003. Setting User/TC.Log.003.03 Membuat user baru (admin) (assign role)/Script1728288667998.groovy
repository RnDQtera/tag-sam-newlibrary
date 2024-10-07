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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://console.tagsamurai.com/')

WebUI.delay(5)

WebUI.setText(findTestObject('00-01 ID'), 'user22@mailnesia.com')

WebUI.setText(findTestObject('00-02 PASS'), 'Moderator12@')

WebUI.delay(10)

WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Dashboard/Modul fixed asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('001 Reusable Component/001.016 Reusable - Menu Settings'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Reusable menu Setting - User'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action user list (3)'))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action list (3) - detail'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Role - Transaction Role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button plus assign role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button select group assign transaction role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Select group - jawa barat'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button select - select group'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown transaction role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/List (1) Transaction role - borrowing assignment'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown select role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/List (1) Transaction role - Manager'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button submit - transaction role'))

WebUI.delay(1)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.03 - Membuat user baru (admin) (assign role).png', FailureHandling.STOP_ON_FAILURE)

