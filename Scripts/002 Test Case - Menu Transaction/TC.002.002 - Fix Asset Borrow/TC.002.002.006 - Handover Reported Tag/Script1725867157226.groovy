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
//WebUI.navigateToUrl('https://localhost:9001')
//
//WebUI.click(findTestObject('00-05 Advance Localhost9001'))
//
//WebUI.click(findTestObject('00-06 Proceed to Localhost'))
//
//WebUI.delay(2)
//
//WebUI.navigateToUrl('https://localhost:9002')
//
//WebUI.delay(2)
//
//WebUI.navigateToUrl(GlobalVariable.URL)
//
//WebUI.delay(5)
//
//WebUI.setText(findTestObject('00-01 ID'), GlobalVariable.id2)
//
//WebUI.setText(findTestObject('00-02 PASS'), GlobalVariable.pass)
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-04 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-07 Sync'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-08 Hardware Sync'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-09 Closed Hardware Sync'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('001 Reusable Component/001.001 Reusable - Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('001 Reusable Component/001.004 Reusable - Menu Fixed Asset - Borrow'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.013 Sub Tab Transaction Borrow'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.014 Add Borrow Transaction'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.026 Search by Scan'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-10 Select Single Scan RFID'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.003 - Add Borrow Asset By Tag.png', FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.020 Select User'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.021 Button Search Select User'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.022 Text Field Select User'), 'Smith Doe')
//
//WebUI.sendKeys(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.022 Text Field Select User'), Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.023 Select User Borrow'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.019 Submit Select and Select user Asset for Borrowing'), 
//    FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.024 Text Field Duration Borrowing'), '1')
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.025 Submit Borrowing Request'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.006 Single Action Sub Tab Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.007 Action Handover'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.040 Single Action Asset Verification'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.041 Action Reported Tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.044 Cancel Reported Tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.040 Single Action Asset Verification'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.041 Action Reported Tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.043 Submit Report Tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.045 Confirm Reported Tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.006 - Handover, Reported Tag.png', FailureHandling.STOP_ON_FAILURE)

