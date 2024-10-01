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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(5)

WebUI.setText(findTestObject('00-01 ID'), 'davidvila@mailnesia.com')

WebUI.setText(findTestObject('00-02 PASS'), 'Moderator12@')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Dashboard/Modul fixed asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Profil'))

WebUI.delay(2)

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Menu my asset'))

WebUI.delay(5)

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Button Filter'))

WebUI.delay(2)

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Field button select group'))

WebUI.delay(2)

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/List (1) Select Group'))

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Button Select - Select Group'))

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Button apply - task borrow'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/User Basic/Tc.Log.001.11- Melakukan filtering sesuai dengan field group.png', FailureHandling.STOP_ON_FAILURE)

