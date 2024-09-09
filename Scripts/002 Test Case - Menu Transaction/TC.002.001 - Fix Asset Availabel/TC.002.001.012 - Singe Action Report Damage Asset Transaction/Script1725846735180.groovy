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

WebUI.setText(findTestObject('00-01 ID'), GlobalVariable.id)

WebUI.setText(findTestObject('00-02 PASS'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-04 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.001 Reusable - Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.003 Reusable - Menu Fixed Asset - Available'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.020 - Fixed Asset - Report Damage Transaction/OBJ.020.001 Action (1) - Fixed Asset Available'))

WebUI.click(findTestObject('OBJ.020 - Fixed Asset - Report Damage Transaction/OBJ.020.002 Action Report Damage (9)'))

WebUI.uploadFile(findTestObject('OBJ.020 - Fixed Asset - Report Damage Transaction/OBJ.020.003 Button Upload Foto'), 'D:\\Meja Rusak.png')

WebUI.delay(2)

WebUI.click(findTestObject('OBJ.020 - Fixed Asset - Report Damage Transaction/OBJ.020.004 Button Apply Upload Photo'))

WebUI.delay(1)

WebUI.setText(findTestObject('OBJ.020 - Fixed Asset - Report Damage Transaction/OBJ.020.006 Field Note'), 'rusak')

WebUI.click(findTestObject('OBJ.020 - Fixed Asset - Report Damage Transaction/OBJ.020.005 Button Submit'))

WebUI.click(findTestObject('OBJ.020 - Fixed Asset - Report Damage Transaction/OBJ.020.007 Button Continue'))

WebUI.delay(5)

WebUI.click(findTestObject('001 Reusable Component/001.007 Reusable - Menu Fixed Asset - Damaged'))

WebUI.takeScreenshot('Screenshot/010. Register Asset/TC.010.012 - Report Damage Asset Transaction.png', FailureHandling.STOP_ON_FAILURE)

