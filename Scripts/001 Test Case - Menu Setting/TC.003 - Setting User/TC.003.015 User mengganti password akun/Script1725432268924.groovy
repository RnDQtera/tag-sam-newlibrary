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

WebUI.setText(findTestObject('0001 ID'), 'fajar3@mailnesia.com')

WebUI.setText(findTestObject('0002 PASS'), 'Moderator12@')

WebUI.click(findTestObject('0003 Button Login'))

WebUI.click(findTestObject('0004 Modul Fixed Asset'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.059 Click icon profile - Copy'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.060 Click menu profile - Copy'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.061 Button Change password - Copy'))

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.062 Field old password - Copy'), 'Moderator12@')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.063 Field new password - Copy'), 'Moderator13@')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.064 Field Re-enter new password - Copy'), 'Moderator13@')

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.065 Button Save Password - Copy'))

WebUI.takeScreenshot('Screenshot/TC.003.015- User mengganti password akun.png', FailureHandling.STOP_ON_FAILURE)

