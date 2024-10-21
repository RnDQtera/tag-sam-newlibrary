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

WebUI.delay(10)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Menu Setting'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Reusable menu Setting - User'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button search'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/003 Setting User/Field search - user'), Keys.chord('indra', Keys.ENTER))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action user (1))'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action list (1) - edit'))

WebUI.delay(4)

WebUI.clearText(findTestObject('OBJ Menu Setting/003 Setting User/Field position edit user'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ Menu Setting/003 Setting User/Field position edit user'), 'IT Manager')

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button save'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button continue edit user'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button change log search user'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.18 - Admin melakukan edit user.png', FailureHandling.STOP_ON_FAILURE)

