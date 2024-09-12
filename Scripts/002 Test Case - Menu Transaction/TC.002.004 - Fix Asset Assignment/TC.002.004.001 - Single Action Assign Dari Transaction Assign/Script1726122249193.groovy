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

WebUI.delay(5)

WebUI.click(findTestObject('00-04 Modul Fixed Asset'))

WebUI.delay(8)

WebUI.click(findTestObject('001 Reusable Component/001.001 Reusable - Menu Fixed Asset'))

WebUI.click(findTestObject('001 Reusable Component/001.005 Reusable - Menu Fixed Asset - Assignment'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.001 Assignment - Transaction'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.002 Button Tambah Assign'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.003 Button Tambah Asset'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.004 Checkbox'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.005 Button Select'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.006 Select User'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.007 John Doe'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.008 Button Select - Select User'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.009 Button Submit Assignment'))

WebUI.delay(5)

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.014 Menu Approval'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.015 Menu Approval - Assignment'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.016 Button Action Approval'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.017 Approval'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.018 Slider Approval'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.019 Button Submit Approval'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.020 Button Submit - Submit Approval'))

WebUI.delay(5)

WebUI.click(findTestObject('001 Reusable Component/001.001 Reusable - Menu Fixed Asset'))

WebUI.click(findTestObject('001 Reusable Component/001.005 Reusable - Menu Fixed Asset - Assignment'))

WebUI.click(findTestObject('OBJ.051 Modul Assign/OBJ.051.001 Assignment - Transaction'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/013. Asset Assignment/TC.013.001 - Action Assign.png', FailureHandling.STOP_ON_FAILURE)

