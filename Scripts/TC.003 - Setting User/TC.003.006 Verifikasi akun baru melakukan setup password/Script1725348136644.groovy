import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://mailnesia.com/')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.039 Field mailbox'), 'rizky')

WebUI.sendKeys(findTestObject('OBJ.003 - Setting User/OBJ.003.039 Field mailbox'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.038 click email (To rizkyamailnesia)'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.040 Button Activate Account'))

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.041 Field Password'), 'Moderator12@')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.042 Field Confirm Password'), 'Moderator12@')

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.043 Button Save'))

WebUI.takeScreenshot('Screenshot/TC.003.006- Verifikasi akun baru .png', FailureHandling.STOP_ON_FAILURE)

