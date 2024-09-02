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

WebUI.openBrowser(GlobalVariable.URL, FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('OBJ.007 - Login/OBJ.007.001.Field ID'), GlobalVariable.id)

WebUI.setText(findTestObject('OBJ.007 - Login/OBJ.007.002.Field Password'), GlobalVariable.pass)

WebUI.click(findTestObject('OBJ.007 - Login/OBJ.007.003.Button Login'))

WebUI.click(findTestObject('OBJ.001 - Setting Group/0005 Menu Fixed Asset'))

WebUI.click(findTestObject('OBJ.001 - Setting Group/0042 Menu Setting'))

WebUI.click(findTestObject('001 Reusable Component/001.017 Reusable - Menu Setting - Group'))

WebUI.click(findTestObject('OBJ.001 - Setting Group/0029 Slider Kantor Pusat Jakarta'))

WebUI.click(findTestObject('OBJ.001 - Setting Group/0020 Button View Log'))

WebUI.delay(5)

WebUI.takeScreenshot('Screenshot/TC.001.013 - Disabling Disposal Policy Group.png', FailureHandling.STOP_ON_FAILURE)

