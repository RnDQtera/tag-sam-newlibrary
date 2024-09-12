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

WebUI.setText(findTestObject('0001 ID'), GlobalVariable.id)

WebUI.setText(findTestObject('0002 PASS'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0003 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0004 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.001 Reusable - Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.003 Reusable - Menu Fixed Asset - Available'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.030 - Fixed Asset - Bulk Action Add Pre-list Borrows/OBJ.030.001 Checkbox (1)'))

WebUI.click(findTestObject('OBJ.030 - Fixed Asset - Bulk Action Add Pre-list Borrows/OBJ.030.002 Button Bulk Action'))

WebUI.click(findTestObject('OBJ.030 - Fixed Asset - Bulk Action Add Pre-list Borrows/OBJ.030.003 Bulk Action - Action (2)'))

WebUI.click(findTestObject('OBJ.030 - Fixed Asset - Bulk Action Add Pre-list Borrows/OBJ.030.004 Select User For Borrowing'))

WebUI.click(findTestObject('OBJ.013 - Fixed Asset - Add Prelist Borrow/OBJ.013.005 Submit Borrowing Pre-List'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/010. Register Asset/TC.010.020 - Bulk Action Add Pre-list Borrow.png', FailureHandling.STOP_ON_FAILURE)

