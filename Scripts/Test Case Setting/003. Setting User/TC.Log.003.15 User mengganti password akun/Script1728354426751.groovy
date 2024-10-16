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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://console.tagsamurai.com')

WebUI.delay(5)

WebUI.setText(findTestObject('00-01 ID'), 'indrafrim@mailnesia.com')

WebUI.setText(findTestObject('00-02 PASS'), 'Moderator12@')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/button_Log in'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/div_module-shadow w-110px h-110px flex item_7c244a'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/button_relative items-center justify-center_4185a7'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/a_Profile'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/button_Change Password'))

WebUI.setText(findTestObject('OBJ Menu Setting/003 Setting User/Field old password'), 'Moderator12@')

WebUI.setText(findTestObject('OBJ Menu Setting/003 Setting User/Field new password'), 'Moderator13@')

WebUI.setText(findTestObject('OBJ Menu Setting/003 Setting User/Field re-enter new password'), 'Moderator13@')

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button save change password'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.15 - User mengganti password akun.png', FailureHandling.STOP_ON_FAILURE)

