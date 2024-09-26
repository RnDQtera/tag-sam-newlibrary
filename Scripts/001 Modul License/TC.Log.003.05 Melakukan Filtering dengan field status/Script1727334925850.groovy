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

WebUI.click(findTestObject('OBJ Dashboard/Modul fixed asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('OBJ Modul License/Asset Tab/Menu Licenses'))

WebUI.click(findTestObject('OBJ Modul License/Asset Tab/Tab Asset'))

WebUI.click(findTestObject('OBJ Modul License/Asset Tab/Grup Kantor Pusat Jakarta (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Modul License/Asset Tab/Button Filter'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Modul License/Asset Tab/Dropdown Field Status'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Modul License/Asset Tab/Field 1'))

WebUI.click(findTestObject('OBJ Modul License/Asset Tab/Button Apply'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/015. License/TC.003.05 - Melakukan filter Menampilkan Data Sesuai Field Status.png', FailureHandling.STOP_ON_FAILURE)

