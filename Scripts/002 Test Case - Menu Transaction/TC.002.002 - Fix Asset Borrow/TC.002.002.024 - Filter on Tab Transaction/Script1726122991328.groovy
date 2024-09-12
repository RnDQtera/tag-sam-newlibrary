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

WebUI.setText(findTestObject('00-01 ID'), GlobalVariable.id2)

WebUI.setText(findTestObject('00-02 PASS'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-04 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-07 Sync'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-08 Hardware Sync'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-09 Closed Hardware Sync'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.001 Reusable - Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.004 Reusable - Menu Fixed Asset - Borrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.013 Sub Tab Transaction Borrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.014 Add Borrow Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.026 Search by Scan'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-15 Select Single Scan RFID - Borrow Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.020 Select User'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.021 Button Search Select User'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.022 Text Field Select User'), 'Smith Doe')

WebUI.sendKeys(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.022 Text Field Select User'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.023 Select User Borrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.019 Submit Select and Select user Asset for Borrowing'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.024 Text Field Duration Borrowing'), '1')

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.025 Submit Borrowing Request'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.006 Single Action Sub Tab Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.007 Action Handover'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.039 Verify Asset for Asset Handover'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-15 Select Single Scan RFID - Borrow Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('00-15 Select Single Scan RFID - Borrow Transaction'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.027 Next Page Asset Confirm Handover'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.028 Send Email Asset Confirm Handover'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://dev-fixedasset-v2.tagsamurai.com/my-asset/task/asset-borrowing', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.029 Single Action Task Borrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.030 Action Confirm Handover'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.032 Select All Asset for Confirmation'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.033 Confirm Asset Handover'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.037 Cancel Asset Verification Handover'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.036 Continue Asset Handover'), FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://dev-fixedasset-v2.tagsamurai.com/assets/borrow/transaction/handover-asset', FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.delay(10)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.038 Confirm Handover'))

WebUI.delay(2)

WebUI.click(findTestObject('001 Reusable Component/001.004 Reusable - Menu Fixed Asset - Borrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.013 Sub Tab Transaction Borrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.014 Add Borrow Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.026 Search by Scan'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-16 Select Single Scan QR - Borrow Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.020 Select User'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.021 Button Search Select User'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.022 Text Field Select User'), 'Super Admin')

WebUI.sendKeys(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.022 Text Field Select User'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.023 Select User Borrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.019 Submit Select and Select user Asset for Borrowing'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.024 Text Field Duration Borrowing'), '1')

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.025 Submit Borrowing Request'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.097 Button Filter Borrow Sub Tab Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.098 Section Filter Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.099 Text Field Search Status'), 'Waiting for Handover')

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.100 Select Result Search Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.024 -  FIlter Section Status.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.101 Select FIlter Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.102 Text Field Search Group'), 'Kantor Regional JaTim')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.103 Select Result Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.104 Submit Search Result'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.024 -  FIlter Section Group.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.105 Section FIlter Borrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.099 Text Field Search Status'), 'Super Admin')

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.100 Select Result Search Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.024 -  FIlter Section Borrower.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.106 Section Filter Manager'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.099 Text Field Search Status'), 'Smith Doe')

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.100 Select Result Search Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.024 -  FIlter Section Manager.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.107 Section Filter Request Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.108 Select Request Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.024 -  FIlter Section Request Date.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.109 Section Last Update'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.108 Select Request Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.024 -  FIlter Section Last Update.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.110 Apply FIlter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.111 Button Search Data Transaction Borrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.112 Text Field Search Transaction Borrow'), 'Super Admin')

WebUI.sendKeys(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.112 Text Field Search Transaction Borrow'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.024 -  Result Search.png', FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.113 Scan Data Asset Transaction Borrow'))

WebUI.click(findTestObject('00-12 Select Single Scan RFID - Return Borrow'))

WebUI.delay(10)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.024 - Result Scan Transaction Borrow By RFID.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.113 Scan Data Asset Transaction Borrow'))

WebUI.click(findTestObject('00-13 Select Single Scan QR - Return Borrow'))

WebUI.delay(10)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.024 - Result Scan Transaction Borrow By QR.png', FailureHandling.STOP_ON_FAILURE)
WebUI.refresh()

WebUI.delay(4)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.114 Download Data Transaction Borrow'))

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.024 - Download Data Transaction Borrow.png', FailureHandling.STOP_ON_FAILURE)

