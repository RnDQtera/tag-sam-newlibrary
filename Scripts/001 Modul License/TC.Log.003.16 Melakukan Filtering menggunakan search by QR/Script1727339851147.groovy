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

WebUI.navigateToUrl('https://localhost:9001')

WebUI.click(findTestObject('00-05 Advance Localhost9001'))

WebUI.click(findTestObject('00-06 Proceed to Localhost'))

WebUI.delay(2)

WebUI.navigateToUrl('https://localhost:9002')

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(5)

WebUI.delay(5)

WebUI.setText(findTestObject('00-01 ID'), GlobalVariable.id)

WebUI.setText(findTestObject('00-02 PASS'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Dashboard/Modul fixed asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('OBJ Modul License/Tab Asset/Menu Licenses'))

WebUI.click(findTestObject('OBJ Modul License/Asset Tab/Tab Asset'))

WebUI.click(findTestObject('OBJ Modul License/Tab Asset/Grup Kantor Pusat Jakarta (1)'))

WebUI.click(findTestObject('00-07 Sync'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Modul License/Tab Asset/Button sync'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Modul License/Tab Asset/Close sync'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Modul License/Tab Asset/Button Search By Scan'))

WebUI.click(findTestObject('OBJ Modul License/Tab Asset/Scan QR'))

WebUI.delay(8)

WebUI.takeScreenshot('Screenshot/015. License/TC.003.16 - Melakukan filtering Menggunakan  Search By QR.png',
	FailureHandling.STOP_ON_FAILURE)

