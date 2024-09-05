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

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)
//
//WebUI.navigateToUrl(GlobalVariable.URL)
//
//WebUI.delay(5)
//
//WebUI.setText(findTestObject('0001 ID'), GlobalVariable.id)
//
//WebUI.setText(findTestObject('0002 PASS'), GlobalVariable.pass)
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('0003 Button Login'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('0004 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('001 Reusable Component/001.001 Reusable - Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.002 Reusable - Menu Fixed Asset - All'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.025 Reusable - Register Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.001 Select Group for Register'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.002 Search Group for Register'), 'Kantor Regional JaBar')

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.003 Select Result Search Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.004 Submit Select Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.005 Select Group Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.002 Search Group for Register'), 'Furnitur dan Aksesori')

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.003 Select Result Search Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.004 Submit Select Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.007 Select Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.008 Search Asset Name'), 'Meja Rapat Direksi')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.009 Select Result Search Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.010 Add Alias Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.011 Textfield Alias Asset Name'), 'Alias Asset')

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.012 Select Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.008 Search Asset Name'), 'Fabelio')

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.009 Select Result Search Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.013 Select Model Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.008 Search Asset Name'), 'Lemari Arsip Pajak')

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.009 Select Result Search Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.014 Select Qty Asset'), '1')

WebUI.uploadFile(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.015 Upload Image'), 'C:\\Users\\DELL\\Downloads\\meja.jpeg')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.016 Apply Upload Foto'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.017 Button Register Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.010 - Fixed Asset - Register Asset/OBJ.010.018 Data Change Log'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/010. Register Asset/TC.010.002 - Register Asset Tag.png', FailureHandling.STOP_ON_FAILURE)

