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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

<<<<<<< HEAD
WebUI.setText(findTestObject('0001 ID'), GlobalVariable.id)

WebUI.setText(findTestObject('0002 PASS'), GlobalVariable.pass)

WebUI.click(findTestObject('0003 Button Login'))
=======
WebUI.setText(findTestObject('null'), GlobalVariable.id)

WebUI.setText(findTestObject('null'), GlobalVariable.pass)

WebUI.click(findTestObject('null'))
>>>>>>> 4d629f9efc56921eae00f2709d19be307b732c11

WebUI.click(findTestObject('OBJ.001 - Setting Group/0005 Menu Fixed Asset'))

WebUI.click(findTestObject('OBJ.001 - Setting Group/0042 Menu Setting'))

WebUI.click(findTestObject('001 Reusable Component/001.019 Reusable - Menu Setting - Role'))

WebUI.click(findTestObject('OBJ.002 - Setting Role/OBJ.002.016 Click Menu Audit'))

WebUI.delay(8)

WebUI.click(findTestObject('OBJ.002 - Setting Role/OBJ.002.003 Button Add Monitoring'))

WebUI.click(findTestObject('OBJ.002 - Setting Role/OBJ.002.002 Checkbox List 1'))

WebUI.click(findTestObject('OBJ.002 - Setting Role/OBJ.002.018 Button Change Log'))

WebUI.delay(5)

WebUI.takeScreenshot('Screenshot/TC.002.014 - Add Monitoring And Report - Audit.png', FailureHandling.STOP_ON_FAILURE)

