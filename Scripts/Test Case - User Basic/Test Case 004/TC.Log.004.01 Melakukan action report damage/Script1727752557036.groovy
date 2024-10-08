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

WebUI.navigateToUrl('https://console.tagsamurai.com/auth/login')

WebUI.delay(5)

WebUI.setText(findTestObject('00-01 ID'), 'codygakpo1@mailnesia.com')

WebUI.setText(findTestObject('00-02 PASS'), 'Moderator12@')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Dashboard/Modul fixed asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Profil'))

WebUI.delay(5)

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Menu my asset'))

WebUI.delay(5)

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Menu borrowed asset'))

WebUI.delay(5)

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Button action asset - borrowed asset'))

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Report damaged - borrowed asset'))

WebUI.delay(5)

WebUI.uploadFile(findTestObject('User Basic - My Asset Task Assignment/Input image - assigned asset'), 'C:\\Users\\HP\\OneDrive\\Pictures\\meja rusak.jpg')

WebUI.delay(5)

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Button apply adjust photo'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('User Basic - My Asset Task Assignment/Field enter note'), 'rusak')

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Button submit'))

WebUI.click(findTestObject('User Basic - My Asset Task Assignment/Button continue report damage asset'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/User Basic/Tc.Log.004.01- Melakukan action report damage.png', FailureHandling.STOP_ON_FAILURE)

