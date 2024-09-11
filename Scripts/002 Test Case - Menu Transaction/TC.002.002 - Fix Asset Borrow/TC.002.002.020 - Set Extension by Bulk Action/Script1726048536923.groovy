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
//WebUI.click(findTestObject('001 Reusable Component/001.001 Reusable - Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('001 Reusable Component/001.003 Reusable - Menu Fixed Asset - Available'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.080 Scan List Asset in available'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-10 Select Single Scan RFID'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.013 - Fixed Asset - Add Prelist Borrow/OBJ.013.001 SIngle Action Available Asset'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.016 - Fixed Asset - Borrow Transaction/OBJ.016.001 Action Borrow'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.020 Select User'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.021 Button Search Select User'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.022 Text Field Select User'), 'Smith-Doe')
//
//WebUI.sendKeys(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.022 Text Field Select User'), Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.023 Select User Borrow'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.019 Submit Select and Select user Asset for Borrowing'), 
//    FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.025 Submit Borrowing Request'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('001 Reusable Component/001.003 Reusable - Menu Fixed Asset - Available'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.080 Scan List Asset in available'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-10 Select Single Scan RFID'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.013 - Fixed Asset - Add Prelist Borrow/OBJ.013.001 SIngle Action Available Asset'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.016 - Fixed Asset - Borrow Transaction/OBJ.016.001 Action Borrow'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.020 Select User'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.021 Button Search Select User'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.022 Text Field Select User'), 'Smith-Doe')
//
//WebUI.sendKeys(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.022 Text Field Select User'), Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.023 Select User Borrow'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.019 Submit Select and Select user Asset for Borrowing'), 
//    FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.025 Submit Borrowing Request'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.071 Button Filter'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.072 Select Status'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.073 Text Field Status'), 'Waiting for Handover')
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.074 Select option'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.075 Apply Filter Transaction Borrow'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.006 Single Action Sub Tab Transaction'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.007 Action Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.039 Verify Asset for Asset Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-15 Select Single Scan RFID - Borrow Transaction'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.sendKeys(findTestObject('00-15 Select Single Scan RFID - Borrow Transaction'), Keys.chord(Keys.ESCAPE))
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.027 Next Page Asset Confirm Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.028 Send Email Asset Confirm Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.navigateToUrl('https://dev-fixedasset-v2.tagsamurai.com/my-asset/task/asset-borrowing', FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.029 Single Action Task Borrow'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.030 Action Confirm Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.032 Select All Asset for Confirmation'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.033 Confirm Asset Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.037 Cancel Asset Verification Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.036 Continue Asset Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.navigateToUrl('https://dev-fixedasset-v2.tagsamurai.com/assets/borrow/transaction/handover-asset', FailureHandling.STOP_ON_FAILURE)
//
//WebUI.refresh()
//
//WebUI.delay(10)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.038 Confirm Handover'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.071 Button Filter'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.072 Select Status'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.073 Text Field Status'), 'Waiting for Handover')
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.074 Select option'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.075 Apply Filter Transaction Borrow'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.006 Single Action Sub Tab Transaction'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.007 Action Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.039 Verify Asset for Asset Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-15 Select Single Scan RFID - Borrow Transaction'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.sendKeys(findTestObject('00-15 Select Single Scan RFID - Borrow Transaction'), Keys.chord(Keys.ESCAPE))
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.027 Next Page Asset Confirm Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.028 Send Email Asset Confirm Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.navigateToUrl('https://dev-fixedasset-v2.tagsamurai.com/my-asset/task/asset-borrowing', FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.029 Single Action Task Borrow'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.030 Action Confirm Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.032 Select All Asset for Confirmation'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.033 Confirm Asset Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.037 Cancel Asset Verification Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.036 Continue Asset Handover'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.navigateToUrl('https://dev-fixedasset-v2.tagsamurai.com/assets/borrow/transaction/handover-asset', FailureHandling.STOP_ON_FAILURE)
//
//WebUI.refresh()
//
//WebUI.delay(10)
//
//WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.038 Confirm Handover'))
//
//WebUI.delay(2)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.076 Sub Tab Borrowed'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.077 Check All Borrowing Asset'))

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.078 Select Bulk Action Sub Tab Borrowed'))

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.082 Action Bulk Set Request Extension'))

WebUI.delay(2)

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.083 Text Field Set Duration Bulk-1'), '1')

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.084 Text Field Set Duration Bulk-2'), '1')

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.059 Submit Extend Request'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.020 -  Set Extension bulk.png', FailureHandling.STOP_ON_FAILURE)

