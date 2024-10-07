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

WebUI.navigateToUrl('https://mailnesia.com/')

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/input_mailbox'), 'donyp')

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/inputsm'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/td_no-replytagsamurai.com'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/button_Activate Account'))

WebUI.setEncryptedText(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/input_flex py-1 px-3 items-center space-x-1_d9fbdb'), 
    '8+VvZnBZfpfG5HxfHfyGjg==')

WebUI.setEncryptedText(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/input_flex py-1 px-3 items-center space-x-1_d9fbdb_1'), 
    '8+VvZnBZfpfG5HxfHfyGjg==')

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button save - mailnesia'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.06 - Verifikasi akun baru melakukan set up password.png', FailureHandling.STOP_ON_FAILURE)

