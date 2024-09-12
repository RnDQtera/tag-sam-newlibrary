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

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Single Action Add To Replace QR TAG Pre-list/Single Action (1)'))

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Single Action Add To Replace QR TAG Pre-list/Action - Add to replace QR Tag Pre-list'))

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Single Action Add To Replace QR TAG Pre-list/Button Continue'))

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Single Action Add To Replace RFID AND QR TAG Pre-list/Menu- Device'))

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Single Action Add To Replace QR TAG Pre-list/Menu TAG'))

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Single Action Add To Replace QR TAG Pre-list/Menu Replace TAG'))

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Single Action Add To Replace QR TAG Pre-list/Halaman Pre list Replace QR Tag'))

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Single Action Add To Replace QR TAG Pre-list/Button Action Halaman Replace QR TAG'))

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Single Action Add To Replace QR TAG Pre-list/Replace QR TAG'))

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Single Action Add To Replace QR TAG Pre-list/Button Next'))

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Single Action Add To Replace QR TAG Pre-list/Button Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Single Action Add To Replace QR TAG Pre-list/Button Scan QR'))

WebUI.delay(20)

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Single Action Add To Replace QR TAG Pre-list/Button Submit'))

WebUI.delay(5)

WebUI.takeScreenshot('Screenshot/010. Register Asset/TC.010.014 - Single Action Add To Replace QR TAG Pre-list.png', FailureHandling.STOP_ON_FAILURE)

